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
import com.spectrocloud.client.model.V1AzureStorageConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Azure location specification
 */
@Schema(description = "Azure location specification")


public class V1UserAssetsLocationAzureSpec {
  @SerializedName("config")
  private V1AzureStorageConfig config = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("type")
  private String type = null;

  public V1UserAssetsLocationAzureSpec config(V1AzureStorageConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(required = true, description = "")
  public V1AzureStorageConfig getConfig() {
    return config;
  }

  public void setConfig(V1AzureStorageConfig config) {
    this.config = config;
  }

  public V1UserAssetsLocationAzureSpec isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Set to &#x27;true&#x27;, if location has to be set as default
   * @return isDefault
  **/
  @Schema(description = "Set to 'true', if location has to be set as default")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public V1UserAssetsLocationAzureSpec type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Azure location type [azure]
   * @return type
  **/
  @Schema(description = "Azure location type [azure]")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserAssetsLocationAzureSpec v1UserAssetsLocationAzureSpec = (V1UserAssetsLocationAzureSpec) o;
    return Objects.equals(this.config, v1UserAssetsLocationAzureSpec.config) &&
        Objects.equals(this.isDefault, v1UserAssetsLocationAzureSpec.isDefault) &&
        Objects.equals(this.type, v1UserAssetsLocationAzureSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, isDefault, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserAssetsLocationAzureSpec {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
