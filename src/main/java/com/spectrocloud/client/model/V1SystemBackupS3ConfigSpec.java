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
import com.spectrocloud.client.model.V1SystemBackupSpec;
import com.spectrocloud.client.model.V1SystemS3Spec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * system backup config spec
 */
@Schema(description = "system backup config spec")


public class V1SystemBackupS3ConfigSpec {
  @SerializedName("backupSpec")
  private V1SystemBackupSpec backupSpec = null;

  @SerializedName("s3")
  private V1SystemS3Spec s3 = null;

  public V1SystemBackupS3ConfigSpec backupSpec(V1SystemBackupSpec backupSpec) {
    this.backupSpec = backupSpec;
    return this;
  }

   /**
   * Get backupSpec
   * @return backupSpec
  **/
  @Schema(description = "")
  public V1SystemBackupSpec getBackupSpec() {
    return backupSpec;
  }

  public void setBackupSpec(V1SystemBackupSpec backupSpec) {
    this.backupSpec = backupSpec;
  }

  public V1SystemBackupS3ConfigSpec s3(V1SystemS3Spec s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @Schema(description = "")
  public V1SystemS3Spec getS3() {
    return s3;
  }

  public void setS3(V1SystemS3Spec s3) {
    this.s3 = s3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemBackupS3ConfigSpec v1SystemBackupS3ConfigSpec = (V1SystemBackupS3ConfigSpec) o;
    return Objects.equals(this.backupSpec, v1SystemBackupS3ConfigSpec.backupSpec) &&
        Objects.equals(this.s3, v1SystemBackupS3ConfigSpec.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupSpec, s3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemBackupS3ConfigSpec {\n");
    
    sb.append("    backupSpec: ").append(toIndentedString(backupSpec)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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
