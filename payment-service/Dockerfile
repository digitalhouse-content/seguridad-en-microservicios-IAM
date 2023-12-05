FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/spring-boot-web.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080