FROM openjdk:17
LABEL maintainer="MaxShpud"
ADD target/todoLogBack-0.0.1-SNAPSHOT.jar todoLogBack.jar
ENTRYPOINT ["java","-jar","todoLogBack.jar"]