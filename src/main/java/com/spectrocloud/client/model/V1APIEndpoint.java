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
 * APIEndpoint represents a reachable Kubernetes API endpoint.
 */
@Schema(description = "APIEndpoint represents a reachable Kubernetes API endpoint.")


public class V1APIEndpoint {
  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private Integer port = null;

  public V1APIEndpoint host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The hostname on which the API server is serving.
   * @return host
  **/
  @Schema(required = true, description = "The hostname on which the API server is serving.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1APIEndpoint port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port on which the API server is serving.
   * @return port
  **/
  @Schema(required = true, description = "The port on which the API server is serving.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIEndpoint v1ApiEndpoint = (V1APIEndpoint) o;
    return Objects.equals(this.host, v1ApiEndpoint.host) &&
        Objects.equals(this.port, v1ApiEndpoint.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIEndpoint {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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