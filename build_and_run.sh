#!/bin/bash
#Скрипт сборки и запуска под Debian-like
#Сделать исполняемым chmod +x
#При запуске аргументом указать путь до папки src
#В случае установки jdk-17 при вызове update-alternatives и наличии иных версий выбрать 17 по-умолчанию
set +x
update-alternatives --list java 2> /dev/null  | grep -o java-17 1> /dev/null
JAVA_INSTALLED=$(echo $?)
if ! [[ "$JAVA_INSTALLED" == 0 ]]; then
	sudo apt update;sudo apt install -y  openjdk-17-jdk
	sudo update-alternatives --config java
fi
cd $1
javac -encoding utf-8 *.java
jar cfe ~/eComp.jar Main *.class
rm *.class
cd ~
java -jar eComp.jar
