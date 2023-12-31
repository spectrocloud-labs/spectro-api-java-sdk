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
import com.spectrocloud.client.model.V1VsphereComputeCluster;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Datacenter and its resources like datastore, resoucepool, folders
 */
@Schema(description = "Datacenter and its resources like datastore, resoucepool, folders")


public class V1VsphereComputeClusterResources {
  @SerializedName("computecluster")
  private V1VsphereComputeCluster computecluster = null;

  @SerializedName("datacenter")
  private String datacenter = null;

  public V1VsphereComputeClusterResources computecluster(V1VsphereComputeCluster computecluster) {
    this.computecluster = computecluster;
    return this;
  }

   /**
   * Get computecluster
   * @return computecluster
  **/
  @Schema(description = "")
  public V1VsphereComputeCluster getComputecluster() {
    return computecluster;
  }

  public void setComputecluster(V1VsphereComputeCluster computecluster) {
    this.computecluster = computecluster;
  }

  public V1VsphereComputeClusterResources datacenter(String datacenter) {
    this.datacenter = datacenter;
    return this;
  }

   /**
   * Name of the datacenter
   * @return datacenter
  **/
  @Schema(description = "Name of the datacenter")
  public String getDatacenter() {
    return datacenter;
  }

  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereComputeClusterResources v1VsphereComputeClusterResources = (V1VsphereComputeClusterResources) o;
    return Objects.equals(this.computecluster, v1VsphereComputeClusterResources.computecluster) &&
        Objects.equals(this.datacenter, v1VsphereComputeClusterResources.datacenter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computecluster, datacenter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereComputeClusterResources {\n");
    
    sb.append("    computecluster: ").append(toIndentedString(computecluster)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
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
