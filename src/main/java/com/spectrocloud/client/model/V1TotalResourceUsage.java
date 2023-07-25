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
import com.spectrocloud.client.model.V1ProjectResourceUsage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Total Resource Usage
 */
@Schema(description = "Total Resource Usage")


public class V1TotalResourceUsage {
  @SerializedName("projects")
  private List<V1ProjectResourceUsage> projects = null;

  @SerializedName("totalAlloyCpuCoreHours")
  private BigDecimal totalAlloyCpuCoreHours = null;

  @SerializedName("totalPureCpuCoreHours")
  private BigDecimal totalPureCpuCoreHours = null;

  public V1TotalResourceUsage projects(List<V1ProjectResourceUsage> projects) {
    this.projects = projects;
    return this;
  }

  public V1TotalResourceUsage addProjectsItem(V1ProjectResourceUsage projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<V1ProjectResourceUsage>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @Schema(description = "")
  public List<V1ProjectResourceUsage> getProjects() {
    return projects;
  }

  public void setProjects(List<V1ProjectResourceUsage> projects) {
    this.projects = projects;
  }

  public V1TotalResourceUsage totalAlloyCpuCoreHours(BigDecimal totalAlloyCpuCoreHours) {
    this.totalAlloyCpuCoreHours = totalAlloyCpuCoreHours;
    return this;
  }

   /**
   * Get totalAlloyCpuCoreHours
   * @return totalAlloyCpuCoreHours
  **/
  @Schema(description = "")
  public BigDecimal getTotalAlloyCpuCoreHours() {
    return totalAlloyCpuCoreHours;
  }

  public void setTotalAlloyCpuCoreHours(BigDecimal totalAlloyCpuCoreHours) {
    this.totalAlloyCpuCoreHours = totalAlloyCpuCoreHours;
  }

  public V1TotalResourceUsage totalPureCpuCoreHours(BigDecimal totalPureCpuCoreHours) {
    this.totalPureCpuCoreHours = totalPureCpuCoreHours;
    return this;
  }

   /**
   * Get totalPureCpuCoreHours
   * @return totalPureCpuCoreHours
  **/
  @Schema(description = "")
  public BigDecimal getTotalPureCpuCoreHours() {
    return totalPureCpuCoreHours;
  }

  public void setTotalPureCpuCoreHours(BigDecimal totalPureCpuCoreHours) {
    this.totalPureCpuCoreHours = totalPureCpuCoreHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TotalResourceUsage v1TotalResourceUsage = (V1TotalResourceUsage) o;
    return Objects.equals(this.projects, v1TotalResourceUsage.projects) &&
        Objects.equals(this.totalAlloyCpuCoreHours, v1TotalResourceUsage.totalAlloyCpuCoreHours) &&
        Objects.equals(this.totalPureCpuCoreHours, v1TotalResourceUsage.totalPureCpuCoreHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projects, totalAlloyCpuCoreHours, totalPureCpuCoreHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TotalResourceUsage {\n");
    
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    totalAlloyCpuCoreHours: ").append(toIndentedString(totalAlloyCpuCoreHours)).append("\n");
    sb.append("    totalPureCpuCoreHours: ").append(toIndentedString(totalPureCpuCoreHours)).append("\n");
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