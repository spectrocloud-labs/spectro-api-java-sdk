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
 * Async operation id
 */
@Schema(description = "Async operation id")


public class V1AsyncOperationIdEntity {
  @SerializedName("operationId")
  private String operationId = null;

  public V1AsyncOperationIdEntity operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * OperationId for a particular sync operation id
   * @return operationId
  **/
  @Schema(description = "OperationId for a particular sync operation id")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AsyncOperationIdEntity v1AsyncOperationIdEntity = (V1AsyncOperationIdEntity) o;
    return Objects.equals(this.operationId, v1AsyncOperationIdEntity.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AsyncOperationIdEntity {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
