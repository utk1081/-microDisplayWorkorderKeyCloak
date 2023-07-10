FROM openjdk:8u212-jdk-slim
EXPOSE 8080
ADD target/microDisplayWorkOrderApi-0.0.1-SNAPSHOT.jar microDisplayWorkOrderApi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/microDisplayWorkOrderApi-0.0.1-SNAPSHOT.jar"]