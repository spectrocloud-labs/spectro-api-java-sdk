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
import com.spectrocloud.client.model.V1AwsKmsKey;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of AWS Keys
 */
@Schema(description = "List of AWS Keys")


public class V1AwsKmsKeys {
  @SerializedName("kmsKeys")
  private List<V1AwsKmsKey> kmsKeys = new ArrayList<V1AwsKmsKey>();

  public V1AwsKmsKeys kmsKeys(List<V1AwsKmsKey> kmsKeys) {
    this.kmsKeys = kmsKeys;
    return this;
  }

  public V1AwsKmsKeys addKmsKeysItem(V1AwsKmsKey kmsKeysItem) {
    this.kmsKeys.add(kmsKeysItem);
    return this;
  }

   /**
   * Get kmsKeys
   * @return kmsKeys
  **/
  @Schema(required = true, description = "")
  public List<V1AwsKmsKey> getKmsKeys() {
    return kmsKeys;
  }

  public void setKmsKeys(List<V1AwsKmsKey> kmsKeys) {
    this.kmsKeys = kmsKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsKmsKeys v1AwsKmsKeys = (V1AwsKmsKeys) o;
    return Objects.equals(this.kmsKeys, v1AwsKmsKeys.kmsKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsKmsKeys {\n");
    
    sb.append("    kmsKeys: ").append(toIndentedString(kmsKeys)).append("\n");
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