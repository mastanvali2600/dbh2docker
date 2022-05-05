FROM ubuntu:20.04
RUN apt update -y
RUN apt install -y openjdk-11-jdk
RUN mkdir -p /u01/applications/
COPY /target/spring-boot-h2-database-example-0.0.1-SNAPSHOT.jar /u01/applications/app.jar


CMD java -jar /u01/applications/app.jar
