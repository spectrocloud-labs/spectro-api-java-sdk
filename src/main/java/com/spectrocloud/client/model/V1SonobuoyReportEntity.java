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
import com.spectrocloud.client.model.V1SonobuoyLogEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Sonobuoy report
 */
@Schema(description = "Sonobuoy report")


public class V1SonobuoyReportEntity {
  @SerializedName("fail")
  private Integer fail = null;

  @SerializedName("logs")
  private List<V1SonobuoyLogEntity> logs = null;

  @SerializedName("node")
  private String node = null;

  @SerializedName("pass")
  private Integer pass = null;

  @SerializedName("plugin")
  private String plugin = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("total")
  private Integer total = null;

  public V1SonobuoyReportEntity fail(Integer fail) {
    this.fail = fail;
    return this;
  }

   /**
   * Get fail
   * @return fail
  **/
  @Schema(description = "")
  public Integer getFail() {
    return fail;
  }

  public void setFail(Integer fail) {
    this.fail = fail;
  }

  public V1SonobuoyReportEntity logs(List<V1SonobuoyLogEntity> logs) {
    this.logs = logs;
    return this;
  }

  public V1SonobuoyReportEntity addLogsItem(V1SonobuoyLogEntity logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<V1SonobuoyLogEntity>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @Schema(description = "")
  public List<V1SonobuoyLogEntity> getLogs() {
    return logs;
  }

  public void setLogs(List<V1SonobuoyLogEntity> logs) {
    this.logs = logs;
  }

  public V1SonobuoyReportEntity node(String node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @Schema(description = "")
  public String getNode() {
    return node;
  }

  public void setNode(String node) {
    this.node = node;
  }

  public V1SonobuoyReportEntity pass(Integer pass) {
    this.pass = pass;
    return this;
  }

   /**
   * Get pass
   * @return pass
  **/
  @Schema(description = "")
  public Integer getPass() {
    return pass;
  }

  public void setPass(Integer pass) {
    this.pass = pass;
  }

  public V1SonobuoyReportEntity plugin(String plugin) {
    this.plugin = plugin;
    return this;
  }

   /**
   * Get plugin
   * @return plugin
  **/
  @Schema(description = "")
  public String getPlugin() {
    return plugin;
  }

  public void setPlugin(String plugin) {
    this.plugin = plugin;
  }

  public V1SonobuoyReportEntity status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1SonobuoyReportEntity total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SonobuoyReportEntity v1SonobuoyReportEntity = (V1SonobuoyReportEntity) o;
    return Objects.equals(this.fail, v1SonobuoyReportEntity.fail) &&
        Objects.equals(this.logs, v1SonobuoyReportEntity.logs) &&
        Objects.equals(this.node, v1SonobuoyReportEntity.node) &&
        Objects.equals(this.pass, v1SonobuoyReportEntity.pass) &&
        Objects.equals(this.plugin, v1SonobuoyReportEntity.plugin) &&
        Objects.equals(this.status, v1SonobuoyReportEntity.status) &&
        Objects.equals(this.total, v1SonobuoyReportEntity.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fail, logs, node, pass, plugin, status, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SonobuoyReportEntity {\n");
    
    sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
