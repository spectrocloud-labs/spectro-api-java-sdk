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
import com.spectrocloud.client.model.V1OpenStackDomain;
import com.spectrocloud.client.model.V1OpenStackRegion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of OpenStack regions and domains
 */
@Schema(description = "List of OpenStack regions and domains")


public class V1OpenStackRegions {
  @SerializedName("domains")
  private List<V1OpenStackDomain> domains = new ArrayList<V1OpenStackDomain>();

  @SerializedName("regions")
  private List<V1OpenStackRegion> regions = new ArrayList<V1OpenStackRegion>();

  public V1OpenStackRegions domains(List<V1OpenStackDomain> domains) {
    this.domains = domains;
    return this;
  }

  public V1OpenStackRegions addDomainsItem(V1OpenStackDomain domainsItem) {
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * List of OpenStack domains
   * @return domains
  **/
  @Schema(required = true, description = "List of OpenStack domains")
  public List<V1OpenStackDomain> getDomains() {
    return domains;
  }

  public void setDomains(List<V1OpenStackDomain> domains) {
    this.domains = domains;
  }

  public V1OpenStackRegions regions(List<V1OpenStackRegion> regions) {
    this.regions = regions;
    return this;
  }

  public V1OpenStackRegions addRegionsItem(V1OpenStackRegion regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * List of OpenStack regions
   * @return regions
  **/
  @Schema(required = true, description = "List of OpenStack regions")
  public List<V1OpenStackRegion> getRegions() {
    return regions;
  }

  public void setRegions(List<V1OpenStackRegion> regions) {
    this.regions = regions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OpenStackRegions v1OpenStackRegions = (V1OpenStackRegions) o;
    return Objects.equals(this.domains, v1OpenStackRegions.domains) &&
        Objects.equals(this.regions, v1OpenStackRegions.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, regions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OpenStackRegions {\n");
    
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
