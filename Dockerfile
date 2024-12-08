# Use Maven to build the app and OpenJDK for running it
FROM maven:3.8.6-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and other necessary files to the container
COPY pom.xml /app/pom.xml
COPY src /app/src

# Install dependencies and build the application (this step will generate the JAR)
RUN mvn clean package -DskipTests

# Now use the OpenJDK 17 image to run the application
FROM openjdk:17-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file from the build stage into the new container
COPY --from=build /app/target/your-app-name.jar /app/app.jar

# Expose port 8080 (or the port your app uses)
EXPOSE 8080

# Command to run the Spring Boot app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]