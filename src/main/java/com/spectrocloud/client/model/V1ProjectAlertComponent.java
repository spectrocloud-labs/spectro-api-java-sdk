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
import java.util.ArrayList;
import java.util.List;
/**
 * Project alert component
 */
@Schema(description = "Project alert component")


public class V1ProjectAlertComponent {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("supportedChannels")
  private List<String> supportedChannels = null;

  public V1ProjectAlertComponent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1ProjectAlertComponent name(String name) {
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

  public V1ProjectAlertComponent supportedChannels(List<String> supportedChannels) {
    this.supportedChannels = supportedChannels;
    return this;
  }

  public V1ProjectAlertComponent addSupportedChannelsItem(String supportedChannelsItem) {
    if (this.supportedChannels == null) {
      this.supportedChannels = new ArrayList<String>();
    }
    this.supportedChannels.add(supportedChannelsItem);
    return this;
  }

   /**
   * Get supportedChannels
   * @return supportedChannels
  **/
  @Schema(description = "")
  public List<String> getSupportedChannels() {
    return supportedChannels;
  }

  public void setSupportedChannels(List<String> supportedChannels) {
    this.supportedChannels = supportedChannels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectAlertComponent v1ProjectAlertComponent = (V1ProjectAlertComponent) o;
    return Objects.equals(this.description, v1ProjectAlertComponent.description) &&
        Objects.equals(this.name, v1ProjectAlertComponent.name) &&
        Objects.equals(this.supportedChannels, v1ProjectAlertComponent.supportedChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, supportedChannels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectAlertComponent {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedChannels: ").append(toIndentedString(supportedChannels)).append("\n");
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