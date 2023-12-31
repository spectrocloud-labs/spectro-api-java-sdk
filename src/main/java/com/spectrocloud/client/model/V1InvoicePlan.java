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
import com.spectrocloud.client.model.V1InvoicePlanCredit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Invoice plan object
 */
@Schema(description = "Invoice plan object")


public class V1InvoicePlan {
  @SerializedName("freeCredits")
  private List<V1InvoicePlanCredit> freeCredits = null;

  /**
   * Gets or Sets plantype
   */
  @JsonAdapter(PlantypeEnum.Adapter.class)
  public enum PlantypeEnum {
    TRIAL("Trial"),
    MONTHLYONDEMAND("MonthlyOnDemand"),
    ANNUALSUBSCRIPTION("AnnualSubscription");

    private String value;

    PlantypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PlantypeEnum fromValue(String input) {
      for (PlantypeEnum b : PlantypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PlantypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlantypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PlantypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PlantypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("plantype")
  private PlantypeEnum plantype = null;

  @SerializedName("slaCredits")
  private List<V1InvoicePlanCredit> slaCredits = null;

  public V1InvoicePlan freeCredits(List<V1InvoicePlanCredit> freeCredits) {
    this.freeCredits = freeCredits;
    return this;
  }

  public V1InvoicePlan addFreeCreditsItem(V1InvoicePlanCredit freeCreditsItem) {
    if (this.freeCredits == null) {
      this.freeCredits = new ArrayList<V1InvoicePlanCredit>();
    }
    this.freeCredits.add(freeCreditsItem);
    return this;
  }

   /**
   * List of free credits
   * @return freeCredits
  **/
  @Schema(description = "List of free credits")
  public List<V1InvoicePlanCredit> getFreeCredits() {
    return freeCredits;
  }

  public void setFreeCredits(List<V1InvoicePlanCredit> freeCredits) {
    this.freeCredits = freeCredits;
  }

  public V1InvoicePlan plantype(PlantypeEnum plantype) {
    this.plantype = plantype;
    return this;
  }

   /**
   * Get plantype
   * @return plantype
  **/
  @Schema(description = "")
  public PlantypeEnum getPlantype() {
    return plantype;
  }

  public void setPlantype(PlantypeEnum plantype) {
    this.plantype = plantype;
  }

  public V1InvoicePlan slaCredits(List<V1InvoicePlanCredit> slaCredits) {
    this.slaCredits = slaCredits;
    return this;
  }

  public V1InvoicePlan addSlaCreditsItem(V1InvoicePlanCredit slaCreditsItem) {
    if (this.slaCredits == null) {
      this.slaCredits = new ArrayList<V1InvoicePlanCredit>();
    }
    this.slaCredits.add(slaCreditsItem);
    return this;
  }

   /**
   * List of SLA credits
   * @return slaCredits
  **/
  @Schema(description = "List of SLA credits")
  public List<V1InvoicePlanCredit> getSlaCredits() {
    return slaCredits;
  }

  public void setSlaCredits(List<V1InvoicePlanCredit> slaCredits) {
    this.slaCredits = slaCredits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1InvoicePlan v1InvoicePlan = (V1InvoicePlan) o;
    return Objects.equals(this.freeCredits, v1InvoicePlan.freeCredits) &&
        Objects.equals(this.plantype, v1InvoicePlan.plantype) &&
        Objects.equals(this.slaCredits, v1InvoicePlan.slaCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeCredits, plantype, slaCredits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1InvoicePlan {\n");
    
    sb.append("    freeCredits: ").append(toIndentedString(freeCredits)).append("\n");
    sb.append("    plantype: ").append(toIndentedString(plantype)).append("\n");
    sb.append("    slaCredits: ").append(toIndentedString(slaCredits)).append("\n");
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
