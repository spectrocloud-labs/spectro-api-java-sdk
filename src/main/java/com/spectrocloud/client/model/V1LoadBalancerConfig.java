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
/**
 * Load balancer configuration for exposing the virtual cluster&#x27;s kube-apiserver
 */
@Schema(description = "Load balancer configuration for exposing the virtual cluster's kube-apiserver")


public class V1LoadBalancerConfig {
  @SerializedName("externalIPs")
  private List<String> externalIPs = null;

  @SerializedName("externalTrafficPolicy")
  private String externalTrafficPolicy = null;

  @SerializedName("loadBalancerSourceRanges")
  private List<String> loadBalancerSourceRanges = null;

  public V1LoadBalancerConfig externalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  public V1LoadBalancerConfig addExternalIPsItem(String externalIPsItem) {
    if (this.externalIPs == null) {
      this.externalIPs = new ArrayList<String>();
    }
    this.externalIPs.add(externalIPsItem);
    return this;
  }

   /**
   * Get externalIPs
   * @return externalIPs
  **/
  @Schema(description = "")
  public List<String> getExternalIPs() {
    return externalIPs;
  }

  public void setExternalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }

  public V1LoadBalancerConfig externalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return this;
  }

   /**
   * Get externalTrafficPolicy
   * @return externalTrafficPolicy
  **/
  @Schema(description = "")
  public String getExternalTrafficPolicy() {
    return externalTrafficPolicy;
  }

  public void setExternalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
  }

  public V1LoadBalancerConfig loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  public V1LoadBalancerConfig addLoadBalancerSourceRangesItem(String loadBalancerSourceRangesItem) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new ArrayList<String>();
    }
    this.loadBalancerSourceRanges.add(loadBalancerSourceRangesItem);
    return this;
  }

   /**
   * Get loadBalancerSourceRanges
   * @return loadBalancerSourceRanges
  **/
  @Schema(description = "")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }

  public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LoadBalancerConfig v1LoadBalancerConfig = (V1LoadBalancerConfig) o;
    return Objects.equals(this.externalIPs, v1LoadBalancerConfig.externalIPs) &&
        Objects.equals(this.externalTrafficPolicy, v1LoadBalancerConfig.externalTrafficPolicy) &&
        Objects.equals(this.loadBalancerSourceRanges, v1LoadBalancerConfig.loadBalancerSourceRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIPs, externalTrafficPolicy, loadBalancerSourceRanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerConfig {\n");
    
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    externalTrafficPolicy: ").append(toIndentedString(externalTrafficPolicy)).append("\n");
    sb.append("    loadBalancerSourceRanges: ").append(toIndentedString(loadBalancerSourceRanges)).append("\n");
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