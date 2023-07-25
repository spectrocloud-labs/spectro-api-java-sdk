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
import com.spectrocloud.client.model.V1ProjectCleanUpStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Project status
 */
@Schema(description = "Project status")


public class V1ProjectStatus {
  @SerializedName("cleanUpStatus")
  private V1ProjectCleanUpStatus cleanUpStatus = null;

  @SerializedName("isDisabled")
  private Boolean isDisabled = null;

  public V1ProjectStatus cleanUpStatus(V1ProjectCleanUpStatus cleanUpStatus) {
    this.cleanUpStatus = cleanUpStatus;
    return this;
  }

   /**
   * Get cleanUpStatus
   * @return cleanUpStatus
  **/
  @Schema(description = "")
  public V1ProjectCleanUpStatus getCleanUpStatus() {
    return cleanUpStatus;
  }

  public void setCleanUpStatus(V1ProjectCleanUpStatus cleanUpStatus) {
    this.cleanUpStatus = cleanUpStatus;
  }

  public V1ProjectStatus isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @Schema(description = "")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectStatus v1ProjectStatus = (V1ProjectStatus) o;
    return Objects.equals(this.cleanUpStatus, v1ProjectStatus.cleanUpStatus) &&
        Objects.equals(this.isDisabled, v1ProjectStatus.isDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanUpStatus, isDisabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectStatus {\n");
    
    sb.append("    cleanUpStatus: ").append(toIndentedString(cleanUpStatus)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
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
