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
 * KubeBench log
 */
@Schema(description = "KubeBench log")


public class V1KubeBenchLogEntity {
  @SerializedName("description")
  private String description = null;

  @SerializedName("expected")
  private String expected = null;

  @SerializedName("remediation")
  private String remediation = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("testId")
  private String testId = null;

  @SerializedName("value")
  private String value = null;

  public V1KubeBenchLogEntity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1KubeBenchLogEntity expected(String expected) {
    this.expected = expected;
    return this;
  }

   /**
   * Get expected
   * @return expected
  **/
  @Schema(description = "")
  public String getExpected() {
    return expected;
  }

  public void setExpected(String expected) {
    this.expected = expected;
  }

  public V1KubeBenchLogEntity remediation(String remediation) {
    this.remediation = remediation;
    return this;
  }

   /**
   * Get remediation
   * @return remediation
  **/
  @Schema(description = "")
  public String getRemediation() {
    return remediation;
  }

  public void setRemediation(String remediation) {
    this.remediation = remediation;
  }

  public V1KubeBenchLogEntity state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public V1KubeBenchLogEntity testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * Get testId
   * @return testId
  **/
  @Schema(description = "")
  public String getTestId() {
    return testId;
  }

  public void setTestId(String testId) {
    this.testId = testId;
  }

  public V1KubeBenchLogEntity value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1KubeBenchLogEntity v1KubeBenchLogEntity = (V1KubeBenchLogEntity) o;
    return Objects.equals(this.description, v1KubeBenchLogEntity.description) &&
        Objects.equals(this.expected, v1KubeBenchLogEntity.expected) &&
        Objects.equals(this.remediation, v1KubeBenchLogEntity.remediation) &&
        Objects.equals(this.state, v1KubeBenchLogEntity.state) &&
        Objects.equals(this.testId, v1KubeBenchLogEntity.testId) &&
        Objects.equals(this.value, v1KubeBenchLogEntity.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expected, remediation, state, testId, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1KubeBenchLogEntity {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
