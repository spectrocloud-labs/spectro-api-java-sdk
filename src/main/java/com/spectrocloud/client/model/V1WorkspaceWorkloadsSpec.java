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
import com.spectrocloud.client.model.V1WorkspaceWorkloadsFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Workspace workloads spec
 */
@Schema(description = "Workspace workloads spec")


public class V1WorkspaceWorkloadsSpec {
  @SerializedName("filter")
  private V1WorkspaceWorkloadsFilter filter = null;

  public V1WorkspaceWorkloadsSpec filter(V1WorkspaceWorkloadsFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public V1WorkspaceWorkloadsFilter getFilter() {
    return filter;
  }

  public void setFilter(V1WorkspaceWorkloadsFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkspaceWorkloadsSpec v1WorkspaceWorkloadsSpec = (V1WorkspaceWorkloadsSpec) o;
    return Objects.equals(this.filter, v1WorkspaceWorkloadsSpec.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceWorkloadsSpec {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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