#
# Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

# Current working directory will be <repo-root>/.terraform/
source ./helpers/get-module-output.sh

CONTAINER_NETWORK_NAME=$(getModuleOutput java-container container_network_name)
echo "Setting environment variable CONTAINER_NETWORK_NAME=$CONTAINER_NETWORK_NAME"
export CONTAINER_NETWORK_NAME
