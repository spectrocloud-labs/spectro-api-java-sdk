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
 * system aws account specifications
 */
@Schema(description = "system aws account specifications")


public class V1SystemAzureStorageSpec {
  @SerializedName("accessKey")
  private String accessKey = null;

  @SerializedName("container")
  private String container = null;

  @SerializedName("storageName")
  private String storageName = null;

  public V1SystemAzureStorageSpec accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public V1SystemAzureStorageSpec container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public V1SystemAzureStorageSpec storageName(String storageName) {
    this.storageName = storageName;
    return this;
  }

   /**
   * Get storageName
   * @return storageName
  **/
  @Schema(description = "")
  public String getStorageName() {
    return storageName;
  }

  public void setStorageName(String storageName) {
    this.storageName = storageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemAzureStorageSpec v1SystemAzureStorageSpec = (V1SystemAzureStorageSpec) o;
    return Objects.equals(this.accessKey, v1SystemAzureStorageSpec.accessKey) &&
        Objects.equals(this.container, v1SystemAzureStorageSpec.container) &&
        Objects.equals(this.storageName, v1SystemAzureStorageSpec.storageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, container, storageName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemAzureStorageSpec {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    storageName: ").append(toIndentedString(storageName)).append("\n");
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
