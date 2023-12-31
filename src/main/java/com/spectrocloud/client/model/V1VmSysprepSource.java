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
import com.spectrocloud.client.model.V1VmLocalObjectReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Represents a Sysprep volume source.
 */
@Schema(description = "Represents a Sysprep volume source.")


public class V1VmSysprepSource {
  @SerializedName("configMap")
  private V1VmLocalObjectReference configMap = null;

  @SerializedName("secret")
  private V1VmLocalObjectReference secret = null;

  public V1VmSysprepSource configMap(V1VmLocalObjectReference configMap) {
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @Schema(description = "")
  public V1VmLocalObjectReference getConfigMap() {
    return configMap;
  }

  public void setConfigMap(V1VmLocalObjectReference configMap) {
    this.configMap = configMap;
  }

  public V1VmSysprepSource secret(V1VmLocalObjectReference secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @Schema(description = "")
  public V1VmLocalObjectReference getSecret() {
    return secret;
  }

  public void setSecret(V1VmLocalObjectReference secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmSysprepSource v1VmSysprepSource = (V1VmSysprepSource) o;
    return Objects.equals(this.configMap, v1VmSysprepSource.configMap) &&
        Objects.equals(this.secret, v1VmSysprepSource.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmSysprepSource {\n");
    
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
