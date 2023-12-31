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
import java.util.ArrayList;
import java.util.List;
/**
 * APIServerAccessProfile - access profile for AKS API server.
 */
@Schema(description = "APIServerAccessProfile - access profile for AKS API server.")


public class V1APIServerAccessProfile {
  @SerializedName("authorizedIPRanges")
  private List<String> authorizedIPRanges = null;

  @SerializedName("enablePrivateCluster")
  private Boolean enablePrivateCluster = null;

  @SerializedName("enablePrivateClusterPublicFQDN")
  private Boolean enablePrivateClusterPublicFQDN = null;

  @SerializedName("privateDNSZone")
  private String privateDNSZone = null;

  public V1APIServerAccessProfile authorizedIPRanges(List<String> authorizedIPRanges) {
    this.authorizedIPRanges = authorizedIPRanges;
    return this;
  }

  public V1APIServerAccessProfile addAuthorizedIPRangesItem(String authorizedIPRangesItem) {
    if (this.authorizedIPRanges == null) {
      this.authorizedIPRanges = new ArrayList<String>();
    }
    this.authorizedIPRanges.add(authorizedIPRangesItem);
    return this;
  }

   /**
   * AuthorizedIPRanges - Authorized IP Ranges to kubernetes API server.
   * @return authorizedIPRanges
  **/
  @Schema(description = "AuthorizedIPRanges - Authorized IP Ranges to kubernetes API server.")
  public List<String> getAuthorizedIPRanges() {
    return authorizedIPRanges;
  }

  public void setAuthorizedIPRanges(List<String> authorizedIPRanges) {
    this.authorizedIPRanges = authorizedIPRanges;
  }

  public V1APIServerAccessProfile enablePrivateCluster(Boolean enablePrivateCluster) {
    this.enablePrivateCluster = enablePrivateCluster;
    return this;
  }

   /**
   * EnablePrivateCluster - Whether to create the cluster as a private cluster or not.
   * @return enablePrivateCluster
  **/
  @Schema(description = "EnablePrivateCluster - Whether to create the cluster as a private cluster or not.")
  public Boolean isEnablePrivateCluster() {
    return enablePrivateCluster;
  }

  public void setEnablePrivateCluster(Boolean enablePrivateCluster) {
    this.enablePrivateCluster = enablePrivateCluster;
  }

  public V1APIServerAccessProfile enablePrivateClusterPublicFQDN(Boolean enablePrivateClusterPublicFQDN) {
    this.enablePrivateClusterPublicFQDN = enablePrivateClusterPublicFQDN;
    return this;
  }

   /**
   * EnablePrivateClusterPublicFQDN - Whether to create additional public FQDN for private cluster or not.
   * @return enablePrivateClusterPublicFQDN
  **/
  @Schema(description = "EnablePrivateClusterPublicFQDN - Whether to create additional public FQDN for private cluster or not.")
  public Boolean isEnablePrivateClusterPublicFQDN() {
    return enablePrivateClusterPublicFQDN;
  }

  public void setEnablePrivateClusterPublicFQDN(Boolean enablePrivateClusterPublicFQDN) {
    this.enablePrivateClusterPublicFQDN = enablePrivateClusterPublicFQDN;
  }

  public V1APIServerAccessProfile privateDNSZone(String privateDNSZone) {
    this.privateDNSZone = privateDNSZone;
    return this;
  }

   /**
   * PrivateDNSZone - Private dns zone mode for private cluster.
   * @return privateDNSZone
  **/
  @Schema(description = "PrivateDNSZone - Private dns zone mode for private cluster.")
  public String getPrivateDNSZone() {
    return privateDNSZone;
  }

  public void setPrivateDNSZone(String privateDNSZone) {
    this.privateDNSZone = privateDNSZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIServerAccessProfile v1APIServerAccessProfile = (V1APIServerAccessProfile) o;
    return Objects.equals(this.authorizedIPRanges, v1APIServerAccessProfile.authorizedIPRanges) &&
        Objects.equals(this.enablePrivateCluster, v1APIServerAccessProfile.enablePrivateCluster) &&
        Objects.equals(this.enablePrivateClusterPublicFQDN, v1APIServerAccessProfile.enablePrivateClusterPublicFQDN) &&
        Objects.equals(this.privateDNSZone, v1APIServerAccessProfile.privateDNSZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedIPRanges, enablePrivateCluster, enablePrivateClusterPublicFQDN, privateDNSZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIServerAccessProfile {\n");
    
    sb.append("    authorizedIPRanges: ").append(toIndentedString(authorizedIPRanges)).append("\n");
    sb.append("    enablePrivateCluster: ").append(toIndentedString(enablePrivateCluster)).append("\n");
    sb.append("    enablePrivateClusterPublicFQDN: ").append(toIndentedString(enablePrivateClusterPublicFQDN)).append("\n");
    sb.append("    privateDNSZone: ").append(toIndentedString(privateDNSZone)).append("\n");
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
