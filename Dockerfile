FROM openjdk:14-alpine
COPY target/micrinaut-2-*.jar micrinaut-2.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micrinaut-2.jar"]