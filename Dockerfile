# Use a Maven image to build the JAR
FROM maven:3.9.0-eclipse-temurin-17 AS build

# Copy the source code into the container
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build the application and package it into a JAR file
RUN mvn clean package -DskipTests

# Use a lightweight JDK image for the runtime
FROM openjdk:17-jdk-slim

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
# Set the entry point for the application
ENTRYPOINT ["java", "-Dserver.port=8080", "-jar", "/app.jar"]