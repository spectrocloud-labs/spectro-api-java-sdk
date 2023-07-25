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
 * Workspace quota resource allocation
 */
@Schema(description = "Workspace quota resource allocation")


public class V1DashboardWorkspaceQuotaResourceAllocation {
  @SerializedName("cpu")
  private BigDecimal cpu = null;

  @SerializedName("memory")
  private BigDecimal memory = null;

  public V1DashboardWorkspaceQuotaResourceAllocation cpu(BigDecimal cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * minimum: 0
   * @return cpu
  **/
  @Schema(description = "")
  public BigDecimal getCpu() {
    return cpu;
  }

  public void setCpu(BigDecimal cpu) {
    this.cpu = cpu;
  }

  public V1DashboardWorkspaceQuotaResourceAllocation memory(BigDecimal memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * minimum: 0
   * @return memory
  **/
  @Schema(description = "")
  public BigDecimal getMemory() {
    return memory;
  }

  public void setMemory(BigDecimal memory) {
    this.memory = memory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DashboardWorkspaceQuotaResourceAllocation v1DashboardWorkspaceQuotaResourceAllocation = (V1DashboardWorkspaceQuotaResourceAllocation) o;
    return Objects.equals(this.cpu, v1DashboardWorkspaceQuotaResourceAllocation.cpu) &&
        Objects.equals(this.memory, v1DashboardWorkspaceQuotaResourceAllocation.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DashboardWorkspaceQuotaResourceAllocation {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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