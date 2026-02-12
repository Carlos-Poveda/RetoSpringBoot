FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/RetoSpringBoot-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]