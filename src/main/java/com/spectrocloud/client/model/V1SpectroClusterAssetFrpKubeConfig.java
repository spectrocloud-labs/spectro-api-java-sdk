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
 * Cluster asset Frp Kube Config
 */
@Schema(description = "Cluster asset Frp Kube Config")


public class V1SpectroClusterAssetFrpKubeConfig {
  @SerializedName("frpKubeconfig")
  private String frpKubeconfig = null;

  public V1SpectroClusterAssetFrpKubeConfig frpKubeconfig(String frpKubeconfig) {
    this.frpKubeconfig = frpKubeconfig;
    return this;
  }

   /**
   * Get frpKubeconfig
   * @return frpKubeconfig
  **/
  @Schema(description = "")
  public String getFrpKubeconfig() {
    return frpKubeconfig;
  }

  public void setFrpKubeconfig(String frpKubeconfig) {
    this.frpKubeconfig = frpKubeconfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroClusterAssetFrpKubeConfig v1SpectroClusterAssetFrpKubeConfig = (V1SpectroClusterAssetFrpKubeConfig) o;
    return Objects.equals(this.frpKubeconfig, v1SpectroClusterAssetFrpKubeConfig.frpKubeconfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frpKubeconfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterAssetFrpKubeConfig {\n");
    
    sb.append("    frpKubeconfig: ").append(toIndentedString(frpKubeconfig)).append("\n");
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