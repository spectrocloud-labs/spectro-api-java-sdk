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
 * AWS image name and credentials
 */
@Schema(description = "AWS image name and credentials")


public class V1AwsFindImageRequest {
  @SerializedName("amiName")
  private String amiName = null;

  @SerializedName("awsAccount")
  private V1AwsCloudAccount awsAccount = null;

  public V1AwsFindImageRequest amiName(String amiName) {
    this.amiName = amiName;
    return this;
  }

   /**
   * AWS image ami name
   * @return amiName
  **/
  @Schema(description = "AWS image ami name")
  public String getAmiName() {
    return amiName;
  }

  public void setAmiName(String amiName) {
    this.amiName = amiName;
  }

  public V1AwsFindImageRequest awsAccount(V1AwsCloudAccount awsAccount) {
    this.awsAccount = awsAccount;
    return this;
  }

   /**
   * Get awsAccount
   * @return awsAccount
  **/
  @Schema(description = "")
  public V1AwsCloudAccount getAwsAccount() {
    return awsAccount;
  }

  public void setAwsAccount(V1AwsCloudAccount awsAccount) {
    this.awsAccount = awsAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsFindImageRequest v1AwsFindImageRequest = (V1AwsFindImageRequest) o;
    return Objects.equals(this.amiName, v1AwsFindImageRequest.amiName) &&
        Objects.equals(this.awsAccount, v1AwsFindImageRequest.awsAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amiName, awsAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsFindImageRequest {\n");
    
    sb.append("    amiName: ").append(toIndentedString(amiName)).append("\n");
    sb.append("    awsAccount: ").append(toIndentedString(awsAccount)).append("\n");
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