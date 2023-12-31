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
import com.spectrocloud.client.model.V1MgmtAppPodsStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * V1MgmtAppObjectStatus
 */



public class V1MgmtAppObjectStatus {
  @SerializedName("availableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("desiredReplicaCount")
  private Integer desiredReplicaCount = null;

  @SerializedName("isHealthy")
  private Boolean isHealthy = null;

  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("pods")
  private Map<String, V1MgmtAppPodsStatus> pods = null;

  public V1MgmtAppObjectStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Get availableReplicas
   * @return availableReplicas
  **/
  @Schema(description = "")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public V1MgmtAppObjectStatus creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public V1MgmtAppObjectStatus desiredReplicaCount(Integer desiredReplicaCount) {
    this.desiredReplicaCount = desiredReplicaCount;
    return this;
  }

   /**
   * Get desiredReplicaCount
   * @return desiredReplicaCount
  **/
  @Schema(description = "")
  public Integer getDesiredReplicaCount() {
    return desiredReplicaCount;
  }

  public void setDesiredReplicaCount(Integer desiredReplicaCount) {
    this.desiredReplicaCount = desiredReplicaCount;
  }

  public V1MgmtAppObjectStatus isHealthy(Boolean isHealthy) {
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

  public V1MgmtAppObjectStatus messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public V1MgmtAppObjectStatus addMessagesItem(String messagesItem) {
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

  public V1MgmtAppObjectStatus name(String name) {
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

  public V1MgmtAppObjectStatus pods(Map<String, V1MgmtAppPodsStatus> pods) {
    this.pods = pods;
    return this;
  }

  public V1MgmtAppObjectStatus putPodsItem(String key, V1MgmtAppPodsStatus podsItem) {
    if (this.pods == null) {
      this.pods = new HashMap<String, V1MgmtAppPodsStatus>();
    }
    this.pods.put(key, podsItem);
    return this;
  }

   /**
   * Get pods
   * @return pods
  **/
  @Schema(description = "")
  public Map<String, V1MgmtAppPodsStatus> getPods() {
    return pods;
  }

  public void setPods(Map<String, V1MgmtAppPodsStatus> pods) {
    this.pods = pods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MgmtAppObjectStatus v1MgmtAppObjectStatus = (V1MgmtAppObjectStatus) o;
    return Objects.equals(this.availableReplicas, v1MgmtAppObjectStatus.availableReplicas) &&
        Objects.equals(this.creationTime, v1MgmtAppObjectStatus.creationTime) &&
        Objects.equals(this.desiredReplicaCount, v1MgmtAppObjectStatus.desiredReplicaCount) &&
        Objects.equals(this.isHealthy, v1MgmtAppObjectStatus.isHealthy) &&
        Objects.equals(this.messages, v1MgmtAppObjectStatus.messages) &&
        Objects.equals(this.name, v1MgmtAppObjectStatus.name) &&
        Objects.equals(this.pods, v1MgmtAppObjectStatus.pods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, creationTime, desiredReplicaCount, isHealthy, messages, name, pods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MgmtAppObjectStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    desiredReplicaCount: ").append(toIndentedString(desiredReplicaCount)).append("\n");
    sb.append("    isHealthy: ").append(toIndentedString(isHealthy)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
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
