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
import com.spectrocloud.client.model.V1Subscription;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of Azure subscription
 */
@Schema(description = "List of Azure subscription")


public class V1AzureSubscriptionList {
  @SerializedName("subscriptionList")
  private List<V1Subscription> subscriptionList = null;

  public V1AzureSubscriptionList subscriptionList(List<V1Subscription> subscriptionList) {
    this.subscriptionList = subscriptionList;
    return this;
  }

  public V1AzureSubscriptionList addSubscriptionListItem(V1Subscription subscriptionListItem) {
    if (this.subscriptionList == null) {
      this.subscriptionList = new ArrayList<V1Subscription>();
    }
    this.subscriptionList.add(subscriptionListItem);
    return this;
  }

   /**
   * Get subscriptionList
   * @return subscriptionList
  **/
  @Schema(description = "")
  public List<V1Subscription> getSubscriptionList() {
    return subscriptionList;
  }

  public void setSubscriptionList(List<V1Subscription> subscriptionList) {
    this.subscriptionList = subscriptionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AzureSubscriptionList v1AzureSubscriptionList = (V1AzureSubscriptionList) o;
    return Objects.equals(this.subscriptionList, v1AzureSubscriptionList.subscriptionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureSubscriptionList {\n");
    
    sb.append("    subscriptionList: ").append(toIndentedString(subscriptionList)).append("\n");
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
