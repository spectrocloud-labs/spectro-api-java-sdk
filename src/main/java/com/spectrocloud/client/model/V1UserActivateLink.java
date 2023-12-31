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
 * V1UserActivateLink
 */



public class V1UserActivateLink {
  @SerializedName("activationLink")
  private String activationLink = null;

  public V1UserActivateLink activationLink(String activationLink) {
    this.activationLink = activationLink;
    return this;
  }

   /**
   * Get activationLink
   * @return activationLink
  **/
  @Schema(description = "")
  public String getActivationLink() {
    return activationLink;
  }

  public void setActivationLink(String activationLink) {
    this.activationLink = activationLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserActivateLink v1UserActivateLink = (V1UserActivateLink) o;
    return Objects.equals(this.activationLink, v1UserActivateLink.activationLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserActivateLink {\n");
    
    sb.append("    activationLink: ").append(toIndentedString(activationLink)).append("\n");
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
