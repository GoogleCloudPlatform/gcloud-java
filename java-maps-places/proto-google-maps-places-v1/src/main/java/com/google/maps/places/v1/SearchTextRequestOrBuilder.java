/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/places/v1/places_service.proto

package com.google.maps.places.v1;

public interface SearchTextRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.SearchTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The text query for textual search.
   * </pre>
   *
   * <code>string text_query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The textQuery.
   */
  java.lang.String getTextQuery();
  /**
   *
   *
   * <pre>
   * Required. The text query for textual search.
   * </pre>
   *
   * <code>string text_query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for textQuery.
   */
  com.google.protobuf.ByteString getTextQueryBytes();

  /**
   *
   *
   * <pre>
   * Place details will be displayed with the preferred language if available.
   * If the language code is unspecified or unrecognized, place details of any
   * language may be returned, with a preference for English if such details
   * exist.
   *
   * Current list of supported languages:
   * https://developers.google.com/maps/faq#languagesupport.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Place details will be displayed with the preferred language if available.
   * If the language code is unspecified or unrecognized, place details of any
   * language may be returned, with a preference for English if such details
   * exist.
   *
   * Current list of supported languages:
   * https://developers.google.com/maps/faq#languagesupport.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The Unicode country/region code (CLDR) of the location where the
   * request is coming from. This parameter is used to display the place
   * details, like region-specific place name, if available. The parameter can
   * affect results based on applicable law.
   *
   * For more information, see
   * https://www.unicode.org/cldr/charts/latest/supplemental/territory_language_information.html.
   *
   *
   * Note that 3-digit region codes are not currently supported.
   * </pre>
   *
   * <code>string region_code = 3;</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();
  /**
   *
   *
   * <pre>
   * The Unicode country/region code (CLDR) of the location where the
   * request is coming from. This parameter is used to display the place
   * details, like region-specific place name, if available. The parameter can
   * affect results based on applicable law.
   *
   * For more information, see
   * https://www.unicode.org/cldr/charts/latest/supplemental/territory_language_information.html.
   *
   *
   * Note that 3-digit region codes are not currently supported.
   * </pre>
   *
   * <code>string region_code = 3;</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * How results will be ranked in the response.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.RankPreference rank_preference = 4;</code>
   *
   * @return The enum numeric value on the wire for rankPreference.
   */
  int getRankPreferenceValue();
  /**
   *
   *
   * <pre>
   * How results will be ranked in the response.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.RankPreference rank_preference = 4;</code>
   *
   * @return The rankPreference.
   */
  com.google.maps.places.v1.SearchTextRequest.RankPreference getRankPreference();

  /**
   *
   *
   * <pre>
   * The requested place type. Full list of types supported:
   * https://developers.google.com/maps/documentation/places/web-service/place-types.
   * Only support one included type.
   * </pre>
   *
   * <code>string included_type = 6;</code>
   *
   * @return The includedType.
   */
  java.lang.String getIncludedType();
  /**
   *
   *
   * <pre>
   * The requested place type. Full list of types supported:
   * https://developers.google.com/maps/documentation/places/web-service/place-types.
   * Only support one included type.
   * </pre>
   *
   * <code>string included_type = 6;</code>
   *
   * @return The bytes for includedType.
   */
  com.google.protobuf.ByteString getIncludedTypeBytes();

  /**
   *
   *
   * <pre>
   * Used to restrict the search to places that are currently open.  The default
   * is false.
   * </pre>
   *
   * <code>bool open_now = 7;</code>
   *
   * @return The openNow.
   */
  boolean getOpenNow();

  /**
   *
   *
   * <pre>
   * Filter out results whose average user rating is strictly less than this
   * limit. A valid value must be a float between 0 and 5 (inclusively) at a
   * 0.5 cadence i.e. [0, 0.5, 1.0, ... , 5.0] inclusively. The input rating
   * will round up to the nearest 0.5(ceiling). For instance, a rating of 0.6
   * will eliminate all results with a less than 1.0 rating.
   * </pre>
   *
   * <code>double min_rating = 9;</code>
   *
   * @return The minRating.
   */
  double getMinRating();

  /**
   *
   *
   * <pre>
   * Maximum number of results to return. It must be between 1 and 20,
   * inclusively. The default is 20.  If the number is unset, it falls back to
   * the upper limit. If the number is set to negative or exceeds the upper
   * limit, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>int32 max_result_count = 10;</code>
   *
   * @return The maxResultCount.
   */
  int getMaxResultCount();

  /**
   *
   *
   * <pre>
   * Used to restrict the search to places that are marked as certain price
   * levels. Users can choose any combinations of price levels. Default to
   * select all price levels.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.PriceLevel price_levels = 11;</code>
   *
   * @return A list containing the priceLevels.
   */
  java.util.List<com.google.maps.places.v1.PriceLevel> getPriceLevelsList();
  /**
   *
   *
   * <pre>
   * Used to restrict the search to places that are marked as certain price
   * levels. Users can choose any combinations of price levels. Default to
   * select all price levels.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.PriceLevel price_levels = 11;</code>
   *
   * @return The count of priceLevels.
   */
  int getPriceLevelsCount();
  /**
   *
   *
   * <pre>
   * Used to restrict the search to places that are marked as certain price
   * levels. Users can choose any combinations of price levels. Default to
   * select all price levels.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.PriceLevel price_levels = 11;</code>
   *
   * @param index The index of the element to return.
   * @return The priceLevels at the given index.
   */
  com.google.maps.places.v1.PriceLevel getPriceLevels(int index);
  /**
   *
   *
   * <pre>
   * Used to restrict the search to places that are marked as certain price
   * levels. Users can choose any combinations of price levels. Default to
   * select all price levels.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.PriceLevel price_levels = 11;</code>
   *
   * @return A list containing the enum numeric values on the wire for priceLevels.
   */
  java.util.List<java.lang.Integer> getPriceLevelsValueList();
  /**
   *
   *
   * <pre>
   * Used to restrict the search to places that are marked as certain price
   * levels. Users can choose any combinations of price levels. Default to
   * select all price levels.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.PriceLevel price_levels = 11;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of priceLevels at the given index.
   */
  int getPriceLevelsValue(int index);

  /**
   *
   *
   * <pre>
   * Used to set strict type filtering for included_type. If set to true, only
   * results of the same type will be returned. Default to false.
   * </pre>
   *
   * <code>bool strict_type_filtering = 12;</code>
   *
   * @return The strictTypeFiltering.
   */
  boolean getStrictTypeFiltering();

  /**
   *
   *
   * <pre>
   * The region to search. This location serves as a bias which means results
   * around given location might be returned. Cannot be set along with
   * location_restriction.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.LocationBias location_bias = 13;</code>
   *
   * @return Whether the locationBias field is set.
   */
  boolean hasLocationBias();
  /**
   *
   *
   * <pre>
   * The region to search. This location serves as a bias which means results
   * around given location might be returned. Cannot be set along with
   * location_restriction.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.LocationBias location_bias = 13;</code>
   *
   * @return The locationBias.
   */
  com.google.maps.places.v1.SearchTextRequest.LocationBias getLocationBias();
  /**
   *
   *
   * <pre>
   * The region to search. This location serves as a bias which means results
   * around given location might be returned. Cannot be set along with
   * location_restriction.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.LocationBias location_bias = 13;</code>
   */
  com.google.maps.places.v1.SearchTextRequest.LocationBiasOrBuilder getLocationBiasOrBuilder();

  /**
   *
   *
   * <pre>
   * The region to search. This location serves as a restriction which means
   * results outside given location will not be returned. Cannot be set along
   * with location_bias.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.LocationRestriction location_restriction = 14;
   * </code>
   *
   * @return Whether the locationRestriction field is set.
   */
  boolean hasLocationRestriction();
  /**
   *
   *
   * <pre>
   * The region to search. This location serves as a restriction which means
   * results outside given location will not be returned. Cannot be set along
   * with location_bias.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.LocationRestriction location_restriction = 14;
   * </code>
   *
   * @return The locationRestriction.
   */
  com.google.maps.places.v1.SearchTextRequest.LocationRestriction getLocationRestriction();
  /**
   *
   *
   * <pre>
   * The region to search. This location serves as a restriction which means
   * results outside given location will not be returned. Cannot be set along
   * with location_bias.
   * </pre>
   *
   * <code>.google.maps.places.v1.SearchTextRequest.LocationRestriction location_restriction = 14;
   * </code>
   */
  com.google.maps.places.v1.SearchTextRequest.LocationRestrictionOrBuilder
      getLocationRestrictionOrBuilder();
}
