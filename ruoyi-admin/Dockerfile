FROM registry.cn-beijing.aliyuncs.com/java8-jdk/java8_jdk:8-jdk-alpine
MAINTAINER herouu herouucn@foxmail.com
#RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
RUN mkdir /opt/app
COPY target/ruoyi-admin.jar /opt/app/ruoyi-admin.jar
ENTRYPOINT ["java","-jar","/opt/app/ruoyi-admin.jar"]
EXPOSE 8080
