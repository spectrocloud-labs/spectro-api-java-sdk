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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Plans usage compute spec
 */
@Schema(description = "Plans usage compute spec")


public class V1PlansUsageComputeSpec {
  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("tenantUids")
  private List<String> tenantUids = null;

  public V1PlansUsageComputeSpec startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public V1PlansUsageComputeSpec tenantUids(List<String> tenantUids) {
    this.tenantUids = tenantUids;
    return this;
  }

  public V1PlansUsageComputeSpec addTenantUidsItem(String tenantUidsItem) {
    if (this.tenantUids == null) {
      this.tenantUids = new ArrayList<String>();
    }
    this.tenantUids.add(tenantUidsItem);
    return this;
  }

   /**
   * Get tenantUids
   * @return tenantUids
  **/
  @Schema(description = "")
  public List<String> getTenantUids() {
    return tenantUids;
  }

  public void setTenantUids(List<String> tenantUids) {
    this.tenantUids = tenantUids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PlansUsageComputeSpec v1PlansUsageComputeSpec = (V1PlansUsageComputeSpec) o;
    return Objects.equals(this.startTime, v1PlansUsageComputeSpec.startTime) &&
        Objects.equals(this.tenantUids, v1PlansUsageComputeSpec.tenantUids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, tenantUids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PlansUsageComputeSpec {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tenantUids: ").append(toIndentedString(tenantUids)).append("\n");
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
