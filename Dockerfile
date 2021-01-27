FROM openjdk:8u212-jdk
COPY target/*SNAPSHOT.jar app.jar
EXPOSE 80
ENTRYPOINT ["java","-Xmx400M","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]