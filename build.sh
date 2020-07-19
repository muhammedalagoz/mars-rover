#!/bin/bash
set -e

IMAGE_USER="muhammed-alagoz"
IMAGE_NAME="mars-rover"

FINAL_IMAGE="${IMAGE_USER}/${IMAGE_NAME}:latest"

echo "FINAL IMAGE = ${FINAL_IMAGE}"

# Build project
mvn clean clean install

docker build \
  -t "${FINAL_IMAGE}" .


#docker run -p 8080:8080 -t muhammed-alagoz/mars-rover
