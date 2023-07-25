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
import com.spectrocloud.client.model.V1ClusterFeatureActor;
import com.spectrocloud.client.model.V1WorkspaceClusterRestoreConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Workspace restore status meta
 */
@Schema(description = "Workspace restore status meta")


public class V1WorkspaceRestoreStatusMeta {
  @SerializedName("actor")
  private V1ClusterFeatureActor actor = null;

  @SerializedName("requestUid")
  private String requestUid = null;

  @SerializedName("workspaceRestoreConfig")
  private V1WorkspaceClusterRestoreConfig workspaceRestoreConfig = null;

  public V1WorkspaceRestoreStatusMeta actor(V1ClusterFeatureActor actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/
  @Schema(description = "")
  public V1ClusterFeatureActor getActor() {
    return actor;
  }

  public void setActor(V1ClusterFeatureActor actor) {
    this.actor = actor;
  }

  public V1WorkspaceRestoreStatusMeta requestUid(String requestUid) {
    this.requestUid = requestUid;
    return this;
  }

   /**
   * Get requestUid
   * @return requestUid
  **/
  @Schema(description = "")
  public String getRequestUid() {
    return requestUid;
  }

  public void setRequestUid(String requestUid) {
    this.requestUid = requestUid;
  }

  public V1WorkspaceRestoreStatusMeta workspaceRestoreConfig(V1WorkspaceClusterRestoreConfig workspaceRestoreConfig) {
    this.workspaceRestoreConfig = workspaceRestoreConfig;
    return this;
  }

   /**
   * Get workspaceRestoreConfig
   * @return workspaceRestoreConfig
  **/
  @Schema(description = "")
  public V1WorkspaceClusterRestoreConfig getWorkspaceRestoreConfig() {
    return workspaceRestoreConfig;
  }

  public void setWorkspaceRestoreConfig(V1WorkspaceClusterRestoreConfig workspaceRestoreConfig) {
    this.workspaceRestoreConfig = workspaceRestoreConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkspaceRestoreStatusMeta v1WorkspaceRestoreStatusMeta = (V1WorkspaceRestoreStatusMeta) o;
    return Objects.equals(this.actor, v1WorkspaceRestoreStatusMeta.actor) &&
        Objects.equals(this.requestUid, v1WorkspaceRestoreStatusMeta.requestUid) &&
        Objects.equals(this.workspaceRestoreConfig, v1WorkspaceRestoreStatusMeta.workspaceRestoreConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, requestUid, workspaceRestoreConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceRestoreStatusMeta {\n");
    
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    requestUid: ").append(toIndentedString(requestUid)).append("\n");
    sb.append("    workspaceRestoreConfig: ").append(toIndentedString(workspaceRestoreConfig)).append("\n");
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
