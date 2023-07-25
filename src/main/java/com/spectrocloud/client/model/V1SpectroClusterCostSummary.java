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
import com.spectrocloud.client.model.V1SpectroClusterCost;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * V1SpectroClusterCostSummary
 */



public class V1SpectroClusterCostSummary {
  @SerializedName("cluster")
  private V1SpectroClusterCost cluster = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("period")
  private Integer period = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  public V1SpectroClusterCostSummary cluster(V1SpectroClusterCost cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public V1SpectroClusterCost getCluster() {
    return cluster;
  }

  public void setCluster(V1SpectroClusterCost cluster) {
    this.cluster = cluster;
  }

  public V1SpectroClusterCostSummary endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public V1SpectroClusterCostSummary period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public V1SpectroClusterCostSummary startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroClusterCostSummary v1SpectroClusterCostSummary = (V1SpectroClusterCostSummary) o;
    return Objects.equals(this.cluster, v1SpectroClusterCostSummary.cluster) &&
        Objects.equals(this.endTime, v1SpectroClusterCostSummary.endTime) &&
        Objects.equals(this.period, v1SpectroClusterCostSummary.period) &&
        Objects.equals(this.startTime, v1SpectroClusterCostSummary.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, endTime, period, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterCostSummary {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
