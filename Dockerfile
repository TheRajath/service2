FROM openjdk
ADD target/service2-0.0.1-SNAPSHOT.jar /
EXPOSE 8083:8083
CMD ["java","-jar","service2-0.0.1-SNAPSHOT.jar"]
