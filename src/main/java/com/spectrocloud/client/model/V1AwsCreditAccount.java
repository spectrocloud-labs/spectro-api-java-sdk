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
import com.spectrocloud.client.model.V1AwsLoginCredentials;
import com.spectrocloud.client.model.V1AwsUserCloudAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * V1AwsCreditAccount
 */



public class V1AwsCreditAccount {
  @SerializedName("creditLimitInDollars")
  private BigDecimal creditLimitInDollars = null;

  @SerializedName("loginCredentials")
  private V1AwsLoginCredentials loginCredentials = null;

  @SerializedName("userCloudAccount")
  private V1AwsUserCloudAccount userCloudAccount = null;

  public V1AwsCreditAccount creditLimitInDollars(BigDecimal creditLimitInDollars) {
    this.creditLimitInDollars = creditLimitInDollars;
    return this;
  }

   /**
   * Get creditLimitInDollars
   * @return creditLimitInDollars
  **/
  @Schema(description = "")
  public BigDecimal getCreditLimitInDollars() {
    return creditLimitInDollars;
  }

  public void setCreditLimitInDollars(BigDecimal creditLimitInDollars) {
    this.creditLimitInDollars = creditLimitInDollars;
  }

  public V1AwsCreditAccount loginCredentials(V1AwsLoginCredentials loginCredentials) {
    this.loginCredentials = loginCredentials;
    return this;
  }

   /**
   * Get loginCredentials
   * @return loginCredentials
  **/
  @Schema(description = "")
  public V1AwsLoginCredentials getLoginCredentials() {
    return loginCredentials;
  }

  public void setLoginCredentials(V1AwsLoginCredentials loginCredentials) {
    this.loginCredentials = loginCredentials;
  }

  public V1AwsCreditAccount userCloudAccount(V1AwsUserCloudAccount userCloudAccount) {
    this.userCloudAccount = userCloudAccount;
    return this;
  }

   /**
   * Get userCloudAccount
   * @return userCloudAccount
  **/
  @Schema(description = "")
  public V1AwsUserCloudAccount getUserCloudAccount() {
    return userCloudAccount;
  }

  public void setUserCloudAccount(V1AwsUserCloudAccount userCloudAccount) {
    this.userCloudAccount = userCloudAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsCreditAccount v1AwsCreditAccount = (V1AwsCreditAccount) o;
    return Objects.equals(this.creditLimitInDollars, v1AwsCreditAccount.creditLimitInDollars) &&
        Objects.equals(this.loginCredentials, v1AwsCreditAccount.loginCredentials) &&
        Objects.equals(this.userCloudAccount, v1AwsCreditAccount.userCloudAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimitInDollars, loginCredentials, userCloudAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsCreditAccount {\n");
    
    sb.append("    creditLimitInDollars: ").append(toIndentedString(creditLimitInDollars)).append("\n");
    sb.append("    loginCredentials: ").append(toIndentedString(loginCredentials)).append("\n");
    sb.append("    userCloudAccount: ").append(toIndentedString(userCloudAccount)).append("\n");
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