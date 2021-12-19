FROM openjdk:11

EXPOSE 8080

COPY ./target/*.jar /usr/app/startsoft.jar
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "startsoft.jar"]

docker run -d -p 8080:8080 krish186/sample-angular-app-image:latest
