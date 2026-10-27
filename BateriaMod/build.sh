#!/usr/bin/env sh
set -eu
if ! command -v gradle >/dev/null 2>&1; then echo "Gradle não encontrado. Instale Gradle 8.1+ e Java 17, depois execute ./build.sh"; exit 1; fi
gradle build
