FROM java:8-jdk-alpine
RUN apk add -U tzdata
COPY ./target/eureka-server-1.0.0.jar ./
ENV JAVA_OPTS="-Duser.timezone=Asia/Shanghai"
EXPOSE 8761
ENV APP_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar /eureka-server-1.0.0.jar  $APP_OPTS" ]