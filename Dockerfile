FROM openjdk:8-jdk

VOLUME /tmp
EXPOSE 8080
COPY target/activeme-testclient-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]