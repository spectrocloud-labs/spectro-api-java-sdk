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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 */
@Schema(description = "A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.")


public class V1VmNodeSelectorRequirement {
  @SerializedName("key")
  private String key = null;

  @SerializedName("operator")
  private String operator = null;

  @SerializedName("values")
  private List<String> values = null;

  public V1VmNodeSelectorRequirement key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The label key that the selector applies to.
   * @return key
  **/
  @Schema(required = true, description = "The label key that the selector applies to.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1VmNodeSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Represents a key&#x27;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
   * @return operator
  **/
  @Schema(required = true, description = "Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1VmNodeSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public V1VmNodeSelectorRequirement addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
   * @return values
  **/
  @Schema(description = "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.")
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
    V1VmNodeSelectorRequirement v1VmNodeSelectorRequirement = (V1VmNodeSelectorRequirement) o;
    return Objects.equals(this.key, v1VmNodeSelectorRequirement.key) &&
        Objects.equals(this.operator, v1VmNodeSelectorRequirement.operator) &&
        Objects.equals(this.values, v1VmNodeSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmNodeSelectorRequirement {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
