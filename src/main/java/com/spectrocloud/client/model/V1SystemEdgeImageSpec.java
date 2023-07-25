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
 * system edge account specifications
 */
@Schema(description = "system edge account specifications")


public class V1SystemEdgeImageSpec {
  @SerializedName("imagesHostEndpoint")
  private String imagesHostEndpoint = null;

  public V1SystemEdgeImageSpec imagesHostEndpoint(String imagesHostEndpoint) {
    this.imagesHostEndpoint = imagesHostEndpoint;
    return this;
  }

   /**
   * Get imagesHostEndpoint
   * @return imagesHostEndpoint
  **/
  @Schema(description = "")
  public String getImagesHostEndpoint() {
    return imagesHostEndpoint;
  }

  public void setImagesHostEndpoint(String imagesHostEndpoint) {
    this.imagesHostEndpoint = imagesHostEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemEdgeImageSpec v1SystemEdgeImageSpec = (V1SystemEdgeImageSpec) o;
    return Objects.equals(this.imagesHostEndpoint, v1SystemEdgeImageSpec.imagesHostEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagesHostEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemEdgeImageSpec {\n");
    
    sb.append("    imagesHostEndpoint: ").append(toIndentedString(imagesHostEndpoint)).append("\n");
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
