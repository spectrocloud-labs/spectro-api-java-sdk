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
import com.spectrocloud.client.model.V1GcpAccountEntitySpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GCP storage config object
 */
@Schema(description = "GCP storage config object")


public class V1GcpStorageConfig {
  @SerializedName("bucketName")
  private String bucketName = null;

  @SerializedName("credentials")
  private V1GcpAccountEntitySpec credentials = null;

  public V1GcpStorageConfig bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * GCP storage bucket name
   * @return bucketName
  **/
  @Schema(required = true, description = "GCP storage bucket name")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public V1GcpStorageConfig credentials(V1GcpAccountEntitySpec credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Schema(required = true, description = "")
  public V1GcpAccountEntitySpec getCredentials() {
    return credentials;
  }

  public void setCredentials(V1GcpAccountEntitySpec credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpStorageConfig v1GcpStorageConfig = (V1GcpStorageConfig) o;
    return Objects.equals(this.bucketName, v1GcpStorageConfig.bucketName) &&
        Objects.equals(this.credentials, v1GcpStorageConfig.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, credentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpStorageConfig {\n");
    
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
