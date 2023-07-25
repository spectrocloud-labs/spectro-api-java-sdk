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
import com.spectrocloud.client.model.V1ResourceReference;
import com.spectrocloud.client.model.V1RestoreStatusMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster Restore Status Meta
 */
@Schema(description = "Cluster Restore Status Meta")


public class V1ClusterRestoreStatusMeta {
  @SerializedName("actor")
  private V1ClusterFeatureActor actor = null;

  @SerializedName("backupName")
  private String backupName = null;

  @SerializedName("backupRequestUid")
  private String backupRequestUid = null;

  @SerializedName("restoreRequestUid")
  private String restoreRequestUid = null;

  @SerializedName("restoreStatusMeta")
  private V1RestoreStatusMeta restoreStatusMeta = null;

  @SerializedName("sourceClusterRef")
  private V1ResourceReference sourceClusterRef = null;

  @SerializedName("state")
  private String state = null;

  public V1ClusterRestoreStatusMeta actor(V1ClusterFeatureActor actor) {
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

  public V1ClusterRestoreStatusMeta backupName(String backupName) {
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

  public V1ClusterRestoreStatusMeta backupRequestUid(String backupRequestUid) {
    this.backupRequestUid = backupRequestUid;
    return this;
  }

   /**
   * Get backupRequestUid
   * @return backupRequestUid
  **/
  @Schema(description = "")
  public String getBackupRequestUid() {
    return backupRequestUid;
  }

  public void setBackupRequestUid(String backupRequestUid) {
    this.backupRequestUid = backupRequestUid;
  }

  public V1ClusterRestoreStatusMeta restoreRequestUid(String restoreRequestUid) {
    this.restoreRequestUid = restoreRequestUid;
    return this;
  }

   /**
   * Get restoreRequestUid
   * @return restoreRequestUid
  **/
  @Schema(description = "")
  public String getRestoreRequestUid() {
    return restoreRequestUid;
  }

  public void setRestoreRequestUid(String restoreRequestUid) {
    this.restoreRequestUid = restoreRequestUid;
  }

  public V1ClusterRestoreStatusMeta restoreStatusMeta(V1RestoreStatusMeta restoreStatusMeta) {
    this.restoreStatusMeta = restoreStatusMeta;
    return this;
  }

   /**
   * Get restoreStatusMeta
   * @return restoreStatusMeta
  **/
  @Schema(description = "")
  public V1RestoreStatusMeta getRestoreStatusMeta() {
    return restoreStatusMeta;
  }

  public void setRestoreStatusMeta(V1RestoreStatusMeta restoreStatusMeta) {
    this.restoreStatusMeta = restoreStatusMeta;
  }

  public V1ClusterRestoreStatusMeta sourceClusterRef(V1ResourceReference sourceClusterRef) {
    this.sourceClusterRef = sourceClusterRef;
    return this;
  }

   /**
   * Get sourceClusterRef
   * @return sourceClusterRef
  **/
  @Schema(description = "")
  public V1ResourceReference getSourceClusterRef() {
    return sourceClusterRef;
  }

  public void setSourceClusterRef(V1ResourceReference sourceClusterRef) {
    this.sourceClusterRef = sourceClusterRef;
  }

  public V1ClusterRestoreStatusMeta state(String state) {
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
    V1ClusterRestoreStatusMeta v1ClusterRestoreStatusMeta = (V1ClusterRestoreStatusMeta) o;
    return Objects.equals(this.actor, v1ClusterRestoreStatusMeta.actor) &&
        Objects.equals(this.backupName, v1ClusterRestoreStatusMeta.backupName) &&
        Objects.equals(this.backupRequestUid, v1ClusterRestoreStatusMeta.backupRequestUid) &&
        Objects.equals(this.restoreRequestUid, v1ClusterRestoreStatusMeta.restoreRequestUid) &&
        Objects.equals(this.restoreStatusMeta, v1ClusterRestoreStatusMeta.restoreStatusMeta) &&
        Objects.equals(this.sourceClusterRef, v1ClusterRestoreStatusMeta.sourceClusterRef) &&
        Objects.equals(this.state, v1ClusterRestoreStatusMeta.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, backupName, backupRequestUid, restoreRequestUid, restoreStatusMeta, sourceClusterRef, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterRestoreStatusMeta {\n");
    
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    backupRequestUid: ").append(toIndentedString(backupRequestUid)).append("\n");
    sb.append("    restoreRequestUid: ").append(toIndentedString(restoreRequestUid)).append("\n");
    sb.append("    restoreStatusMeta: ").append(toIndentedString(restoreStatusMeta)).append("\n");
    sb.append("    sourceClusterRef: ").append(toIndentedString(sourceClusterRef)).append("\n");
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
