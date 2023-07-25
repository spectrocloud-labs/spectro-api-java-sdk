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
 * VSphere DNS Mapping Spec
 */
@Schema(description = "VSphere DNS Mapping Spec")


public class V1VsphereDnsMappingSpec {
  @SerializedName("datacenter")
  private String datacenter = null;

  @SerializedName("dnsName")
  private String dnsName = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("networkUrl")
  private String networkUrl = null;

  @SerializedName("privateGatewayUid")
  private String privateGatewayUid = null;

  public V1VsphereDnsMappingSpec datacenter(String datacenter) {
    this.datacenter = datacenter;
    return this;
  }

   /**
   * VSphere datacenter name
   * @return datacenter
  **/
  @Schema(required = true, description = "VSphere datacenter name")
  public String getDatacenter() {
    return datacenter;
  }

  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }

  public V1VsphereDnsMappingSpec dnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

   /**
   * VSphere DNS name
   * @return dnsName
  **/
  @Schema(required = true, description = "VSphere DNS name")
  public String getDnsName() {
    return dnsName;
  }

  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }

  public V1VsphereDnsMappingSpec network(String network) {
    this.network = network;
    return this;
  }

   /**
   * VSphere network name
   * @return network
  **/
  @Schema(required = true, description = "VSphere network name")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

   /**
   * VSphere network URL
   * @return networkUrl
  **/
  @Schema(description = "VSphere network URL")
  public String getNetworkUrl() {
    return networkUrl;
  }

  public V1VsphereDnsMappingSpec privateGatewayUid(String privateGatewayUid) {
    this.privateGatewayUid = privateGatewayUid;
    return this;
  }

   /**
   * VSphere private gateway uid
   * @return privateGatewayUid
  **/
  @Schema(required = true, description = "VSphere private gateway uid")
  public String getPrivateGatewayUid() {
    return privateGatewayUid;
  }

  public void setPrivateGatewayUid(String privateGatewayUid) {
    this.privateGatewayUid = privateGatewayUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereDnsMappingSpec v1VsphereDnsMappingSpec = (V1VsphereDnsMappingSpec) o;
    return Objects.equals(this.datacenter, v1VsphereDnsMappingSpec.datacenter) &&
        Objects.equals(this.dnsName, v1VsphereDnsMappingSpec.dnsName) &&
        Objects.equals(this.network, v1VsphereDnsMappingSpec.network) &&
        Objects.equals(this.networkUrl, v1VsphereDnsMappingSpec.networkUrl) &&
        Objects.equals(this.privateGatewayUid, v1VsphereDnsMappingSpec.privateGatewayUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datacenter, dnsName, network, networkUrl, privateGatewayUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereDnsMappingSpec {\n");
    
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    networkUrl: ").append(toIndentedString(networkUrl)).append("\n");
    sb.append("    privateGatewayUid: ").append(toIndentedString(privateGatewayUid)).append("\n");
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
