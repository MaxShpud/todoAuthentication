FROM openjdk:11
ADD target/todoLogBack-0.0.1-SNAPSHOT.jar todoLogBack-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","todoLogBack-0.0.1-SNAPSHOT.jar"]