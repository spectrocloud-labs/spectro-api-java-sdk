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
import com.spectrocloud.client.model.V1ProjectMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * project resource usage
 */
@Schema(description = "project resource usage")


public class V1ProjectResourceUsage {
  @SerializedName("alloyCpuCoreHours")
  private BigDecimal alloyCpuCoreHours = null;

  @SerializedName("project")
  private V1ProjectMeta project = null;

  @SerializedName("pureCpuCoreHours")
  private BigDecimal pureCpuCoreHours = null;

  public V1ProjectResourceUsage alloyCpuCoreHours(BigDecimal alloyCpuCoreHours) {
    this.alloyCpuCoreHours = alloyCpuCoreHours;
    return this;
  }

   /**
   * Get alloyCpuCoreHours
   * @return alloyCpuCoreHours
  **/
  @Schema(description = "")
  public BigDecimal getAlloyCpuCoreHours() {
    return alloyCpuCoreHours;
  }

  public void setAlloyCpuCoreHours(BigDecimal alloyCpuCoreHours) {
    this.alloyCpuCoreHours = alloyCpuCoreHours;
  }

  public V1ProjectResourceUsage project(V1ProjectMeta project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public V1ProjectMeta getProject() {
    return project;
  }

  public void setProject(V1ProjectMeta project) {
    this.project = project;
  }

  public V1ProjectResourceUsage pureCpuCoreHours(BigDecimal pureCpuCoreHours) {
    this.pureCpuCoreHours = pureCpuCoreHours;
    return this;
  }

   /**
   * Get pureCpuCoreHours
   * @return pureCpuCoreHours
  **/
  @Schema(description = "")
  public BigDecimal getPureCpuCoreHours() {
    return pureCpuCoreHours;
  }

  public void setPureCpuCoreHours(BigDecimal pureCpuCoreHours) {
    this.pureCpuCoreHours = pureCpuCoreHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectResourceUsage v1ProjectResourceUsage = (V1ProjectResourceUsage) o;
    return Objects.equals(this.alloyCpuCoreHours, v1ProjectResourceUsage.alloyCpuCoreHours) &&
        Objects.equals(this.project, v1ProjectResourceUsage.project) &&
        Objects.equals(this.pureCpuCoreHours, v1ProjectResourceUsage.pureCpuCoreHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloyCpuCoreHours, project, pureCpuCoreHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectResourceUsage {\n");
    
    sb.append("    alloyCpuCoreHours: ").append(toIndentedString(alloyCpuCoreHours)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    pureCpuCoreHours: ").append(toIndentedString(pureCpuCoreHours)).append("\n");
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