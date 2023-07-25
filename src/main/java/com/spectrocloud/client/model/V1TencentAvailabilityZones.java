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
import com.spectrocloud.client.model.V1TencentAvailabilityZone;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of Tencent Availability zones
 */
@Schema(description = "List of Tencent Availability zones")


public class V1TencentAvailabilityZones {
  @SerializedName("zones")
  private List<V1TencentAvailabilityZone> zones = new ArrayList<V1TencentAvailabilityZone>();

  public V1TencentAvailabilityZones zones(List<V1TencentAvailabilityZone> zones) {
    this.zones = zones;
    return this;
  }

  public V1TencentAvailabilityZones addZonesItem(V1TencentAvailabilityZone zonesItem) {
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * Get zones
   * @return zones
  **/
  @Schema(required = true, description = "")
  public List<V1TencentAvailabilityZone> getZones() {
    return zones;
  }

  public void setZones(List<V1TencentAvailabilityZone> zones) {
    this.zones = zones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TencentAvailabilityZones v1TencentAvailabilityZones = (V1TencentAvailabilityZones) o;
    return Objects.equals(this.zones, v1TencentAvailabilityZones.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TencentAvailabilityZones {\n");
    
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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