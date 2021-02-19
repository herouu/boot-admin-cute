FROM adoptopenjdk:8-jre-hotspot
MAINTAINER herouu herouucn@foxmail.com
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
RUN mkdir /opt/app
COPY target/ruoyi-admin.jar /opt/app/ruoyi-admin.jar
ENTRYPOINT ["java","-jar","/opt/app/ruoyi-admin.jar"]
EXPOSE 8080
