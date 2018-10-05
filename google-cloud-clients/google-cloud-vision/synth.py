# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""

import synthtool as s
import synthtool.gcp as gcp

gapic = gcp.GAPICGenerator()
common_templates = gcp.CommonTemplates()

for version in ["v1", "v1p1beta1", "v1p2beta1", "v1p3beta1"]:
    library = gapic.java_library(
        service='vision',
        version=version,
        config_path=f'/google/cloud/vision/artman_vision_{version}.yaml',
        artman_output_name='')

    s.copy(library / f'gapic-google-cloud-vision-{version}/src', 'src')
    s.copy(library / f'grpc-google-cloud-vision-{version}/src', f'../../google-api-grpc/grpc-google-cloud-vision-{version}/src')
    s.copy(library / f'proto-google-cloud-vision-{version}/src', f'../../google-api-grpc/proto-google-cloud-vision-{version}/src')
