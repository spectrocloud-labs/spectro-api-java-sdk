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
import com.spectrocloud.client.model.V1ResourceUsage;
import com.spectrocloud.client.model.V1TotalResourceUsage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Plan monthly usage entity
 */
@Schema(description = "Plan monthly usage entity")


public class V1PlanMonthlyUsage {
  @SerializedName("dailyUsages")
  private List<V1ResourceUsage> dailyUsages = null;

  @SerializedName("month")
  private OffsetDateTime month = null;

  @SerializedName("planLimit")
  private V1PlanLimit planLimit = null;

  /**
   * Gets or Sets planType
   */
  @JsonAdapter(PlanTypeEnum.Adapter.class)
  public enum PlanTypeEnum {
    TRIAL("Trial"),
    MONTHLYONDEMAND("MonthlyOnDemand"),
    ANNUALSUBSCRIPTION("AnnualSubscription");

    private String value;

    PlanTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PlanTypeEnum fromValue(String input) {
      for (PlanTypeEnum b : PlanTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PlanTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PlanTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PlanTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("planType")
  private PlanTypeEnum planType = null;

  @SerializedName("planUid")
  private String planUid = null;

  @SerializedName("totalMonthlyUsage")
  private V1TotalResourceUsage totalMonthlyUsage = null;

  public V1PlanMonthlyUsage dailyUsages(List<V1ResourceUsage> dailyUsages) {
    this.dailyUsages = dailyUsages;
    return this;
  }

  public V1PlanMonthlyUsage addDailyUsagesItem(V1ResourceUsage dailyUsagesItem) {
    if (this.dailyUsages == null) {
      this.dailyUsages = new ArrayList<V1ResourceUsage>();
    }
    this.dailyUsages.add(dailyUsagesItem);
    return this;
  }

   /**
   * Get dailyUsages
   * @return dailyUsages
  **/
  @Schema(description = "")
  public List<V1ResourceUsage> getDailyUsages() {
    return dailyUsages;
  }

  public void setDailyUsages(List<V1ResourceUsage> dailyUsages) {
    this.dailyUsages = dailyUsages;
  }

  public V1PlanMonthlyUsage month(OffsetDateTime month) {
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @Schema(description = "")
  public OffsetDateTime getMonth() {
    return month;
  }

  public void setMonth(OffsetDateTime month) {
    this.month = month;
  }

  public V1PlanMonthlyUsage planLimit(V1PlanLimit planLimit) {
    this.planLimit = planLimit;
    return this;
  }

   /**
   * Get planLimit
   * @return planLimit
  **/
  @Schema(description = "")
  public V1PlanLimit getPlanLimit() {
    return planLimit;
  }

  public void setPlanLimit(V1PlanLimit planLimit) {
    this.planLimit = planLimit;
  }

  public V1PlanMonthlyUsage planType(PlanTypeEnum planType) {
    this.planType = planType;
    return this;
  }

   /**
   * Get planType
   * @return planType
  **/
  @Schema(description = "")
  public PlanTypeEnum getPlanType() {
    return planType;
  }

  public void setPlanType(PlanTypeEnum planType) {
    this.planType = planType;
  }

  public V1PlanMonthlyUsage planUid(String planUid) {
    this.planUid = planUid;
    return this;
  }

   /**
   * Get planUid
   * @return planUid
  **/
  @Schema(description = "")
  public String getPlanUid() {
    return planUid;
  }

  public void setPlanUid(String planUid) {
    this.planUid = planUid;
  }

  public V1PlanMonthlyUsage totalMonthlyUsage(V1TotalResourceUsage totalMonthlyUsage) {
    this.totalMonthlyUsage = totalMonthlyUsage;
    return this;
  }

   /**
   * Get totalMonthlyUsage
   * @return totalMonthlyUsage
  **/
  @Schema(description = "")
  public V1TotalResourceUsage getTotalMonthlyUsage() {
    return totalMonthlyUsage;
  }

  public void setTotalMonthlyUsage(V1TotalResourceUsage totalMonthlyUsage) {
    this.totalMonthlyUsage = totalMonthlyUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PlanMonthlyUsage v1PlanMonthlyUsage = (V1PlanMonthlyUsage) o;
    return Objects.equals(this.dailyUsages, v1PlanMonthlyUsage.dailyUsages) &&
        Objects.equals(this.month, v1PlanMonthlyUsage.month) &&
        Objects.equals(this.planLimit, v1PlanMonthlyUsage.planLimit) &&
        Objects.equals(this.planType, v1PlanMonthlyUsage.planType) &&
        Objects.equals(this.planUid, v1PlanMonthlyUsage.planUid) &&
        Objects.equals(this.totalMonthlyUsage, v1PlanMonthlyUsage.totalMonthlyUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyUsages, month, planLimit, planType, planUid, totalMonthlyUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PlanMonthlyUsage {\n");
    
    sb.append("    dailyUsages: ").append(toIndentedString(dailyUsages)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    planLimit: ").append(toIndentedString(planLimit)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    planUid: ").append(toIndentedString(planUid)).append("\n");
    sb.append("    totalMonthlyUsage: ").append(toIndentedString(totalMonthlyUsage)).append("\n");
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
