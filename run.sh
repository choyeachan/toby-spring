#!/bin/bash

javac -cp ./src:./lib/mariadb-java-client-2.5.4.jar:./lib/spring-core-5.2.6.RELEASE.jar:./lib/spring-context-5.2.6.RELEASE.jar:./lib/spring-beans-5.2.6.RELEASE.jar:./lib/commons-logging-1.2.jar:./lib/cglib-3.3.0.jar:./lib/spring-aop-5.2.6.RELEASE.jar:./lib/spring-expression-5.2.6.RELEASE.jar ./src/**/*.java 
java -cp ./src:./lib/mariadb-java-client-2.5.4.jar:./lib/spring-core-5.2.6.RELEASE.jar:./lib/spring-context-5.2.6.RELEASE.jar:./lib/spring-beans-5.2.6.RELEASE.jar:./lib/commons-logging-1.2.jar:./lib/cglib-3.3.0.jar:./lib/spring-aop-5.2.6.RELEASE.jar:./lib/spring-expression-5.2.6.RELEASE.jar  springbook.UserDaoTest
