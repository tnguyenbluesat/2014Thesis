directories = dir('us_greatcircle*');
close all;
currentDirectory = cd;
addpath(currentDirectory);
folderNames = {directories.name};
set(0,'DefaultFigureWindowStyle','docked');
for i=1:numel(folderNames)
    
    directories = dir('us_greatcircle*');
    folderNames = {directories.name};
    name = folderNames{i}
    cd (folderNames{i});
    parse_all;
    cd ..
end