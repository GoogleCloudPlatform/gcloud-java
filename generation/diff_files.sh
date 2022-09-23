#!/bin/bash
#run this script from google-cloud-java directory
# google-cloud-java$ ./generation/diff_files.sh
# not using set -e because failing diff command is ok
# latest repositories Id -> comgooglecloud-5570, comgoogleapi-5038, comgoogleanalytics-1052
# this script must be run on a branch which does not have any snapshot versions in it

## HOW TO USE THIS SCRIPT ##
# 1. Run the stage job for google-cloud-java, on a branch which does not have any snapshot versions in it.
# 2. search the stage job logs for
#     a. 'comgooglecloud' (the result will be like "comgooglecloud-5570")
#     b. 'comgoogleapi' (the result will be like "comgoogleapi-5038")
#     c. 'comgoogleanalytics' (the result will be like "comgoogleanalytics-1052")
# 3. update them below under the variables `cloudRepoId`, `apiRepoId`, `analyticsRepoId`
# 4. run ./generation/diff_files.sh

# Output of this script are 2 files ->
# 1. diff-files-summary.txt : This will show success for artifacts which have same files on maven-central and sonatype,
# and if they differ, it will show a diff failure message along with the names of the files that differ.
# 2. total-diff.txt : For every artifact, this will show 4 things:
      # a. Sonatype directory URL
      # b. Files that exist on sonatype (with version omitted, since we only care about the file generated)
      # c. Maven directory URL
      # d. Files that exist on Maven (with version omitted, since we only care about the file generated)
# This script calls ./generation/diff_directory.sh for every pair, but you do not need to do anything for it. You just need to run this script.
# Search total-diff.txt for any artifact, and it will show you a complete scenario, what all files exist etc etc.


cloudRepoId=comgooglecloud-5570
apiRepoId=comgoogleapi-5038
analyticsRepoId=comgoogleanalytics-1052

#-maxDepth 2 will just loop over all the packages we have, like java-vision etc, not maven submodules within it
#-maxDepth 3 and 4 output same number of modules (more than 2 ofcourse) so 3 is covering all the modules
for module in $(find . -mindepth 1 -maxdepth 3 -name pom.xml | sort | xargs dirname); do

  if [[ "${module}" = *google-cloud-gapic-bom ]] || [[ "${module}" = *CoverageAggregator ]]; then
    continue
  fi

  if [[ "${module}" = *samples* ]]; then
    continue
  fi

  #these modules do not exist on maven-central yet
  if [[ "${module}" = *beyondcorp* ]]; then
    continue
  fi

  pom_file="${module}/pom.xml"
  groupId_line=$(grep --max-count=1 'groupId' "${pom_file}")
  artifactId_line=$(grep --max-count=1 'artifactId' "${pom_file}")
  version_line=$(grep --max-count=1 'x-version-update' "${pom_file}")

  #strip off everything from version line except digits and . to get the version
  version=$(echo "$version_line" | cut -d '>' -f 2 | cut -d '<' -f 1)

  prefix="  <groupId>"
  suffix="</groupId>"
  string=${groupId_line}
  new_string=${string#"$prefix"}
  groupId=${new_string%"$suffix"}

  prefix="  <artifactId>"
  suffix="</artifactId>"
  string=${artifactId_line}
  new_string=${string#"$prefix"}
  artifactId=${new_string%"$suffix"}

  if [[ "${groupId}" == *grafeas* ]]; then
    continue
  fi

  if [[ "${groupId}" == *google.cloud* ]]; then
    maven_version=$(curl -s "https://repo1.maven.org/maven2/com/google/cloud/${artifactId}/maven-metadata.xml" | grep --max-count=1 'latest')
    maven_latest_version=$(echo "$maven_version" | cut -d '>' -f 2 | cut -d '<' -f 1)

    sonatypeURL="https://google.oss.sonatype.org/content/repositories/${cloudRepoId}/com/google/cloud/${artifactId}/${version}"
    mavenURL="https://repo1.maven.org/maven2/com/google/cloud/${artifactId}/${maven_latest_version}"

    ./generation/diff_directory.sh ${mavenURL} ${sonatypeURL} ${artifactId} ${cloudRepoId}
  fi

  if [[ "${groupId}" == *grpc* ]]; then
    maven_version=$(curl -s "https://repo1.maven.org/maven2/com/google/api/grpc/${artifactId}/maven-metadata.xml" | grep --max-count=1 'latest')
    maven_latest_version=$(echo "$maven_version" | cut -d '>' -f 2 | cut -d '<' -f 1)

    sonatypeURL="https://google.oss.sonatype.org/content/repositories/${apiRepoId}/com/google/api/grpc/${artifactId}/${version}"
    mavenURL="https://repo1.maven.org/maven2/com/google/api/grpc/${artifactId}/${maven_latest_version}"

    ./generation/diff_directory.sh ${mavenURL} ${sonatypeURL} ${artifactId} ${apiRepoId}
  fi

  if [[ "${groupId}" == *analytics* ]]; then
    maven_version=$(curl -s "https://repo1.maven.org/maven2/com/google/analytics/${artifactId}/maven-metadata.xml" | grep --max-count=1 'latest')
    maven_latest_version=$(echo "$maven_version" | cut -d '>' -f 2 | cut -d '<' -f 1)

    sonatypeURL="https://google.oss.sonatype.org/content/repositories/${analyticsRepoId}/com/google/analytics/${artifactId}/${version}"
    mavenURL="https://repo1.maven.org/maven2/com/google/analytics/${artifactId}/${maven_latest_version}"

    ./generation/diff_directory.sh ${mavenURL} ${sonatypeURL} ${artifactId} ${analyticsRepoId}
  fi
done
