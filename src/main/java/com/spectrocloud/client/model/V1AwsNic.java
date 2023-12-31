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
 * AWS network interface
 */
@Schema(description = "AWS network interface")


public class V1AwsNic {
  @SerializedName("index")
  private Integer index = null;

  @SerializedName("privateIPs")
  private List<String> privateIPs = null;

  @SerializedName("publicIp")
  private String publicIp = null;

  public V1AwsNic index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public V1AwsNic privateIPs(List<String> privateIPs) {
    this.privateIPs = privateIPs;
    return this;
  }

  public V1AwsNic addPrivateIPsItem(String privateIPsItem) {
    if (this.privateIPs == null) {
      this.privateIPs = new ArrayList<String>();
    }
    this.privateIPs.add(privateIPsItem);
    return this;
  }

   /**
   * Get privateIPs
   * @return privateIPs
  **/
  @Schema(description = "")
  public List<String> getPrivateIPs() {
    return privateIPs;
  }

  public void setPrivateIPs(List<String> privateIPs) {
    this.privateIPs = privateIPs;
  }

  public V1AwsNic publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * Get publicIp
   * @return publicIp
  **/
  @Schema(description = "")
  public String getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsNic v1AwsNic = (V1AwsNic) o;
    return Objects.equals(this.index, v1AwsNic.index) &&
        Objects.equals(this.privateIPs, v1AwsNic.privateIPs) &&
        Objects.equals(this.publicIp, v1AwsNic.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, privateIPs, publicIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsNic {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    privateIPs: ").append(toIndentedString(privateIPs)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
