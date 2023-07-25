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
import com.spectrocloud.client.model.V1AwsCloudCostSpecFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Aws cloud account usage cost payload spec
 */
@Schema(description = "Aws cloud account usage cost payload spec")


public class V1AwsCloudCostSpec {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("credentials")
  private V1AwsCloudAccount credentials = null;

  @SerializedName("filter")
  private V1AwsCloudCostSpecFilter filter = null;

  public V1AwsCloudCostSpec accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * AccountId of AWS cloud cost
   * @return accountId
  **/
  @Schema(description = "AccountId of AWS cloud cost")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public V1AwsCloudCostSpec credentials(V1AwsCloudAccount credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Schema(required = true, description = "")
  public V1AwsCloudAccount getCredentials() {
    return credentials;
  }

  public void setCredentials(V1AwsCloudAccount credentials) {
    this.credentials = credentials;
  }

  public V1AwsCloudCostSpec filter(V1AwsCloudCostSpecFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public V1AwsCloudCostSpecFilter getFilter() {
    return filter;
  }

  public void setFilter(V1AwsCloudCostSpecFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsCloudCostSpec v1AwsCloudCostSpec = (V1AwsCloudCostSpec) o;
    return Objects.equals(this.accountId, v1AwsCloudCostSpec.accountId) &&
        Objects.equals(this.credentials, v1AwsCloudCostSpec.credentials) &&
        Objects.equals(this.filter, v1AwsCloudCostSpec.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, credentials, filter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsCloudCostSpec {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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