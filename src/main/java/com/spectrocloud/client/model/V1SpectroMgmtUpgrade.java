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
import org.threeten.bp.OffsetDateTime;
/**
 * spectro management upgrade logs
 */
@Schema(description = "spectro management upgrade logs")


public class V1SpectroMgmtUpgrade {
  @SerializedName("upgradeTime")
  private OffsetDateTime upgradeTime = null;

  @SerializedName("version")
  private String version = null;

  public V1SpectroMgmtUpgrade upgradeTime(OffsetDateTime upgradeTime) {
    this.upgradeTime = upgradeTime;
    return this;
  }

   /**
   * Get upgradeTime
   * @return upgradeTime
  **/
  @Schema(description = "")
  public OffsetDateTime getUpgradeTime() {
    return upgradeTime;
  }

  public void setUpgradeTime(OffsetDateTime upgradeTime) {
    this.upgradeTime = upgradeTime;
  }

  public V1SpectroMgmtUpgrade version(String version) {
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
    V1SpectroMgmtUpgrade v1SpectroMgmtUpgrade = (V1SpectroMgmtUpgrade) o;
    return Objects.equals(this.upgradeTime, v1SpectroMgmtUpgrade.upgradeTime) &&
        Objects.equals(this.version, v1SpectroMgmtUpgrade.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upgradeTime, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroMgmtUpgrade {\n");
    
    sb.append("    upgradeTime: ").append(toIndentedString(upgradeTime)).append("\n");
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
