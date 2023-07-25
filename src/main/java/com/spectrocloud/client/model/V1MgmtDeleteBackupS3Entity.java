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
import com.spectrocloud.client.model.V1MgmtFileTransferS3Entity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * delete backups based on retention period
 */
@Schema(description = "delete backups based on retention period")


public class V1MgmtDeleteBackupS3Entity {
  @SerializedName("fileTransferConfig")
  private V1MgmtFileTransferS3Entity fileTransferConfig = null;

  @SerializedName("retentionPeriod")
  private Integer retentionPeriod = null;

  public V1MgmtDeleteBackupS3Entity fileTransferConfig(V1MgmtFileTransferS3Entity fileTransferConfig) {
    this.fileTransferConfig = fileTransferConfig;
    return this;
  }

   /**
   * Get fileTransferConfig
   * @return fileTransferConfig
  **/
  @Schema(description = "")
  public V1MgmtFileTransferS3Entity getFileTransferConfig() {
    return fileTransferConfig;
  }

  public void setFileTransferConfig(V1MgmtFileTransferS3Entity fileTransferConfig) {
    this.fileTransferConfig = fileTransferConfig;
  }

  public V1MgmtDeleteBackupS3Entity retentionPeriod(Integer retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
    return this;
  }

   /**
   * Get retentionPeriod
   * @return retentionPeriod
  **/
  @Schema(description = "")
  public Integer getRetentionPeriod() {
    return retentionPeriod;
  }

  public void setRetentionPeriod(Integer retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MgmtDeleteBackupS3Entity v1MgmtDeleteBackupS3Entity = (V1MgmtDeleteBackupS3Entity) o;
    return Objects.equals(this.fileTransferConfig, v1MgmtDeleteBackupS3Entity.fileTransferConfig) &&
        Objects.equals(this.retentionPeriod, v1MgmtDeleteBackupS3Entity.retentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTransferConfig, retentionPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MgmtDeleteBackupS3Entity {\n");
    
    sb.append("    fileTransferConfig: ").append(toIndentedString(fileTransferConfig)).append("\n");
    sb.append("    retentionPeriod: ").append(toIndentedString(retentionPeriod)).append("\n");
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
