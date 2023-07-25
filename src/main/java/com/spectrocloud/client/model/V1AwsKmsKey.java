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
 * AWS KMS Key - gives you centralized control over the cryptographic keys used to protect your data.
 */
@Schema(description = "AWS KMS Key - gives you centralized control over the cryptographic keys used to protect your data.")


public class V1AwsKmsKey {
  @SerializedName("keyAlias")
  private String keyAlias = null;

  @SerializedName("keyArn")
  private String keyArn = null;

  @SerializedName("keyId")
  private String keyId = null;

  public V1AwsKmsKey keyAlias(String keyAlias) {
    this.keyAlias = keyAlias;
    return this;
  }

   /**
   * AWS KMS alias
   * @return keyAlias
  **/
  @Schema(description = "AWS KMS alias")
  public String getKeyAlias() {
    return keyAlias;
  }

  public void setKeyAlias(String keyAlias) {
    this.keyAlias = keyAlias;
  }

  public V1AwsKmsKey keyArn(String keyArn) {
    this.keyArn = keyArn;
    return this;
  }

   /**
   * AWS KMS arn
   * @return keyArn
  **/
  @Schema(required = true, description = "AWS KMS arn")
  public String getKeyArn() {
    return keyArn;
  }

  public void setKeyArn(String keyArn) {
    this.keyArn = keyArn;
  }

  public V1AwsKmsKey keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * AWS KMS keyid
   * @return keyId
  **/
  @Schema(required = true, description = "AWS KMS keyid")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsKmsKey v1AwsKmsKey = (V1AwsKmsKey) o;
    return Objects.equals(this.keyAlias, v1AwsKmsKey.keyAlias) &&
        Objects.equals(this.keyArn, v1AwsKmsKey.keyArn) &&
        Objects.equals(this.keyId, v1AwsKmsKey.keyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyAlias, keyArn, keyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsKmsKey {\n");
    
    sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
    sb.append("    keyArn: ").append(toIndentedString(keyArn)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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
