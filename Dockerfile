FROM openjdk:17
MAINTAINER abhi <abh@gmail.com>
WORKDIR /users/app/
COPY target/docker1.jar docker1.jar
ENTRYPOINT ["java","-jar","docker1.jar"]