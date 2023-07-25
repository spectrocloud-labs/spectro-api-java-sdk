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
import com.spectrocloud.client.model.V1RegistryAuth;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Registry configuration
 */
@Schema(description = "Registry configuration")


public class V1RegistryConfiguration {
  @SerializedName("auth")
  private V1RegistryAuth auth = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("name")
  private String name = null;

  public V1RegistryConfiguration auth(V1RegistryAuth auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @Schema(description = "")
  public V1RegistryAuth getAuth() {
    return auth;
  }

  public void setAuth(V1RegistryAuth auth) {
    this.auth = auth;
  }

  public V1RegistryConfiguration endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public V1RegistryConfiguration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RegistryConfiguration v1RegistryConfiguration = (V1RegistryConfiguration) o;
    return Objects.equals(this.auth, v1RegistryConfiguration.auth) &&
        Objects.equals(this.endpoint, v1RegistryConfiguration.endpoint) &&
        Objects.equals(this.name, v1RegistryConfiguration.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, endpoint, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RegistryConfiguration {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
