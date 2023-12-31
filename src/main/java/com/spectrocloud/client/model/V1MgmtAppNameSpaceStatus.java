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
import com.spectrocloud.client.model.V1MgmtAppCronJobStatus;
import com.spectrocloud.client.model.V1MgmtAppObjectStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * V1MgmtAppNameSpaceStatus
 */



public class V1MgmtAppNameSpaceStatus {
  @SerializedName("cronJobs")
  private Map<String, V1MgmtAppCronJobStatus> cronJobs = null;

  @SerializedName("deployments")
  private Map<String, V1MgmtAppObjectStatus> deployments = null;

  @SerializedName("isHealthy")
  private Boolean isHealthy = null;

  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("statefulSets")
  private Map<String, V1MgmtAppObjectStatus> statefulSets = null;

  public V1MgmtAppNameSpaceStatus cronJobs(Map<String, V1MgmtAppCronJobStatus> cronJobs) {
    this.cronJobs = cronJobs;
    return this;
  }

  public V1MgmtAppNameSpaceStatus putCronJobsItem(String key, V1MgmtAppCronJobStatus cronJobsItem) {
    if (this.cronJobs == null) {
      this.cronJobs = new HashMap<String, V1MgmtAppCronJobStatus>();
    }
    this.cronJobs.put(key, cronJobsItem);
    return this;
  }

   /**
   * Get cronJobs
   * @return cronJobs
  **/
  @Schema(description = "")
  public Map<String, V1MgmtAppCronJobStatus> getCronJobs() {
    return cronJobs;
  }

  public void setCronJobs(Map<String, V1MgmtAppCronJobStatus> cronJobs) {
    this.cronJobs = cronJobs;
  }

  public V1MgmtAppNameSpaceStatus deployments(Map<String, V1MgmtAppObjectStatus> deployments) {
    this.deployments = deployments;
    return this;
  }

  public V1MgmtAppNameSpaceStatus putDeploymentsItem(String key, V1MgmtAppObjectStatus deploymentsItem) {
    if (this.deployments == null) {
      this.deployments = new HashMap<String, V1MgmtAppObjectStatus>();
    }
    this.deployments.put(key, deploymentsItem);
    return this;
  }

   /**
   * Get deployments
   * @return deployments
  **/
  @Schema(description = "")
  public Map<String, V1MgmtAppObjectStatus> getDeployments() {
    return deployments;
  }

  public void setDeployments(Map<String, V1MgmtAppObjectStatus> deployments) {
    this.deployments = deployments;
  }

  public V1MgmtAppNameSpaceStatus isHealthy(Boolean isHealthy) {
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

  public V1MgmtAppNameSpaceStatus messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public V1MgmtAppNameSpaceStatus addMessagesItem(String messagesItem) {
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

  public V1MgmtAppNameSpaceStatus statefulSets(Map<String, V1MgmtAppObjectStatus> statefulSets) {
    this.statefulSets = statefulSets;
    return this;
  }

  public V1MgmtAppNameSpaceStatus putStatefulSetsItem(String key, V1MgmtAppObjectStatus statefulSetsItem) {
    if (this.statefulSets == null) {
      this.statefulSets = new HashMap<String, V1MgmtAppObjectStatus>();
    }
    this.statefulSets.put(key, statefulSetsItem);
    return this;
  }

   /**
   * Get statefulSets
   * @return statefulSets
  **/
  @Schema(description = "")
  public Map<String, V1MgmtAppObjectStatus> getStatefulSets() {
    return statefulSets;
  }

  public void setStatefulSets(Map<String, V1MgmtAppObjectStatus> statefulSets) {
    this.statefulSets = statefulSets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MgmtAppNameSpaceStatus v1MgmtAppNameSpaceStatus = (V1MgmtAppNameSpaceStatus) o;
    return Objects.equals(this.cronJobs, v1MgmtAppNameSpaceStatus.cronJobs) &&
        Objects.equals(this.deployments, v1MgmtAppNameSpaceStatus.deployments) &&
        Objects.equals(this.isHealthy, v1MgmtAppNameSpaceStatus.isHealthy) &&
        Objects.equals(this.messages, v1MgmtAppNameSpaceStatus.messages) &&
        Objects.equals(this.statefulSets, v1MgmtAppNameSpaceStatus.statefulSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronJobs, deployments, isHealthy, messages, statefulSets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MgmtAppNameSpaceStatus {\n");
    
    sb.append("    cronJobs: ").append(toIndentedString(cronJobs)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    isHealthy: ").append(toIndentedString(isHealthy)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    statefulSets: ").append(toIndentedString(statefulSets)).append("\n");
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
