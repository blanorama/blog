#!/bin/bash
./mvnw package -Dmaven.test.skip=true &&
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/blog . &&
docker tag quarkus/blog ve5li/blog:1.0.0 &&
docker push ve5li/blog:1.0.0
