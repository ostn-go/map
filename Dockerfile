# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-oracle

# Set the working directory in the container
WORKDIR /src

# Copy the JAR file into the container at /app
COPY build/libs/map-0.0.1-SNAPSHOT.jar .

# Expose the port the app runs on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "map-0.0.1-SNAPSHOT.jar"]