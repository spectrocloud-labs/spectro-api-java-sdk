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
import com.spectrocloud.client.model.V1ResourceReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Backup restored status
 */
@Schema(description = "Backup restored status")


public class V1BackupRestoreStatusMeta {
  @SerializedName("backupName")
  private String backupName = null;

  @SerializedName("destinationClusterRef")
  private V1ResourceReference destinationClusterRef = null;

  @SerializedName("restoreState")
  private String restoreState = null;

  public V1BackupRestoreStatusMeta backupName(String backupName) {
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

  public V1BackupRestoreStatusMeta destinationClusterRef(V1ResourceReference destinationClusterRef) {
    this.destinationClusterRef = destinationClusterRef;
    return this;
  }

   /**
   * Get destinationClusterRef
   * @return destinationClusterRef
  **/
  @Schema(description = "")
  public V1ResourceReference getDestinationClusterRef() {
    return destinationClusterRef;
  }

  public void setDestinationClusterRef(V1ResourceReference destinationClusterRef) {
    this.destinationClusterRef = destinationClusterRef;
  }

  public V1BackupRestoreStatusMeta restoreState(String restoreState) {
    this.restoreState = restoreState;
    return this;
  }

   /**
   * Get restoreState
   * @return restoreState
  **/
  @Schema(description = "")
  public String getRestoreState() {
    return restoreState;
  }

  public void setRestoreState(String restoreState) {
    this.restoreState = restoreState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1BackupRestoreStatusMeta v1BackupRestoreStatusMeta = (V1BackupRestoreStatusMeta) o;
    return Objects.equals(this.backupName, v1BackupRestoreStatusMeta.backupName) &&
        Objects.equals(this.destinationClusterRef, v1BackupRestoreStatusMeta.destinationClusterRef) &&
        Objects.equals(this.restoreState, v1BackupRestoreStatusMeta.restoreState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, destinationClusterRef, restoreState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1BackupRestoreStatusMeta {\n");
    
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    destinationClusterRef: ").append(toIndentedString(destinationClusterRef)).append("\n");
    sb.append("    restoreState: ").append(toIndentedString(restoreState)).append("\n");
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
