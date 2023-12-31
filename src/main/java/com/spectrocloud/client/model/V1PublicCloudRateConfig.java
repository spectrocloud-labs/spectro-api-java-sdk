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
import com.spectrocloud.client.model.V1CloudInstanceRateConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Public cloud rate config
 */
@Schema(description = "Public cloud rate config")


public class V1PublicCloudRateConfig {
  @SerializedName("computeOptimized")
  private V1CloudInstanceRateConfig computeOptimized = null;

  @SerializedName("memoryOptimized")
  private V1CloudInstanceRateConfig memoryOptimized = null;

  public V1PublicCloudRateConfig computeOptimized(V1CloudInstanceRateConfig computeOptimized) {
    this.computeOptimized = computeOptimized;
    return this;
  }

   /**
   * Get computeOptimized
   * @return computeOptimized
  **/
  @Schema(description = "")
  public V1CloudInstanceRateConfig getComputeOptimized() {
    return computeOptimized;
  }

  public void setComputeOptimized(V1CloudInstanceRateConfig computeOptimized) {
    this.computeOptimized = computeOptimized;
  }

  public V1PublicCloudRateConfig memoryOptimized(V1CloudInstanceRateConfig memoryOptimized) {
    this.memoryOptimized = memoryOptimized;
    return this;
  }

   /**
   * Get memoryOptimized
   * @return memoryOptimized
  **/
  @Schema(description = "")
  public V1CloudInstanceRateConfig getMemoryOptimized() {
    return memoryOptimized;
  }

  public void setMemoryOptimized(V1CloudInstanceRateConfig memoryOptimized) {
    this.memoryOptimized = memoryOptimized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PublicCloudRateConfig v1PublicCloudRateConfig = (V1PublicCloudRateConfig) o;
    return Objects.equals(this.computeOptimized, v1PublicCloudRateConfig.computeOptimized) &&
        Objects.equals(this.memoryOptimized, v1PublicCloudRateConfig.memoryOptimized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeOptimized, memoryOptimized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PublicCloudRateConfig {\n");
    
    sb.append("    computeOptimized: ").append(toIndentedString(computeOptimized)).append("\n");
    sb.append("    memoryOptimized: ").append(toIndentedString(memoryOptimized)).append("\n");
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
