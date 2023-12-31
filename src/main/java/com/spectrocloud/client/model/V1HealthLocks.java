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
import com.spectrocloud.client.model.V1Lock;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1HealthLocks
 */



public class V1HealthLocks {
  @SerializedName("expiredLocks")
  private List<V1Lock> expiredLocks = null;

  public V1HealthLocks expiredLocks(List<V1Lock> expiredLocks) {
    this.expiredLocks = expiredLocks;
    return this;
  }

  public V1HealthLocks addExpiredLocksItem(V1Lock expiredLocksItem) {
    if (this.expiredLocks == null) {
      this.expiredLocks = new ArrayList<V1Lock>();
    }
    this.expiredLocks.add(expiredLocksItem);
    return this;
  }

   /**
   * Get expiredLocks
   * @return expiredLocks
  **/
  @Schema(description = "")
  public List<V1Lock> getExpiredLocks() {
    return expiredLocks;
  }

  public void setExpiredLocks(List<V1Lock> expiredLocks) {
    this.expiredLocks = expiredLocks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HealthLocks v1HealthLocks = (V1HealthLocks) o;
    return Objects.equals(this.expiredLocks, v1HealthLocks.expiredLocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiredLocks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HealthLocks {\n");
    
    sb.append("    expiredLocks: ").append(toIndentedString(expiredLocks)).append("\n");
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
