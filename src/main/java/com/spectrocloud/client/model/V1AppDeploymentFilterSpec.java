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
import com.spectrocloud.client.model.V1FilterArray;
import com.spectrocloud.client.model.V1FilterString;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application deployment filter spec
 */
@Schema(description = "Application deployment filter spec")


public class V1AppDeploymentFilterSpec {
  @SerializedName("appDeploymentName")
  private V1FilterString appDeploymentName = null;

  @SerializedName("clusterUids")
  private V1FilterArray clusterUids = null;

  @SerializedName("tags")
  private V1FilterArray tags = null;

  public V1AppDeploymentFilterSpec appDeploymentName(V1FilterString appDeploymentName) {
    this.appDeploymentName = appDeploymentName;
    return this;
  }

   /**
   * Get appDeploymentName
   * @return appDeploymentName
  **/
  @Schema(description = "")
  public V1FilterString getAppDeploymentName() {
    return appDeploymentName;
  }

  public void setAppDeploymentName(V1FilterString appDeploymentName) {
    this.appDeploymentName = appDeploymentName;
  }

  public V1AppDeploymentFilterSpec clusterUids(V1FilterArray clusterUids) {
    this.clusterUids = clusterUids;
    return this;
  }

   /**
   * Get clusterUids
   * @return clusterUids
  **/
  @Schema(description = "")
  public V1FilterArray getClusterUids() {
    return clusterUids;
  }

  public void setClusterUids(V1FilterArray clusterUids) {
    this.clusterUids = clusterUids;
  }

  public V1AppDeploymentFilterSpec tags(V1FilterArray tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public V1FilterArray getTags() {
    return tags;
  }

  public void setTags(V1FilterArray tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppDeploymentFilterSpec v1AppDeploymentFilterSpec = (V1AppDeploymentFilterSpec) o;
    return Objects.equals(this.appDeploymentName, v1AppDeploymentFilterSpec.appDeploymentName) &&
        Objects.equals(this.clusterUids, v1AppDeploymentFilterSpec.clusterUids) &&
        Objects.equals(this.tags, v1AppDeploymentFilterSpec.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeploymentName, clusterUids, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppDeploymentFilterSpec {\n");
    
    sb.append("    appDeploymentName: ").append(toIndentedString(appDeploymentName)).append("\n");
    sb.append("    clusterUids: ").append(toIndentedString(clusterUids)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
