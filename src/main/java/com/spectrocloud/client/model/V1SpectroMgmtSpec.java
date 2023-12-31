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
 * spectro management specifications
 */
@Schema(description = "spectro management specifications")


public class V1SpectroMgmtSpec {
  @SerializedName("installerMode")
  private String installerMode = null;

  @SerializedName("spectroClusterUid")
  private String spectroClusterUid = null;

  @SerializedName("targetVersion")
  private String targetVersion = null;

  @SerializedName("version")
  private String version = null;

  public V1SpectroMgmtSpec installerMode(String installerMode) {
    this.installerMode = installerMode;
    return this;
  }

   /**
   * Get installerMode
   * @return installerMode
  **/
  @Schema(description = "")
  public String getInstallerMode() {
    return installerMode;
  }

  public void setInstallerMode(String installerMode) {
    this.installerMode = installerMode;
  }

  public V1SpectroMgmtSpec spectroClusterUid(String spectroClusterUid) {
    this.spectroClusterUid = spectroClusterUid;
    return this;
  }

   /**
   * Get spectroClusterUid
   * @return spectroClusterUid
  **/
  @Schema(description = "")
  public String getSpectroClusterUid() {
    return spectroClusterUid;
  }

  public void setSpectroClusterUid(String spectroClusterUid) {
    this.spectroClusterUid = spectroClusterUid;
  }

  public V1SpectroMgmtSpec targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

   /**
   * Get targetVersion
   * @return targetVersion
  **/
  @Schema(description = "")
  public String getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  public V1SpectroMgmtSpec version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroMgmtSpec v1SpectroMgmtSpec = (V1SpectroMgmtSpec) o;
    return Objects.equals(this.installerMode, v1SpectroMgmtSpec.installerMode) &&
        Objects.equals(this.spectroClusterUid, v1SpectroMgmtSpec.spectroClusterUid) &&
        Objects.equals(this.targetVersion, v1SpectroMgmtSpec.targetVersion) &&
        Objects.equals(this.version, v1SpectroMgmtSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installerMode, spectroClusterUid, targetVersion, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroMgmtSpec {\n");
    
    sb.append("    installerMode: ").append(toIndentedString(installerMode)).append("\n");
    sb.append("    spectroClusterUid: ").append(toIndentedString(spectroClusterUid)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
