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
 * Cluster meta updates information
 */
@Schema(description = "Cluster meta updates information")


public class V1ClusterMetaStatusUpdates {
  @SerializedName("isUpdatesPending")
  private Boolean isUpdatesPending = null;

  public V1ClusterMetaStatusUpdates isUpdatesPending(Boolean isUpdatesPending) {
    this.isUpdatesPending = isUpdatesPending;
    return this;
  }

   /**
   * Get isUpdatesPending
   * @return isUpdatesPending
  **/
  @Schema(description = "")
  public Boolean isIsUpdatesPending() {
    return isUpdatesPending;
  }

  public void setIsUpdatesPending(Boolean isUpdatesPending) {
    this.isUpdatesPending = isUpdatesPending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterMetaStatusUpdates v1ClusterMetaStatusUpdates = (V1ClusterMetaStatusUpdates) o;
    return Objects.equals(this.isUpdatesPending, v1ClusterMetaStatusUpdates.isUpdatesPending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isUpdatesPending);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterMetaStatusUpdates {\n");
    
    sb.append("    isUpdatesPending: ").append(toIndentedString(isUpdatesPending)).append("\n");
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
