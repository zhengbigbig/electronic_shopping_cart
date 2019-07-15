FROM openjdk:12.0.1-jdk-oraclelinux7
EXPOSE 8080
VOLUME /tmp
ENV BASE_DIR /app
COPY target/electronic_shopping_cart-1.0-SNAPSHOT.jar $BASE_DIR/app.jar
COPY resources $BASE_DIR/resources
WORKDIR $BASE_DIR
ENTRYPOINT ["java","-jar","app.jar"]
