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
 * V1VmVolumeSnapshotStatus
 */



public class V1VmVolumeSnapshotStatus {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("reason")
  private String reason = null;

  public V1VmVolumeSnapshotStatus enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * True if the volume supports snapshotting
   * @return enabled
  **/
  @Schema(required = true, description = "True if the volume supports snapshotting")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public V1VmVolumeSnapshotStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Volume name
   * @return name
  **/
  @Schema(required = true, description = "Volume name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1VmVolumeSnapshotStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Empty if snapshotting is enabled, contains reason otherwise
   * @return reason
  **/
  @Schema(description = "Empty if snapshotting is enabled, contains reason otherwise")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmVolumeSnapshotStatus v1VmVolumeSnapshotStatus = (V1VmVolumeSnapshotStatus) o;
    return Objects.equals(this.enabled, v1VmVolumeSnapshotStatus.enabled) &&
        Objects.equals(this.name, v1VmVolumeSnapshotStatus.name) &&
        Objects.equals(this.reason, v1VmVolumeSnapshotStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, name, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmVolumeSnapshotStatus {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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