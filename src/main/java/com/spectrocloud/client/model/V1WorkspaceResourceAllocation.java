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
import java.math.BigDecimal;
/**
 * Workspace resource allocation
 */
@Schema(description = "Workspace resource allocation")


public class V1WorkspaceResourceAllocation {
  @SerializedName("cpuCores")
  private BigDecimal cpuCores = null;

  @SerializedName("memoryMiB")
  private BigDecimal memoryMiB = null;

  public V1WorkspaceResourceAllocation cpuCores(BigDecimal cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

   /**
   * Get cpuCores
   * minimum: -1
   * @return cpuCores
  **/
  @Schema(description = "")
  public BigDecimal getCpuCores() {
    return cpuCores;
  }

  public void setCpuCores(BigDecimal cpuCores) {
    this.cpuCores = cpuCores;
  }

  public V1WorkspaceResourceAllocation memoryMiB(BigDecimal memoryMiB) {
    this.memoryMiB = memoryMiB;
    return this;
  }

   /**
   * Get memoryMiB
   * minimum: -1
   * @return memoryMiB
  **/
  @Schema(description = "")
  public BigDecimal getMemoryMiB() {
    return memoryMiB;
  }

  public void setMemoryMiB(BigDecimal memoryMiB) {
    this.memoryMiB = memoryMiB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkspaceResourceAllocation v1WorkspaceResourceAllocation = (V1WorkspaceResourceAllocation) o;
    return Objects.equals(this.cpuCores, v1WorkspaceResourceAllocation.cpuCores) &&
        Objects.equals(this.memoryMiB, v1WorkspaceResourceAllocation.memoryMiB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuCores, memoryMiB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceResourceAllocation {\n");
    
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    memoryMiB: ").append(toIndentedString(memoryMiB)).append("\n");
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
