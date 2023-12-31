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
import com.spectrocloud.client.model.V1GcpManagedClusterConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster level configuration for gcp cloud and applicable for all the machine pools
 */
@Schema(description = "Cluster level configuration for gcp cloud and applicable for all the machine pools")


public class V1GcpClusterConfig {
  @SerializedName("managedClusterConfig")
  private V1GcpManagedClusterConfig managedClusterConfig = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("region")
  private String region = null;

  public V1GcpClusterConfig managedClusterConfig(V1GcpManagedClusterConfig managedClusterConfig) {
    this.managedClusterConfig = managedClusterConfig;
    return this;
  }

   /**
   * Get managedClusterConfig
   * @return managedClusterConfig
  **/
  @Schema(description = "")
  public V1GcpManagedClusterConfig getManagedClusterConfig() {
    return managedClusterConfig;
  }

  public void setManagedClusterConfig(V1GcpManagedClusterConfig managedClusterConfig) {
    this.managedClusterConfig = managedClusterConfig;
  }

  public V1GcpClusterConfig network(String network) {
    this.network = network;
    return this;
  }

   /**
   * NetworkName if empty would create VPC Network in auto mode. If provided, custom VPC network will be used
   * @return network
  **/
  @Schema(description = "NetworkName if empty would create VPC Network in auto mode. If provided, custom VPC network will be used")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public V1GcpClusterConfig project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Name of the project in which cluster is to be deployed
   * @return project
  **/
  @Schema(required = true, description = "Name of the project in which cluster is to be deployed")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1GcpClusterConfig region(String region) {
    this.region = region;
    return this;
  }

   /**
   * GCP region for the cluster
   * @return region
  **/
  @Schema(required = true, description = "GCP region for the cluster")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpClusterConfig v1GcpClusterConfig = (V1GcpClusterConfig) o;
    return Objects.equals(this.managedClusterConfig, v1GcpClusterConfig.managedClusterConfig) &&
        Objects.equals(this.network, v1GcpClusterConfig.network) &&
        Objects.equals(this.project, v1GcpClusterConfig.project) &&
        Objects.equals(this.region, v1GcpClusterConfig.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedClusterConfig, network, project, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpClusterConfig {\n");
    
    sb.append("    managedClusterConfig: ").append(toIndentedString(managedClusterConfig)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
