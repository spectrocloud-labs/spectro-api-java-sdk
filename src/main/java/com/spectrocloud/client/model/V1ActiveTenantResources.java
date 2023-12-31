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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Active resources of tenant
 */
@Schema(description = "Active resources of tenant")


public class V1ActiveTenantResources {
  @SerializedName("activeResources")
  private Map<String, List<String>> activeResources = null;

  public V1ActiveTenantResources activeResources(Map<String, List<String>> activeResources) {
    this.activeResources = activeResources;
    return this;
  }

  public V1ActiveTenantResources putActiveResourcesItem(String key, List<String> activeResourcesItem) {
    if (this.activeResources == null) {
      this.activeResources = new HashMap<String, List<String>>();
    }
    this.activeResources.put(key, activeResourcesItem);
    return this;
  }

   /**
   * Get activeResources
   * @return activeResources
  **/
  @Schema(description = "")
  public Map<String, List<String>> getActiveResources() {
    return activeResources;
  }

  public void setActiveResources(Map<String, List<String>> activeResources) {
    this.activeResources = activeResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ActiveTenantResources v1ActiveTenantResources = (V1ActiveTenantResources) o;
    return Objects.equals(this.activeResources, v1ActiveTenantResources.activeResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeResources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ActiveTenantResources {\n");
    
    sb.append("    activeResources: ").append(toIndentedString(activeResources)).append("\n");
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
