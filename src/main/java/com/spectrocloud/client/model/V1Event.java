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
import com.spectrocloud.client.model.V1EventRelatedObject;
import com.spectrocloud.client.model.V1EventSource;
import com.spectrocloud.client.model.V1ObjectMeta;
import com.spectrocloud.client.model.V1ObjectReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Describes the component event details
 */
@Schema(description = "Describes the component event details")


public class V1Event {
  @SerializedName("involvedObject")
  private V1ObjectReference involvedObject = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("relatedObject")
  private V1EventRelatedObject relatedObject = null;

  @SerializedName("severity")
  private String severity = null;

  @SerializedName("source")
  private V1EventSource source = null;

  public V1Event involvedObject(V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

   /**
   * Get involvedObject
   * @return involvedObject
  **/
  @Schema(description = "")
  public V1ObjectReference getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }

  public V1Event message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Describes message associated with the event
   * @return message
  **/
  @Schema(description = "Describes message associated with the event")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1Event metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1Event reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Describes the reason for the event
   * @return reason
  **/
  @Schema(description = "Describes the reason for the event")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1Event relatedObject(V1EventRelatedObject relatedObject) {
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * Get relatedObject
   * @return relatedObject
  **/
  @Schema(description = "")
  public V1EventRelatedObject getRelatedObject() {
    return relatedObject;
  }

  public void setRelatedObject(V1EventRelatedObject relatedObject) {
    this.relatedObject = relatedObject;
  }

  public V1Event severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Describes the gravitas for the event
   * @return severity
  **/
  @Schema(description = "Describes the gravitas for the event")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public V1Event source(V1EventSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public V1EventSource getSource() {
    return source;
  }

  public void setSource(V1EventSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Event v1Event = (V1Event) o;
    return Objects.equals(this.involvedObject, v1Event.involvedObject) &&
        Objects.equals(this.message, v1Event.message) &&
        Objects.equals(this.metadata, v1Event.metadata) &&
        Objects.equals(this.reason, v1Event.reason) &&
        Objects.equals(this.relatedObject, v1Event.relatedObject) &&
        Objects.equals(this.severity, v1Event.severity) &&
        Objects.equals(this.source, v1Event.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(involvedObject, message, metadata, reason, relatedObject, severity, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Event {\n");
    
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
