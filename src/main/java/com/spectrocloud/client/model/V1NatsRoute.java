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
 * V1NatsRoute
 */



public class V1NatsRoute {
  @SerializedName("didSolicit")
  private Boolean didSolicit = null;

  @SerializedName("inBytes")
  private Integer inBytes = null;

  @SerializedName("inMsgs")
  private Integer inMsgs = null;

  @SerializedName("isConfigured")
  private Boolean isConfigured = null;

  @SerializedName("outBytes")
  private Integer outBytes = null;

  @SerializedName("outMsgs")
  private Integer outMsgs = null;

  @SerializedName("pendingSize")
  private Integer pendingSize = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("remoteId")
  private String remoteId = null;

  @SerializedName("rid")
  private Integer rid = null;

  @SerializedName("rtt")
  private String rtt = null;

  @SerializedName("subscriptions")
  private Integer subscriptions = null;

  public V1NatsRoute didSolicit(Boolean didSolicit) {
    this.didSolicit = didSolicit;
    return this;
  }

   /**
   * Get didSolicit
   * @return didSolicit
  **/
  @Schema(description = "")
  public Boolean isDidSolicit() {
    return didSolicit;
  }

  public void setDidSolicit(Boolean didSolicit) {
    this.didSolicit = didSolicit;
  }

  public V1NatsRoute inBytes(Integer inBytes) {
    this.inBytes = inBytes;
    return this;
  }

   /**
   * Get inBytes
   * @return inBytes
  **/
  @Schema(description = "")
  public Integer getInBytes() {
    return inBytes;
  }

  public void setInBytes(Integer inBytes) {
    this.inBytes = inBytes;
  }

  public V1NatsRoute inMsgs(Integer inMsgs) {
    this.inMsgs = inMsgs;
    return this;
  }

   /**
   * Get inMsgs
   * @return inMsgs
  **/
  @Schema(description = "")
  public Integer getInMsgs() {
    return inMsgs;
  }

  public void setInMsgs(Integer inMsgs) {
    this.inMsgs = inMsgs;
  }

  public V1NatsRoute isConfigured(Boolean isConfigured) {
    this.isConfigured = isConfigured;
    return this;
  }

   /**
   * Get isConfigured
   * @return isConfigured
  **/
  @Schema(description = "")
  public Boolean isIsConfigured() {
    return isConfigured;
  }

  public void setIsConfigured(Boolean isConfigured) {
    this.isConfigured = isConfigured;
  }

  public V1NatsRoute outBytes(Integer outBytes) {
    this.outBytes = outBytes;
    return this;
  }

   /**
   * Get outBytes
   * @return outBytes
  **/
  @Schema(description = "")
  public Integer getOutBytes() {
    return outBytes;
  }

  public void setOutBytes(Integer outBytes) {
    this.outBytes = outBytes;
  }

  public V1NatsRoute outMsgs(Integer outMsgs) {
    this.outMsgs = outMsgs;
    return this;
  }

   /**
   * Get outMsgs
   * @return outMsgs
  **/
  @Schema(description = "")
  public Integer getOutMsgs() {
    return outMsgs;
  }

  public void setOutMsgs(Integer outMsgs) {
    this.outMsgs = outMsgs;
  }

  public V1NatsRoute pendingSize(Integer pendingSize) {
    this.pendingSize = pendingSize;
    return this;
  }

   /**
   * Get pendingSize
   * @return pendingSize
  **/
  @Schema(description = "")
  public Integer getPendingSize() {
    return pendingSize;
  }

  public void setPendingSize(Integer pendingSize) {
    this.pendingSize = pendingSize;
  }

  public V1NatsRoute port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public V1NatsRoute remoteId(String remoteId) {
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Get remoteId
   * @return remoteId
  **/
  @Schema(description = "")
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  public V1NatsRoute rid(Integer rid) {
    this.rid = rid;
    return this;
  }

   /**
   * Get rid
   * @return rid
  **/
  @Schema(description = "")
  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public V1NatsRoute rtt(String rtt) {
    this.rtt = rtt;
    return this;
  }

   /**
   * Get rtt
   * @return rtt
  **/
  @Schema(description = "")
  public String getRtt() {
    return rtt;
  }

  public void setRtt(String rtt) {
    this.rtt = rtt;
  }

  public V1NatsRoute subscriptions(Integer subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @Schema(description = "")
  public Integer getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(Integer subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NatsRoute v1NatsRoute = (V1NatsRoute) o;
    return Objects.equals(this.didSolicit, v1NatsRoute.didSolicit) &&
        Objects.equals(this.inBytes, v1NatsRoute.inBytes) &&
        Objects.equals(this.inMsgs, v1NatsRoute.inMsgs) &&
        Objects.equals(this.isConfigured, v1NatsRoute.isConfigured) &&
        Objects.equals(this.outBytes, v1NatsRoute.outBytes) &&
        Objects.equals(this.outMsgs, v1NatsRoute.outMsgs) &&
        Objects.equals(this.pendingSize, v1NatsRoute.pendingSize) &&
        Objects.equals(this.port, v1NatsRoute.port) &&
        Objects.equals(this.remoteId, v1NatsRoute.remoteId) &&
        Objects.equals(this.rid, v1NatsRoute.rid) &&
        Objects.equals(this.rtt, v1NatsRoute.rtt) &&
        Objects.equals(this.subscriptions, v1NatsRoute.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(didSolicit, inBytes, inMsgs, isConfigured, outBytes, outMsgs, pendingSize, port, remoteId, rid, rtt, subscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NatsRoute {\n");
    
    sb.append("    didSolicit: ").append(toIndentedString(didSolicit)).append("\n");
    sb.append("    inBytes: ").append(toIndentedString(inBytes)).append("\n");
    sb.append("    inMsgs: ").append(toIndentedString(inMsgs)).append("\n");
    sb.append("    isConfigured: ").append(toIndentedString(isConfigured)).append("\n");
    sb.append("    outBytes: ").append(toIndentedString(outBytes)).append("\n");
    sb.append("    outMsgs: ").append(toIndentedString(outMsgs)).append("\n");
    sb.append("    pendingSize: ").append(toIndentedString(pendingSize)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    rtt: ").append(toIndentedString(rtt)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
