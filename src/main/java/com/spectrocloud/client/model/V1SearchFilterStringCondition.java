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
import com.spectrocloud.client.model.V1SearchFilterStringConditionMatch;
import com.spectrocloud.client.model.V1SearchFilterStringOperator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1SearchFilterStringCondition
 */



public class V1SearchFilterStringCondition {
  @SerializedName("ignoreCase")
  private Boolean ignoreCase = null;

  @SerializedName("match")
  private V1SearchFilterStringConditionMatch match = null;

  @SerializedName("negation")
  private Boolean negation = null;

  @SerializedName("operator")
  private V1SearchFilterStringOperator operator = null;

  public V1SearchFilterStringCondition ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @Schema(description = "")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public V1SearchFilterStringCondition match(V1SearchFilterStringConditionMatch match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @Schema(description = "")
  public V1SearchFilterStringConditionMatch getMatch() {
    return match;
  }

  public void setMatch(V1SearchFilterStringConditionMatch match) {
    this.match = match;
  }

  public V1SearchFilterStringCondition negation(Boolean negation) {
    this.negation = negation;
    return this;
  }

   /**
   * Get negation
   * @return negation
  **/
  @Schema(description = "")
  public Boolean isNegation() {
    return negation;
  }

  public void setNegation(Boolean negation) {
    this.negation = negation;
  }

  public V1SearchFilterStringCondition operator(V1SearchFilterStringOperator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public V1SearchFilterStringOperator getOperator() {
    return operator;
  }

  public void setOperator(V1SearchFilterStringOperator operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SearchFilterStringCondition v1SearchFilterStringCondition = (V1SearchFilterStringCondition) o;
    return Objects.equals(this.ignoreCase, v1SearchFilterStringCondition.ignoreCase) &&
        Objects.equals(this.match, v1SearchFilterStringCondition.match) &&
        Objects.equals(this.negation, v1SearchFilterStringCondition.negation) &&
        Objects.equals(this.operator, v1SearchFilterStringCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreCase, match, negation, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SearchFilterStringCondition {\n");
    
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    negation: ").append(toIndentedString(negation)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
