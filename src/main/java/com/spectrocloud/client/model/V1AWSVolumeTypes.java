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
import com.spectrocloud.client.model.V1AwsVolumeType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AWS Volume Types
 */
@Schema(description = "AWS Volume Types")


public class V1AWSVolumeTypes {
  @SerializedName("volumeTypes")
  private List<V1AwsVolumeType> volumeTypes = null;

  public V1AWSVolumeTypes volumeTypes(List<V1AwsVolumeType> volumeTypes) {
    this.volumeTypes = volumeTypes;
    return this;
  }

  public V1AWSVolumeTypes addVolumeTypesItem(V1AwsVolumeType volumeTypesItem) {
    if (this.volumeTypes == null) {
      this.volumeTypes = new ArrayList<V1AwsVolumeType>();
    }
    this.volumeTypes.add(volumeTypesItem);
    return this;
  }

   /**
   * Get volumeTypes
   * @return volumeTypes
  **/
  @Schema(description = "")
  public List<V1AwsVolumeType> getVolumeTypes() {
    return volumeTypes;
  }

  public void setVolumeTypes(List<V1AwsVolumeType> volumeTypes) {
    this.volumeTypes = volumeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AWSVolumeTypes v1AWSVolumeTypes = (V1AWSVolumeTypes) o;
    return Objects.equals(this.volumeTypes, v1AWSVolumeTypes.volumeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AWSVolumeTypes {\n");
    
    sb.append("    volumeTypes: ").append(toIndentedString(volumeTypes)).append("\n");
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