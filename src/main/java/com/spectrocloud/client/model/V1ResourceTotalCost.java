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
 * Resource total cost information
 */
@Schema(description = "Resource total cost information")


public class V1ResourceTotalCost {
  @SerializedName("cpu")
  private BigDecimal cpu = null;

  @SerializedName("memory")
  private BigDecimal memory = null;

  @SerializedName("storage")
  private BigDecimal storage = null;

  @SerializedName("total")
  private BigDecimal total = null;

  public V1ResourceTotalCost cpu(BigDecimal cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @Schema(description = "")
  public BigDecimal getCpu() {
    return cpu;
  }

  public void setCpu(BigDecimal cpu) {
    this.cpu = cpu;
  }

  public V1ResourceTotalCost memory(BigDecimal memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public BigDecimal getMemory() {
    return memory;
  }

  public void setMemory(BigDecimal memory) {
    this.memory = memory;
  }

  public V1ResourceTotalCost storage(BigDecimal storage) {
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

  public V1ResourceTotalCost total(BigDecimal total) {
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
    V1ResourceTotalCost v1ResourceTotalCost = (V1ResourceTotalCost) o;
    return Objects.equals(this.cpu, v1ResourceTotalCost.cpu) &&
        Objects.equals(this.memory, v1ResourceTotalCost.memory) &&
        Objects.equals(this.storage, v1ResourceTotalCost.storage) &&
        Objects.equals(this.total, v1ResourceTotalCost.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory, storage, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceTotalCost {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
