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
import org.threeten.bp.OffsetDateTime;
/**
 * V1SpcPatchTimeEntity
 */



public class V1SpcPatchTimeEntity {
  @SerializedName("patchTime")
  private OffsetDateTime patchTime = null;

  public V1SpcPatchTimeEntity patchTime(OffsetDateTime patchTime) {
    this.patchTime = patchTime;
    return this;
  }

   /**
   * Get patchTime
   * @return patchTime
  **/
  @Schema(description = "")
  public OffsetDateTime getPatchTime() {
    return patchTime;
  }

  public void setPatchTime(OffsetDateTime patchTime) {
    this.patchTime = patchTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpcPatchTimeEntity v1SpcPatchTimeEntity = (V1SpcPatchTimeEntity) o;
    return Objects.equals(this.patchTime, v1SpcPatchTimeEntity.patchTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpcPatchTimeEntity {\n");
    
    sb.append("    patchTime: ").append(toIndentedString(patchTime)).append("\n");
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
