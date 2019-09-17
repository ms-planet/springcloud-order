FROM hub.c.163.com/library/java:openjdk-8-jre-alpine

MAINTAINER zxlei1 18883179599@163.com

ADD  order-server-0.0.1-SNAPSHOT.jar order.jar

EXPOSE 7001

ENTRYPOINT ["java","-jar","/order.jar"]