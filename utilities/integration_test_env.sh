
# Export test env variables
export GCLOUD_PROJECT="gcloud-devel"
export GOOGLE_APPLICATION_CREDENTIALS=$TRAVIS_BUILD_DIR/signing-tools/gcloud-devel-travis.json
export GOOGLE_API_KEY=$(< $TRAVIS_BUILD_DIR/signing-tools/api_key)

# Ensure latest Google Cloud SDK installed, for commands below
if [ ! -d "$HOME/google-cloud-sdk/bin" ]
then
  rm -rf "$HOME/google-cloud-sdk"
  export CLOUDSDK_CORE_DISABLE_PROMPTS=1
  curl https://sdk.cloud.google.com | bash
fi
gcloud components update
source "$HOME/google-cloud-sdk/path.bash.inc"
gcloud version

# Remove orphaned firewall rules and networks presumed generated by interrupted runs of Compute
# integration tests: see https://github.com/GoogleCloudPlatform/google-cloud-java/issues/2118
firewalls=$(gcloud compute firewall-rules list | cut -f 1 -d ' ' | grep '^test-')
if [[ $firewalls ]]
then
  echo 'Y' | gcloud compute firewall-rules delete $firewalls
fi
networks=$(gcloud compute networks list | cut -f 1 -d ' ' | grep '^test-')
if [[ $networks ]]
then
  echo 'Y' | gcloud compute networks delete $networks
fi
