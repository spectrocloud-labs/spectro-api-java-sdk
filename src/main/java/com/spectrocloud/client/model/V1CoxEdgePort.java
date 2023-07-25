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
 * CoxEdge network port
 */
@Schema(description = "CoxEdge network port")


public class V1CoxEdgePort {
  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("publicPort")
  private String publicPort = null;

  @SerializedName("publicPortDesc")
  private String publicPortDesc = null;

  public V1CoxEdgePort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public V1CoxEdgePort publicPort(String publicPort) {
    this.publicPort = publicPort;
    return this;
  }

   /**
   * Get publicPort
   * @return publicPort
  **/
  @Schema(description = "")
  public String getPublicPort() {
    return publicPort;
  }

  public void setPublicPort(String publicPort) {
    this.publicPort = publicPort;
  }

  public V1CoxEdgePort publicPortDesc(String publicPortDesc) {
    this.publicPortDesc = publicPortDesc;
    return this;
  }

   /**
   * Get publicPortDesc
   * @return publicPortDesc
  **/
  @Schema(description = "")
  public String getPublicPortDesc() {
    return publicPortDesc;
  }

  public void setPublicPortDesc(String publicPortDesc) {
    this.publicPortDesc = publicPortDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CoxEdgePort v1CoxEdgePort = (V1CoxEdgePort) o;
    return Objects.equals(this.protocol, v1CoxEdgePort.protocol) &&
        Objects.equals(this.publicPort, v1CoxEdgePort.publicPort) &&
        Objects.equals(this.publicPortDesc, v1CoxEdgePort.publicPortDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, publicPort, publicPortDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CoxEdgePort {\n");
    
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
    sb.append("    publicPortDesc: ").append(toIndentedString(publicPortDesc)).append("\n");
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