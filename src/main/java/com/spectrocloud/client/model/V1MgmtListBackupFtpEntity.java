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
import com.spectrocloud.client.model.V1MgmtFileTransferFtpEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * list ftp backups
 */
@Schema(description = "list ftp backups")


public class V1MgmtListBackupFtpEntity {
  @SerializedName("fileTransferConfig")
  private V1MgmtFileTransferFtpEntity fileTransferConfig = null;

  public V1MgmtListBackupFtpEntity fileTransferConfig(V1MgmtFileTransferFtpEntity fileTransferConfig) {
    this.fileTransferConfig = fileTransferConfig;
    return this;
  }

   /**
   * Get fileTransferConfig
   * @return fileTransferConfig
  **/
  @Schema(description = "")
  public V1MgmtFileTransferFtpEntity getFileTransferConfig() {
    return fileTransferConfig;
  }

  public void setFileTransferConfig(V1MgmtFileTransferFtpEntity fileTransferConfig) {
    this.fileTransferConfig = fileTransferConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MgmtListBackupFtpEntity v1MgmtListBackupFtpEntity = (V1MgmtListBackupFtpEntity) o;
    return Objects.equals(this.fileTransferConfig, v1MgmtListBackupFtpEntity.fileTransferConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTransferConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MgmtListBackupFtpEntity {\n");
    
    sb.append("    fileTransferConfig: ").append(toIndentedString(fileTransferConfig)).append("\n");
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