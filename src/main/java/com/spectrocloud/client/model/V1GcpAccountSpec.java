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
 * V1GcpAccountSpec
 */



public class V1GcpAccountSpec {
  @SerializedName("jsonCredentials")
  private String jsonCredentials = null;

  @SerializedName("jsonCredentialsFileName")
  private String jsonCredentialsFileName = null;

  public V1GcpAccountSpec jsonCredentials(String jsonCredentials) {
    this.jsonCredentials = jsonCredentials;
    return this;
  }

   /**
   * Gcp cloud account json credentials
   * @return jsonCredentials
  **/
  @Schema(description = "Gcp cloud account json credentials")
  public String getJsonCredentials() {
    return jsonCredentials;
  }

  public void setJsonCredentials(String jsonCredentials) {
    this.jsonCredentials = jsonCredentials;
  }

  public V1GcpAccountSpec jsonCredentialsFileName(String jsonCredentialsFileName) {
    this.jsonCredentialsFileName = jsonCredentialsFileName;
    return this;
  }

   /**
   * Reference of the credentials stored in the file
   * @return jsonCredentialsFileName
  **/
  @Schema(description = "Reference of the credentials stored in the file")
  public String getJsonCredentialsFileName() {
    return jsonCredentialsFileName;
  }

  public void setJsonCredentialsFileName(String jsonCredentialsFileName) {
    this.jsonCredentialsFileName = jsonCredentialsFileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpAccountSpec v1GcpAccountSpec = (V1GcpAccountSpec) o;
    return Objects.equals(this.jsonCredentials, v1GcpAccountSpec.jsonCredentials) &&
        Objects.equals(this.jsonCredentialsFileName, v1GcpAccountSpec.jsonCredentialsFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonCredentials, jsonCredentialsFileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpAccountSpec {\n");
    
    sb.append("    jsonCredentials: ").append(toIndentedString(jsonCredentials)).append("\n");
    sb.append("    jsonCredentialsFileName: ").append(toIndentedString(jsonCredentialsFileName)).append("\n");
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
