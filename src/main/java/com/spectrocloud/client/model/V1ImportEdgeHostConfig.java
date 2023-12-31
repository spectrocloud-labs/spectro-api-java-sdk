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
 * V1ImportEdgeHostConfig
 */



public class V1ImportEdgeHostConfig {
  @SerializedName("edgeHostUid")
  private String edgeHostUid = null;

  @SerializedName("edgeHostUids")
  private List<String> edgeHostUids = null;

  public V1ImportEdgeHostConfig edgeHostUid(String edgeHostUid) {
    this.edgeHostUid = edgeHostUid;
    return this;
  }

   /**
   * Deprecated. Use &#x27;edgeHostUids&#x27; field
   * @return edgeHostUid
  **/
  @Schema(description = "Deprecated. Use 'edgeHostUids' field")
  public String getEdgeHostUid() {
    return edgeHostUid;
  }

  public void setEdgeHostUid(String edgeHostUid) {
    this.edgeHostUid = edgeHostUid;
  }

  public V1ImportEdgeHostConfig edgeHostUids(List<String> edgeHostUids) {
    this.edgeHostUids = edgeHostUids;
    return this;
  }

  public V1ImportEdgeHostConfig addEdgeHostUidsItem(String edgeHostUidsItem) {
    if (this.edgeHostUids == null) {
      this.edgeHostUids = new ArrayList<String>();
    }
    this.edgeHostUids.add(edgeHostUidsItem);
    return this;
  }

   /**
   * Get edgeHostUids
   * @return edgeHostUids
  **/
  @Schema(description = "")
  public List<String> getEdgeHostUids() {
    return edgeHostUids;
  }

  public void setEdgeHostUids(List<String> edgeHostUids) {
    this.edgeHostUids = edgeHostUids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ImportEdgeHostConfig v1ImportEdgeHostConfig = (V1ImportEdgeHostConfig) o;
    return Objects.equals(this.edgeHostUid, v1ImportEdgeHostConfig.edgeHostUid) &&
        Objects.equals(this.edgeHostUids, v1ImportEdgeHostConfig.edgeHostUids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeHostUid, edgeHostUids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ImportEdgeHostConfig {\n");
    
    sb.append("    edgeHostUid: ").append(toIndentedString(edgeHostUid)).append("\n");
    sb.append("    edgeHostUids: ").append(toIndentedString(edgeHostUids)).append("\n");
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
