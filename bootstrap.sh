#!/bin/bash

# https://stackoverflow.com/questions/1425892/how-do-you-merge-two-git-repositories

set -xe

[ -z "`git config user.email`" ] && git config --global user.email "${USERNAME:-script}@google.com"
[ -z "`git config user.name`" ] && git config --global user.name "${USERNAME:-script}"

rm -rf monorepo
mkdir monorepo

cp bootstrap.sh monorepo
cp repos.txt monorepo

cd monorepo

git clone https://github.com/newren/git-filter-repo.git
export PATH=$PATH:`pwd`/git-filter-repo

mkdir google-cloud-java

cd google-cloud-java
git init -b main

cat ../../repos.txt | while read service
do
#  cd ..
  echo "    <module>${service}</module>" >> repo-modules.txt
#  git clone https://github.com/googleapis/${service}.git
#  cd  ${service}
#  git filter-repo --to-subdirectory-filter ${service}
#
#  # Search for <parent> tag and replace the next three lines -- groupId, artifcatId, and version
#  # Doesn't modify the pom.xml for each module's bom package (that still points to shared-config ... for now)
#  sed -i -e '/<parent>/{N;s/com.google.cloud/com.google.api/;N;s/google-cloud-shared-config/google-cloud-java/;N;s/<version>.*<\/version>/<version>0.0.1-SNAPSHOT<\/version>/}' ${service}/pom.xml
#
#  # setup owlbot files correctly to match monorepo configuration
#  cp ${service}/.github/.OwlBot.yaml ${service}/.OwlBot.yaml
#  rm ${service}/.github/.OwlBot.lock.yaml
#  rm ${service}/.github/.OwlBot.yaml
#  sed -i.bak '/docker/d' ${service}/.OwlBot.yaml && rm ${service}/.OwlBot.yaml.bak
#  sed -i.bak '/image/d' ${service}/.OwlBot.yaml && rm ${service}/.OwlBot.yaml.bak
#
#  # In monorepo, the staging directory structure tells the destination module to
#  # which the OwlBot Java postprocessor copies the files.
#  sed -i.bak "s|owl-bot-staging|owl-bot-staging/${service}|" ${service}/.OwlBot.yaml && rm ${service}/.OwlBot.yaml.bak
#
#  text=$(grep '^.*api_shortname.*' ${service}/.repo-metadata.json)
#  text=$(echo "$text" | sed 's/\"//g; s/\,//g; s/^[[:space:]]*//' )
#  text=${text/api_shortname/api-name}
#  echo -e "\n"$text>> ${service}/.OwlBot.yaml
#  git add .
#  git config --add secrets.allowed "dest.*src"
#  git commit -am "chore: setup owlbot configuration"
#
#  cd ../google-cloud-java
#  git remote add ${service} ../${service}
#  git config --add secrets.allowed "dest.*src"
#  git fetch ${service} #--tags
#  EDITOR=true git merge --allow-unrelated-histories ${service}/main
#  git remote remove ${service}
#  rm -rf ../${service}
done

cd ..

# insert processed modules into aggregator pom.xml
awk -v MODULES="`awk -v ORS='\\\\n' '1' repo-modules.txt`" '1;/<modules>/{print MODULES}' ../parent.pom.xml > google-cloud-java/pom.xml

cd google-cloud-java

git add pom.xml
git commit -am 'feat: create aggregator pom'

# generate BOM of the artifacts in this repository
bom_lines=""
for bom_directory in $(find . -name 'google-*-bom' | sort); do
  repo_metadata="${bom_directory}/../.repo-metadata.json"
  pom_file="${bom_directory}/pom.xml"
  groupId_line=$(grep --max-count=1 'groupId' "${pom_file}")
  artifactId_line=$(grep --max-count=1 'artifactId' "${pom_file}")
  version_line=$(grep --max-count=1 'x-version-update' "${pom_file}")
  if ! grep --quiet '"release_level": "stable"' "${repo_metadata}"; then
    # Not including non-GA libraries, except those that happened to be included
    # already in google-cloud-bom.
    if [[ $artifactId_line != *"google-cloud-datalabeling"* ]] \
        && [[ $artifactId_line != *"google-cloud-errorreporting"* ]] \
        && [[ $artifactId_line != *"google-cloud-logging-logback"* ]] \
        && [[ $artifactId_line != *"google-cloud-mediatranslation"* ]] \
        && [[ $artifactId_line != *"google-cloud-nio"* ]] \
        && [[ $artifactId_line != *"google-cloud-notification"* ]] \
        && [[ $artifactId_line != *"google-cloud-phishingprotection"* ]]; then
      echo "Not adding ${pom_file} to the BOM because it's not stable."
      continue
    fi
  fi

  bom_lines+="      <dependency>\n\
      ${groupId_line}\n\
      ${artifactId_line}\n\
      ${version_line}\n\
        <type>pom</type>\n\
        <scope>import</scope>\n\
      </dependency>\n"

done

mkdir google-cloud-gapic-bom
awk -v "dependencyManagements=$bom_lines" '{gsub(/BOM_ARTIFACT_LIST/,dependencyManagements)}1' \
    ../../bom.pom.xml > google-cloud-gapic-bom/pom.xml

git add google-cloud-gapic-bom/pom.xml
git commit -am 'feat: create bom module'

# Template files
cp -rp ../../templates/. ./

# Confirm everything is fine so far
# Need license-checks.xml to validate
mvn -q -B -ntp validate

# Add all template files
git add --all
git add -f .gitignore
git commit -m 'chore: add template files'


# generate coverage report
mkdir CoverageAggregator
cp ../../coverage.pom.xml CoverageAggregator/pom.xml

# create aggregator project for jacoco
mvn compile -Dexec.executable='echo' \
-Dexec.args='<dependency><groupId>${project.groupId}</groupId><artifactId>${project.artifactId}</artifactId><version>${project.version}</version></dependency>' \
exec:exec -q -B | grep -v 'CoverageAggregator\|bom\|parent\|proto\-\|grpc-\|google\-cloud\-java' >> ../coverage-modules.txt

# insert processed modules into coverage aggregator pom.xml
awk -v MODULES="`awk -v ORS='\\\\n' '1' ../coverage-modules.txt`" '1;/<dependencies>/{print MODULES}' ../../coverage.pom.xml > CoverageAggregator/pom.xml

# add CoverageAggregator to root pom
awk -v MODULE='    <module>CoverageAggregator</module>' '/<\/modules>/{print MODULE};1' pom.xml > pom.xml.tmp && mv pom.xml.tmp pom.xml

git add --all
git commit -am 'feat: create CoverageAggregator module'