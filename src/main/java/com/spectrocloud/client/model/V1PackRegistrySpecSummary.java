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
 * Pack Registry spec summary
 */
@Schema(description = "Pack Registry spec summary")


public class V1PackRegistrySpecSummary {
  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("scope")
  private String scope = null;

  public V1PackRegistrySpecSummary endpoint(String endpoint) {
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

  public V1PackRegistrySpecSummary _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @Schema(description = "")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public V1PackRegistrySpecSummary scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PackRegistrySpecSummary v1PackRegistrySpecSummary = (V1PackRegistrySpecSummary) o;
    return Objects.equals(this.endpoint, v1PackRegistrySpecSummary.endpoint) &&
        Objects.equals(this._private, v1PackRegistrySpecSummary._private) &&
        Objects.equals(this.scope, v1PackRegistrySpecSummary.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, _private, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackRegistrySpecSummary {\n");
    
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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