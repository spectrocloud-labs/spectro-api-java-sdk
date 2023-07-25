/*
 * Palette APIs - 3.4
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.spectrocloud.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spectrocloud.client.model.V1ConstraintValidatorResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Constraint validator response
 */
@Schema(description = "Constraint validator response")


public class V1ConstraintValidatorResponse {
  @SerializedName("results")
  private List<V1ConstraintValidatorResult> results = null;

  public V1ConstraintValidatorResponse results(List<V1ConstraintValidatorResult> results) {
    this.results = results;
    return this;
  }

  public V1ConstraintValidatorResponse addResultsItem(V1ConstraintValidatorResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<V1ConstraintValidatorResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<V1ConstraintValidatorResult> getResults() {
    return results;
  }

  public void setResults(List<V1ConstraintValidatorResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ConstraintValidatorResponse v1ConstraintValidatorResponse = (V1ConstraintValidatorResponse) o;
    return Objects.equals(this.results, v1ConstraintValidatorResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ConstraintValidatorResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
