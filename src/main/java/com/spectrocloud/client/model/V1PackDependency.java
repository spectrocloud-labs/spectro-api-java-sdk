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
 * Pack template dependency
 */
@Schema(description = "Pack template dependency")


public class V1PackDependency {
  @SerializedName("layer")
  private String layer = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public V1PackDependency layer(String layer) {
    this.layer = layer;
    return this;
  }

   /**
   * Pack template dependency pack layer
   * @return layer
  **/
  @Schema(description = "Pack template dependency pack layer")
  public String getLayer() {
    return layer;
  }

  public void setLayer(String layer) {
    this.layer = layer;
  }

  public V1PackDependency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Pack template dependency pack name
   * @return name
  **/
  @Schema(description = "Pack template dependency pack name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PackDependency readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * If true then dependency pack values can&#x27;t be overridden
   * @return readOnly
  **/
  @Schema(description = "If true then dependency pack values can't be overridden")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PackDependency v1PackDependency = (V1PackDependency) o;
    return Objects.equals(this.layer, v1PackDependency.layer) &&
        Objects.equals(this.name, v1PackDependency.name) &&
        Objects.equals(this.readOnly, v1PackDependency.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layer, name, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackDependency {\n");
    
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
