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
 * V1TencentCloudAccount
 */



public class V1TencentCloudAccount {
  @SerializedName("secretId")
  private String secretId = null;

  @SerializedName("secretKey")
  private String secretKey = null;

  public V1TencentCloudAccount secretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

   /**
   * Tencent api secretID
   * @return secretId
  **/
  @Schema(required = true, description = "Tencent api secretID")
  public String getSecretId() {
    return secretId;
  }

  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }

  public V1TencentCloudAccount secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Tencent api secret key
   * @return secretKey
  **/
  @Schema(required = true, description = "Tencent api secret key")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TencentCloudAccount v1TencentCloudAccount = (V1TencentCloudAccount) o;
    return Objects.equals(this.secretId, v1TencentCloudAccount.secretId) &&
        Objects.equals(this.secretKey, v1TencentCloudAccount.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretId, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TencentCloudAccount {\n");
    
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
