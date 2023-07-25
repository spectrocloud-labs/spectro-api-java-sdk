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
import com.spectrocloud.client.model.V1WorkspaceClusterRestoreState;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Workspace cluster restore response
 */
@Schema(description = "Workspace cluster restore response")


public class V1WorkspaceClusterRestoreResponse {
  @SerializedName("backupName")
  private String backupName = null;

  @SerializedName("clusterName")
  private String clusterName = null;

  @SerializedName("clusterUid")
  private String clusterUid = null;

  @SerializedName("restoreStatusMeta")
  private V1WorkspaceClusterRestoreState restoreStatusMeta = null;

  @SerializedName("restoreUid")
  private String restoreUid = null;

  public V1WorkspaceClusterRestoreResponse backupName(String backupName) {
    this.backupName = backupName;
    return this;
  }

   /**
   * Get backupName
   * @return backupName
  **/
  @Schema(description = "")
  public String getBackupName() {
    return backupName;
  }

  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  public V1WorkspaceClusterRestoreResponse clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Get clusterName
   * @return clusterName
  **/
  @Schema(description = "")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public V1WorkspaceClusterRestoreResponse clusterUid(String clusterUid) {
    this.clusterUid = clusterUid;
    return this;
  }

   /**
   * Get clusterUid
   * @return clusterUid
  **/
  @Schema(description = "")
  public String getClusterUid() {
    return clusterUid;
  }

  public void setClusterUid(String clusterUid) {
    this.clusterUid = clusterUid;
  }

  public V1WorkspaceClusterRestoreResponse restoreStatusMeta(V1WorkspaceClusterRestoreState restoreStatusMeta) {
    this.restoreStatusMeta = restoreStatusMeta;
    return this;
  }

   /**
   * Get restoreStatusMeta
   * @return restoreStatusMeta
  **/
  @Schema(description = "")
  public V1WorkspaceClusterRestoreState getRestoreStatusMeta() {
    return restoreStatusMeta;
  }

  public void setRestoreStatusMeta(V1WorkspaceClusterRestoreState restoreStatusMeta) {
    this.restoreStatusMeta = restoreStatusMeta;
  }

  public V1WorkspaceClusterRestoreResponse restoreUid(String restoreUid) {
    this.restoreUid = restoreUid;
    return this;
  }

   /**
   * Get restoreUid
   * @return restoreUid
  **/
  @Schema(description = "")
  public String getRestoreUid() {
    return restoreUid;
  }

  public void setRestoreUid(String restoreUid) {
    this.restoreUid = restoreUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkspaceClusterRestoreResponse v1WorkspaceClusterRestoreResponse = (V1WorkspaceClusterRestoreResponse) o;
    return Objects.equals(this.backupName, v1WorkspaceClusterRestoreResponse.backupName) &&
        Objects.equals(this.clusterName, v1WorkspaceClusterRestoreResponse.clusterName) &&
        Objects.equals(this.clusterUid, v1WorkspaceClusterRestoreResponse.clusterUid) &&
        Objects.equals(this.restoreStatusMeta, v1WorkspaceClusterRestoreResponse.restoreStatusMeta) &&
        Objects.equals(this.restoreUid, v1WorkspaceClusterRestoreResponse.restoreUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, clusterName, clusterUid, restoreStatusMeta, restoreUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceClusterRestoreResponse {\n");
    
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterUid: ").append(toIndentedString(clusterUid)).append("\n");
    sb.append("    restoreStatusMeta: ").append(toIndentedString(restoreStatusMeta)).append("\n");
    sb.append("    restoreUid: ").append(toIndentedString(restoreUid)).append("\n");
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
