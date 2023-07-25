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
import com.spectrocloud.client.model.V1ResourceEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * V1Resources
 */



public class V1Resources {
  @SerializedName("resources")
  private Map<String, V1ResourceEntity> resources = null;

  public V1Resources resources(Map<String, V1ResourceEntity> resources) {
    this.resources = resources;
    return this;
  }

  public V1Resources putResourcesItem(String key, V1ResourceEntity resourcesItem) {
    if (this.resources == null) {
      this.resources = new HashMap<String, V1ResourceEntity>();
    }
    this.resources.put(key, resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Schema(description = "")
  public Map<String, V1ResourceEntity> getResources() {
    return resources;
  }

  public void setResources(Map<String, V1ResourceEntity> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Resources v1Resources = (V1Resources) o;
    return Objects.equals(this.resources, v1Resources.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Resources {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
