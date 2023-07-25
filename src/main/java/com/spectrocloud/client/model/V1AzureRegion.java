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
import com.spectrocloud.client.model.V1AzureAvailabilityZone;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Azure region entity
 */
@Schema(description = "Azure region entity")


public class V1AzureRegion {
  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("zones")
  private List<V1AzureAvailabilityZone> zones = null;

  public V1AzureRegion displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Azure region displayname
   * @return displayName
  **/
  @Schema(description = "Azure region displayname")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public V1AzureRegion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Azure region name
   * @return name
  **/
  @Schema(description = "Azure region name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1AzureRegion zones(List<V1AzureAvailabilityZone> zones) {
    this.zones = zones;
    return this;
  }

  public V1AzureRegion addZonesItem(V1AzureAvailabilityZone zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<V1AzureAvailabilityZone>();
    }
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * List of zones associated to a particular Azure region
   * @return zones
  **/
  @Schema(description = "List of zones associated to a particular Azure region")
  public List<V1AzureAvailabilityZone> getZones() {
    return zones;
  }

  public void setZones(List<V1AzureAvailabilityZone> zones) {
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
    V1AzureRegion v1AzureRegion = (V1AzureRegion) o;
    return Objects.equals(this.displayName, v1AzureRegion.displayName) &&
        Objects.equals(this.name, v1AzureRegion.name) &&
        Objects.equals(this.zones, v1AzureRegion.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, name, zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureRegion {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
