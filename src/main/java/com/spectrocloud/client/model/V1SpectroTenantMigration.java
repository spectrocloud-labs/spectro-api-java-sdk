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
import com.spectrocloud.client.model.V1SpectroTenantClusterMigration;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Spectro tenant migration status
 */
@Schema(description = "Spectro tenant migration status")


public class V1SpectroTenantMigration {
  @SerializedName("clusters")
  private List<V1SpectroTenantClusterMigration> clusters = null;

  @SerializedName("state")
  private String state = null;

  public V1SpectroTenantMigration clusters(List<V1SpectroTenantClusterMigration> clusters) {
    this.clusters = clusters;
    return this;
  }

  public V1SpectroTenantMigration addClustersItem(V1SpectroTenantClusterMigration clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<V1SpectroTenantClusterMigration>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @Schema(description = "")
  public List<V1SpectroTenantClusterMigration> getClusters() {
    return clusters;
  }

  public void setClusters(List<V1SpectroTenantClusterMigration> clusters) {
    this.clusters = clusters;
  }

  public V1SpectroTenantMigration state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroTenantMigration v1SpectroTenantMigration = (V1SpectroTenantMigration) o;
    return Objects.equals(this.clusters, v1SpectroTenantMigration.clusters) &&
        Objects.equals(this.state, v1SpectroTenantMigration.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroTenantMigration {\n");
    
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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