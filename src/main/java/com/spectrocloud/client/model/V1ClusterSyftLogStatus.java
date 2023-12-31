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
import com.spectrocloud.client.model.V1ClusterFeatureActor;
import com.spectrocloud.client.model.V1ClusterScanTime;
import com.spectrocloud.client.model.V1ObjectEntity;
import com.spectrocloud.client.model.V1SyftReport;
import com.spectrocloud.client.model.V1SyftScanContext;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster compliance scan Syft Log Status
 */
@Schema(description = "Cluster compliance scan Syft Log Status")


public class V1ClusterSyftLogStatus {
  @SerializedName("actor")
  private V1ClusterFeatureActor actor = null;

  @SerializedName("location")
  private V1ObjectEntity location = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reports")
  private List<V1SyftReport> reports = null;

  @SerializedName("requestUid")
  private String requestUid = null;

  @SerializedName("scanContext")
  private V1SyftScanContext scanContext = null;

  @SerializedName("scanTime")
  private V1ClusterScanTime scanTime = null;

  @SerializedName("state")
  private String state = null;

  public V1ClusterSyftLogStatus actor(V1ClusterFeatureActor actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/
  @Schema(description = "")
  public V1ClusterFeatureActor getActor() {
    return actor;
  }

  public void setActor(V1ClusterFeatureActor actor) {
    this.actor = actor;
  }

  public V1ClusterSyftLogStatus location(V1ObjectEntity location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public V1ObjectEntity getLocation() {
    return location;
  }

  public void setLocation(V1ObjectEntity location) {
    this.location = location;
  }

  public V1ClusterSyftLogStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1ClusterSyftLogStatus reports(List<V1SyftReport> reports) {
    this.reports = reports;
    return this;
  }

  public V1ClusterSyftLogStatus addReportsItem(V1SyftReport reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<V1SyftReport>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @Schema(description = "")
  public List<V1SyftReport> getReports() {
    return reports;
  }

  public void setReports(List<V1SyftReport> reports) {
    this.reports = reports;
  }

  public V1ClusterSyftLogStatus requestUid(String requestUid) {
    this.requestUid = requestUid;
    return this;
  }

   /**
   * Get requestUid
   * @return requestUid
  **/
  @Schema(description = "")
  public String getRequestUid() {
    return requestUid;
  }

  public void setRequestUid(String requestUid) {
    this.requestUid = requestUid;
  }

  public V1ClusterSyftLogStatus scanContext(V1SyftScanContext scanContext) {
    this.scanContext = scanContext;
    return this;
  }

   /**
   * Get scanContext
   * @return scanContext
  **/
  @Schema(description = "")
  public V1SyftScanContext getScanContext() {
    return scanContext;
  }

  public void setScanContext(V1SyftScanContext scanContext) {
    this.scanContext = scanContext;
  }

  public V1ClusterSyftLogStatus scanTime(V1ClusterScanTime scanTime) {
    this.scanTime = scanTime;
    return this;
  }

   /**
   * Get scanTime
   * @return scanTime
  **/
  @Schema(description = "")
  public V1ClusterScanTime getScanTime() {
    return scanTime;
  }

  public void setScanTime(V1ClusterScanTime scanTime) {
    this.scanTime = scanTime;
  }

  public V1ClusterSyftLogStatus state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterSyftLogStatus v1ClusterSyftLogStatus = (V1ClusterSyftLogStatus) o;
    return Objects.equals(this.actor, v1ClusterSyftLogStatus.actor) &&
        Objects.equals(this.location, v1ClusterSyftLogStatus.location) &&
        Objects.equals(this.message, v1ClusterSyftLogStatus.message) &&
        Objects.equals(this.reports, v1ClusterSyftLogStatus.reports) &&
        Objects.equals(this.requestUid, v1ClusterSyftLogStatus.requestUid) &&
        Objects.equals(this.scanContext, v1ClusterSyftLogStatus.scanContext) &&
        Objects.equals(this.scanTime, v1ClusterSyftLogStatus.scanTime) &&
        Objects.equals(this.state, v1ClusterSyftLogStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, location, message, reports, requestUid, scanContext, scanTime, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterSyftLogStatus {\n");
    
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    requestUid: ").append(toIndentedString(requestUid)).append("\n");
    sb.append("    scanContext: ").append(toIndentedString(scanContext)).append("\n");
    sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
