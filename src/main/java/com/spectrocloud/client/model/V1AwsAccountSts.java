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
import com.spectrocloud.client.model.V1AwsPartition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AWS cloud account sts
 */
@Schema(description = "AWS cloud account sts")


public class V1AwsAccountSts {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("partition")
  private V1AwsPartition partition = null;

  public V1AwsAccountSts accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * A 12-digit number, such as 123456789012, that uniquely identifies an AWS account
   * @return accountId
  **/
  @Schema(description = "A 12-digit number, such as 123456789012, that uniquely identifies an AWS account")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public V1AwsAccountSts externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * It can be passed to the AssumeRole API of the STS. It can be used in the condition element in a role&#x27;s trust policy, allowing the role to be assumed only when a certain value is present in the external ID
   * @return externalId
  **/
  @Schema(description = "It can be passed to the AssumeRole API of the STS. It can be used in the condition element in a role's trust policy, allowing the role to be assumed only when a certain value is present in the external ID")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public V1AwsAccountSts partition(V1AwsPartition partition) {
    this.partition = partition;
    return this;
  }

   /**
   * Get partition
   * @return partition
  **/
  @Schema(description = "")
  public V1AwsPartition getPartition() {
    return partition;
  }

  public void setPartition(V1AwsPartition partition) {
    this.partition = partition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsAccountSts v1AwsAccountSts = (V1AwsAccountSts) o;
    return Objects.equals(this.accountId, v1AwsAccountSts.accountId) &&
        Objects.equals(this.externalId, v1AwsAccountSts.externalId) &&
        Objects.equals(this.partition, v1AwsAccountSts.partition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalId, partition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsAccountSts {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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