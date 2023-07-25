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
import com.spectrocloud.client.model.V1Pool;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1IpPoolInputEntitySpec
 */



public class V1IpPoolInputEntitySpec {
  @SerializedName("pool")
  private V1Pool pool = null;

  @SerializedName("restrictToSingleCluster")
  private Boolean restrictToSingleCluster = null;

  public V1IpPoolInputEntitySpec pool(V1Pool pool) {
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @Schema(required = true, description = "")
  public V1Pool getPool() {
    return pool;
  }

  public void setPool(V1Pool pool) {
    this.pool = pool;
  }

  public V1IpPoolInputEntitySpec restrictToSingleCluster(Boolean restrictToSingleCluster) {
    this.restrictToSingleCluster = restrictToSingleCluster;
    return this;
  }

   /**
   * if true, restricts this IP pool to be used by single cluster at any time
   * @return restrictToSingleCluster
  **/
  @Schema(description = "if true, restricts this IP pool to be used by single cluster at any time")
  public Boolean isRestrictToSingleCluster() {
    return restrictToSingleCluster;
  }

  public void setRestrictToSingleCluster(Boolean restrictToSingleCluster) {
    this.restrictToSingleCluster = restrictToSingleCluster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IpPoolInputEntitySpec v1IpPoolInputEntitySpec = (V1IpPoolInputEntitySpec) o;
    return Objects.equals(this.pool, v1IpPoolInputEntitySpec.pool) &&
        Objects.equals(this.restrictToSingleCluster, v1IpPoolInputEntitySpec.restrictToSingleCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pool, restrictToSingleCluster);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IpPoolInputEntitySpec {\n");
    
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    restrictToSingleCluster: ").append(toIndentedString(restrictToSingleCluster)).append("\n");
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