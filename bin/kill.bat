rem 关闭名称为 teclan-watchdog 的程序
@echo off
set name=teclan-watchdog
echo name : %name%
for /f "usebackq tokens=1-2" %%a in (`jps -l ^| findstr %name%`) do (
		echo find process %%a %%b
		set pid=%%a
		set image_name=%%b
)
echo now will kill process : pid %pid%, image_name %image_name%
rem pause
rem 根据进程ID，kill进程
echo 即将启动 teclan-watchdog-1.0.jar ...
taskkill /f /pid %pid%