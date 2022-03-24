FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN /bin/sh -c "apk add --no-cache bash"
ENTRYPOINT ["java","-jar","/app.jar"]