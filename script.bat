
echo Startscript
del build/libs/*.jar
call gradlew.bat assemble
if EXIST (build/libs/*.jar)
copy build/libs/*.jar C:\B
else
echo (error)









