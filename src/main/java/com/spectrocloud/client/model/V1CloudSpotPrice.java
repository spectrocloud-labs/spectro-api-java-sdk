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
 * Spot price entity of a particular cloud type
 */
@Schema(description = "Spot price entity of a particular cloud type")


public class V1CloudSpotPrice {
  @SerializedName("spotPrice")
  private BigDecimal spotPrice = null;

  public V1CloudSpotPrice spotPrice(BigDecimal spotPrice) {
    this.spotPrice = spotPrice;
    return this;
  }

   /**
   * Spot price of a resource for a particular cloud
   * @return spotPrice
  **/
  @Schema(description = "Spot price of a resource for a particular cloud")
  public BigDecimal getSpotPrice() {
    return spotPrice;
  }

  public void setSpotPrice(BigDecimal spotPrice) {
    this.spotPrice = spotPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CloudSpotPrice v1CloudSpotPrice = (V1CloudSpotPrice) o;
    return Objects.equals(this.spotPrice, v1CloudSpotPrice.spotPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spotPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CloudSpotPrice {\n");
    
    sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
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