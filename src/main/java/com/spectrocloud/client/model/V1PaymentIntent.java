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
/**
 * Payment setup object
 */
@Schema(description = "Payment setup object")


public class V1PaymentIntent {
  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("paymentIntentId")
  private String paymentIntentId = null;

  @SerializedName("status")
  private String status = null;

  public V1PaymentIntent clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Payment client secret
   * @return clientSecret
  **/
  @Schema(description = "Payment client secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public V1PaymentIntent paymentIntentId(String paymentIntentId) {
    this.paymentIntentId = paymentIntentId;
    return this;
  }

   /**
   * Payment intent id
   * @return paymentIntentId
  **/
  @Schema(description = "Payment intent id")
  public String getPaymentIntentId() {
    return paymentIntentId;
  }

  public void setPaymentIntentId(String paymentIntentId) {
    this.paymentIntentId = paymentIntentId;
  }

  public V1PaymentIntent status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of payment intent
   * @return status
  **/
  @Schema(description = "Status of payment intent")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PaymentIntent v1PaymentIntent = (V1PaymentIntent) o;
    return Objects.equals(this.clientSecret, v1PaymentIntent.clientSecret) &&
        Objects.equals(this.paymentIntentId, v1PaymentIntent.paymentIntentId) &&
        Objects.equals(this.status, v1PaymentIntent.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSecret, paymentIntentId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PaymentIntent {\n");
    
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    paymentIntentId: ").append(toIndentedString(paymentIntentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
