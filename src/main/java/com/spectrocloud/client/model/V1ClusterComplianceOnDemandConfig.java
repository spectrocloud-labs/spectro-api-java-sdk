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
import com.spectrocloud.client.model.V1ClusterComplianceScanKubeBenchConfig;
import com.spectrocloud.client.model.V1ClusterComplianceScanKubeHunterConfig;
import com.spectrocloud.client.model.V1ClusterComplianceScanSonobuoyConfig;
import com.spectrocloud.client.model.V1ClusterComplianceScanSyftConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster compliance scan on demand configuration
 */
@Schema(description = "Cluster compliance scan on demand configuration")


public class V1ClusterComplianceOnDemandConfig {
  @SerializedName("kubeBench")
  private V1ClusterComplianceScanKubeBenchConfig kubeBench = null;

  @SerializedName("kubeHunter")
  private V1ClusterComplianceScanKubeHunterConfig kubeHunter = null;

  @SerializedName("sonobuoy")
  private V1ClusterComplianceScanSonobuoyConfig sonobuoy = null;

  @SerializedName("syft")
  private V1ClusterComplianceScanSyftConfig syft = null;

  public V1ClusterComplianceOnDemandConfig kubeBench(V1ClusterComplianceScanKubeBenchConfig kubeBench) {
    this.kubeBench = kubeBench;
    return this;
  }

   /**
   * Get kubeBench
   * @return kubeBench
  **/
  @Schema(description = "")
  public V1ClusterComplianceScanKubeBenchConfig getKubeBench() {
    return kubeBench;
  }

  public void setKubeBench(V1ClusterComplianceScanKubeBenchConfig kubeBench) {
    this.kubeBench = kubeBench;
  }

  public V1ClusterComplianceOnDemandConfig kubeHunter(V1ClusterComplianceScanKubeHunterConfig kubeHunter) {
    this.kubeHunter = kubeHunter;
    return this;
  }

   /**
   * Get kubeHunter
   * @return kubeHunter
  **/
  @Schema(description = "")
  public V1ClusterComplianceScanKubeHunterConfig getKubeHunter() {
    return kubeHunter;
  }

  public void setKubeHunter(V1ClusterComplianceScanKubeHunterConfig kubeHunter) {
    this.kubeHunter = kubeHunter;
  }

  public V1ClusterComplianceOnDemandConfig sonobuoy(V1ClusterComplianceScanSonobuoyConfig sonobuoy) {
    this.sonobuoy = sonobuoy;
    return this;
  }

   /**
   * Get sonobuoy
   * @return sonobuoy
  **/
  @Schema(description = "")
  public V1ClusterComplianceScanSonobuoyConfig getSonobuoy() {
    return sonobuoy;
  }

  public void setSonobuoy(V1ClusterComplianceScanSonobuoyConfig sonobuoy) {
    this.sonobuoy = sonobuoy;
  }

  public V1ClusterComplianceOnDemandConfig syft(V1ClusterComplianceScanSyftConfig syft) {
    this.syft = syft;
    return this;
  }

   /**
   * Get syft
   * @return syft
  **/
  @Schema(description = "")
  public V1ClusterComplianceScanSyftConfig getSyft() {
    return syft;
  }

  public void setSyft(V1ClusterComplianceScanSyftConfig syft) {
    this.syft = syft;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterComplianceOnDemandConfig v1ClusterComplianceOnDemandConfig = (V1ClusterComplianceOnDemandConfig) o;
    return Objects.equals(this.kubeBench, v1ClusterComplianceOnDemandConfig.kubeBench) &&
        Objects.equals(this.kubeHunter, v1ClusterComplianceOnDemandConfig.kubeHunter) &&
        Objects.equals(this.sonobuoy, v1ClusterComplianceOnDemandConfig.sonobuoy) &&
        Objects.equals(this.syft, v1ClusterComplianceOnDemandConfig.syft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeBench, kubeHunter, sonobuoy, syft);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterComplianceOnDemandConfig {\n");
    
    sb.append("    kubeBench: ").append(toIndentedString(kubeBench)).append("\n");
    sb.append("    kubeHunter: ").append(toIndentedString(kubeHunter)).append("\n");
    sb.append("    sonobuoy: ").append(toIndentedString(sonobuoy)).append("\n");
    sb.append("    syft: ").append(toIndentedString(syft)).append("\n");
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
