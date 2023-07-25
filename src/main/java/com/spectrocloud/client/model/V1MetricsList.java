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
import com.spectrocloud.client.model.V1MetricMetadata;
import com.spectrocloud.client.model.V1Metrics;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1MetricsList
 */



public class V1MetricsList {
  @SerializedName("metadata")
  private V1MetricMetadata metadata = null;

  @SerializedName("metrics")
  private List<V1Metrics> metrics = null;

  public V1MetricsList metadata(V1MetricMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public V1MetricMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(V1MetricMetadata metadata) {
    this.metadata = metadata;
  }

  public V1MetricsList metrics(List<V1Metrics> metrics) {
    this.metrics = metrics;
    return this;
  }

  public V1MetricsList addMetricsItem(V1Metrics metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<V1Metrics>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public List<V1Metrics> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<V1Metrics> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MetricsList v1MetricsList = (V1MetricsList) o;
    return Objects.equals(this.metadata, v1MetricsList.metadata) &&
        Objects.equals(this.metrics, v1MetricsList.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, metrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MetricsList {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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