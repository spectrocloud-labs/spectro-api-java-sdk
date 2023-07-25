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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application deployment target cluster limits
 */
@Schema(description = "Application deployment target cluster limits")


public class V1AppDeploymentTargetClusterLimits {
  @SerializedName("cpu")
  private Integer cpu = null;

  @SerializedName("memoryMiB")
  private Integer memoryMiB = null;

  @SerializedName("storageGiB")
  private Integer storageGiB = null;

  public V1AppDeploymentTargetClusterLimits cpu(Integer cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * CPU cores
   * @return cpu
  **/
  @Schema(description = "CPU cores")
  public Integer getCpu() {
    return cpu;
  }

  public void setCpu(Integer cpu) {
    this.cpu = cpu;
  }

  public V1AppDeploymentTargetClusterLimits memoryMiB(Integer memoryMiB) {
    this.memoryMiB = memoryMiB;
    return this;
  }

   /**
   * Memory in MiB
   * @return memoryMiB
  **/
  @Schema(description = "Memory in MiB")
  public Integer getMemoryMiB() {
    return memoryMiB;
  }

  public void setMemoryMiB(Integer memoryMiB) {
    this.memoryMiB = memoryMiB;
  }

  public V1AppDeploymentTargetClusterLimits storageGiB(Integer storageGiB) {
    this.storageGiB = storageGiB;
    return this;
  }

   /**
   * Storage in GiB
   * @return storageGiB
  **/
  @Schema(description = "Storage in GiB")
  public Integer getStorageGiB() {
    return storageGiB;
  }

  public void setStorageGiB(Integer storageGiB) {
    this.storageGiB = storageGiB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppDeploymentTargetClusterLimits v1AppDeploymentTargetClusterLimits = (V1AppDeploymentTargetClusterLimits) o;
    return Objects.equals(this.cpu, v1AppDeploymentTargetClusterLimits.cpu) &&
        Objects.equals(this.memoryMiB, v1AppDeploymentTargetClusterLimits.memoryMiB) &&
        Objects.equals(this.storageGiB, v1AppDeploymentTargetClusterLimits.storageGiB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memoryMiB, storageGiB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppDeploymentTargetClusterLimits {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memoryMiB: ").append(toIndentedString(memoryMiB)).append("\n");
    sb.append("    storageGiB: ").append(toIndentedString(storageGiB)).append("\n");
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