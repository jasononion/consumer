FROM openjdk:8-jre-alpine

WORKDIR /home/apps/
ADD target/consumer-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

CMD sh /home/apps/start.sh