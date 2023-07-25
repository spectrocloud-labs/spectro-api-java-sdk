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
import com.spectrocloud.client.model.V1TagFilterGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Filter create spec
 */
@Schema(description = "Filter create spec")


public class V1TagFilterSpec {
  @SerializedName("filterGroup")
  private V1TagFilterGroup filterGroup = null;

  public V1TagFilterSpec filterGroup(V1TagFilterGroup filterGroup) {
    this.filterGroup = filterGroup;
    return this;
  }

   /**
   * Get filterGroup
   * @return filterGroup
  **/
  @Schema(description = "")
  public V1TagFilterGroup getFilterGroup() {
    return filterGroup;
  }

  public void setFilterGroup(V1TagFilterGroup filterGroup) {
    this.filterGroup = filterGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TagFilterSpec v1TagFilterSpec = (V1TagFilterSpec) o;
    return Objects.equals(this.filterGroup, v1TagFilterSpec.filterGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TagFilterSpec {\n");
    
    sb.append("    filterGroup: ").append(toIndentedString(filterGroup)).append("\n");
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
