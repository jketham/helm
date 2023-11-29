FROM openjdk:11
EXPOSE 8085
ADD target/helm.jar helm.jar
ENTRYPOINT ["java","-jar","/helm.jar"]