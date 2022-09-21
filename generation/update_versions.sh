#!/bin/bash

set +e

for path in $(find . -mindepth 2 -maxdepth 2 -name pom.xml | sort | xargs dirname); do
  if [[ "${path}" =~ google-cloud-gapic-bom ]] || [[ "${path}" =~ CoverageAggregator ]] || [[ "${path}" =~ .*samples.* ]] || [[ "${path}" =~ .*beyondcorp.* ]]; then
    continue
  fi

  versions_array=($(grep -E "^.*:[0-9]+\.[0-9]+\.[0-9]+.*:[0-9]+\.[0-9]+\.[0-9]+.*$" "${path}/versions.txt"))

  for line in "${versions_array[@]}"; do
    echo "Running for ${line}"
    artifactId=$(echo "${line}" | cut -d ":" -f1)

    if [[ "${artifactId}" =~ .*grafeas.* ]]; then
      maven_url="https://repo1.maven.org/maven2/io/grafeas/${artifactId}/maven-metadata.xml"
    elif [[ "${artifactId}" =~ .*area120.* ]] && [[ "${artifactId}" =~ ^google- ]]; then
      maven_url="https://repo1.maven.org/maven2/com/google/area120/${artifactId}/maven-metadata.xml"
    elif [[ "${artifactId}" =~ .*analytics.* ]] && [[ "${artifactId}" =~ ^google- ]]; then
      maven_url="https://repo1.maven.org/maven2/com/google/analytics/${artifactId}/maven-metadata.xml"
    elif [[ "${artifactId}" =~ ^google- ]]; then
      maven_url="https://repo1.maven.org/maven2/com/google/cloud/${artifactId}/maven-metadata.xml"
    else
      maven_url="https://repo1.maven.org/maven2/com/google/api/grpc/${artifactId}/maven-metadata.xml"
    fi

    echo "Downloading ${artifactId} from ${maven_url}"

    maven_version=$(curl -si "${maven_url}" | grep 'latest')
    maven_latest_version=$(echo "$maven_version" | cut -d '>' -f 2 | cut -d '<' -f 1 | cut -d "-" -f1)

    major_version=$(echo "${maven_latest_version}" | cut -d "." -f1)
    minor_version=$(echo "${maven_latest_version}" | cut -d "." -f2)
    patch_version=$(echo "${maven_latest_version}" | cut -d "." -f3)
    patch_version_bump=$((patch_version + 1))
    maven_version_bump="${major_version}:${minor_version}:${patch_version_bump}"
    new_version="${artifactId}:${maven_latest_version}:${maven_version_bump}-SNAPSHOT"

    sed -i "s/${line}/${new_version}/g" "${path}/versions.txt"
    echo "Done running for ${line}"
  done
done
