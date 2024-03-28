# Перед запуском поменять путь до проекта #
cd "$env:USERPROFILE\IdeaProjects\evilcompucter\"
cd ".\src"
javac -encoding utf-8 *.java
jar -cfe $env:USERPROFILE\eComp.jar Main *.class
rm *.class
cd $env:USERPROFILE
java -jar eComp.jar