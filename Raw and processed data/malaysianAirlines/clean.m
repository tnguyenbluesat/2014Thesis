directories = dir('us_greatcircle*');
currentDirectory = cd;
addpath(currentDirectory);
folderNames = {directories.name};
for i=1:numel(folderNames)
    
    directories = dir('us_greatcircle*');
    folderNames = {directories.name};
    name = folderNames{i}
    cd (folderNames{i});
    
    dd = dir('*.m');

    fileNames = {dd.name};

    if(numel(fileNames)) > 0
       
        data = cell(numel(fileNames),2);
        data(:,1) = regexprep(fileNames, '*.m','');

        data

        for j=1:numel(fileNames)
            delete(fileNames{j});
        end
    end
    
    cd ..
end