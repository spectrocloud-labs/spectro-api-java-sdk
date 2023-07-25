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
import com.spectrocloud.client.model.V1SearchFilterKeyValueOperator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1TagFilterItem
 */



public class V1TagFilterItem {
  @SerializedName("key")
  private String key = null;

  @SerializedName("negation")
  private Boolean negation = null;

  @SerializedName("operator")
  private V1SearchFilterKeyValueOperator operator = null;

  @SerializedName("values")
  private List<String> values = null;

  public V1TagFilterItem key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1TagFilterItem negation(Boolean negation) {
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

  public V1TagFilterItem operator(V1SearchFilterKeyValueOperator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public V1SearchFilterKeyValueOperator getOperator() {
    return operator;
  }

  public void setOperator(V1SearchFilterKeyValueOperator operator) {
    this.operator = operator;
  }

  public V1TagFilterItem values(List<String> values) {
    this.values = values;
    return this;
  }

  public V1TagFilterItem addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TagFilterItem v1TagFilterItem = (V1TagFilterItem) o;
    return Objects.equals(this.key, v1TagFilterItem.key) &&
        Objects.equals(this.negation, v1TagFilterItem.negation) &&
        Objects.equals(this.operator, v1TagFilterItem.operator) &&
        Objects.equals(this.values, v1TagFilterItem.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, negation, operator, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TagFilterItem {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    negation: ").append(toIndentedString(negation)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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