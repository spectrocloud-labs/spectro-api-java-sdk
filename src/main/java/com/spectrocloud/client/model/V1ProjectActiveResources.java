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
import com.spectrocloud.client.model.V1ProjectActiveAppDeployments;
import com.spectrocloud.client.model.V1ProjectActiveClusters;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Active project resources
 */
@Schema(description = "Active project resources")


public class V1ProjectActiveResources {
  @SerializedName("appDeployments")
  private V1ProjectActiveAppDeployments appDeployments = null;

  @SerializedName("clusters")
  private V1ProjectActiveClusters clusters = null;

  @SerializedName("virtualClusters")
  private V1ProjectActiveClusters virtualClusters = null;

  public V1ProjectActiveResources appDeployments(V1ProjectActiveAppDeployments appDeployments) {
    this.appDeployments = appDeployments;
    return this;
  }

   /**
   * Get appDeployments
   * @return appDeployments
  **/
  @Schema(description = "")
  public V1ProjectActiveAppDeployments getAppDeployments() {
    return appDeployments;
  }

  public void setAppDeployments(V1ProjectActiveAppDeployments appDeployments) {
    this.appDeployments = appDeployments;
  }

  public V1ProjectActiveResources clusters(V1ProjectActiveClusters clusters) {
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @Schema(description = "")
  public V1ProjectActiveClusters getClusters() {
    return clusters;
  }

  public void setClusters(V1ProjectActiveClusters clusters) {
    this.clusters = clusters;
  }

  public V1ProjectActiveResources virtualClusters(V1ProjectActiveClusters virtualClusters) {
    this.virtualClusters = virtualClusters;
    return this;
  }

   /**
   * Get virtualClusters
   * @return virtualClusters
  **/
  @Schema(description = "")
  public V1ProjectActiveClusters getVirtualClusters() {
    return virtualClusters;
  }

  public void setVirtualClusters(V1ProjectActiveClusters virtualClusters) {
    this.virtualClusters = virtualClusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectActiveResources v1ProjectActiveResources = (V1ProjectActiveResources) o;
    return Objects.equals(this.appDeployments, v1ProjectActiveResources.appDeployments) &&
        Objects.equals(this.clusters, v1ProjectActiveResources.clusters) &&
        Objects.equals(this.virtualClusters, v1ProjectActiveResources.virtualClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeployments, clusters, virtualClusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectActiveResources {\n");
    
    sb.append("    appDeployments: ").append(toIndentedString(appDeployments)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    virtualClusters: ").append(toIndentedString(virtualClusters)).append("\n");
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
