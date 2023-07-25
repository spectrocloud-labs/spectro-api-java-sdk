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
import com.spectrocloud.client.model.V1VmVGPUDisplayOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1VmVGPUOptions
 */



public class V1VmVGPUOptions {
  @SerializedName("display")
  private V1VmVGPUDisplayOptions display = null;

  public V1VmVGPUOptions display(V1VmVGPUDisplayOptions display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @Schema(description = "")
  public V1VmVGPUDisplayOptions getDisplay() {
    return display;
  }

  public void setDisplay(V1VmVGPUDisplayOptions display) {
    this.display = display;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmVGPUOptions v1VmVGPUOptions = (V1VmVGPUOptions) o;
    return Objects.equals(this.display, v1VmVGPUOptions.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmVGPUOptions {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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
