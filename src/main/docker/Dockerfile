FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
EXPOSE 5432
ENTRYPOINT ["java", "-jar", "application.jar"]