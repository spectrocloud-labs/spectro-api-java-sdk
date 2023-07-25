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
import org.threeten.bp.OffsetDateTime;
/**
 * V1SchedulerJobStatus
 */



public class V1SchedulerJobStatus {
  @SerializedName("cycleNumber")
  private Integer cycleNumber = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("forceNextRun")
  private Boolean forceNextRun = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("isDisabled")
  private Boolean isDisabled = null;

  @SerializedName("isLocked")
  private Boolean isLocked = null;

  @SerializedName("lastRunTime")
  private OffsetDateTime lastRunTime = null;

  @SerializedName("lastSuccessfulRunTime")
  private OffsetDateTime lastSuccessfulRunTime = null;

  @SerializedName("nextRunTime")
  private OffsetDateTime nextRunTime = null;

  public V1SchedulerJobStatus cycleNumber(Integer cycleNumber) {
    this.cycleNumber = cycleNumber;
    return this;
  }

   /**
   * Get cycleNumber
   * @return cycleNumber
  **/
  @Schema(description = "")
  public Integer getCycleNumber() {
    return cycleNumber;
  }

  public void setCycleNumber(Integer cycleNumber) {
    this.cycleNumber = cycleNumber;
  }

  public V1SchedulerJobStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public V1SchedulerJobStatus forceNextRun(Boolean forceNextRun) {
    this.forceNextRun = forceNextRun;
    return this;
  }

   /**
   * Get forceNextRun
   * @return forceNextRun
  **/
  @Schema(description = "")
  public Boolean isForceNextRun() {
    return forceNextRun;
  }

  public void setForceNextRun(Boolean forceNextRun) {
    this.forceNextRun = forceNextRun;
  }

  public V1SchedulerJobStatus isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @Schema(description = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public V1SchedulerJobStatus isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @Schema(description = "")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public V1SchedulerJobStatus isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @Schema(description = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public V1SchedulerJobStatus lastRunTime(OffsetDateTime lastRunTime) {
    this.lastRunTime = lastRunTime;
    return this;
  }

   /**
   * Get lastRunTime
   * @return lastRunTime
  **/
  @Schema(description = "")
  public OffsetDateTime getLastRunTime() {
    return lastRunTime;
  }

  public void setLastRunTime(OffsetDateTime lastRunTime) {
    this.lastRunTime = lastRunTime;
  }

  public V1SchedulerJobStatus lastSuccessfulRunTime(OffsetDateTime lastSuccessfulRunTime) {
    this.lastSuccessfulRunTime = lastSuccessfulRunTime;
    return this;
  }

   /**
   * Get lastSuccessfulRunTime
   * @return lastSuccessfulRunTime
  **/
  @Schema(description = "")
  public OffsetDateTime getLastSuccessfulRunTime() {
    return lastSuccessfulRunTime;
  }

  public void setLastSuccessfulRunTime(OffsetDateTime lastSuccessfulRunTime) {
    this.lastSuccessfulRunTime = lastSuccessfulRunTime;
  }

  public V1SchedulerJobStatus nextRunTime(OffsetDateTime nextRunTime) {
    this.nextRunTime = nextRunTime;
    return this;
  }

   /**
   * Get nextRunTime
   * @return nextRunTime
  **/
  @Schema(description = "")
  public OffsetDateTime getNextRunTime() {
    return nextRunTime;
  }

  public void setNextRunTime(OffsetDateTime nextRunTime) {
    this.nextRunTime = nextRunTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SchedulerJobStatus v1SchedulerJobStatus = (V1SchedulerJobStatus) o;
    return Objects.equals(this.cycleNumber, v1SchedulerJobStatus.cycleNumber) &&
        Objects.equals(this.error, v1SchedulerJobStatus.error) &&
        Objects.equals(this.forceNextRun, v1SchedulerJobStatus.forceNextRun) &&
        Objects.equals(this.isActive, v1SchedulerJobStatus.isActive) &&
        Objects.equals(this.isDisabled, v1SchedulerJobStatus.isDisabled) &&
        Objects.equals(this.isLocked, v1SchedulerJobStatus.isLocked) &&
        Objects.equals(this.lastRunTime, v1SchedulerJobStatus.lastRunTime) &&
        Objects.equals(this.lastSuccessfulRunTime, v1SchedulerJobStatus.lastSuccessfulRunTime) &&
        Objects.equals(this.nextRunTime, v1SchedulerJobStatus.nextRunTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleNumber, error, forceNextRun, isActive, isDisabled, isLocked, lastRunTime, lastSuccessfulRunTime, nextRunTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SchedulerJobStatus {\n");
    
    sb.append("    cycleNumber: ").append(toIndentedString(cycleNumber)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    forceNextRun: ").append(toIndentedString(forceNextRun)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
    sb.append("    lastSuccessfulRunTime: ").append(toIndentedString(lastSuccessfulRunTime)).append("\n");
    sb.append("    nextRunTime: ").append(toIndentedString(nextRunTime)).append("\n");
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
