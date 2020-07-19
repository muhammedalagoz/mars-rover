FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER muhammed.alagoz27@gmail.com

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
