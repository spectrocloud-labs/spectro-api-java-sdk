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
import com.spectrocloud.client.model.V1MsgBrokerConnection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * V1MsgBrokerConnections
 */



public class V1MsgBrokerConnections {
  @SerializedName("connections")
  private List<V1MsgBrokerConnection> connections = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("now")
  private OffsetDateTime now = null;

  @SerializedName("numOfConnections")
  private Integer numOfConnections = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("serverId")
  private String serverId = null;

  @SerializedName("totalConnections")
  private Integer totalConnections = null;

  public V1MsgBrokerConnections connections(List<V1MsgBrokerConnection> connections) {
    this.connections = connections;
    return this;
  }

  public V1MsgBrokerConnections addConnectionsItem(V1MsgBrokerConnection connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<V1MsgBrokerConnection>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @Schema(description = "")
  public List<V1MsgBrokerConnection> getConnections() {
    return connections;
  }

  public void setConnections(List<V1MsgBrokerConnection> connections) {
    this.connections = connections;
  }

  public V1MsgBrokerConnections limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public V1MsgBrokerConnections now(OffsetDateTime now) {
    this.now = now;
    return this;
  }

   /**
   * Get now
   * @return now
  **/
  @Schema(description = "")
  public OffsetDateTime getNow() {
    return now;
  }

  public void setNow(OffsetDateTime now) {
    this.now = now;
  }

  public V1MsgBrokerConnections numOfConnections(Integer numOfConnections) {
    this.numOfConnections = numOfConnections;
    return this;
  }

   /**
   * Get numOfConnections
   * @return numOfConnections
  **/
  @Schema(description = "")
  public Integer getNumOfConnections() {
    return numOfConnections;
  }

  public void setNumOfConnections(Integer numOfConnections) {
    this.numOfConnections = numOfConnections;
  }

  public V1MsgBrokerConnections offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public V1MsgBrokerConnections serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public V1MsgBrokerConnections totalConnections(Integer totalConnections) {
    this.totalConnections = totalConnections;
    return this;
  }

   /**
   * Get totalConnections
   * @return totalConnections
  **/
  @Schema(description = "")
  public Integer getTotalConnections() {
    return totalConnections;
  }

  public void setTotalConnections(Integer totalConnections) {
    this.totalConnections = totalConnections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MsgBrokerConnections v1MsgBrokerConnections = (V1MsgBrokerConnections) o;
    return Objects.equals(this.connections, v1MsgBrokerConnections.connections) &&
        Objects.equals(this.limit, v1MsgBrokerConnections.limit) &&
        Objects.equals(this.now, v1MsgBrokerConnections.now) &&
        Objects.equals(this.numOfConnections, v1MsgBrokerConnections.numOfConnections) &&
        Objects.equals(this.offset, v1MsgBrokerConnections.offset) &&
        Objects.equals(this.serverId, v1MsgBrokerConnections.serverId) &&
        Objects.equals(this.totalConnections, v1MsgBrokerConnections.totalConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections, limit, now, numOfConnections, offset, serverId, totalConnections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MsgBrokerConnections {\n");
    
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
    sb.append("    numOfConnections: ").append(toIndentedString(numOfConnections)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    totalConnections: ").append(toIndentedString(totalConnections)).append("\n");
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
