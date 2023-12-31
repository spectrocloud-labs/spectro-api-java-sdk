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
import com.spectrocloud.client.model.V1ServicePort;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1LoadBalancerService
 */



public class V1LoadBalancerService {
  @SerializedName("host")
  private String host = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ports")
  private List<V1ServicePort> ports = null;

  public V1LoadBalancerService host(String host) {
    this.host = host;
    return this;
  }

   /**
   * IP or Host from svc.Status.LoadBalancerStatus.Ingress
   * @return host
  **/
  @Schema(description = "IP or Host from svc.Status.LoadBalancerStatus.Ingress")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1LoadBalancerService name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the loadbalancer service
   * @return name
  **/
  @Schema(description = "name of the loadbalancer service")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1LoadBalancerService ports(List<V1ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  public V1LoadBalancerService addPortsItem(V1ServicePort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ServicePort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * port this service exposed
   * @return ports
  **/
  @Schema(description = "port this service exposed")
  public List<V1ServicePort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ServicePort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LoadBalancerService v1LoadBalancerService = (V1LoadBalancerService) o;
    return Objects.equals(this.host, v1LoadBalancerService.host) &&
        Objects.equals(this.name, v1LoadBalancerService.name) &&
        Objects.equals(this.ports, v1LoadBalancerService.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, name, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerService {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
