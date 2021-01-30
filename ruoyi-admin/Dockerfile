FROM adoptopenjdk:11-jre-hotspot
MAINTAINER herouu 2269648132@qq.com
RUN mkdir /opt/app
# 时区
#RUN echo "Asia/Shanghai" > /etc/timezone
# 字体包
#RUN set -xe apk --no-cache add ttf-dejavu fontconfig
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/ruoyi-admin.jar
ENTRYPOINT ["java","-jar","/opt/app/ruoyi-admin.jar"]
EXPOSE 8080
