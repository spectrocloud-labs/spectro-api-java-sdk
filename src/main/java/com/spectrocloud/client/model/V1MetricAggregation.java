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
import java.math.BigDecimal;
/**
 * Aggregation values
 */
@Schema(description = "Aggregation values")


public class V1MetricAggregation {
  @SerializedName("avg")
  private BigDecimal avg = null;

  @SerializedName("count")
  private BigDecimal count = null;

  @SerializedName("max")
  private BigDecimal max = null;

  @SerializedName("min")
  private BigDecimal min = null;

  @SerializedName("sum")
  private BigDecimal sum = null;

  public V1MetricAggregation avg(BigDecimal avg) {
    this.avg = avg;
    return this;
  }

   /**
   * Get avg
   * @return avg
  **/
  @Schema(description = "")
  public BigDecimal getAvg() {
    return avg;
  }

  public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

  public V1MetricAggregation count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public V1MetricAggregation max(BigDecimal max) {
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @Schema(description = "")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public V1MetricAggregation min(BigDecimal min) {
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @Schema(description = "")
  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public V1MetricAggregation sum(BigDecimal sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  @Schema(description = "")
  public BigDecimal getSum() {
    return sum;
  }

  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MetricAggregation v1MetricAggregation = (V1MetricAggregation) o;
    return Objects.equals(this.avg, v1MetricAggregation.avg) &&
        Objects.equals(this.count, v1MetricAggregation.count) &&
        Objects.equals(this.max, v1MetricAggregation.max) &&
        Objects.equals(this.min, v1MetricAggregation.min) &&
        Objects.equals(this.sum, v1MetricAggregation.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avg, count, max, min, sum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MetricAggregation {\n");
    
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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
