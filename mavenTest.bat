@echo off
mvn clean
mvn test
start .\target\my-reports\index.html