FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/eureka-server.jar eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]