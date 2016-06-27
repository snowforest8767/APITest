@echo off



REM set MAVEN_OPTS environment

REM set MAVEN_OPTS=-Xms128m -Xmx1024m -XX:PermSize=64m -XX:MaxPermSize=640m

REM install Helper project

cd Helper

cmd /c mvn clean install -Dmaven.test.skip=true

if not "%errorlevel%"=="0" goto :end

REM generate TestProject

cmd /c mvn api:genTests -U

if not "%errorlevel%"=="0" goto :end

cmd /c mvn clean install -Dmaven.test.skip=true

if not "%errorlevel%"=="0" goto :end

cd ../TestProject

REM cmd /c mvn idea:clean idea:idea

if not "%errorlevel%"=="0" goto :end

cd ..



:end

pause