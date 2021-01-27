FROM centos:latest
MAINTAINER herouu 2269648132@qq.com
VOLUME /tmp
ADD ruoyi-admin/target/ruoyi-admin.jar ruoyi-admin.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ruoyi-admin.jar"]
