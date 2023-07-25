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


public class V1DashboardWorkspaceResourceAllocation {
  @SerializedName("allocated")
  private BigDecimal allocated = null;

  @SerializedName("usage")
  private BigDecimal usage = null;

  public V1DashboardWorkspaceResourceAllocation allocated(BigDecimal allocated) {
    this.allocated = allocated;
    return this;
  }

   /**
   * Get allocated
   * @return allocated
  **/
  @Schema(description = "")
  public BigDecimal getAllocated() {
    return allocated;
  }

  public void setAllocated(BigDecimal allocated) {
    this.allocated = allocated;
  }

  public V1DashboardWorkspaceResourceAllocation usage(BigDecimal usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @Schema(description = "")
  public BigDecimal getUsage() {
    return usage;
  }

  public void setUsage(BigDecimal usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DashboardWorkspaceResourceAllocation v1DashboardWorkspaceResourceAllocation = (V1DashboardWorkspaceResourceAllocation) o;
    return Objects.equals(this.allocated, v1DashboardWorkspaceResourceAllocation.allocated) &&
        Objects.equals(this.usage, v1DashboardWorkspaceResourceAllocation.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocated, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DashboardWorkspaceResourceAllocation {\n");
    
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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