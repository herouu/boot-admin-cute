FROM openjdk:8-jdk-alpine
MAINTAINER herouu 2269648132@qq.com
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} ruoyi-admin.jar
RUN apk add --update font-adobe-100dpi ttf-dejavu fontconfig
ENTRYPOINT ["java","-jar","/ruoyi-admin.jar"]
EXPOSE 8080
