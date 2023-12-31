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
 * Project usage data object
 */
@Schema(description = "Project usage data object")


public class V1ProjectUsageData {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("tierPrice")
  private BigDecimal tierPrice = null;

  @SerializedName("usedCredits")
  private BigDecimal usedCredits = null;

  public V1ProjectUsageData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Billing amount for the project
   * @return amount
  **/
  @Schema(description = "Billing amount for the project")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public V1ProjectUsageData tierPrice(BigDecimal tierPrice) {
    this.tierPrice = tierPrice;
    return this;
  }

   /**
   * Tier price based on the usage
   * @return tierPrice
  **/
  @Schema(description = "Tier price based on the usage")
  public BigDecimal getTierPrice() {
    return tierPrice;
  }

  public void setTierPrice(BigDecimal tierPrice) {
    this.tierPrice = tierPrice;
  }

  public V1ProjectUsageData usedCredits(BigDecimal usedCredits) {
    this.usedCredits = usedCredits;
    return this;
  }

   /**
   * Project used credits
   * @return usedCredits
  **/
  @Schema(description = "Project used credits")
  public BigDecimal getUsedCredits() {
    return usedCredits;
  }

  public void setUsedCredits(BigDecimal usedCredits) {
    this.usedCredits = usedCredits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectUsageData v1ProjectUsageData = (V1ProjectUsageData) o;
    return Objects.equals(this.amount, v1ProjectUsageData.amount) &&
        Objects.equals(this.tierPrice, v1ProjectUsageData.tierPrice) &&
        Objects.equals(this.usedCredits, v1ProjectUsageData.usedCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, tierPrice, usedCredits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectUsageData {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tierPrice: ").append(toIndentedString(tierPrice)).append("\n");
    sb.append("    usedCredits: ").append(toIndentedString(usedCredits)).append("\n");
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
