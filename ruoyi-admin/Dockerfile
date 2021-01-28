FROM openjdk:8-jdk-alpine
MAINTAINER herouu 2269648132@qq.com
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} ruoyi-admin.jar
ENTRYPOINT ["java","-jar","/ruoyi-admin.jar"]
