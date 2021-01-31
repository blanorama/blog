#!/bin/bash
./mvnw package -Dmaven.test.skip=true &&
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/blog . &&
docker tag quarkus/blog blanorama/blog:1.0.0 &&
docker push ghcr.io/blanorama/blog:1.0.0
