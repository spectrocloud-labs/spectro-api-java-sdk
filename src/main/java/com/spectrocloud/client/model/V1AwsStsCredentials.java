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
 * Aws sts credentials
 */
@Schema(description = "Aws sts credentials")


public class V1AwsStsCredentials {
  @SerializedName("arn")
  private String arn = null;

  @SerializedName("externalId")
  private String externalId = null;

  public V1AwsStsCredentials arn(String arn) {
    this.arn = arn;
    return this;
  }

   /**
   * Arn for the aws sts credentials in cloud account
   * @return arn
  **/
  @Schema(description = "Arn for the aws sts credentials in cloud account")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public V1AwsStsCredentials externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * ExternalId for the aws sts credentials in cloud account
   * @return externalId
  **/
  @Schema(description = "ExternalId for the aws sts credentials in cloud account")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsStsCredentials v1AwsStsCredentials = (V1AwsStsCredentials) o;
    return Objects.equals(this.arn, v1AwsStsCredentials.arn) &&
        Objects.equals(this.externalId, v1AwsStsCredentials.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, externalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsStsCredentials {\n");
    
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
