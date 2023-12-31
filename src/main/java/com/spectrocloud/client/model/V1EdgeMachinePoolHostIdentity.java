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
 * V1EdgeMachinePoolHostIdentity
 */



public class V1EdgeMachinePoolHostIdentity {
  @SerializedName("caCert")
  private String caCert = null;

  @SerializedName("socketPath")
  private String socketPath = null;

  public V1EdgeMachinePoolHostIdentity caCert(String caCert) {
    this.caCert = caCert;
    return this;
  }

   /**
   * CACert is the client CA certificate
   * @return caCert
  **/
  @Schema(description = "CACert is the client CA certificate")
  public String getCaCert() {
    return caCert;
  }

  public void setCaCert(String caCert) {
    this.caCert = caCert;
  }

  public V1EdgeMachinePoolHostIdentity socketPath(String socketPath) {
    this.socketPath = socketPath;
    return this;
  }

   /**
   * SocketPath is an optional path to the socket on the host, if not using defaults
   * @return socketPath
  **/
  @Schema(description = "SocketPath is an optional path to the socket on the host, if not using defaults")
  public String getSocketPath() {
    return socketPath;
  }

  public void setSocketPath(String socketPath) {
    this.socketPath = socketPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EdgeMachinePoolHostIdentity v1EdgeMachinePoolHostIdentity = (V1EdgeMachinePoolHostIdentity) o;
    return Objects.equals(this.caCert, v1EdgeMachinePoolHostIdentity.caCert) &&
        Objects.equals(this.socketPath, v1EdgeMachinePoolHostIdentity.socketPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCert, socketPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EdgeMachinePoolHostIdentity {\n");
    
    sb.append("    caCert: ").append(toIndentedString(caCert)).append("\n");
    sb.append("    socketPath: ").append(toIndentedString(socketPath)).append("\n");
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
