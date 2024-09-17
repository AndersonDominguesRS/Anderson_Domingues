FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/Pb_Aluno_Microsser-0.0.1-SNAPSHOT.jar aluno-server.jar
ENTRYPOINT ["java", "-jar", "aluno-server.jar"]