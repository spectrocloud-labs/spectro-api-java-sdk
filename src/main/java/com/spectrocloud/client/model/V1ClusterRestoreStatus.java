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
import com.spectrocloud.client.model.V1ClusterRestoreStatusMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster Restore Status
 */
@Schema(description = "Cluster Restore Status")


public class V1ClusterRestoreStatus {
  @SerializedName("clusterRestoreStatuses")
  private List<V1ClusterRestoreStatusMeta> clusterRestoreStatuses = null;

  public V1ClusterRestoreStatus clusterRestoreStatuses(List<V1ClusterRestoreStatusMeta> clusterRestoreStatuses) {
    this.clusterRestoreStatuses = clusterRestoreStatuses;
    return this;
  }

  public V1ClusterRestoreStatus addClusterRestoreStatusesItem(V1ClusterRestoreStatusMeta clusterRestoreStatusesItem) {
    if (this.clusterRestoreStatuses == null) {
      this.clusterRestoreStatuses = new ArrayList<V1ClusterRestoreStatusMeta>();
    }
    this.clusterRestoreStatuses.add(clusterRestoreStatusesItem);
    return this;
  }

   /**
   * Get clusterRestoreStatuses
   * @return clusterRestoreStatuses
  **/
  @Schema(description = "")
  public List<V1ClusterRestoreStatusMeta> getClusterRestoreStatuses() {
    return clusterRestoreStatuses;
  }

  public void setClusterRestoreStatuses(List<V1ClusterRestoreStatusMeta> clusterRestoreStatuses) {
    this.clusterRestoreStatuses = clusterRestoreStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterRestoreStatus v1ClusterRestoreStatus = (V1ClusterRestoreStatus) o;
    return Objects.equals(this.clusterRestoreStatuses, v1ClusterRestoreStatus.clusterRestoreStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRestoreStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterRestoreStatus {\n");
    
    sb.append("    clusterRestoreStatuses: ").append(toIndentedString(clusterRestoreStatuses)).append("\n");
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
