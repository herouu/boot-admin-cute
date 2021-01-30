FROM openjdk:8-jdk-alpine
MAINTAINER herouu 2269648132@qq.com
VOLUME /tmp
# 时区
RUN echo "Asia/Shanghai" > /etc/timezone
# 字体包
RUN set -xe apk --no-cache add ttf-dejavu fontconfig
ARG JAR_FILE
COPY ${JAR_FILE} ruoyi-admin.jar
ENTRYPOINT ["java","-jar","/ruoyi-admin.jar"]
EXPOSE 8080
