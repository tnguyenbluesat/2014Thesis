function parse_linkbudget_csv(filename)

rx_iso_pwr_column = 4;


%read CSV input file
input_data = xlsread(filename);

min_rx_power = min(input_data(:,rx_iso_pwr_column));
max_rx_power = max(input_data(:,rx_iso_pwr_column));

output_mat_filename = strrep(filename, '.csv', '.mat');
save(output_mat_filename);

end