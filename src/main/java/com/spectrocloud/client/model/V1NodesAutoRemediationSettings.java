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
 * V1NodesAutoRemediationSettings
 */



public class V1NodesAutoRemediationSettings {
  @SerializedName("disableNodesAutoRemediation")
  private Boolean disableNodesAutoRemediation = null;

  @SerializedName("isEnabled")
  private Boolean isEnabled = null;

  public V1NodesAutoRemediationSettings disableNodesAutoRemediation(Boolean disableNodesAutoRemediation) {
    this.disableNodesAutoRemediation = disableNodesAutoRemediation;
    return this;
  }

   /**
   * Get disableNodesAutoRemediation
   * @return disableNodesAutoRemediation
  **/
  @Schema(description = "")
  public Boolean isDisableNodesAutoRemediation() {
    return disableNodesAutoRemediation;
  }

  public void setDisableNodesAutoRemediation(Boolean disableNodesAutoRemediation) {
    this.disableNodesAutoRemediation = disableNodesAutoRemediation;
  }

  public V1NodesAutoRemediationSettings isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodesAutoRemediationSettings v1NodesAutoRemediationSettings = (V1NodesAutoRemediationSettings) o;
    return Objects.equals(this.disableNodesAutoRemediation, v1NodesAutoRemediationSettings.disableNodesAutoRemediation) &&
        Objects.equals(this.isEnabled, v1NodesAutoRemediationSettings.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableNodesAutoRemediation, isEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodesAutoRemediationSettings {\n");
    
    sb.append("    disableNodesAutoRemediation: ").append(toIndentedString(disableNodesAutoRemediation)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
