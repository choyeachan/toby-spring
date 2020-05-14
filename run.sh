#!/bin/bash

javac -cp ./src:./lib/mariadb-java-client-2.5.4.jar ./src/**/*.java 
java -cp ./src:./lib/mariadb-java-client-2.5.4.jar  springbook.UserDaoTest
