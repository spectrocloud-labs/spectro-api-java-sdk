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
import com.spectrocloud.client.model.V1GeolocationLatlong;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster location information
 */
@Schema(description = "Cluster location information")


public class V1ClusterLocation {
  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("countryName")
  private String countryName = null;

  @SerializedName("geoLoc")
  private V1GeolocationLatlong geoLoc = null;

  @SerializedName("regionCode")
  private String regionCode = null;

  @SerializedName("regionName")
  private String regionName = null;

  public V1ClusterLocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * country code for cluster location
   * @return countryCode
  **/
  @Schema(description = "country code for cluster location")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public V1ClusterLocation countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * country name for cluster location
   * @return countryName
  **/
  @Schema(description = "country name for cluster location")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public V1ClusterLocation geoLoc(V1GeolocationLatlong geoLoc) {
    this.geoLoc = geoLoc;
    return this;
  }

   /**
   * Get geoLoc
   * @return geoLoc
  **/
  @Schema(description = "")
  public V1GeolocationLatlong getGeoLoc() {
    return geoLoc;
  }

  public void setGeoLoc(V1GeolocationLatlong geoLoc) {
    this.geoLoc = geoLoc;
  }

  public V1ClusterLocation regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * region code for cluster location
   * @return regionCode
  **/
  @Schema(description = "region code for cluster location")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public V1ClusterLocation regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

   /**
   * region name for cluster location
   * @return regionName
  **/
  @Schema(description = "region name for cluster location")
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterLocation v1ClusterLocation = (V1ClusterLocation) o;
    return Objects.equals(this.countryCode, v1ClusterLocation.countryCode) &&
        Objects.equals(this.countryName, v1ClusterLocation.countryName) &&
        Objects.equals(this.geoLoc, v1ClusterLocation.geoLoc) &&
        Objects.equals(this.regionCode, v1ClusterLocation.regionCode) &&
        Objects.equals(this.regionName, v1ClusterLocation.regionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryName, geoLoc, regionCode, regionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterLocation {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    geoLoc: ").append(toIndentedString(geoLoc)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
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
