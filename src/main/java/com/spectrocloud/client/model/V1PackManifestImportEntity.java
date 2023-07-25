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
 * Pack manifest import objct
 */
@Schema(description = "Pack manifest import objct")


public class V1PackManifestImportEntity {
  @SerializedName("content")
  private String content = null;

  @SerializedName("name")
  private String name = null;

  public V1PackManifestImportEntity content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Pack manifest content in yaml
   * @return content
  **/
  @Schema(description = "Pack manifest content in yaml")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public V1PackManifestImportEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Pack manifest name
   * @return name
  **/
  @Schema(description = "Pack manifest name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PackManifestImportEntity v1PackManifestImportEntity = (V1PackManifestImportEntity) o;
    return Objects.equals(this.content, v1PackManifestImportEntity.content) &&
        Objects.equals(this.name, v1PackManifestImportEntity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackManifestImportEntity {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
