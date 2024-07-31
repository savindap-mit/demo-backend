# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file produced by the Maven build
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose the port that the application runs on
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "/app/demo.jar"]
