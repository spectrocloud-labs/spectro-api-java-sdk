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
import com.spectrocloud.client.model.V1PlanCreditEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Plan credit update entity
 */
@Schema(description = "Plan credit update entity")


public class V1PlanCreditUpdate {
  @SerializedName("credit")
  private V1PlanCreditEntity credit = null;

  public V1PlanCreditUpdate credit(V1PlanCreditEntity credit) {
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @Schema(description = "")
  public V1PlanCreditEntity getCredit() {
    return credit;
  }

  public void setCredit(V1PlanCreditEntity credit) {
    this.credit = credit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PlanCreditUpdate v1PlanCreditUpdate = (V1PlanCreditUpdate) o;
    return Objects.equals(this.credit, v1PlanCreditUpdate.credit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PlanCreditUpdate {\n");
    
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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
