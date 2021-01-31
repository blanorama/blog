#!/bin/bash
./mvnw package -Dmaven.test.skip=true &&
docker build -f src/main/docker/Dockerfile.jvm -t ghcr.io/quarkus/blog . &&
docker tag ghcr.io/quarkus/blog ghcr.io/blanorama/blog &&
docker push ghcr.io/blanorama/blog
