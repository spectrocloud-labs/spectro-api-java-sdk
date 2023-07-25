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
 * V1VmFeatureVendorId
 */



public class V1VmFeatureVendorId {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("vendorid")
  private String vendorid = null;

  public V1VmFeatureVendorId enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true.
   * @return enabled
  **/
  @Schema(description = "Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public V1VmFeatureVendorId vendorid(String vendorid) {
    this.vendorid = vendorid;
    return this;
  }

   /**
   * VendorID sets the hypervisor vendor id, visible to the vmi. String up to twelve characters.
   * @return vendorid
  **/
  @Schema(description = "VendorID sets the hypervisor vendor id, visible to the vmi. String up to twelve characters.")
  public String getVendorid() {
    return vendorid;
  }

  public void setVendorid(String vendorid) {
    this.vendorid = vendorid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmFeatureVendorId v1VmFeatureVendorId = (V1VmFeatureVendorId) o;
    return Objects.equals(this.enabled, v1VmFeatureVendorId.enabled) &&
        Objects.equals(this.vendorid, v1VmFeatureVendorId.vendorid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, vendorid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmFeatureVendorId {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    vendorid: ").append(toIndentedString(vendorid)).append("\n");
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