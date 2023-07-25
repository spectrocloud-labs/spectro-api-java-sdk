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
import com.spectrocloud.client.model.V1ObjectEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Active clusters
 */
@Schema(description = "Active clusters")


public class V1ProjectActiveCluster {
  @SerializedName("clusterRef")
  private V1ObjectEntity clusterRef = null;

  @SerializedName("state")
  private String state = null;

  public V1ProjectActiveCluster clusterRef(V1ObjectEntity clusterRef) {
    this.clusterRef = clusterRef;
    return this;
  }

   /**
   * Get clusterRef
   * @return clusterRef
  **/
  @Schema(description = "")
  public V1ObjectEntity getClusterRef() {
    return clusterRef;
  }

  public void setClusterRef(V1ObjectEntity clusterRef) {
    this.clusterRef = clusterRef;
  }

  public V1ProjectActiveCluster state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectActiveCluster v1ProjectActiveCluster = (V1ProjectActiveCluster) o;
    return Objects.equals(this.clusterRef, v1ProjectActiveCluster.clusterRef) &&
        Objects.equals(this.state, v1ProjectActiveCluster.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRef, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectActiveCluster {\n");
    
    sb.append("    clusterRef: ").append(toIndentedString(clusterRef)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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