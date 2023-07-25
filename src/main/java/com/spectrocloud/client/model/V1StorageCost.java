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
import com.spectrocloud.client.model.V1StoragePrice;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cloud storage cost
 */
@Schema(description = "Cloud storage cost")


public class V1StorageCost {
  @SerializedName("discountedUsage")
  private String discountedUsage = null;

  @SerializedName("price")
  private List<V1StoragePrice> price = null;

  public V1StorageCost discountedUsage(String discountedUsage) {
    this.discountedUsage = discountedUsage;
    return this;
  }

   /**
   * Cloud storage upper limit which is free.
   * @return discountedUsage
  **/
  @Schema(description = "Cloud storage upper limit which is free.")
  public String getDiscountedUsage() {
    return discountedUsage;
  }

  public void setDiscountedUsage(String discountedUsage) {
    this.discountedUsage = discountedUsage;
  }

  public V1StorageCost price(List<V1StoragePrice> price) {
    this.price = price;
    return this;
  }

  public V1StorageCost addPriceItem(V1StoragePrice priceItem) {
    if (this.price == null) {
      this.price = new ArrayList<V1StoragePrice>();
    }
    this.price.add(priceItem);
    return this;
  }

   /**
   * Array of cloud storage range prices
   * @return price
  **/
  @Schema(description = "Array of cloud storage range prices")
  public List<V1StoragePrice> getPrice() {
    return price;
  }

  public void setPrice(List<V1StoragePrice> price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StorageCost v1StorageCost = (V1StorageCost) o;
    return Objects.equals(this.discountedUsage, v1StorageCost.discountedUsage) &&
        Objects.equals(this.price, v1StorageCost.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountedUsage, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StorageCost {\n");
    
    sb.append("    discountedUsage: ").append(toIndentedString(discountedUsage)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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