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
import com.spectrocloud.client.model.V1AwsCloudAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1AwsUserCloudAccount
 */



public class V1AwsUserCloudAccount {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("cloudAccount")
  private V1AwsCloudAccount cloudAccount = null;

  public V1AwsUserCloudAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public V1AwsUserCloudAccount cloudAccount(V1AwsCloudAccount cloudAccount) {
    this.cloudAccount = cloudAccount;
    return this;
  }

   /**
   * Get cloudAccount
   * @return cloudAccount
  **/
  @Schema(description = "")
  public V1AwsCloudAccount getCloudAccount() {
    return cloudAccount;
  }

  public void setCloudAccount(V1AwsCloudAccount cloudAccount) {
    this.cloudAccount = cloudAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsUserCloudAccount v1AwsUserCloudAccount = (V1AwsUserCloudAccount) o;
    return Objects.equals(this.accountId, v1AwsUserCloudAccount.accountId) &&
        Objects.equals(this.cloudAccount, v1AwsUserCloudAccount.cloudAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, cloudAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsUserCloudAccount {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    cloudAccount: ").append(toIndentedString(cloudAccount)).append("\n");
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
