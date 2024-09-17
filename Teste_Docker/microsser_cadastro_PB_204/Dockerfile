FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/microsser_cadastro_PB_204-0.0.1-SNAPSHOT.jar microsservico-cadastro.jar
ENTRYPOINT ["java", "-jar", "microsservico-cadastro.jar"]