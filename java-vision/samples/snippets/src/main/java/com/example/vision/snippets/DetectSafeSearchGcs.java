/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.vision.snippets;

// [START vision_safe_search_detection_gcs]

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Feature.Type;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.cloud.vision.v1.ImageSource;
import com.google.cloud.vision.v1.SafeSearchAnnotation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DetectSafeSearchGcs {

  public static void detectSafeSearchGcs() throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String filePath = "gs://your-gcs-bucket/path/to/image/file.jpg";
    detectSafeSearchGcs(filePath);
  }

  // Detects whether the specified image on Google Cloud Storage has features you would want to
  // moderate.
  public static void detectSafeSearchGcs(String gcsPath) throws IOException {
    List<AnnotateImageRequest> requests = new ArrayList<>();

    ImageSource imgSource = ImageSource.newBuilder().setGcsImageUri(gcsPath).build();
    Image img = Image.newBuilder().setSource(imgSource).build();
    Feature feat = Feature.newBuilder().setType(Type.SAFE_SEARCH_DETECTION).build();
    AnnotateImageRequest request =
        AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
    requests.add(request);

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
      BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
      List<AnnotateImageResponse> responses = response.getResponsesList();

      for (AnnotateImageResponse res : responses) {
        if (res.hasError()) {
          System.out.format("Error: %s%n", res.getError().getMessage());
          return;
        }

        // For full list of available annotations, see http://g.co/cloud/vision/docs
        SafeSearchAnnotation annotation = res.getSafeSearchAnnotation();
        System.out.format(
            "adult: %s%nmedical: %s%nspoofed: %s%nviolence: %s%nracy: %s%n",
            annotation.getAdult(),
            annotation.getMedical(),
            annotation.getSpoof(),
            annotation.getViolence(),
            annotation.getRacy());
      }
    }
  }
}
// [END vision_safe_search_detection_gcs]
