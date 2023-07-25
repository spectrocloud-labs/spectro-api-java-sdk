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
 * Represents the stock pod network interface.
 */
@Schema(description = "Represents the stock pod network interface.")


public class V1VmPodNetwork {
  @SerializedName("vmIPv6NetworkCIDR")
  private String vmIPv6NetworkCIDR = null;

  @SerializedName("vmNetworkCIDR")
  private String vmNetworkCIDR = null;

  public V1VmPodNetwork vmIPv6NetworkCIDR(String vmIPv6NetworkCIDR) {
    this.vmIPv6NetworkCIDR = vmIPv6NetworkCIDR;
    return this;
  }

   /**
   * IPv6 CIDR for the vm network. Defaults to fd10:0:2::/120 if not specified.
   * @return vmIPv6NetworkCIDR
  **/
  @Schema(description = "IPv6 CIDR for the vm network. Defaults to fd10:0:2::/120 if not specified.")
  public String getVmIPv6NetworkCIDR() {
    return vmIPv6NetworkCIDR;
  }

  public void setVmIPv6NetworkCIDR(String vmIPv6NetworkCIDR) {
    this.vmIPv6NetworkCIDR = vmIPv6NetworkCIDR;
  }

  public V1VmPodNetwork vmNetworkCIDR(String vmNetworkCIDR) {
    this.vmNetworkCIDR = vmNetworkCIDR;
    return this;
  }

   /**
   * CIDR for vm network. Default 10.0.2.0/24 if not specified.
   * @return vmNetworkCIDR
  **/
  @Schema(description = "CIDR for vm network. Default 10.0.2.0/24 if not specified.")
  public String getVmNetworkCIDR() {
    return vmNetworkCIDR;
  }

  public void setVmNetworkCIDR(String vmNetworkCIDR) {
    this.vmNetworkCIDR = vmNetworkCIDR;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmPodNetwork v1VmPodNetwork = (V1VmPodNetwork) o;
    return Objects.equals(this.vmIPv6NetworkCIDR, v1VmPodNetwork.vmIPv6NetworkCIDR) &&
        Objects.equals(this.vmNetworkCIDR, v1VmPodNetwork.vmNetworkCIDR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmIPv6NetworkCIDR, vmNetworkCIDR);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmPodNetwork {\n");
    
    sb.append("    vmIPv6NetworkCIDR: ").append(toIndentedString(vmIPv6NetworkCIDR)).append("\n");
    sb.append("    vmNetworkCIDR: ").append(toIndentedString(vmNetworkCIDR)).append("\n");
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