// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/answer_record.proto

package com.google.cloud.dialogflow.v2beta1;

public interface AgentAssistantFeedbackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AgentAssistantFeedback)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether or not the suggested answer is relevant.
   * For example:
   * * Query: "Can I change my mailing address?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * [answer_relevance][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.answer_relevance]: [AnswerRelevance.IRRELEVANT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance.IRRELEVANT]
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance answer_relevance = 1;</code>
   * @return The enum numeric value on the wire for answerRelevance.
   */
  int getAnswerRelevanceValue();
  /**
   * <pre>
   * Optional. Whether or not the suggested answer is relevant.
   * For example:
   * * Query: "Can I change my mailing address?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * [answer_relevance][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.answer_relevance]: [AnswerRelevance.IRRELEVANT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance.IRRELEVANT]
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance answer_relevance = 1;</code>
   * @return The answerRelevance.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.AnswerRelevance getAnswerRelevance();

  /**
   * <pre>
   * Optional. Whether or not the information in the document is correct.
   * For example:
   * * Query: "Can I return the package in 2 days once received?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * Ground truth: "No return or exchange is allowed."
   * * [document_correctness]: INCORRECT
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentCorrectness document_correctness = 2;</code>
   * @return The enum numeric value on the wire for documentCorrectness.
   */
  int getDocumentCorrectnessValue();
  /**
   * <pre>
   * Optional. Whether or not the information in the document is correct.
   * For example:
   * * Query: "Can I return the package in 2 days once received?"
   * * Suggested document says: "Items must be returned/exchanged within 60
   *   days of the purchase date."
   * * Ground truth: "No return or exchange is allowed."
   * * [document_correctness]: INCORRECT
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentCorrectness document_correctness = 2;</code>
   * @return The documentCorrectness.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentCorrectness getDocumentCorrectness();

  /**
   * <pre>
   * Optional. Whether or not the suggested document is efficient. For example,
   * if the document is poorly written, hard to understand, hard to use or
   * too long to find useful information,
   * [document_efficiency][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.document_efficiency]
   * is
   * [DocumentEfficiency.INEFFICIENT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency.INEFFICIENT].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency document_efficiency = 3;</code>
   * @return The enum numeric value on the wire for documentEfficiency.
   */
  int getDocumentEfficiencyValue();
  /**
   * <pre>
   * Optional. Whether or not the suggested document is efficient. For example,
   * if the document is poorly written, hard to understand, hard to use or
   * too long to find useful information,
   * [document_efficiency][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.document_efficiency]
   * is
   * [DocumentEfficiency.INEFFICIENT][google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency.INEFFICIENT].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency document_efficiency = 3;</code>
   * @return The documentEfficiency.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.DocumentEfficiency getDocumentEfficiency();

  /**
   * <pre>
   * Feedback for conversation summarization.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback summarization_feedback = 4;</code>
   * @return Whether the summarizationFeedback field is set.
   */
  boolean hasSummarizationFeedback();
  /**
   * <pre>
   * Feedback for conversation summarization.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback summarization_feedback = 4;</code>
   * @return The summarizationFeedback.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback getSummarizationFeedback();
  /**
   * <pre>
   * Feedback for conversation summarization.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedback summarization_feedback = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback.SummarizationFeedbackOrBuilder getSummarizationFeedbackOrBuilder();
}
