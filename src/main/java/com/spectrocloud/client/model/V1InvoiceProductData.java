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
 * Product invoice data
 */
@Schema(description = "Product invoice data")


public class V1InvoiceProductData {
  @SerializedName("allocatedCredits")
  private BigDecimal allocatedCredits = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("billableCredits")
  private BigDecimal billableCredits = null;

  @SerializedName("breachedCredits")
  private BigDecimal breachedCredits = null;

  @SerializedName("discount")
  private BigDecimal discount = null;

  @SerializedName("freeCredits")
  private BigDecimal freeCredits = null;

  @SerializedName("overageLimitPercentage")
  private BigDecimal overageLimitPercentage = null;

  @SerializedName("tierName")
  private String tierName = null;

  @SerializedName("tierPrice")
  private BigDecimal tierPrice = null;

  @SerializedName("totalUsedCredits")
  private BigDecimal totalUsedCredits = null;

  @SerializedName("usedCredits")
  private BigDecimal usedCredits = null;

  public V1InvoiceProductData allocatedCredits(BigDecimal allocatedCredits) {
    this.allocatedCredits = allocatedCredits;
    return this;
  }

   /**
   * Allocated credits
   * @return allocatedCredits
  **/
  @Schema(description = "Allocated credits")
  public BigDecimal getAllocatedCredits() {
    return allocatedCredits;
  }

  public void setAllocatedCredits(BigDecimal allocatedCredits) {
    this.allocatedCredits = allocatedCredits;
  }

  public V1InvoiceProductData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total amount
   * @return amount
  **/
  @Schema(description = "Total amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public V1InvoiceProductData billableCredits(BigDecimal billableCredits) {
    this.billableCredits = billableCredits;
    return this;
  }

   /**
   * Credits to be billed
   * @return billableCredits
  **/
  @Schema(description = "Credits to be billed")
  public BigDecimal getBillableCredits() {
    return billableCredits;
  }

  public void setBillableCredits(BigDecimal billableCredits) {
    this.billableCredits = billableCredits;
  }

  public V1InvoiceProductData breachedCredits(BigDecimal breachedCredits) {
    this.breachedCredits = breachedCredits;
    return this;
  }

   /**
   * Credits that are exceeds the allocated credits
   * @return breachedCredits
  **/
  @Schema(description = "Credits that are exceeds the allocated credits")
  public BigDecimal getBreachedCredits() {
    return breachedCredits;
  }

  public void setBreachedCredits(BigDecimal breachedCredits) {
    this.breachedCredits = breachedCredits;
  }

  public V1InvoiceProductData discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Applied discount
   * @return discount
  **/
  @Schema(description = "Applied discount")
  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public V1InvoiceProductData freeCredits(BigDecimal freeCredits) {
    this.freeCredits = freeCredits;
    return this;
  }

   /**
   * Allocated free credits
   * @return freeCredits
  **/
  @Schema(description = "Allocated free credits")
  public BigDecimal getFreeCredits() {
    return freeCredits;
  }

  public void setFreeCredits(BigDecimal freeCredits) {
    this.freeCredits = freeCredits;
  }

  public V1InvoiceProductData overageLimitPercentage(BigDecimal overageLimitPercentage) {
    this.overageLimitPercentage = overageLimitPercentage;
    return this;
  }

   /**
   * Allowed overage limit in percentage
   * @return overageLimitPercentage
  **/
  @Schema(description = "Allowed overage limit in percentage")
  public BigDecimal getOverageLimitPercentage() {
    return overageLimitPercentage;
  }

  public void setOverageLimitPercentage(BigDecimal overageLimitPercentage) {
    this.overageLimitPercentage = overageLimitPercentage;
  }

  public V1InvoiceProductData tierName(String tierName) {
    this.tierName = tierName;
    return this;
  }

   /**
   * Tier name
   * @return tierName
  **/
  @Schema(description = "Tier name")
  public String getTierName() {
    return tierName;
  }

  public void setTierName(String tierName) {
    this.tierName = tierName;
  }

  public V1InvoiceProductData tierPrice(BigDecimal tierPrice) {
    this.tierPrice = tierPrice;
    return this;
  }

   /**
   * Tier price
   * @return tierPrice
  **/
  @Schema(description = "Tier price")
  public BigDecimal getTierPrice() {
    return tierPrice;
  }

  public void setTierPrice(BigDecimal tierPrice) {
    this.tierPrice = tierPrice;
  }

  public V1InvoiceProductData totalUsedCredits(BigDecimal totalUsedCredits) {
    this.totalUsedCredits = totalUsedCredits;
    return this;
  }

   /**
   * Total used credits
   * @return totalUsedCredits
  **/
  @Schema(description = "Total used credits")
  public BigDecimal getTotalUsedCredits() {
    return totalUsedCredits;
  }

  public void setTotalUsedCredits(BigDecimal totalUsedCredits) {
    this.totalUsedCredits = totalUsedCredits;
  }

  public V1InvoiceProductData usedCredits(BigDecimal usedCredits) {
    this.usedCredits = usedCredits;
    return this;
  }

   /**
   * Used credits
   * @return usedCredits
  **/
  @Schema(description = "Used credits")
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
    V1InvoiceProductData v1InvoiceProductData = (V1InvoiceProductData) o;
    return Objects.equals(this.allocatedCredits, v1InvoiceProductData.allocatedCredits) &&
        Objects.equals(this.amount, v1InvoiceProductData.amount) &&
        Objects.equals(this.billableCredits, v1InvoiceProductData.billableCredits) &&
        Objects.equals(this.breachedCredits, v1InvoiceProductData.breachedCredits) &&
        Objects.equals(this.discount, v1InvoiceProductData.discount) &&
        Objects.equals(this.freeCredits, v1InvoiceProductData.freeCredits) &&
        Objects.equals(this.overageLimitPercentage, v1InvoiceProductData.overageLimitPercentage) &&
        Objects.equals(this.tierName, v1InvoiceProductData.tierName) &&
        Objects.equals(this.tierPrice, v1InvoiceProductData.tierPrice) &&
        Objects.equals(this.totalUsedCredits, v1InvoiceProductData.totalUsedCredits) &&
        Objects.equals(this.usedCredits, v1InvoiceProductData.usedCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedCredits, amount, billableCredits, breachedCredits, discount, freeCredits, overageLimitPercentage, tierName, tierPrice, totalUsedCredits, usedCredits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1InvoiceProductData {\n");
    
    sb.append("    allocatedCredits: ").append(toIndentedString(allocatedCredits)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billableCredits: ").append(toIndentedString(billableCredits)).append("\n");
    sb.append("    breachedCredits: ").append(toIndentedString(breachedCredits)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    freeCredits: ").append(toIndentedString(freeCredits)).append("\n");
    sb.append("    overageLimitPercentage: ").append(toIndentedString(overageLimitPercentage)).append("\n");
    sb.append("    tierName: ").append(toIndentedString(tierName)).append("\n");
    sb.append("    tierPrice: ").append(toIndentedString(tierPrice)).append("\n");
    sb.append("    totalUsedCredits: ").append(toIndentedString(totalUsedCredits)).append("\n");
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
