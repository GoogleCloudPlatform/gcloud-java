Google Cloud Java Client Examples
=================================

Examples for gcloud-java (Java idiomatic client for [Google Cloud Platform][cloud-platform] services).

[![Build Status](https://travis-ci.org/GoogleCloudPlatform/gcloud-java.svg?branch=master)](https://travis-ci.org/GoogleCloudPlatform/gcloud-java)
[![Coverage Status](https://coveralls.io/repos/GoogleCloudPlatform/gcloud-java/badge.svg?branch=master)](https://coveralls.io/r/GoogleCloudPlatform/gcloud-java?branch=master)
[![Maven](https://img.shields.io/maven-central/v/com.google.gcloud/gcloud-java-examples.svg)]( https://img.shields.io/maven-central/v/com.google.gcloud/gcloud-java-examples.svg)

-  [Homepage] (https://googlecloudplatform.github.io/gcloud-java/)
-  [Examples] (http://googlecloudplatform.github.io/gcloud-java/apidocs/index.html?com/google/gcloud/examples/package-summary.html)

Quickstart
----------
If you are using Maven, add this to your pom.xml file
```xml
<dependency>
  <groupId>com.google.gcloud</groupId>
  <artifactId>gcloud-java-examples</artifactId>
  <version>0.0.12</version>
</dependency>
```
If you are using Gradle, add this to your dependencies
```Groovy
compile 'com.google.gcloud:gcloud-java-examples:jar:0.0.12'
```
If you are using SBT, add this to your dependencies
```Scala
libraryDependencies += "com.google.gcloud" % "gcloud-java-examples" % "0.0.12"
```

To run examples from your command line:

1. Login using gcloud SDK (`gcloud auth login` in command line)

2. Set your current project using `gcloud config set project PROJECT_ID`

3. Compile using Maven (`mvn compile` in command line from your base project directory)

4. Run an example using Maven from command line.

  Here's an example run of `DatastoreExample`.
  
  Note that you have to enable the Google Cloud Datastore API on the [Google Developers Console][developers-console] before running the following commands.
  ```
  $mvn exec:java -Dexec.mainClass="com.google.gcloud.examples.DatastoreExample" -Dexec.args="my_name add my\ comment"
  $mvn exec:java -Dexec.mainClass="com.google.gcloud.examples.DatastoreExample" -Dexec.args="my_name display"
  $mvn exec:java -Dexec.mainClass="com.google.gcloud.examples.DatastoreExample" -Dexec.args="my_name delete"
  ```

  Here's an example run of `StorageExample`.

  Before running the example, go to the [Google Developers Console][developers-console] to ensure that Google Cloud Storage API is enabled and that you have a bucket.  Also ensure that you have a test file (`test.txt` is chosen here) to upload to Cloud Storage stored locally on your machine.
  ```
  $mvn exec:java -Dexec.mainClass="com.google.gcloud.examples.StorageExample" -Dexec.args="upload /path/to/test.txt <bucket_name>"
  $mvn exec:java -Dexec.mainClass="com.google.gcloud.examples.StorageExample" -Dexec.args="list <bucket_name>"
  $mvn exec:java -Dexec.mainClass="com.google.gcloud.examples.StorageExample" -Dexec.args="download <bucket_name> test.txt"
  $mvn exec:java -Dexec.mainClass="com.google.gcloud.examples.StorageExample" -Dexec.args="delete <bucket_name> test.txt"
```

Troubleshooting
---------------

To get help, follow the `gcloud-java` links in the `gcloud-*` [shared Troubleshooting document](https://github.com/GoogleCloudPlatform/gcloud-common/blob/master/troubleshooting/readme.md#troubleshooting).

Java Versions
-------------

Java 7 or above is required for using this client.

Versioning
----------

This library follows [Semantic Versioning] (http://semver.org/).

It is currently in major version zero (``0.y.z``), which means that anything
may change at any time and the public API should not be considered
stable.

Contributing
------------

Contributions to this library are always welcome and highly encouraged.

See `gcloud-java`'s [CONTRIBUTING] documentation and the `gcloud-*` [shared documentation](https://github.com/GoogleCloudPlatform/gcloud-common/blob/master/contributing/readme.md#how-to-contribute-to-gcloud) for more information on how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more information.

License
-------

Apache 2.0 - See [LICENSE] for more information.


[CONTRIBUTING]:https://github.com/GoogleCloudPlatform/gcloud-java/blob/master/CONTRIBUTING.md
[code-of-conduct]:https://github.com/GoogleCloudPlatform/gcloud-java/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[LICENSE]: https://github.com/GoogleCloudPlatform/gcloud-java/blob/master/LICENSE
[cloud-platform]: https://cloud.google.com/
[developers-console]:https://console.developers.google.com/
