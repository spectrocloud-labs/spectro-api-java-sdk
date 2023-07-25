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
import com.spectrocloud.client.model.V1ResourceUsageSummaryFilter;
import com.spectrocloud.client.model.V1ResourceUsageSummaryOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Resource usage summary spec
 */
@Schema(description = "Resource usage summary spec")


public class V1ResourceUsageSummarySpec {
  @SerializedName("filter")
  private V1ResourceUsageSummaryFilter filter = null;

  @SerializedName("options")
  private V1ResourceUsageSummaryOptions options = null;

  public V1ResourceUsageSummarySpec filter(V1ResourceUsageSummaryFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public V1ResourceUsageSummaryFilter getFilter() {
    return filter;
  }

  public void setFilter(V1ResourceUsageSummaryFilter filter) {
    this.filter = filter;
  }

  public V1ResourceUsageSummarySpec options(V1ResourceUsageSummaryOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public V1ResourceUsageSummaryOptions getOptions() {
    return options;
  }

  public void setOptions(V1ResourceUsageSummaryOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceUsageSummarySpec v1ResourceUsageSummarySpec = (V1ResourceUsageSummarySpec) o;
    return Objects.equals(this.filter, v1ResourceUsageSummarySpec.filter) &&
        Objects.equals(this.options, v1ResourceUsageSummarySpec.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceUsageSummarySpec {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
