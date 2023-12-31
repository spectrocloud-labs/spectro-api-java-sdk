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
import com.spectrocloud.client.model.V1CloudResourceMetadata;
import com.spectrocloud.client.model.V1MachinePoolRate;
import com.spectrocloud.client.model.V1TotalClusterRate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster estimated rate information
 */
@Schema(description = "Cluster estimated rate information")


public class V1SpectroClusterRate {
  @SerializedName("machinePools")
  private List<V1MachinePoolRate> machinePools = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rate")
  private V1TotalClusterRate rate = null;

  @SerializedName("resourceMetadata")
  private V1CloudResourceMetadata resourceMetadata = null;

  public V1SpectroClusterRate machinePools(List<V1MachinePoolRate> machinePools) {
    this.machinePools = machinePools;
    return this;
  }

  public V1SpectroClusterRate addMachinePoolsItem(V1MachinePoolRate machinePoolsItem) {
    if (this.machinePools == null) {
      this.machinePools = new ArrayList<V1MachinePoolRate>();
    }
    this.machinePools.add(machinePoolsItem);
    return this;
  }

   /**
   * Get machinePools
   * @return machinePools
  **/
  @Schema(description = "")
  public List<V1MachinePoolRate> getMachinePools() {
    return machinePools;
  }

  public void setMachinePools(List<V1MachinePoolRate> machinePools) {
    this.machinePools = machinePools;
  }

  public V1SpectroClusterRate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1SpectroClusterRate rate(V1TotalClusterRate rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @Schema(description = "")
  public V1TotalClusterRate getRate() {
    return rate;
  }

  public void setRate(V1TotalClusterRate rate) {
    this.rate = rate;
  }

  public V1SpectroClusterRate resourceMetadata(V1CloudResourceMetadata resourceMetadata) {
    this.resourceMetadata = resourceMetadata;
    return this;
  }

   /**
   * Get resourceMetadata
   * @return resourceMetadata
  **/
  @Schema(description = "")
  public V1CloudResourceMetadata getResourceMetadata() {
    return resourceMetadata;
  }

  public void setResourceMetadata(V1CloudResourceMetadata resourceMetadata) {
    this.resourceMetadata = resourceMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroClusterRate v1SpectroClusterRate = (V1SpectroClusterRate) o;
    return Objects.equals(this.machinePools, v1SpectroClusterRate.machinePools) &&
        Objects.equals(this.name, v1SpectroClusterRate.name) &&
        Objects.equals(this.rate, v1SpectroClusterRate.rate) &&
        Objects.equals(this.resourceMetadata, v1SpectroClusterRate.resourceMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machinePools, name, rate, resourceMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterRate {\n");
    
    sb.append("    machinePools: ").append(toIndentedString(machinePools)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    resourceMetadata: ").append(toIndentedString(resourceMetadata)).append("\n");
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
