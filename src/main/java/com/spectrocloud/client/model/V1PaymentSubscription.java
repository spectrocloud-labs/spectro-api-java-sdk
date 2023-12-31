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
import com.spectrocloud.client.model.V1PaymentIntent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Payment subscription object
 */
@Schema(description = "Payment subscription object")


public class V1PaymentSubscription {
  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("paymentIntent")
  private V1PaymentIntent paymentIntent = null;

  @SerializedName("paymentMethodIds")
  private List<String> paymentMethodIds = null;

  @SerializedName("planType")
  private String planType = null;

  @SerializedName("priceId")
  private String priceId = null;

  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("subscriptionState")
  private String subscriptionState = null;

  public V1PaymentSubscription customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer uid
   * @return customerId
  **/
  @Schema(description = "Customer uid")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public V1PaymentSubscription paymentIntent(V1PaymentIntent paymentIntent) {
    this.paymentIntent = paymentIntent;
    return this;
  }

   /**
   * Get paymentIntent
   * @return paymentIntent
  **/
  @Schema(description = "")
  public V1PaymentIntent getPaymentIntent() {
    return paymentIntent;
  }

  public void setPaymentIntent(V1PaymentIntent paymentIntent) {
    this.paymentIntent = paymentIntent;
  }

  public V1PaymentSubscription paymentMethodIds(List<String> paymentMethodIds) {
    this.paymentMethodIds = paymentMethodIds;
    return this;
  }

  public V1PaymentSubscription addPaymentMethodIdsItem(String paymentMethodIdsItem) {
    if (this.paymentMethodIds == null) {
      this.paymentMethodIds = new ArrayList<String>();
    }
    this.paymentMethodIds.add(paymentMethodIdsItem);
    return this;
  }

   /**
   * List of payment method uids
   * @return paymentMethodIds
  **/
  @Schema(description = "List of payment method uids")
  public List<String> getPaymentMethodIds() {
    return paymentMethodIds;
  }

  public void setPaymentMethodIds(List<String> paymentMethodIds) {
    this.paymentMethodIds = paymentMethodIds;
  }

  public V1PaymentSubscription planType(String planType) {
    this.planType = planType;
    return this;
  }

   /**
   * Plan type
   * @return planType
  **/
  @Schema(description = "Plan type")
  public String getPlanType() {
    return planType;
  }

  public void setPlanType(String planType) {
    this.planType = planType;
  }

  public V1PaymentSubscription priceId(String priceId) {
    this.priceId = priceId;
    return this;
  }

   /**
   * Price uid
   * @return priceId
  **/
  @Schema(description = "Price uid")
  public String getPriceId() {
    return priceId;
  }

  public void setPriceId(String priceId) {
    this.priceId = priceId;
  }

  public V1PaymentSubscription subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Subscription uid
   * @return subscriptionId
  **/
  @Schema(description = "Subscription uid")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public V1PaymentSubscription subscriptionState(String subscriptionState) {
    this.subscriptionState = subscriptionState;
    return this;
  }

   /**
   * Plan subscription state
   * @return subscriptionState
  **/
  @Schema(description = "Plan subscription state")
  public String getSubscriptionState() {
    return subscriptionState;
  }

  public void setSubscriptionState(String subscriptionState) {
    this.subscriptionState = subscriptionState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PaymentSubscription v1PaymentSubscription = (V1PaymentSubscription) o;
    return Objects.equals(this.customerId, v1PaymentSubscription.customerId) &&
        Objects.equals(this.paymentIntent, v1PaymentSubscription.paymentIntent) &&
        Objects.equals(this.paymentMethodIds, v1PaymentSubscription.paymentMethodIds) &&
        Objects.equals(this.planType, v1PaymentSubscription.planType) &&
        Objects.equals(this.priceId, v1PaymentSubscription.priceId) &&
        Objects.equals(this.subscriptionId, v1PaymentSubscription.subscriptionId) &&
        Objects.equals(this.subscriptionState, v1PaymentSubscription.subscriptionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, paymentIntent, paymentMethodIds, planType, priceId, subscriptionId, subscriptionState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PaymentSubscription {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    paymentIntent: ").append(toIndentedString(paymentIntent)).append("\n");
    sb.append("    paymentMethodIds: ").append(toIndentedString(paymentMethodIds)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    priceId: ").append(toIndentedString(priceId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionState: ").append(toIndentedString(subscriptionState)).append("\n");
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
