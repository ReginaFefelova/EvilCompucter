#!/bin/bash
#Сборка и запуск под Debian-like
set +x
update-alternatives --list java | grep -o java-17 1> /dev/null
JAVA_INSTALLED=$(echo $?)
if ! [[ "$JAVA_INSTALLED" == 0 ]]; then
	sudo apt update;sudo apt install openjdk-17-jdk
fi
cd $1
javac -encoding utf-8 *.java
jar cfe ~/eComp.jar Main *.class
rm *.class
cd ~
java -jar eComp.jar
