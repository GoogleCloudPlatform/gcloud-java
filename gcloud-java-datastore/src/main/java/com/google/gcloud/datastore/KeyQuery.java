/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gcloud.datastore;

import com.google.api.services.datastore.DatastoreV1;

/**
 * An implementation of a Google Cloud Datastore key-only query that can be constructed by providing
 * all the specific query elements.
 *
 * @see <a href="https://cloud.google.com/appengine/docs/java/datastore/queries">Datastore
 *     queries</a>
 */
public final class KeyQuery extends StructuredQuery<Key> {

  private static final long serialVersionUID = -746768461459070045L;

  /**
   * A {@code KeyQuery} builder for queries that return {@link Key} results.
   */
  public static final class Builder extends StructuredQuery.BuilderImpl<Key, Builder> {

    Builder(KeyQuery query) {
      super(query);
    }

    Builder() {
      super(ResultType.KEY);
      projection(Projection.property(KEY_PROPERTY_NAME));
    }

    @Override
    Builder mergeFrom(DatastoreV1.Query queryPb) {
      super.mergeFrom(queryPb);
      projection(Projection.property(KEY_PROPERTY_NAME));
      clearGroupBy();
      return this;
    }

    @Override
    public KeyQuery build() {
      return new KeyQuery(this);
    }
  }

  KeyQuery(Builder builder) {
    super(builder);
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }
}
