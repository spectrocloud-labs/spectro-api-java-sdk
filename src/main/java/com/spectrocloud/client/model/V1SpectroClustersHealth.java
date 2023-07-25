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
/**
 * Spectro Clusters health data
 */
@Schema(description = "Spectro Clusters health data")


public class V1SpectroClustersHealth {
  @SerializedName("errored")
  private Integer errored = null;

  @SerializedName("healthy")
  private Integer healthy = null;

  @SerializedName("running")
  private Integer running = null;

  @SerializedName("unhealthy")
  private Integer unhealthy = null;

  public V1SpectroClustersHealth errored(Integer errored) {
    this.errored = errored;
    return this;
  }

   /**
   * Get errored
   * @return errored
  **/
  @Schema(description = "")
  public Integer getErrored() {
    return errored;
  }

  public void setErrored(Integer errored) {
    this.errored = errored;
  }

  public V1SpectroClustersHealth healthy(Integer healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Get healthy
   * @return healthy
  **/
  @Schema(description = "")
  public Integer getHealthy() {
    return healthy;
  }

  public void setHealthy(Integer healthy) {
    this.healthy = healthy;
  }

  public V1SpectroClustersHealth running(Integer running) {
    this.running = running;
    return this;
  }

   /**
   * Get running
   * @return running
  **/
  @Schema(description = "")
  public Integer getRunning() {
    return running;
  }

  public void setRunning(Integer running) {
    this.running = running;
  }

  public V1SpectroClustersHealth unhealthy(Integer unhealthy) {
    this.unhealthy = unhealthy;
    return this;
  }

   /**
   * Get unhealthy
   * @return unhealthy
  **/
  @Schema(description = "")
  public Integer getUnhealthy() {
    return unhealthy;
  }

  public void setUnhealthy(Integer unhealthy) {
    this.unhealthy = unhealthy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroClustersHealth v1SpectroClustersHealth = (V1SpectroClustersHealth) o;
    return Objects.equals(this.errored, v1SpectroClustersHealth.errored) &&
        Objects.equals(this.healthy, v1SpectroClustersHealth.healthy) &&
        Objects.equals(this.running, v1SpectroClustersHealth.running) &&
        Objects.equals(this.unhealthy, v1SpectroClustersHealth.unhealthy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errored, healthy, running, unhealthy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClustersHealth {\n");
    
    sb.append("    errored: ").append(toIndentedString(errored)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    unhealthy: ").append(toIndentedString(unhealthy)).append("\n");
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
