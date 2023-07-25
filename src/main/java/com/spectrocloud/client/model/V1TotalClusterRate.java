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
 * Cluster total estimated rate information
 */
@Schema(description = "Cluster total estimated rate information")


public class V1TotalClusterRate {
  @SerializedName("compute")
  private BigDecimal compute = null;

  @SerializedName("storage")
  private BigDecimal storage = null;

  @SerializedName("total")
  private BigDecimal total = null;

  public V1TotalClusterRate compute(BigDecimal compute) {
    this.compute = compute;
    return this;
  }

   /**
   * Get compute
   * @return compute
  **/
  @Schema(description = "")
  public BigDecimal getCompute() {
    return compute;
  }

  public void setCompute(BigDecimal compute) {
    this.compute = compute;
  }

  public V1TotalClusterRate storage(BigDecimal storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @Schema(description = "")
  public BigDecimal getStorage() {
    return storage;
  }

  public void setStorage(BigDecimal storage) {
    this.storage = storage;
  }

  public V1TotalClusterRate total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TotalClusterRate v1TotalClusterRate = (V1TotalClusterRate) o;
    return Objects.equals(this.compute, v1TotalClusterRate.compute) &&
        Objects.equals(this.storage, v1TotalClusterRate.storage) &&
        Objects.equals(this.total, v1TotalClusterRate.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, storage, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TotalClusterRate {\n");
    
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
