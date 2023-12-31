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
import com.spectrocloud.client.model.V1MgmtAppContainersState;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1MgmtAppContainersStatus
 */



public class V1MgmtAppContainersStatus {
  @SerializedName("isHealthy")
  private Boolean isHealthy = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("numberOfRestarts")
  private Integer numberOfRestarts = null;

  @SerializedName("state")
  private V1MgmtAppContainersState state = null;

  public V1MgmtAppContainersStatus isHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
    return this;
  }

   /**
   * Get isHealthy
   * @return isHealthy
  **/
  @Schema(description = "")
  public Boolean isIsHealthy() {
    return isHealthy;
  }

  public void setIsHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
  }

  public V1MgmtAppContainersStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1MgmtAppContainersStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1MgmtAppContainersStatus numberOfRestarts(Integer numberOfRestarts) {
    this.numberOfRestarts = numberOfRestarts;
    return this;
  }

   /**
   * Get numberOfRestarts
   * @return numberOfRestarts
  **/
  @Schema(description = "")
  public Integer getNumberOfRestarts() {
    return numberOfRestarts;
  }

  public void setNumberOfRestarts(Integer numberOfRestarts) {
    this.numberOfRestarts = numberOfRestarts;
  }

  public V1MgmtAppContainersStatus state(V1MgmtAppContainersState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public V1MgmtAppContainersState getState() {
    return state;
  }

  public void setState(V1MgmtAppContainersState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MgmtAppContainersStatus v1MgmtAppContainersStatus = (V1MgmtAppContainersStatus) o;
    return Objects.equals(this.isHealthy, v1MgmtAppContainersStatus.isHealthy) &&
        Objects.equals(this.message, v1MgmtAppContainersStatus.message) &&
        Objects.equals(this.name, v1MgmtAppContainersStatus.name) &&
        Objects.equals(this.numberOfRestarts, v1MgmtAppContainersStatus.numberOfRestarts) &&
        Objects.equals(this.state, v1MgmtAppContainersStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHealthy, message, name, numberOfRestarts, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MgmtAppContainersStatus {\n");
    
    sb.append("    isHealthy: ").append(toIndentedString(isHealthy)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfRestarts: ").append(toIndentedString(numberOfRestarts)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
