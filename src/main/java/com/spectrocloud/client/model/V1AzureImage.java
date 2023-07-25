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
 * Refers to Azure Shared Gallery image
 */
@Schema(description = "Refers to Azure Shared Gallery image")


public class V1AzureImage {
  @SerializedName("gallery")
  private String gallery = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("resourceGroup")
  private String resourceGroup = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("subscriptionID")
  private String subscriptionID = null;

  @SerializedName("version")
  private String version = null;

  public V1AzureImage gallery(String gallery) {
    this.gallery = gallery;
    return this;
  }

   /**
   * Get gallery
   * @return gallery
  **/
  @Schema(description = "")
  public String getGallery() {
    return gallery;
  }

  public void setGallery(String gallery) {
    this.gallery = gallery;
  }

  public V1AzureImage name(String name) {
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

  public V1AzureImage resourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

   /**
   * Get resourceGroup
   * @return resourceGroup
  **/
  @Schema(description = "")
  public String getResourceGroup() {
    return resourceGroup;
  }

  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  public V1AzureImage state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public V1AzureImage subscriptionID(String subscriptionID) {
    this.subscriptionID = subscriptionID;
    return this;
  }

   /**
   * Get subscriptionID
   * @return subscriptionID
  **/
  @Schema(description = "")
  public String getSubscriptionID() {
    return subscriptionID;
  }

  public void setSubscriptionID(String subscriptionID) {
    this.subscriptionID = subscriptionID;
  }

  public V1AzureImage version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AzureImage v1AzureImage = (V1AzureImage) o;
    return Objects.equals(this.gallery, v1AzureImage.gallery) &&
        Objects.equals(this.name, v1AzureImage.name) &&
        Objects.equals(this.resourceGroup, v1AzureImage.resourceGroup) &&
        Objects.equals(this.state, v1AzureImage.state) &&
        Objects.equals(this.subscriptionID, v1AzureImage.subscriptionID) &&
        Objects.equals(this.version, v1AzureImage.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gallery, name, resourceGroup, state, subscriptionID, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureImage {\n");
    
    sb.append("    gallery: ").append(toIndentedString(gallery)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionID: ").append(toIndentedString(subscriptionID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
