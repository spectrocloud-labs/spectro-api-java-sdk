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
 * Cluster group limit config
 */
@Schema(description = "Cluster group limit config")


public class V1ClusterGroupLimitConfig {
  @SerializedName("cpu")
  private Integer cpu = null;

  @SerializedName("cpuMilliCore")
  private Integer cpuMilliCore = null;

  @SerializedName("memory")
  private Integer memory = null;

  @SerializedName("memoryMiB")
  private Integer memoryMiB = null;

  @SerializedName("overSubscription")
  private Integer overSubscription = null;

  @SerializedName("storageGiB")
  private Integer storageGiB = null;

  public V1ClusterGroupLimitConfig cpu(Integer cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Deprecated. Use field cpuMilliCore
   * @return cpu
  **/
  @Schema(description = "Deprecated. Use field cpuMilliCore")
  public Integer getCpu() {
    return cpu;
  }

  public void setCpu(Integer cpu) {
    this.cpu = cpu;
  }

  public V1ClusterGroupLimitConfig cpuMilliCore(Integer cpuMilliCore) {
    this.cpuMilliCore = cpuMilliCore;
    return this;
  }

   /**
   * CPU in milli cores
   * @return cpuMilliCore
  **/
  @Schema(description = "CPU in milli cores")
  public Integer getCpuMilliCore() {
    return cpuMilliCore;
  }

  public void setCpuMilliCore(Integer cpuMilliCore) {
    this.cpuMilliCore = cpuMilliCore;
  }

  public V1ClusterGroupLimitConfig memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Deprecated. Use field memoryMiB
   * @return memory
  **/
  @Schema(description = "Deprecated. Use field memoryMiB")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public V1ClusterGroupLimitConfig memoryMiB(Integer memoryMiB) {
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

  public V1ClusterGroupLimitConfig overSubscription(Integer overSubscription) {
    this.overSubscription = overSubscription;
    return this;
  }

   /**
   * Over subscription percentage
   * @return overSubscription
  **/
  @Schema(description = "Over subscription percentage")
  public Integer getOverSubscription() {
    return overSubscription;
  }

  public void setOverSubscription(Integer overSubscription) {
    this.overSubscription = overSubscription;
  }

  public V1ClusterGroupLimitConfig storageGiB(Integer storageGiB) {
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
    V1ClusterGroupLimitConfig v1ClusterGroupLimitConfig = (V1ClusterGroupLimitConfig) o;
    return Objects.equals(this.cpu, v1ClusterGroupLimitConfig.cpu) &&
        Objects.equals(this.cpuMilliCore, v1ClusterGroupLimitConfig.cpuMilliCore) &&
        Objects.equals(this.memory, v1ClusterGroupLimitConfig.memory) &&
        Objects.equals(this.memoryMiB, v1ClusterGroupLimitConfig.memoryMiB) &&
        Objects.equals(this.overSubscription, v1ClusterGroupLimitConfig.overSubscription) &&
        Objects.equals(this.storageGiB, v1ClusterGroupLimitConfig.storageGiB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, cpuMilliCore, memory, memoryMiB, overSubscription, storageGiB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterGroupLimitConfig {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    cpuMilliCore: ").append(toIndentedString(cpuMilliCore)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    memoryMiB: ").append(toIndentedString(memoryMiB)).append("\n");
    sb.append("    overSubscription: ").append(toIndentedString(overSubscription)).append("\n");
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
