FROM maven:3.9.10-eclipse-temurin-21 AS maven-builder

WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY --from=maven-builder /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
