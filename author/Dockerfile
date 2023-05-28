FROM --platform=linux/amd64 docker.io/adoptopenjdk/openjdk8 AS java8
WORKDIR /opt/web
COPY target/author.jar .
ENV BOOK_URL book
ENTRYPOINT java -jar author.jar --app.book.remote}=${BOOK_URL} --server.port=80