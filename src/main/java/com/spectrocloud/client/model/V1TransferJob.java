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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * transfer job details
 */
@Schema(description = "transfer job details")


public class V1TransferJob {
  @SerializedName("finishTime")
  private OffsetDateTime finishTime = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("isCompleted")
  private Boolean isCompleted = null;

  @SerializedName("message")
  private List<String> message = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("status")
  private List<String> status = null;

  public V1TransferJob finishTime(OffsetDateTime finishTime) {
    this.finishTime = finishTime;
    return this;
  }

   /**
   * Get finishTime
   * @return finishTime
  **/
  @Schema(description = "")
  public OffsetDateTime getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(OffsetDateTime finishTime) {
    this.finishTime = finishTime;
  }

  public V1TransferJob folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @Schema(description = "")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public V1TransferJob isCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
    return this;
  }

   /**
   * Get isCompleted
   * @return isCompleted
  **/
  @Schema(description = "")
  public Boolean isIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public V1TransferJob message(List<String> message) {
    this.message = message;
    return this;
  }

  public V1TransferJob addMessageItem(String messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<String>();
    }
    this.message.add(messageItem);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public List<String> getMessage() {
    return message;
  }

  public void setMessage(List<String> message) {
    this.message = message;
  }

  public V1TransferJob startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public V1TransferJob state(String state) {
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

  public V1TransferJob status(List<String> status) {
    this.status = status;
    return this;
  }

  public V1TransferJob addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<String>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TransferJob v1TransferJob = (V1TransferJob) o;
    return Objects.equals(this.finishTime, v1TransferJob.finishTime) &&
        Objects.equals(this.folder, v1TransferJob.folder) &&
        Objects.equals(this.isCompleted, v1TransferJob.isCompleted) &&
        Objects.equals(this.message, v1TransferJob.message) &&
        Objects.equals(this.startTime, v1TransferJob.startTime) &&
        Objects.equals(this.state, v1TransferJob.state) &&
        Objects.equals(this.status, v1TransferJob.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishTime, folder, isCompleted, message, startTime, state, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TransferJob {\n");
    
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
