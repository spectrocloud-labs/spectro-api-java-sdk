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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1TenantUpgradeSettingsEntity
 */



public class V1TenantUpgradeSettingsEntity {
  @SerializedName("enableLock")
  private Boolean enableLock = null;

  @SerializedName("supportedVersionsRange")
  private Integer supportedVersionsRange = null;

  public V1TenantUpgradeSettingsEntity enableLock(Boolean enableLock) {
    this.enableLock = enableLock;
    return this;
  }

   /**
   * Get enableLock
   * @return enableLock
  **/
  @Schema(description = "")
  public Boolean isEnableLock() {
    return enableLock;
  }

  public void setEnableLock(Boolean enableLock) {
    this.enableLock = enableLock;
  }

  public V1TenantUpgradeSettingsEntity supportedVersionsRange(Integer supportedVersionsRange) {
    this.supportedVersionsRange = supportedVersionsRange;
    return this;
  }

   /**
   * Get supportedVersionsRange
   * @return supportedVersionsRange
  **/
  @Schema(description = "")
  public Integer getSupportedVersionsRange() {
    return supportedVersionsRange;
  }

  public void setSupportedVersionsRange(Integer supportedVersionsRange) {
    this.supportedVersionsRange = supportedVersionsRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TenantUpgradeSettingsEntity v1TenantUpgradeSettingsEntity = (V1TenantUpgradeSettingsEntity) o;
    return Objects.equals(this.enableLock, v1TenantUpgradeSettingsEntity.enableLock) &&
        Objects.equals(this.supportedVersionsRange, v1TenantUpgradeSettingsEntity.supportedVersionsRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableLock, supportedVersionsRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TenantUpgradeSettingsEntity {\n");
    
    sb.append("    enableLock: ").append(toIndentedString(enableLock)).append("\n");
    sb.append("    supportedVersionsRange: ").append(toIndentedString(supportedVersionsRange)).append("\n");
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
