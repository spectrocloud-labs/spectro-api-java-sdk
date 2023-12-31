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
import com.spectrocloud.client.model.V1ClusterFeatureSchedule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Compliance Scan config
 */
@Schema(description = "Compliance Scan config")


public class V1ComplianceScanConfig {
  @SerializedName("schedule")
  private V1ClusterFeatureSchedule schedule = null;

  public V1ComplianceScanConfig schedule(V1ClusterFeatureSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @Schema(description = "")
  public V1ClusterFeatureSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(V1ClusterFeatureSchedule schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ComplianceScanConfig v1ComplianceScanConfig = (V1ComplianceScanConfig) o;
    return Objects.equals(this.schedule, v1ComplianceScanConfig.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ComplianceScanConfig {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
