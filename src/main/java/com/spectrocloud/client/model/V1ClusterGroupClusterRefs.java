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
import com.spectrocloud.client.model.V1ClusterGroupClusterRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster group clusters reference
 */
@Schema(description = "Cluster group clusters reference")


public class V1ClusterGroupClusterRefs {
  @SerializedName("clusterRefs")
  private List<V1ClusterGroupClusterRef> clusterRefs = null;

  public V1ClusterGroupClusterRefs clusterRefs(List<V1ClusterGroupClusterRef> clusterRefs) {
    this.clusterRefs = clusterRefs;
    return this;
  }

  public V1ClusterGroupClusterRefs addClusterRefsItem(V1ClusterGroupClusterRef clusterRefsItem) {
    if (this.clusterRefs == null) {
      this.clusterRefs = new ArrayList<V1ClusterGroupClusterRef>();
    }
    this.clusterRefs.add(clusterRefsItem);
    return this;
  }

   /**
   * Get clusterRefs
   * @return clusterRefs
  **/
  @Schema(description = "")
  public List<V1ClusterGroupClusterRef> getClusterRefs() {
    return clusterRefs;
  }

  public void setClusterRefs(List<V1ClusterGroupClusterRef> clusterRefs) {
    this.clusterRefs = clusterRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterGroupClusterRefs v1ClusterGroupClusterRefs = (V1ClusterGroupClusterRefs) o;
    return Objects.equals(this.clusterRefs, v1ClusterGroupClusterRefs.clusterRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRefs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterGroupClusterRefs {\n");
    
    sb.append("    clusterRefs: ").append(toIndentedString(clusterRefs)).append("\n");
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
