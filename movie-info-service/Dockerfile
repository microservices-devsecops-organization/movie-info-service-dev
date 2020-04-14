FROM azul/zulu-openjdk-alpine:11-jre

LABEL author="Dhiego Duarte"
LABEL email="Dhiego.Duarte.terceiros@claro.com.br"
LABEL company="Claro BR"
# same version in jar file 
LABEL version="1.0.0.RELEASE" 

RUN addgroup -g 3000 movie-info-service-group

RUN adduser -D -g '' -G movie-info-service-group -u 1000 movie-info-service-user

USER movie-info-service-user

WORKDIR /home/movie-info-service-user

COPY --chown=movie-info-service-user:movie-info-service-group target/movie-info-service-1.0.0.RELEASE.jar /home/movie-info-service-user

EXPOSE 8082

ENTRYPOINT ["/usr/bin/java", "-jar"]

CMD ["movie-info-service-1.0.0.RELEASE.jar"]

