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
import com.spectrocloud.client.model.V1TierPrice;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * billing preference
 */
@Schema(description = "billing preference")


public class V1Billing {
  @SerializedName("billingDay")
  private Integer billingDay = null;

  @SerializedName("tierPricing")
  private V1TierPrice tierPricing = null;

  public V1Billing billingDay(Integer billingDay) {
    this.billingDay = billingDay;
    return this;
  }

   /**
   * Get billingDay
   * @return billingDay
  **/
  @Schema(description = "")
  public Integer getBillingDay() {
    return billingDay;
  }

  public void setBillingDay(Integer billingDay) {
    this.billingDay = billingDay;
  }

  public V1Billing tierPricing(V1TierPrice tierPricing) {
    this.tierPricing = tierPricing;
    return this;
  }

   /**
   * Get tierPricing
   * @return tierPricing
  **/
  @Schema(description = "")
  public V1TierPrice getTierPricing() {
    return tierPricing;
  }

  public void setTierPricing(V1TierPrice tierPricing) {
    this.tierPricing = tierPricing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Billing v1Billing = (V1Billing) o;
    return Objects.equals(this.billingDay, v1Billing.billingDay) &&
        Objects.equals(this.tierPricing, v1Billing.tierPricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDay, tierPricing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Billing {\n");
    
    sb.append("    billingDay: ").append(toIndentedString(billingDay)).append("\n");
    sb.append("    tierPricing: ").append(toIndentedString(tierPricing)).append("\n");
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