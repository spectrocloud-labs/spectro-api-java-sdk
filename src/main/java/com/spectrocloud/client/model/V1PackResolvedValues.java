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
 * Pack resolved values
 */
@Schema(description = "Pack resolved values")


public class V1PackResolvedValues {
  @SerializedName("resolved")
  private Map<String, String> resolved = null;

  public V1PackResolvedValues resolved(Map<String, String> resolved) {
    this.resolved = resolved;
    return this;
  }

  public V1PackResolvedValues putResolvedItem(String key, String resolvedItem) {
    if (this.resolved == null) {
      this.resolved = new HashMap<String, String>();
    }
    this.resolved.put(key, resolvedItem);
    return this;
  }

   /**
   * Pack resolved values map
   * @return resolved
  **/
  @Schema(description = "Pack resolved values map")
  public Map<String, String> getResolved() {
    return resolved;
  }

  public void setResolved(Map<String, String> resolved) {
    this.resolved = resolved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PackResolvedValues v1PackResolvedValues = (V1PackResolvedValues) o;
    return Objects.equals(this.resolved, v1PackResolvedValues.resolved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackResolvedValues {\n");
    
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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
