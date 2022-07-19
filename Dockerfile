FROM openjdk:11-jre
MAINTAINER Oleh Nahorniak <oleh_nahorniak@epam.com>
VOLUME /tmp
ADD target/simple-app-0.0.1-SNAPSHOT.jar simple-app.jar
ENTRYPOINT ["java", "-jar", "/simple-app.jar"]
