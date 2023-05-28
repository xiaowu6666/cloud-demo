FROM --platform=linux/amd64 docker.io/adoptopenjdk/openjdk8 AS java8
WORKDIR /opt/web
COPY target/book.jar .
ENV AUTHOR_URL author
ENTRYPOINT java -jar book.jar --app.author.remote}=${AUTHOR_URL} --server.port=80