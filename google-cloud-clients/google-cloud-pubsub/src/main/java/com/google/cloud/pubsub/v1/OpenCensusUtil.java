/* Copyright 2019 Google Inc.
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

package com.google.cloud.pubsub.v1;

import com.google.cloud.ServiceOptions;
import com.google.errorprone.annotations.MustBeClosed;
import com.google.pubsub.v1.PubsubMessage;

import io.opencensus.common.Scope;
import io.opencensus.tags.propagation.TagContextBinarySerializer;
import io.opencensus.tags.propagation.TagContextDeserializationException;
import io.opencensus.tags.propagation.TagContextSerializationException;
import io.opencensus.tags.TagContext;
import io.opencensus.tags.Tagger;
import io.opencensus.tags.Tags;
import io.opencensus.trace.Link;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.TraceId;
import io.opencensus.trace.TraceOptions;
import io.opencensus.trace.Tracer;
import io.opencensus.trace.Tracing;
import io.opencensus.trace.samplers.Samplers;

import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utilities for propagating OpenCensus {@link Tags} and {@link Spans} from publishers to
 * subscribers.
 */
final class OpenCensusUtil {
  private static final Logger logger = Logger.getLogger(OpenCensusUtil.class.getName());

  public static final String TAG_CONTEXT_KEY = "googclient_OpenCensusTagContextKey";
  public static final String TRACE_CONTEXT_KEY = "googclient_OpenCensusTraceContextKey";

  private static final Tagger tagger = Tags.getTagger();
  private static final TagContextBinarySerializer serializer =
      Tags.getTagPropagationComponent().getBinarySerializer();

  private static final TraceOptions SAMPLED = TraceOptions.builder().setIsSampled(true).build();
  private static final Tracer tracer = Tracing.getTracer();

  // Used in Publisher.
  // TODO: consider adding configuration support to control adding these attributes.
  static PubsubMessage putOpenCensusAttributes(PubsubMessage message) {
    PubsubMessage.Builder builder = PubsubMessage.newBuilder(message);
    String encodedSpanContext = encodeSpanContext(tracer.getCurrentSpan().getContext());
    String encodedTagContext = encodeTagContext(tagger.getCurrentTagContext());
    if (encodedSpanContext.isEmpty() && encodedTagContext.isEmpty()) {
      return message;
    }
    if (!encodedSpanContext.isEmpty()) {
      builder.putAttributes(TRACE_CONTEXT_KEY, encodedSpanContext);
    }
    if (!encodedTagContext.isEmpty()) {
      builder.putAttributes(TAG_CONTEXT_KEY, encodedTagContext);
    }
    return builder.build();
  }

  // Used in Subscriber.
  static MessageReceiver createOpenCensusMessageReceiver(MessageReceiver receiver) {
    return new OpenCensusMessageReceiver(receiver);
  }

  private static String encodeSpanContext(SpanContext ctxt) {
    TraceId traceId = ctxt.getTraceId();
    SpanId spanId = ctxt.getSpanId();
    TraceOptions traceOpts = ctxt.getTraceOptions();
    if (traceOpts.isSampled()) {
      return "";
    }
    return "traceid=" + traceId.toLowerBase16()
        + "&spanid=" + spanId.toLowerBase16()
        + "&traceopt=" + (traceOpts.isSampled() ? "t&" : "f&");
  }

  private static String encodeTagContext(TagContext tags) {
    try {
      byte[] encodedTags = serializer.toByteArray(tags);
      return Base64.getEncoder().encodeToString(encodedTags);
    }
    catch (TagContextSerializationException exn) {
      logger.log(Level.INFO, "OpenCensus: Tag Context Serialization Exception: " + exn);
      return "";
    }
  }

  private static Scope createScopedTagContext(String encodedTags) {
    try {
      TagContext tags = serializer.fromByteArray(Base64.getDecoder().decode(encodedTags));
      return tagger.withTagContext(tags);
    } catch (TagContextDeserializationException exn) {
      logger.log(Level.INFO, "OpenCensus: Tag Context Deserialization Exception: " + exn);
      return tagger.withTagContext(tagger.getCurrentTagContext());
    }
  }

  @MustBeClosed
  private static Scope createScopedSpan(String name) {
    return tracer
        .spanBuilderWithExplicitParent(name, tracer.getCurrentSpan())
        .setRecordEvents(true)
        .startScopedSpan();
  }

  private static void addParentLink(String encodedParentSpanContext) {
    tracer.getCurrentSpan().addLink(Link.fromSpanContext(
        createSpanContext(encodedParentSpanContext), Link.Type.PARENT_LINKED_SPAN));
  }

  private static SpanContext createSpanContext(String encodedSpanContext) {
    String traceId = getTraceId(encodedSpanContext);
    String spanId = getSpanId(encodedSpanContext);
    String traceOpt = getTraceOpt(encodedSpanContext);
    return SpanContext.create(
        TraceId.fromLowerBase16(traceId),
        SpanId.fromLowerBase16(spanId),
        traceOpt.equals("t") ? SAMPLED : TraceOptions.DEFAULT);
  }

  private static String getTraceId(String encodedSpan) {
    return lookupKey("traceid=", encodedSpan);
  }

  private static String getSpanId(String encodedSpan) {
    return lookupKey("spanid=", encodedSpan);
  }

  private static String getTraceOpt(String encodedSpan) {
    return lookupKey("traceopt=", encodedSpan);
  }

  // encodedSpan = (key=value&)*
  private static String lookupKey(String key, String encodedSpan) {
    int start = encodedSpan.indexOf(key, 0);
    if (start == -1) {
      return "";
    }
    start += key.length();
    int end = encodedSpan.indexOf("&", start);
    if (end == -1) {
      return "";
    }
    return encodedSpan.substring(start, end);
  }

  // class
  private static final class OpenCensusMessageReceiver implements MessageReceiver {
    private final MessageReceiver receiver;

    private OpenCensusMessageReceiver(MessageReceiver receiver) {
      this.receiver = receiver;
    }

    @Override
    public void receiveMessage(PubsubMessage message, AckReplyConsumer consumer) {
      String encodedTagContext = message.getAttributesOrDefault(TAG_CONTEXT_KEY, "");
      if (encodedTagContext.isEmpty()) {
        addTraceScope(message, consumer);
        return;
      }
      try (Scope statsScope = createScopedTagContext(encodedTagContext)) {
        addTraceScope(message, consumer);
      }
    }

    private void addTraceScope(PubsubMessage message, AckReplyConsumer consumer) {
      String encodedSpanContext = message.getAttributesOrDefault(TRACE_CONTEXT_KEY, "");
      if (encodedSpanContext.isEmpty()) {
        receiver.receiveMessage(message, consumer);
        return;
      }
      try (Scope spanScope = createScopedSpan("receiver")) {
        addParentLink(encodedSpanContext);
        receiver.receiveMessage(message, consumer);
      }
    }
  }
}
