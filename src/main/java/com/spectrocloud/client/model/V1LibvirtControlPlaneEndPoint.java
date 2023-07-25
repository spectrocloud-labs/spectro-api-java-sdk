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
/**
 * V1LibvirtControlPlaneEndPoint
 */



public class V1LibvirtControlPlaneEndPoint {
  @SerializedName("ddnsSearchDomain")
  private String ddnsSearchDomain = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("type")
  private String type = null;

  public V1LibvirtControlPlaneEndPoint ddnsSearchDomain(String ddnsSearchDomain) {
    this.ddnsSearchDomain = ddnsSearchDomain;
    return this;
  }

   /**
   * DDNSSearchDomain is the search domain used for resolving IP addresses when the EndpointType is DDNS. This search domain is appended to the generated Hostname to obtain the complete DNS name for the endpoint. If Host is already a DDNS FQDN, DDNSSearchDomain is not required
   * @return ddnsSearchDomain
  **/
  @Schema(description = "DDNSSearchDomain is the search domain used for resolving IP addresses when the EndpointType is DDNS. This search domain is appended to the generated Hostname to obtain the complete DNS name for the endpoint. If Host is already a DDNS FQDN, DDNSSearchDomain is not required")
  public String getDdnsSearchDomain() {
    return ddnsSearchDomain;
  }

  public void setDdnsSearchDomain(String ddnsSearchDomain) {
    this.ddnsSearchDomain = ddnsSearchDomain;
  }

  public V1LibvirtControlPlaneEndPoint host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Host is FQDN(DDNS) or IP
   * @return host
  **/
  @Schema(description = "Host is FQDN(DDNS) or IP")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1LibvirtControlPlaneEndPoint type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type indicates DDNS or VIP
   * @return type
  **/
  @Schema(description = "Type indicates DDNS or VIP")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LibvirtControlPlaneEndPoint v1LibvirtControlPlaneEndPoint = (V1LibvirtControlPlaneEndPoint) o;
    return Objects.equals(this.ddnsSearchDomain, v1LibvirtControlPlaneEndPoint.ddnsSearchDomain) &&
        Objects.equals(this.host, v1LibvirtControlPlaneEndPoint.host) &&
        Objects.equals(this.type, v1LibvirtControlPlaneEndPoint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddnsSearchDomain, host, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LibvirtControlPlaneEndPoint {\n");
    
    sb.append("    ddnsSearchDomain: ").append(toIndentedString(ddnsSearchDomain)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
