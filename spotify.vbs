Set WshShell = WScript.CreateObject("WScript.Shell")
Comandline = "C:\Users\ferra\AppData\Local\Microsoft\WindowsApps\Spotify.exe"
WScript.sleep 500
CreateObject("WScript.Shell").Run("spotify:user:jjbloon:playlist:4rtaL2Pce7JODGk3lWAwOK")
WScript.sleep 7000
WshShell.SendKeys " "