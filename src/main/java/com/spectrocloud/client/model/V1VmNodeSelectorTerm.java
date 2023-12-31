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
import com.spectrocloud.client.model.V1VmNodeSelectorRequirement;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 */
@Schema(description = "A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.")


public class V1VmNodeSelectorTerm {
  @SerializedName("matchExpressions")
  private List<V1VmNodeSelectorRequirement> matchExpressions = null;

  @SerializedName("matchFields")
  private List<V1VmNodeSelectorRequirement> matchFields = null;

  public V1VmNodeSelectorTerm matchExpressions(List<V1VmNodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1VmNodeSelectorTerm addMatchExpressionsItem(V1VmNodeSelectorRequirement matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<V1VmNodeSelectorRequirement>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#x27;s labels.
   * @return matchExpressions
  **/
  @Schema(description = "A list of node selector requirements by node's labels.")
  public List<V1VmNodeSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<V1VmNodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public V1VmNodeSelectorTerm matchFields(List<V1VmNodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
    return this;
  }

  public V1VmNodeSelectorTerm addMatchFieldsItem(V1VmNodeSelectorRequirement matchFieldsItem) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList<V1VmNodeSelectorRequirement>();
    }
    this.matchFields.add(matchFieldsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#x27;s fields.
   * @return matchFields
  **/
  @Schema(description = "A list of node selector requirements by node's fields.")
  public List<V1VmNodeSelectorRequirement> getMatchFields() {
    return matchFields;
  }

  public void setMatchFields(List<V1VmNodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmNodeSelectorTerm v1VmNodeSelectorTerm = (V1VmNodeSelectorTerm) o;
    return Objects.equals(this.matchExpressions, v1VmNodeSelectorTerm.matchExpressions) &&
        Objects.equals(this.matchFields, v1VmNodeSelectorTerm.matchFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmNodeSelectorTerm {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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
