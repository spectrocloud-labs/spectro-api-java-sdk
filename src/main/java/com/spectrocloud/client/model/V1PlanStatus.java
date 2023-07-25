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
import java.util.ArrayList;
import java.util.List;
/**
 * V1PlanStatus
 */



public class V1PlanStatus {
  @SerializedName("changeLogs")
  private List<String> changeLogs = null;

  public V1PlanStatus changeLogs(List<String> changeLogs) {
    this.changeLogs = changeLogs;
    return this;
  }

  public V1PlanStatus addChangeLogsItem(String changeLogsItem) {
    if (this.changeLogs == null) {
      this.changeLogs = new ArrayList<String>();
    }
    this.changeLogs.add(changeLogsItem);
    return this;
  }

   /**
   * Get changeLogs
   * @return changeLogs
  **/
  @Schema(description = "")
  public List<String> getChangeLogs() {
    return changeLogs;
  }

  public void setChangeLogs(List<String> changeLogs) {
    this.changeLogs = changeLogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PlanStatus v1PlanStatus = (V1PlanStatus) o;
    return Objects.equals(this.changeLogs, v1PlanStatus.changeLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeLogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PlanStatus {\n");
    
    sb.append("    changeLogs: ").append(toIndentedString(changeLogs)).append("\n");
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
