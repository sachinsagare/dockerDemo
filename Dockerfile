FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar dockerDemo
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080