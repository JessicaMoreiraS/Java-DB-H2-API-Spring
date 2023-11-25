# Base image with Java
FROM openjdk:11-jdk-slim

# Add a volume pointing to /tmp (optional)
VOLUME /tmp

# Make port 8080 available to the outside world
EXPOSE 8080

# The application's JAR file
ARG JAR_FILE=target/my-app-0.0.1-SNAPSHOT.jar

# Add the application's JAR file to the container
ADD ${JAR_FILE} app.jar

# Run the app when the container starts
ENTRYPOINT ["java","-jar","/app.jar"]
