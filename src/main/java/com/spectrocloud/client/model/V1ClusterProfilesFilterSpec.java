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
import com.spectrocloud.client.model.V1ClusterProfileFilterSpec;
import com.spectrocloud.client.model.V1ClusterProfileSortSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Spectro cluster filter summary spec
 */
@Schema(description = "Spectro cluster filter summary spec")


public class V1ClusterProfilesFilterSpec {
  @SerializedName("filter")
  private V1ClusterProfileFilterSpec filter = null;

  @SerializedName("sort")
  private List<V1ClusterProfileSortSpec> sort = null;

  public V1ClusterProfilesFilterSpec filter(V1ClusterProfileFilterSpec filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public V1ClusterProfileFilterSpec getFilter() {
    return filter;
  }

  public void setFilter(V1ClusterProfileFilterSpec filter) {
    this.filter = filter;
  }

  public V1ClusterProfilesFilterSpec sort(List<V1ClusterProfileSortSpec> sort) {
    this.sort = sort;
    return this;
  }

  public V1ClusterProfilesFilterSpec addSortItem(V1ClusterProfileSortSpec sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<V1ClusterProfileSortSpec>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @Schema(description = "")
  public List<V1ClusterProfileSortSpec> getSort() {
    return sort;
  }

  public void setSort(List<V1ClusterProfileSortSpec> sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterProfilesFilterSpec v1ClusterProfilesFilterSpec = (V1ClusterProfilesFilterSpec) o;
    return Objects.equals(this.filter, v1ClusterProfilesFilterSpec.filter) &&
        Objects.equals(this.sort, v1ClusterProfilesFilterSpec.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProfilesFilterSpec {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
