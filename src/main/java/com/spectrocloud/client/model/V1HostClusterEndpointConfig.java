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
import com.spectrocloud.client.model.V1IngressConfig;
import com.spectrocloud.client.model.V1LoadBalancerConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1HostClusterEndpointConfig
 */



public class V1HostClusterEndpointConfig {
  @SerializedName("ingressConfig")
  private V1IngressConfig ingressConfig = null;

  @SerializedName("loadBalancerConfig")
  private V1LoadBalancerConfig loadBalancerConfig = null;

  public V1HostClusterEndpointConfig ingressConfig(V1IngressConfig ingressConfig) {
    this.ingressConfig = ingressConfig;
    return this;
  }

   /**
   * Get ingressConfig
   * @return ingressConfig
  **/
  @Schema(description = "")
  public V1IngressConfig getIngressConfig() {
    return ingressConfig;
  }

  public void setIngressConfig(V1IngressConfig ingressConfig) {
    this.ingressConfig = ingressConfig;
  }

  public V1HostClusterEndpointConfig loadBalancerConfig(V1LoadBalancerConfig loadBalancerConfig) {
    this.loadBalancerConfig = loadBalancerConfig;
    return this;
  }

   /**
   * Get loadBalancerConfig
   * @return loadBalancerConfig
  **/
  @Schema(description = "")
  public V1LoadBalancerConfig getLoadBalancerConfig() {
    return loadBalancerConfig;
  }

  public void setLoadBalancerConfig(V1LoadBalancerConfig loadBalancerConfig) {
    this.loadBalancerConfig = loadBalancerConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostClusterEndpointConfig v1HostClusterEndpointConfig = (V1HostClusterEndpointConfig) o;
    return Objects.equals(this.ingressConfig, v1HostClusterEndpointConfig.ingressConfig) &&
        Objects.equals(this.loadBalancerConfig, v1HostClusterEndpointConfig.loadBalancerConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingressConfig, loadBalancerConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostClusterEndpointConfig {\n");
    
    sb.append("    ingressConfig: ").append(toIndentedString(ingressConfig)).append("\n");
    sb.append("    loadBalancerConfig: ").append(toIndentedString(loadBalancerConfig)).append("\n");
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
