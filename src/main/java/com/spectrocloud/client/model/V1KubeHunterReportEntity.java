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
import com.spectrocloud.client.model.V1KubeHunterLogEntity;
import com.spectrocloud.client.model.V1KubeHunterVulnerabilityDataEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * KubeHunter report
 */
@Schema(description = "KubeHunter report")


public class V1KubeHunterReportEntity {
  @SerializedName("logs")
  private List<V1KubeHunterLogEntity> logs = null;

  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("vulnerabilities")
  private V1KubeHunterVulnerabilityDataEntity vulnerabilities = null;

  public V1KubeHunterReportEntity logs(List<V1KubeHunterLogEntity> logs) {
    this.logs = logs;
    return this;
  }

  public V1KubeHunterReportEntity addLogsItem(V1KubeHunterLogEntity logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<V1KubeHunterLogEntity>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @Schema(description = "")
  public List<V1KubeHunterLogEntity> getLogs() {
    return logs;
  }

  public void setLogs(List<V1KubeHunterLogEntity> logs) {
    this.logs = logs;
  }

  public V1KubeHunterReportEntity time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public V1KubeHunterReportEntity vulnerabilities(V1KubeHunterVulnerabilityDataEntity vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
    return this;
  }

   /**
   * Get vulnerabilities
   * @return vulnerabilities
  **/
  @Schema(description = "")
  public V1KubeHunterVulnerabilityDataEntity getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(V1KubeHunterVulnerabilityDataEntity vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1KubeHunterReportEntity v1KubeHunterReportEntity = (V1KubeHunterReportEntity) o;
    return Objects.equals(this.logs, v1KubeHunterReportEntity.logs) &&
        Objects.equals(this.time, v1KubeHunterReportEntity.time) &&
        Objects.equals(this.vulnerabilities, v1KubeHunterReportEntity.vulnerabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs, time, vulnerabilities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1KubeHunterReportEntity {\n");
    
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
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
