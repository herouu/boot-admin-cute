FROM adoptopenjdk:8-jre-hotspot
MAINTAINER herouu 2269648132@qq.com
RUN mkdir /opt/app
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/ruoyi-admin.jar
ENTRYPOINT ["java","-jar","/opt/app/ruoyi-admin.jar"]
EXPOSE 8080
