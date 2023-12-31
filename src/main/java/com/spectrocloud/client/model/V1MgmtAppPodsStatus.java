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
import com.spectrocloud.client.model.V1MgmtAppContainersStatus;
import com.spectrocloud.client.model.V1MgmtAppPvcStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * V1MgmtAppPodsStatus
 */



public class V1MgmtAppPodsStatus {
  @SerializedName("containers")
  private Map<String, V1MgmtAppContainersStatus> containers = null;

  @SerializedName("isHealthy")
  private Boolean isHealthy = null;

  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("pvcs")
  private Map<String, V1MgmtAppPvcStatus> pvcs = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  public V1MgmtAppPodsStatus containers(Map<String, V1MgmtAppContainersStatus> containers) {
    this.containers = containers;
    return this;
  }

  public V1MgmtAppPodsStatus putContainersItem(String key, V1MgmtAppContainersStatus containersItem) {
    if (this.containers == null) {
      this.containers = new HashMap<String, V1MgmtAppContainersStatus>();
    }
    this.containers.put(key, containersItem);
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @Schema(description = "")
  public Map<String, V1MgmtAppContainersStatus> getContainers() {
    return containers;
  }

  public void setContainers(Map<String, V1MgmtAppContainersStatus> containers) {
    this.containers = containers;
  }

  public V1MgmtAppPodsStatus isHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
    return this;
  }

   /**
   * Get isHealthy
   * @return isHealthy
  **/
  @Schema(description = "")
  public Boolean isIsHealthy() {
    return isHealthy;
  }

  public void setIsHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
  }

  public V1MgmtAppPodsStatus messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public V1MgmtAppPodsStatus addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<String>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @Schema(description = "")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public V1MgmtAppPodsStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1MgmtAppPodsStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @Schema(description = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1MgmtAppPodsStatus pvcs(Map<String, V1MgmtAppPvcStatus> pvcs) {
    this.pvcs = pvcs;
    return this;
  }

  public V1MgmtAppPodsStatus putPvcsItem(String key, V1MgmtAppPvcStatus pvcsItem) {
    if (this.pvcs == null) {
      this.pvcs = new HashMap<String, V1MgmtAppPvcStatus>();
    }
    this.pvcs.put(key, pvcsItem);
    return this;
  }

   /**
   * Get pvcs
   * @return pvcs
  **/
  @Schema(description = "")
  public Map<String, V1MgmtAppPvcStatus> getPvcs() {
    return pvcs;
  }

  public void setPvcs(Map<String, V1MgmtAppPvcStatus> pvcs) {
    this.pvcs = pvcs;
  }

  public V1MgmtAppPodsStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1MgmtAppPodsStatus startTime(OffsetDateTime startTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MgmtAppPodsStatus v1MgmtAppPodsStatus = (V1MgmtAppPodsStatus) o;
    return Objects.equals(this.containers, v1MgmtAppPodsStatus.containers) &&
        Objects.equals(this.isHealthy, v1MgmtAppPodsStatus.isHealthy) &&
        Objects.equals(this.messages, v1MgmtAppPodsStatus.messages) &&
        Objects.equals(this.name, v1MgmtAppPodsStatus.name) &&
        Objects.equals(this.phase, v1MgmtAppPodsStatus.phase) &&
        Objects.equals(this.pvcs, v1MgmtAppPodsStatus.pvcs) &&
        Objects.equals(this.reason, v1MgmtAppPodsStatus.reason) &&
        Objects.equals(this.startTime, v1MgmtAppPodsStatus.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, isHealthy, messages, name, phase, pvcs, reason, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MgmtAppPodsStatus {\n");
    
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    isHealthy: ").append(toIndentedString(isHealthy)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    pvcs: ").append(toIndentedString(pvcs)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
