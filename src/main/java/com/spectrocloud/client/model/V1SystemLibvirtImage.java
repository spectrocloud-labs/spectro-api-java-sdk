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
import com.spectrocloud.client.model.V1SystemLibvirtImageSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SystemAdmin
 */
@Schema(description = "SystemAdmin")


public class V1SystemLibvirtImage {
  @SerializedName("spec")
  private V1SystemLibvirtImageSpec spec = null;

  public V1SystemLibvirtImage spec(V1SystemLibvirtImageSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public V1SystemLibvirtImageSpec getSpec() {
    return spec;
  }

  public void setSpec(V1SystemLibvirtImageSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemLibvirtImage v1SystemLibvirtImage = (V1SystemLibvirtImage) o;
    return Objects.equals(this.spec, v1SystemLibvirtImage.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemLibvirtImage {\n");
    
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
