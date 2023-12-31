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
 * Cluster compliance scan logs spec
 */
@Schema(description = "Cluster compliance scan logs spec")


public class V1ClusterComplianceScanLogSpec {
  @SerializedName("clusterUid")
  private String clusterUid = null;

  @SerializedName("driverType")
  private String driverType = null;

  public V1ClusterComplianceScanLogSpec clusterUid(String clusterUid) {
    this.clusterUid = clusterUid;
    return this;
  }

   /**
   * Get clusterUid
   * @return clusterUid
  **/
  @Schema(description = "")
  public String getClusterUid() {
    return clusterUid;
  }

  public void setClusterUid(String clusterUid) {
    this.clusterUid = clusterUid;
  }

  public V1ClusterComplianceScanLogSpec driverType(String driverType) {
    this.driverType = driverType;
    return this;
  }

   /**
   * Get driverType
   * @return driverType
  **/
  @Schema(description = "")
  public String getDriverType() {
    return driverType;
  }

  public void setDriverType(String driverType) {
    this.driverType = driverType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterComplianceScanLogSpec v1ClusterComplianceScanLogSpec = (V1ClusterComplianceScanLogSpec) o;
    return Objects.equals(this.clusterUid, v1ClusterComplianceScanLogSpec.clusterUid) &&
        Objects.equals(this.driverType, v1ClusterComplianceScanLogSpec.driverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterUid, driverType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterComplianceScanLogSpec {\n");
    
    sb.append("    clusterUid: ").append(toIndentedString(clusterUid)).append("\n");
    sb.append("    driverType: ").append(toIndentedString(driverType)).append("\n");
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
