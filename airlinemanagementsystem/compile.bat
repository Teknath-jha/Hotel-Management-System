@echo off
echo =====================================
echo Compiling all Java files...
echo =====================================

:: Set base directory
set SRC_DIR=T:\Java\LLD-HotelManagementSystem
set OUT_DIR=%SRC_DIR%\out
set MAIN_CLASS=airlinemanagementsystem.AirlineManagementSystemDemo

:: Delete old compiled classes (optional)
if exist %OUT_DIR% (
    rmdir /s /q %OUT_DIR%
)
mkdir %OUT_DIR%

:: Compile all .java files
for /R %SRC_DIR% %%f in (*.java) do (
    javac -d %OUT_DIR% %%f
)

echo =====================================
echo Compilation done. Running the app...
echo =====================================

:: Run the main class
cd /d %OUT_DIR%
java %MAIN_CLASS%

pause