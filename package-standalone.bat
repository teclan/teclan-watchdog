xcopy .\target\teclan-watchdog-1.0.jar .\teclan-watchdog\ /y
xcopy .\conf .\teclan-watchdog\conf /y/s/e/i
xcopy .\bin .\teclan-watchdog\ /y/s/e/i
xcopy .\WinRAR .\teclan-watchdog\WinRAR /y/s/e/i
del teclan-watchdog.zip
.\WinRAR\WinRAR.exe a teclan-watchdog.zip teclan-watchdog
