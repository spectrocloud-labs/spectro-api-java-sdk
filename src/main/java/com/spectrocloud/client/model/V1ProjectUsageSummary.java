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
import com.spectrocloud.client.model.V1ClusterUsageSummary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Project usage summary
 */
@Schema(description = "Project usage summary")


public class V1ProjectUsageSummary {
  @SerializedName("alloyCpuCores")
  private BigDecimal alloyCpuCores = null;

  @SerializedName("clusters")
  private List<V1ClusterUsageSummary> clusters = null;

  @SerializedName("pureCpuCores")
  private BigDecimal pureCpuCores = null;

  public V1ProjectUsageSummary alloyCpuCores(BigDecimal alloyCpuCores) {
    this.alloyCpuCores = alloyCpuCores;
    return this;
  }

   /**
   * Get alloyCpuCores
   * @return alloyCpuCores
  **/
  @Schema(description = "")
  public BigDecimal getAlloyCpuCores() {
    return alloyCpuCores;
  }

  public void setAlloyCpuCores(BigDecimal alloyCpuCores) {
    this.alloyCpuCores = alloyCpuCores;
  }

  public V1ProjectUsageSummary clusters(List<V1ClusterUsageSummary> clusters) {
    this.clusters = clusters;
    return this;
  }

  public V1ProjectUsageSummary addClustersItem(V1ClusterUsageSummary clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<V1ClusterUsageSummary>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @Schema(description = "")
  public List<V1ClusterUsageSummary> getClusters() {
    return clusters;
  }

  public void setClusters(List<V1ClusterUsageSummary> clusters) {
    this.clusters = clusters;
  }

  public V1ProjectUsageSummary pureCpuCores(BigDecimal pureCpuCores) {
    this.pureCpuCores = pureCpuCores;
    return this;
  }

   /**
   * Get pureCpuCores
   * @return pureCpuCores
  **/
  @Schema(description = "")
  public BigDecimal getPureCpuCores() {
    return pureCpuCores;
  }

  public void setPureCpuCores(BigDecimal pureCpuCores) {
    this.pureCpuCores = pureCpuCores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectUsageSummary v1ProjectUsageSummary = (V1ProjectUsageSummary) o;
    return Objects.equals(this.alloyCpuCores, v1ProjectUsageSummary.alloyCpuCores) &&
        Objects.equals(this.clusters, v1ProjectUsageSummary.clusters) &&
        Objects.equals(this.pureCpuCores, v1ProjectUsageSummary.pureCpuCores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloyCpuCores, clusters, pureCpuCores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectUsageSummary {\n");
    
    sb.append("    alloyCpuCores: ").append(toIndentedString(alloyCpuCores)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    pureCpuCores: ").append(toIndentedString(pureCpuCores)).append("\n");
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