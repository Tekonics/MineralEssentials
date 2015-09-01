@echo off
title Minecraft Forge Updater
goto clean
:clean
call clean.bat
pause
goto setupdecomp
:setupdecomp
call SetupDecompWorkspace.bat
pause
goto finished
:finished
cls
echo Forge update compleate!
echo Thank you for using the latest version of Forge
pause