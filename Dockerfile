FROM maven:3.9-eclipse-temurin-17 as builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -e -B package

FROM eclipse-temurin:17-jdk
COPY --from=builder /app/target/sample1-0.0.1-SNAPSHOT.jar /
CMD ["java", "-jar", "/sample1-0.0.1-SNAPSHOT.jar"]
