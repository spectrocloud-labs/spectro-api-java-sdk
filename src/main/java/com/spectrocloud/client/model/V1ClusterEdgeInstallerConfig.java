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
 * V1ClusterEdgeInstallerConfig
 */



public class V1ClusterEdgeInstallerConfig {
  @SerializedName("installerDownloadLinks")
  private Object installerDownloadLinks = null;

  public V1ClusterEdgeInstallerConfig installerDownloadLinks(Object installerDownloadLinks) {
    this.installerDownloadLinks = installerDownloadLinks;
    return this;
  }

   /**
   * Get installerDownloadLinks
   * @return installerDownloadLinks
  **/
  @Schema(description = "")
  public Object getInstallerDownloadLinks() {
    return installerDownloadLinks;
  }

  public void setInstallerDownloadLinks(Object installerDownloadLinks) {
    this.installerDownloadLinks = installerDownloadLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterEdgeInstallerConfig v1ClusterEdgeInstallerConfig = (V1ClusterEdgeInstallerConfig) o;
    return Objects.equals(this.installerDownloadLinks, v1ClusterEdgeInstallerConfig.installerDownloadLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installerDownloadLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterEdgeInstallerConfig {\n");
    
    sb.append("    installerDownloadLinks: ").append(toIndentedString(installerDownloadLinks)).append("\n");
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
