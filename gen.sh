#!/bin/bash
docker run -it --rm -v $PWD:/gen  maven:3-eclipse-temurin-11 /gen/entrypoint.sh
