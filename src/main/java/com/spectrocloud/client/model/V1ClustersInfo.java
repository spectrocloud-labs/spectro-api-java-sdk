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
import com.spectrocloud.client.model.V1ClusterMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Active clusters information
 */
@Schema(description = "Active clusters information")


public class V1ClustersInfo {
  @SerializedName("clustersMeta")
  private List<V1ClusterMeta> clustersMeta = null;

  @SerializedName("totalActiveClusters")
  private BigDecimal totalActiveClusters = null;

  @SerializedName("totalActiveGreenFieldClusters")
  private BigDecimal totalActiveGreenFieldClusters = null;

  @SerializedName("totalActiveImportedClusters")
  private BigDecimal totalActiveImportedClusters = null;

  @SerializedName("totalClustersDeleted")
  private BigDecimal totalClustersDeleted = null;

  @SerializedName("totalClustersDeployed")
  private BigDecimal totalClustersDeployed = null;

  public V1ClustersInfo clustersMeta(List<V1ClusterMeta> clustersMeta) {
    this.clustersMeta = clustersMeta;
    return this;
  }

  public V1ClustersInfo addClustersMetaItem(V1ClusterMeta clustersMetaItem) {
    if (this.clustersMeta == null) {
      this.clustersMeta = new ArrayList<V1ClusterMeta>();
    }
    this.clustersMeta.add(clustersMetaItem);
    return this;
  }

   /**
   * Get clustersMeta
   * @return clustersMeta
  **/
  @Schema(description = "")
  public List<V1ClusterMeta> getClustersMeta() {
    return clustersMeta;
  }

  public void setClustersMeta(List<V1ClusterMeta> clustersMeta) {
    this.clustersMeta = clustersMeta;
  }

  public V1ClustersInfo totalActiveClusters(BigDecimal totalActiveClusters) {
    this.totalActiveClusters = totalActiveClusters;
    return this;
  }

   /**
   * Get totalActiveClusters
   * @return totalActiveClusters
  **/
  @Schema(description = "")
  public BigDecimal getTotalActiveClusters() {
    return totalActiveClusters;
  }

  public void setTotalActiveClusters(BigDecimal totalActiveClusters) {
    this.totalActiveClusters = totalActiveClusters;
  }

  public V1ClustersInfo totalActiveGreenFieldClusters(BigDecimal totalActiveGreenFieldClusters) {
    this.totalActiveGreenFieldClusters = totalActiveGreenFieldClusters;
    return this;
  }

   /**
   * Get totalActiveGreenFieldClusters
   * @return totalActiveGreenFieldClusters
  **/
  @Schema(description = "")
  public BigDecimal getTotalActiveGreenFieldClusters() {
    return totalActiveGreenFieldClusters;
  }

  public void setTotalActiveGreenFieldClusters(BigDecimal totalActiveGreenFieldClusters) {
    this.totalActiveGreenFieldClusters = totalActiveGreenFieldClusters;
  }

  public V1ClustersInfo totalActiveImportedClusters(BigDecimal totalActiveImportedClusters) {
    this.totalActiveImportedClusters = totalActiveImportedClusters;
    return this;
  }

   /**
   * Get totalActiveImportedClusters
   * @return totalActiveImportedClusters
  **/
  @Schema(description = "")
  public BigDecimal getTotalActiveImportedClusters() {
    return totalActiveImportedClusters;
  }

  public void setTotalActiveImportedClusters(BigDecimal totalActiveImportedClusters) {
    this.totalActiveImportedClusters = totalActiveImportedClusters;
  }

  public V1ClustersInfo totalClustersDeleted(BigDecimal totalClustersDeleted) {
    this.totalClustersDeleted = totalClustersDeleted;
    return this;
  }

   /**
   * Get totalClustersDeleted
   * @return totalClustersDeleted
  **/
  @Schema(description = "")
  public BigDecimal getTotalClustersDeleted() {
    return totalClustersDeleted;
  }

  public void setTotalClustersDeleted(BigDecimal totalClustersDeleted) {
    this.totalClustersDeleted = totalClustersDeleted;
  }

  public V1ClustersInfo totalClustersDeployed(BigDecimal totalClustersDeployed) {
    this.totalClustersDeployed = totalClustersDeployed;
    return this;
  }

   /**
   * Get totalClustersDeployed
   * @return totalClustersDeployed
  **/
  @Schema(description = "")
  public BigDecimal getTotalClustersDeployed() {
    return totalClustersDeployed;
  }

  public void setTotalClustersDeployed(BigDecimal totalClustersDeployed) {
    this.totalClustersDeployed = totalClustersDeployed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClustersInfo v1ClustersInfo = (V1ClustersInfo) o;
    return Objects.equals(this.clustersMeta, v1ClustersInfo.clustersMeta) &&
        Objects.equals(this.totalActiveClusters, v1ClustersInfo.totalActiveClusters) &&
        Objects.equals(this.totalActiveGreenFieldClusters, v1ClustersInfo.totalActiveGreenFieldClusters) &&
        Objects.equals(this.totalActiveImportedClusters, v1ClustersInfo.totalActiveImportedClusters) &&
        Objects.equals(this.totalClustersDeleted, v1ClustersInfo.totalClustersDeleted) &&
        Objects.equals(this.totalClustersDeployed, v1ClustersInfo.totalClustersDeployed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clustersMeta, totalActiveClusters, totalActiveGreenFieldClusters, totalActiveImportedClusters, totalClustersDeleted, totalClustersDeployed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClustersInfo {\n");
    
    sb.append("    clustersMeta: ").append(toIndentedString(clustersMeta)).append("\n");
    sb.append("    totalActiveClusters: ").append(toIndentedString(totalActiveClusters)).append("\n");
    sb.append("    totalActiveGreenFieldClusters: ").append(toIndentedString(totalActiveGreenFieldClusters)).append("\n");
    sb.append("    totalActiveImportedClusters: ").append(toIndentedString(totalActiveImportedClusters)).append("\n");
    sb.append("    totalClustersDeleted: ").append(toIndentedString(totalClustersDeleted)).append("\n");
    sb.append("    totalClustersDeployed: ").append(toIndentedString(totalClustersDeployed)).append("\n");
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
