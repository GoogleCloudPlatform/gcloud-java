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
  cd ..
  echo "    <module>${service}</module>" >> repo-modules.txt
  git clone https://github.com/googleapis/${service}.git
  cd  ${service}
  git filter-repo --to-subdirectory-filter ${service}

  # Search for <parent> tag in module pom and replace the next three lines -- groupId, artifcatId, and version
  sed -i.bak -e '/<parent>/{N;s/com.google.cloud/com.google.api/;N;s/google-cloud-shared-config/google-cloud-java/;N;s/<version>.*<\/version>/<version>0.0.1-SNAPSHOT<\/version>/}' ${service}/pom.xml && rm ${service}/pom.xml.bak

  NAME=$(jq -r '.distribution_name' ${service}/.repo-metadata.json | cut -d ':' -f 2)
  # Search for <parent> tag in module bom and replace the next three lines -- groupId, artifcatId, and version
  sed -i.bak -e '/<parent>/{N;s/com.google.cloud/com.google.api/;N;s/google-cloud-shared-config/google-cloud-java/;N;s/<version>.*<\/version>/<version>0.0.1-SNAPSHOT<\/version>\n    <relativePath>..\/..\/pom.xml<\/relativePath>/}' ${service}/${NAME}-bom/pom.xml && rm ${service}/${NAME}-bom/pom.xml.bak

  # setup owlbot files correctly to match monorepo configuration
  cp ${service}/.github/.OwlBot.yaml ${service}/.OwlBot.yaml
  rm ${service}/.github/.OwlBot.lock.yaml
  rm ${service}/.github/.OwlBot.yaml
  sed -i.bak '/docker/d' ${service}/.OwlBot.yaml && rm ${service}/.OwlBot.yaml.bak
  sed -i.bak '/image/d' ${service}/.OwlBot.yaml && rm ${service}/.OwlBot.yaml.bak

  # In monorepo, the staging directory structure tells the destination module to
  # which the OwlBot Java postprocessor copies the files.
  sed -i.bak "s|owl-bot-staging|owl-bot-staging/${service}|" ${service}/.OwlBot.yaml && rm ${service}/.OwlBot.yaml.bak

  text=$(grep '^.*api_shortname.*' ${service}/.repo-metadata.json)
  text=$(echo "$text" | sed 's/\"//g; s/\,//g; s/^[[:space:]]*//' )
  text=${text/api_shortname/api-name}
  echo -e "\n"$text>> ${service}/.OwlBot.yaml
  git add .
  git config --add secrets.allowed "dest.*src"
  git commit -am "chore: setup owlbot configuration"

  cd ../google-cloud-java
  git remote add ${service} ../${service}
  git config --add secrets.allowed "dest.*src"
  git fetch ${service} #--tags
  EDITOR=true git merge --allow-unrelated-histories ${service}/main
  git remote remove ${service}
  rm -rf ../${service}
done

cd ..

# insert processed modules into aggregator pom.xml
awk -v MODULES="`awk -v ORS='\\\\n' '1' repo-modules.txt`" '1;/<modules>/{print MODULES}' ../parent.pom.xml > google-cloud-java/pom.xml

cd google-cloud-java

git add pom.xml
git commit -am 'feat: create aggregator pom'

num_modules="$(wc -l < ../../repos.txt)"
echo "{" >> .release-please-manifest.json

echo ""\""google-cloud-gapic-bom"\"": "\""0.0.0"\""," >> .release-please-manifest.json

