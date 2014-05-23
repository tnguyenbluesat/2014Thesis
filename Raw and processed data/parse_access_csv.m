function parse_access_csv(filename)

%constants
start_time_col = 3;
end_time_col = 4;
duration_col = 5;
gap_time_col = 7;
gap_start_col = 8;
gap_end_col = 9;
gap_sec_col = 10;
aggregated_access_col = 11;

abs_time_scalar = 24*60*60;
%read CSV input file
input_data = xlsread(filename);
n = length(input_data);


%insert empty column to insert satellite number being analysed
input_data = [zeros(n,1) input_data];

%compute duration of access in absolute time (1= 1day)
duration_abs = input_data(:, end_time_col) - input_data(:,start_time_col);
input_data = [input_data duration_abs];
input_data(:,duration_col) = duration_abs*abs_time_scalar;

clear duration_abs;

%analyse NaN breaks to increment satellite number
sat_num = 1;
input_data(1,1) = sat_num;
for i=2:n
    if(isnan(input_data(i,2)) && isnan(input_data(i-1,2)))
        sat_num = sat_num + 1;
    end
    input_data(i,1) = sat_num;
            
end
clear sat_num;

%sort data by access start time
sorted_data = sortrows(input_data, start_time_col);

%find NaN values and remove
[nanrow nancol] = find(isnan(sorted_data));
% sorted_data(nanrow(1):end,:) = [];
clear nanrow; clear nancol;

%calculate access gap
n = length(sorted_data);
sorted_data = [sorted_data zeros(n,6)]; 
for i=2:n
    cov_gap  = sorted_data(i, start_time_col)...
                -sorted_data(i-1, end_time_col);
%     sorted_data(i, gap_time_col) = cov_gap;
    
    if(cov_gap > 0)
        sorted_data(i, gap_time_col) = cov_gap;
        sorted_data(i, gap_sec_col) = cov_gap*abs_time_scalar;
        sorted_data(i, gap_start_col) = sorted_data(i-1, end_time_col);
        sorted_data(i, gap_end_col) = sorted_data(i, start_time_col);
        sorted_data(i, aggregated_access_col) = sorted_data(i,duration_col);
        %access time needs to be egregated
        if(i>2 )
            % find the beginning of the coverage time
            k=i-1;
            while(sorted_data(k, gap_time_col) == 0 && k>2)
               k=k-1; 
            end
            sorted_data(i, aggregated_access_col) = ( sorted_data(i, gap_start_col)...
                                                        -sorted_data(k, start_time_col))...
                                                        *abs_time_scalar;
        end
   
            
    end
    
    
end
clear cov_gap;
clear n;
clear i;
total_period_abs = sorted_data(end, end_time_col) - sorted_data(1, start_time_col);
total_period_sec = total_period_abs*abs_time_scalar;
total_gap = sum(sorted_data(:,gap_sec_col));
total_coverage = sum(sorted_data(:,duration_col));
maximum_gap = max(sorted_data(:, gap_sec_col));
gap_fraction = total_gap/total_period_sec;
overlap_time = total_gap + total_coverage - total_period_sec;
ind = find(sorted_data(:, gap_time_col));
average_gap = mean(sorted_data(ind, gap_sec_col));
average_access = mean(sorted_data(ind, aggregated_access_col));
periods = sorted_data(ind, aggregated_access_col) + sorted_data(ind, gap_sec_col);

[D PD] = allfitdist(periods, 'PDF');
stddev_periods_raw = std2(periods);
stddev_fitted = sqrt(var(PD{1}));

if(isinf(stddev_fitted))
    fprintf('!infinite variance: %s\n', filename);
end


figFilename = strrep(filename, '.csv' ,'.png');
if(~strcmp(D(1).DistName, 'tlocationscale'))
    fprintf('%s does not fit tlocationscale\n', filename);
end
print(figFilename, '-dpng');

output_mat_filename = strrep(filename, '.csv', '.mat');
output_xls_filename = strrep(filename, '.csv', '_proc.xls');
save(output_mat_filename);
xlswrite(output_xls_filename, sorted_data);
return;