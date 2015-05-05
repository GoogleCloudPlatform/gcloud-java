/* * Copyright 2015 Google Inc. All Rights Reserved. * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * *       http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */package com.google.gcloud.spi;import com.google.api.services.storage.model.Bucket;import com.google.api.services.storage.model.StorageObject;import com.google.common.collect.ImmutableList;import com.google.common.collect.ImmutableMap;import com.google.gcloud.storage.StorageServiceException;import java.util.List;import java.util.Map;public interface StorageRpc {  enum Option {    PREDEFINED_ACL("predefinedAcl"),    PREDEFINED_DEFAULT_OBJECT_ACL("predefinedDefaultObjectAcl"),    IF_METAGENERATION_MATCH("ifMetagenerationMatch"),    IF_METAGENERATION_NOT_MATCH("ifMetagenerationNotMatch"),    IF_GENERATION_NOT_MATCH("ifGenerationMatch"),    IF_GENERATION_MATCH("ifGenerationNotMatch"),    IF_SOURCE_METAGENERATION_MATCH("ifSourceMetagenerationMatch"),    IF_SOURCE_METAGENERATION_NOT_MATCH("ifSourceMetagenerationNotMatch"),    IF_SOURCE_GENERATION_MATCH("ifSourceGenerationMatch"),    IF_SOURCE_GENERATION_NOT_MATCH("ifSourceGenerationNotMatch"),    PREFIX("prefix"),    MAX_RESULTS("maxResults"),    PAGE_TOKEN("pageToken"),    DELIMITER("delimiter"),    VERSIONS("versions");    private final String value;    Option(String value) {      this.value = value;    }    public String value() {      return value;    }    @SuppressWarnings("unchecked")    <T> T get(Map<Option, ?> options) {      return (T) options.get(this);    }    String getString(Map<Option, ?> options) {      return get(options);    }    Long getLong(Map<Option, ?> options) {      return get(options);    }    Boolean getBoolean(Map<Option, ?> options) {      return get(options);    }  }  class Tuple<X, Y> {    private final X x;    private final Y y;    private Tuple(X x, Y y) {      this.x = x;      this.y = y;    }    public static <X, Y> Tuple<X, Y> of(X x, Y y) {      return new Tuple<>(x, y);    }    public X x() {      return x;    }    public Y y() {      return y;    }  }  class BatchRequest {    public final List<Tuple<StorageObject, Map<Option, ?>>> toDelete;    public final List<Tuple<StorageObject, Map<Option, ?>>> toUpdate;    public final List<Tuple<StorageObject, Map<Option, ?>>> toGet;    public BatchRequest(Iterable<Tuple<StorageObject, Map<Option, ?>>> toDelete,        Iterable<Tuple<StorageObject, Map<Option, ?>>> toUpdate,        Iterable<Tuple<StorageObject, Map<Option, ?>>> toGet) {      this.toDelete = ImmutableList.copyOf(toDelete);      this.toUpdate = ImmutableList.copyOf(toUpdate);      this.toGet = ImmutableList.copyOf(toGet);    }  }  class BatchResponse {    public final Map<StorageObject, Tuple<Boolean, StorageServiceException>> deletes;    public final Map<StorageObject, Tuple<StorageObject, StorageServiceException>> updates;    public final Map<StorageObject, Tuple<StorageObject, StorageServiceException>> gets;    public BatchResponse(Map<StorageObject, Tuple<Boolean, StorageServiceException>> deletes,        Map<StorageObject, Tuple<StorageObject, StorageServiceException>> updates,        Map<StorageObject, Tuple<StorageObject, StorageServiceException>> gets) {      this.deletes = ImmutableMap.copyOf(deletes);      this.updates = ImmutableMap.copyOf(updates);      this.gets = ImmutableMap.copyOf(gets);    }  }  Bucket create(Bucket bucket, Map<Option, ?> options) throws StorageServiceException;  StorageObject create(StorageObject object, byte[] content, Map<Option, ?> options)      throws StorageServiceException;  Tuple<String, Iterable<Bucket>> list(Map<Option, ?> options) throws StorageServiceException;  Tuple<String, Iterable<StorageObject>> list(String bucket, Map<Option, ?> options)      throws StorageServiceException;  Bucket get(Bucket bucket, Map<Option, ?> options) throws StorageServiceException;  StorageObject get(StorageObject object, Map<Option, ?> options)      throws StorageServiceException;  Bucket patch(Bucket bucket, Map<Option, ?> options) throws StorageServiceException;  StorageObject patch(StorageObject storageObject, Map<Option, ?> options)      throws StorageServiceException;  boolean delete(Bucket bucket, Map<Option, ?> options) throws StorageServiceException;  boolean delete(StorageObject object, Map<Option, ?> options) throws StorageServiceException;  BatchResponse batch(BatchRequest request) throws StorageServiceException;  StorageObject compose(Iterable<StorageObject> sources, StorageObject target,      Map<Option, ?> targetOptions) throws StorageServiceException;  StorageObject copy(StorageObject source, Map<Option, ?> sourceOptions,      StorageObject target, Map<Option, ?> targetOptions) throws StorageServiceException;  byte[] load(StorageObject storageObject, Map<Option, ?> options)      throws StorageServiceException;  byte[] read(StorageObject from, Map<Option, ?> options, int position, int bytes)      throws StorageServiceException;  String open(StorageObject object, Map<Option, ?> options) throws StorageServiceException;  void write(byte[] bytes, StorageObject object, String uploadId, int position, boolean last)      throws StorageServiceException;}