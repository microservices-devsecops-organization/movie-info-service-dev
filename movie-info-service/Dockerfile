FROM openjdk:8u212-jdk-alpine3.9

LABEL author="Dhiego Duarte"
LABEL email="Dhiego.Duarte.terceiros@claro.com.br"
LABEL company="Claro BR"
LABEL version="1.0.0"

RUN apk --no-cache add -u musl=1.1.20-r5 \
    && apk --no-cache add -u libtasn1=4.14-r0 \
    && apk --no-cache add libjpeg-turbo=1.5.3-r5

RUN addgroup -g 3000 movie-info-service-group
RUN adduser -D -g '' -G movie-info-service-group -u 1000 movie-info-service-user

USER movie-info-service-user
WORKDIR /home/movie-info-service-user

COPY --chown=movie-info-service-user:movie-info-service-group target/movie-info-service-0.0.1-SNAPSHOT.jar /home/movie-info-service-user

EXPOSE 8082

ENTRYPOINT ["/usr/bin/java", "-jar"]

CMD ["movie-info-service-0.0.1-SNAPSHOT.jar"]

