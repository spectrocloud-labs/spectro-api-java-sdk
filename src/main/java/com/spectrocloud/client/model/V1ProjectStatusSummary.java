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
import com.spectrocloud.client.model.V1ProjectStatus;
import com.spectrocloud.client.model.V1ProjectUsageSummary;
import com.spectrocloud.client.model.V1SpectroClustersHealth;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Project status summary
 */
@Schema(description = "Project status summary")


public class V1ProjectStatusSummary {
  @SerializedName("clustersHealth")
  private V1SpectroClustersHealth clustersHealth = null;

  @SerializedName("status")
  private V1ProjectStatus status = null;

  @SerializedName("usage")
  private V1ProjectUsageSummary usage = null;

  public V1ProjectStatusSummary clustersHealth(V1SpectroClustersHealth clustersHealth) {
    this.clustersHealth = clustersHealth;
    return this;
  }

   /**
   * Get clustersHealth
   * @return clustersHealth
  **/
  @Schema(description = "")
  public V1SpectroClustersHealth getClustersHealth() {
    return clustersHealth;
  }

  public void setClustersHealth(V1SpectroClustersHealth clustersHealth) {
    this.clustersHealth = clustersHealth;
  }

  public V1ProjectStatusSummary status(V1ProjectStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1ProjectStatus getStatus() {
    return status;
  }

  public void setStatus(V1ProjectStatus status) {
    this.status = status;
  }

  public V1ProjectStatusSummary usage(V1ProjectUsageSummary usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @Schema(description = "")
  public V1ProjectUsageSummary getUsage() {
    return usage;
  }

  public void setUsage(V1ProjectUsageSummary usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectStatusSummary v1ProjectStatusSummary = (V1ProjectStatusSummary) o;
    return Objects.equals(this.clustersHealth, v1ProjectStatusSummary.clustersHealth) &&
        Objects.equals(this.status, v1ProjectStatusSummary.status) &&
        Objects.equals(this.usage, v1ProjectStatusSummary.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clustersHealth, status, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectStatusSummary {\n");
    
    sb.append("    clustersHealth: ").append(toIndentedString(clustersHealth)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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