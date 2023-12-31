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
 * Compliance Scan KubeHunter Log
 */
@Schema(description = "Compliance Scan KubeHunter Log")


public class V1KubeHunterLog {
  @SerializedName("description")
  private String description = null;

  @SerializedName("evidence")
  private String evidence = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("severity")
  private String severity = null;

  @SerializedName("testId")
  private String testId = null;

  @SerializedName("vulnerability")
  private String vulnerability = null;

  public V1KubeHunterLog description(String description) {
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

  public V1KubeHunterLog evidence(String evidence) {
    this.evidence = evidence;
    return this;
  }

   /**
   * Get evidence
   * @return evidence
  **/
  @Schema(description = "")
  public String getEvidence() {
    return evidence;
  }

  public void setEvidence(String evidence) {
    this.evidence = evidence;
  }

  public V1KubeHunterLog reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(description = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public V1KubeHunterLog severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @Schema(description = "")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public V1KubeHunterLog testId(String testId) {
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

  public V1KubeHunterLog vulnerability(String vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

   /**
   * Get vulnerability
   * @return vulnerability
  **/
  @Schema(description = "")
  public String getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(String vulnerability) {
    this.vulnerability = vulnerability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1KubeHunterLog v1KubeHunterLog = (V1KubeHunterLog) o;
    return Objects.equals(this.description, v1KubeHunterLog.description) &&
        Objects.equals(this.evidence, v1KubeHunterLog.evidence) &&
        Objects.equals(this.reference, v1KubeHunterLog.reference) &&
        Objects.equals(this.severity, v1KubeHunterLog.severity) &&
        Objects.equals(this.testId, v1KubeHunterLog.testId) &&
        Objects.equals(this.vulnerability, v1KubeHunterLog.vulnerability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, evidence, reference, severity, testId, vulnerability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1KubeHunterLog {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
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
