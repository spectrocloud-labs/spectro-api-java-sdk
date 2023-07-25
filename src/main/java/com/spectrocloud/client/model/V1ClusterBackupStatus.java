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
import com.spectrocloud.client.model.V1ClusterBackupStatusMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster Backup Status
 */
@Schema(description = "Cluster Backup Status")


public class V1ClusterBackupStatus {
  @SerializedName("clusterBackupStatuses")
  private List<V1ClusterBackupStatusMeta> clusterBackupStatuses = null;

  public V1ClusterBackupStatus clusterBackupStatuses(List<V1ClusterBackupStatusMeta> clusterBackupStatuses) {
    this.clusterBackupStatuses = clusterBackupStatuses;
    return this;
  }

  public V1ClusterBackupStatus addClusterBackupStatusesItem(V1ClusterBackupStatusMeta clusterBackupStatusesItem) {
    if (this.clusterBackupStatuses == null) {
      this.clusterBackupStatuses = new ArrayList<V1ClusterBackupStatusMeta>();
    }
    this.clusterBackupStatuses.add(clusterBackupStatusesItem);
    return this;
  }

   /**
   * Get clusterBackupStatuses
   * @return clusterBackupStatuses
  **/
  @Schema(description = "")
  public List<V1ClusterBackupStatusMeta> getClusterBackupStatuses() {
    return clusterBackupStatuses;
  }

  public void setClusterBackupStatuses(List<V1ClusterBackupStatusMeta> clusterBackupStatuses) {
    this.clusterBackupStatuses = clusterBackupStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterBackupStatus v1ClusterBackupStatus = (V1ClusterBackupStatus) o;
    return Objects.equals(this.clusterBackupStatuses, v1ClusterBackupStatus.clusterBackupStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterBackupStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterBackupStatus {\n");
    
    sb.append("    clusterBackupStatuses: ").append(toIndentedString(clusterBackupStatuses)).append("\n");
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