# generate BOM of the artifacts in this repository
bom_lines=""
rp_config_line=""
for bom_directory in $(find . -name 'google-*-bom' | sort); do
  repo_metadata="${bom_directory}/../.repo-metadata.json"
  pom_file="${bom_directory}/pom.xml"
  groupId_line=$(grep --max-count=1 'groupId' "${pom_file}")
  artifactId_line=$(grep --max-count=1 'artifactId' "${pom_file}")

  # extracting module name
  prefix="  <artifactId>"
  suffix="-bom</artifactId>"
  artifactName=${artifactId_line#"$prefix"}
  artifactName=${artifactName%"$suffix"}
  artifactName_config=${artifactName};
  prefix="./"
  suffix="/${artifactName}-bom"
  module=${bom_directory#"$prefix"}
  module=${module%"$suffix"}

  version_line=$(grep --max-count=1 'x-version-update' "${pom_file}")

  version_file="${bom_directory}/../versions.txt"

  module_released_version=$(grep google- ${version_file} |head -1 |awk -F: '{print $2}')
  module_snapshot_version=$(grep google- ${version_file} |head -1 |awk -F: '{print $3}')
  pom_directory="${bom_directory}/../pom.xml"
  snapshot_version=""

  if  [[ "${module_snapshot_version}" =~ .*SNAPSHOT ]]; then
      # increment the third digit of the version and overwrite it.
      snapshot_version=$(echo ${module_released_version} |  awk -F'.' '{print $1"."$2"."$3+1}' |  sed s/[.]$//)

      mvn -f ${pom_directory} -U versions:set -DnewVersion=${snapshot_version}
      mvn -f ${bom_directory} -U versions:set -DnewVersion=${snapshot_version}
      #updating gapic bom pom.xml with the snapshot version
      version_line="${version_line/${module_snapshot_version}/${snapshot_version}}"
    fi

  if ! [[ "${module_snapshot_version}" =~ .*SNAPSHOT ]]; then
    # increment the third digit of the version and overwrite it.
    snapshot_version=$(echo ${module_released_version} |  awk -F'.' '{print $1"."$2"."$3+1}' |  sed s/[.]$//)

    mvn -f ${pom_directory} -U versions:set -DnewVersion=${snapshot_version}
    mvn -f ${bom_directory} -U versions:set -DnewVersion=${snapshot_version}
    #updating gapic bom pom.xml with the snapshot version
    version_line="${version_line/${module_snapshot_version}/${snapshot_version}}"
  fi

  #for modules which have artifacts with different versions, we need to bump to snapshot version
  cat ${version_file} | while read line
    do
       if [[ ${line} =~ [0-9] ]] && ! [[ ${line} == *"SNAPSHOT"* ]] ; then
         artifact_name=$(echo "${line}" | awk -F':' '{print $1}')
         old_version=$(echo "${line}" | awk -F':' '{print $3}')
         new_version=$(echo ${old_version} |  awk -F'.' '{print $1"."$2"."$3+1}' |  sed s/[.]$//)
         new_version="${new_version}-SNAPSHOT"
         sed -i.bak "s|${artifact_name}:${old_version}:${old_version}|${artifact_name}:${old_version}:${new_version}|" ${version_file}
         artifact_directory="${bom_directory}/../${artifact_name}"
         mvn -f ${artifact_directory} -U versions:set -DnewVersion=${new_version}
       fi
    done

  cat ${version_file} | while read line
      do
         if [[ ${line} =~ [0-9] ]] && [[ ${line} == *"SNAPSHOT"* ]] ; then
           artifact_name=$(echo "${line}" | awk -F':' '{print $1}')
           old_version=$(echo "${line}" | awk -F':' '{print $2}')
           new_version=$(echo ${old_version} |  awk -F'.' '{print $1"."$2"."$3+1}' |  sed s/[.]$//)
           artifact_directory="${bom_directory}/../${artifact_name}"
           mvn -f ${artifact_directory} -U versions:set -DnewVersion=${new_version}
         fi
      done

  #concatenating module name and module version
  rp_manifest_line=""\""${module}"\"": "\""${module_released_version}"\"""

  rp_config_line+=""\""${module}"\"": {\n\
        "\""component"\"": ""\""${artifactName_config}"\"","\n\
        "\""skip-github-release"\"": "true"\n\
       }"

  #adding " , " where it's necessary
  if [[ $num_modules -gt 1 ]]; then
    rp_manifest_line+=","
    rp_config_line+=",\n    "
    num_modules=$((num_modules-1))
  fi

  #adding the line to manifest config file
  echo "${rp_manifest_line}" >> .release-please-manifest.json

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

echo "}" >> .release-please-manifest.json

awk -v "packagesList=$rp_config_line" '{gsub(/ALL_PACKAGES/,packagesList)}1' \
    ../../release_please_config_raw.json > release-please-config.json

mkdir google-cloud-gapic-bom
cp ../../gapic_bom_versions.txt google-cloud-gapic-bom/versions.txt
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

if grep -q ERROR ../coverage-modules.txt; then
  echo "There was an error in generating coverage-modules.txt"
  exit 1
fi

# insert processed modules into coverage aggregator pom.xml
awk -v MODULES="`awk -v ORS='\\\\n' '1' ../coverage-modules.txt`" '1;/<dependencies>/{print MODULES}' ../../coverage.pom.xml > CoverageAggregator/pom.xml

# add CoverageAggregator to root pom
awk -v MODULE='    <module>CoverageAggregator</module>' '/<\/modules>/{print MODULE};1' pom.xml > pom.xml.tmp && mv pom.xml.tmp pom.xml

git add --all
git commit -am 'feat: create CoverageAggregator module'