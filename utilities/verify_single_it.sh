#!/bin/bash
# This script is used by Circle-CI to run integration tests for one client..
# This script is referenced in .circleci/config.yml.

set -e

MODULE=$1

if [ -z $MODULE ]; then
    echo "First arg (module) not provided, so we're exiting."
    exit 1
fi

export GCLOUD_PROJECT="gcloud-devel"
export GOOGLE_APPLICATION_CREDENTIALS=$(realpath .circleci/it-service-account.json)

echo "----- building and installing google-cloud-bom -----"
mvn -pl google-cloud-bom install -DskipTests

echo "----- building and installing parent pom -----"
mvn -N install -DskipTests

echo "----- building and installing shared modules -----"
mvn -pl google-cloud-core,google-cloud-core-http,google-cloud-core-grpc install -DskipTests

echo "----- running integration tests -----"
mvn -B -pl $MODULE -DtrimStackTrace=false -fae verify
