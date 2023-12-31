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
import com.spectrocloud.client.model.V1PlanCredit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * Invoice plan credit object
 */
@Schema(description = "Invoice plan credit object")


public class V1InvoicePlanCredit {
  @SerializedName("planCredit")
  private V1PlanCredit planCredit = null;

  @SerializedName("totalCpuCoreHours")
  private BigDecimal totalCpuCoreHours = null;

  public V1InvoicePlanCredit planCredit(V1PlanCredit planCredit) {
    this.planCredit = planCredit;
    return this;
  }

   /**
   * Get planCredit
   * @return planCredit
  **/
  @Schema(description = "")
  public V1PlanCredit getPlanCredit() {
    return planCredit;
  }

  public void setPlanCredit(V1PlanCredit planCredit) {
    this.planCredit = planCredit;
  }

  public V1InvoicePlanCredit totalCpuCoreHours(BigDecimal totalCpuCoreHours) {
    this.totalCpuCoreHours = totalCpuCoreHours;
    return this;
  }

   /**
   * Total used cpu core hours
   * @return totalCpuCoreHours
  **/
  @Schema(description = "Total used cpu core hours")
  public BigDecimal getTotalCpuCoreHours() {
    return totalCpuCoreHours;
  }

  public void setTotalCpuCoreHours(BigDecimal totalCpuCoreHours) {
    this.totalCpuCoreHours = totalCpuCoreHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1InvoicePlanCredit v1InvoicePlanCredit = (V1InvoicePlanCredit) o;
    return Objects.equals(this.planCredit, v1InvoicePlanCredit.planCredit) &&
        Objects.equals(this.totalCpuCoreHours, v1InvoicePlanCredit.totalCpuCoreHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planCredit, totalCpuCoreHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1InvoicePlanCredit {\n");
    
    sb.append("    planCredit: ").append(toIndentedString(planCredit)).append("\n");
    sb.append("    totalCpuCoreHours: ").append(toIndentedString(totalCpuCoreHours)).append("\n");
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
