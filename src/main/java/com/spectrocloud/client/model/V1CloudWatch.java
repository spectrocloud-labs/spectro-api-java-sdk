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
 * V1CloudWatch
 */



public class V1CloudWatch {
  @SerializedName("credentials")
  private V1AwsCloudAccount credentials = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("stream")
  private String stream = null;

  public V1CloudWatch credentials(V1AwsCloudAccount credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Schema(description = "")
  public V1AwsCloudAccount getCredentials() {
    return credentials;
  }

  public void setCredentials(V1AwsCloudAccount credentials) {
    this.credentials = credentials;
  }

  public V1CloudWatch group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(description = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1CloudWatch region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public V1CloudWatch stream(String stream) {
    this.stream = stream;
    return this;
  }

   /**
   * Get stream
   * @return stream
  **/
  @Schema(description = "")
  public String getStream() {
    return stream;
  }

  public void setStream(String stream) {
    this.stream = stream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CloudWatch v1CloudWatch = (V1CloudWatch) o;
    return Objects.equals(this.credentials, v1CloudWatch.credentials) &&
        Objects.equals(this.group, v1CloudWatch.group) &&
        Objects.equals(this.region, v1CloudWatch.region) &&
        Objects.equals(this.stream, v1CloudWatch.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, group, region, stream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CloudWatch {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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