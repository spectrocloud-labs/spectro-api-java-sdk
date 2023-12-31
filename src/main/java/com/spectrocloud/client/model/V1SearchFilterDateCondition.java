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
import com.spectrocloud.client.model.V1SearchFilterDateConditionMatch;
import com.spectrocloud.client.model.V1SearchFilterDateOperator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1SearchFilterDateCondition
 */



public class V1SearchFilterDateCondition {
  @SerializedName("match")
  private V1SearchFilterDateConditionMatch match = null;

  @SerializedName("negation")
  private Boolean negation = null;

  @SerializedName("operator")
  private V1SearchFilterDateOperator operator = null;

  public V1SearchFilterDateCondition match(V1SearchFilterDateConditionMatch match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @Schema(description = "")
  public V1SearchFilterDateConditionMatch getMatch() {
    return match;
  }

  public void setMatch(V1SearchFilterDateConditionMatch match) {
    this.match = match;
  }

  public V1SearchFilterDateCondition negation(Boolean negation) {
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

  public V1SearchFilterDateCondition operator(V1SearchFilterDateOperator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public V1SearchFilterDateOperator getOperator() {
    return operator;
  }

  public void setOperator(V1SearchFilterDateOperator operator) {
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
    V1SearchFilterDateCondition v1SearchFilterDateCondition = (V1SearchFilterDateCondition) o;
    return Objects.equals(this.match, v1SearchFilterDateCondition.match) &&
        Objects.equals(this.negation, v1SearchFilterDateCondition.negation) &&
        Objects.equals(this.operator, v1SearchFilterDateCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, negation, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SearchFilterDateCondition {\n");
    
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
