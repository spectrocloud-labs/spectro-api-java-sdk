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
import com.spectrocloud.client.model.V1CloudCostDataPoint;
import com.spectrocloud.client.model.V1ResourceCost;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Spectro cluster cloud cost information
 */
@Schema(description = "Spectro cluster cloud cost information")


public class V1SpectroClusterCloudCost {
  @SerializedName("cost")
  private V1ResourceCost cost = null;

  @SerializedName("data")
  private List<V1CloudCostDataPoint> data = null;

  public V1SpectroClusterCloudCost cost(V1ResourceCost cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @Schema(description = "")
  public V1ResourceCost getCost() {
    return cost;
  }

  public void setCost(V1ResourceCost cost) {
    this.cost = cost;
  }

  public V1SpectroClusterCloudCost data(List<V1CloudCostDataPoint> data) {
    this.data = data;
    return this;
  }

  public V1SpectroClusterCloudCost addDataItem(V1CloudCostDataPoint dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<V1CloudCostDataPoint>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<V1CloudCostDataPoint> getData() {
    return data;
  }

  public void setData(List<V1CloudCostDataPoint> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroClusterCloudCost v1SpectroClusterCloudCost = (V1SpectroClusterCloudCost) o;
    return Objects.equals(this.cost, v1SpectroClusterCloudCost.cost) &&
        Objects.equals(this.data, v1SpectroClusterCloudCost.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterCloudCost {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
