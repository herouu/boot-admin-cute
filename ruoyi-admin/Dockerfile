FROM adoptopenjdk:8-jre-hotspot
MAINTAINER herouu herouucn@foxmail.com
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
RUN mkdir /opt/app
ARG JAR_FILE=/ruoyi-admin/target/ruoyi-admin.jar
COPY ${JAR_FILE} /opt/app/ruoyi-admin.jar
ENTRYPOINT ["java","-jar","/opt/app/ruoyi-admin.jar"]
EXPOSE 8080
