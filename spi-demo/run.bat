@echo off

@REM 设置变量
set spi=service-provider-interface
set sp=service-provider
set jst=java-spi-test

@REM 删除文件夹
echo 删除文件夹...
rmdir /s /q "%spi%/out"
rmdir /s /q "%sp%/out"
rmdir /s /q "%jst%/out"
rmdir /s /q "%spi%/target"
rmdir /s /q "%sp%/target"
rmdir /s /q "%jst%/target"

@REM 新建文件夹
echo 新建文件夹...
mkdir "%spi%/out"
mkdir "%sp%/out"
mkdir "%jst%/out"
mkdir "%spi%/target"
mkdir "%sp%/target"
mkdir "%jst%/target"

@REM 编译 %spi% 文件
javac -cp "%spi%/src" -d "%spi%/out" "%spi%/src/com/example/spi/LoggerService.java"

@REM 打包
jar cf "%spi%/target/%spi%.jar" -C "%spi%/out/" .
copy "%spi%\target\%spi%.jar" "%sp%\lib\%spi%.jar"
copy "%spi%\target\%spi%.jar" "%jst%\lib\%spi%.jar"

@REM 编译 %sp% 文件
javac -cp "%sp%/lib/"%spi%".jar;%sp%/src" -d "%sp%/out" "%sp%/src/com/example/spi/service/Logback.java"

@REM 打包
xcopy "%sp%\src\META-INF" "%sp%\out\META-INF" /E /I /H
jar cf "%sp%/target/%sp%.jar" -C "%sp%/out" .
copy "%sp%\target\%sp%.jar" "%jst%\lib\%sp%.jar"

@REM 编译 %jst% 文件
javac -cp "%jst%/lib/%spi%.jar;%jst%/lib/%sp%.rar;%jst%/src" -d "%jst%/out" "%jst%/src/org/example/Main.java"

java -cp "%jst%/lib/%spi%.jar;%jst%/lib/%sp%.jar;%jst%/out" "org.example.Main"