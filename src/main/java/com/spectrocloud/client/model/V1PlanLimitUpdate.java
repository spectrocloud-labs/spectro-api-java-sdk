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
import com.spectrocloud.client.model.V1PlanLimit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Plan limit change update entity
 */
@Schema(description = "Plan limit change update entity")


public class V1PlanLimitUpdate {
  @SerializedName("planLimit")
  private V1PlanLimit planLimit = null;

  public V1PlanLimitUpdate planLimit(V1PlanLimit planLimit) {
    this.planLimit = planLimit;
    return this;
  }

   /**
   * Get planLimit
   * @return planLimit
  **/
  @Schema(required = true, description = "")
  public V1PlanLimit getPlanLimit() {
    return planLimit;
  }

  public void setPlanLimit(V1PlanLimit planLimit) {
    this.planLimit = planLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PlanLimitUpdate v1PlanLimitUpdate = (V1PlanLimitUpdate) o;
    return Objects.equals(this.planLimit, v1PlanLimitUpdate.planLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PlanLimitUpdate {\n");
    
    sb.append("    planLimit: ").append(toIndentedString(planLimit)).append("\n");
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
