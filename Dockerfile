FROM alpine-jdk:latest
MAINTAINER mazeit.com
COPY target/mathcalc-0.0.1-SNAPSHOT.jar mathcalc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mathcalc-0.0.1-SNAPSHOT.jar"]