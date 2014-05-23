clear all;

dd = dir('*Access.csv');

fileNames = {dd.name};

data = cell(numel(fileNames),2);
data(:,1) = regexprep(fileNames, '.csv','');

for i=1:numel(fileNames)
    parse_access_csv(fileNames{i});
end

%repeat to find link budget data

dd = dir('*Link Budget.csv');

fileNames = {dd.name};

data = cell(numel(fileNames),2);
data(:,1) = regexprep(fileNames, '.csv','');

for i=1:numel(fileNames)
    parse_linkbudget_csv(fileNames{i});
end


