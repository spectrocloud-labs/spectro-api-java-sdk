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
 * cluster proxy config spec
 */
@Schema(description = "cluster proxy config spec")


public class V1ClusterProxySpec {
  @SerializedName("httpProxy")
  private String httpProxy = null;

  @SerializedName("httpsProxy")
  private String httpsProxy = null;

  @SerializedName("noProxy")
  private String noProxy = null;

  public V1ClusterProxySpec httpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
    return this;
  }

   /**
   * Get httpProxy
   * @return httpProxy
  **/
  @Schema(description = "")
  public String getHttpProxy() {
    return httpProxy;
  }

  public void setHttpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
  }

  public V1ClusterProxySpec httpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
    return this;
  }

   /**
   * Get httpsProxy
   * @return httpsProxy
  **/
  @Schema(description = "")
  public String getHttpsProxy() {
    return httpsProxy;
  }

  public void setHttpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
  }

  public V1ClusterProxySpec noProxy(String noProxy) {
    this.noProxy = noProxy;
    return this;
  }

   /**
   * Get noProxy
   * @return noProxy
  **/
  @Schema(description = "")
  public String getNoProxy() {
    return noProxy;
  }

  public void setNoProxy(String noProxy) {
    this.noProxy = noProxy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterProxySpec v1ClusterProxySpec = (V1ClusterProxySpec) o;
    return Objects.equals(this.httpProxy, v1ClusterProxySpec.httpProxy) &&
        Objects.equals(this.httpsProxy, v1ClusterProxySpec.httpsProxy) &&
        Objects.equals(this.noProxy, v1ClusterProxySpec.noProxy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpProxy, httpsProxy, noProxy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProxySpec {\n");
    
    sb.append("    httpProxy: ").append(toIndentedString(httpProxy)).append("\n");
    sb.append("    httpsProxy: ").append(toIndentedString(httpsProxy)).append("\n");
    sb.append("    noProxy: ").append(toIndentedString(noProxy)).append("\n");
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
