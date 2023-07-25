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
import com.spectrocloud.client.model.V1SystemResourceLimit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * System resource limits. Supported resources keys are &#x27;user&#x27;,&#x27;project&#x27;,&#x27;apiKey&#x27;,&#x27;team&#x27;,&#x27;role&#x27;,&#x27;cloudaccount&#x27;,&#x27;clusterprofile&#x27;,&#x27;workspace&#x27;,&#x27;registry&#x27;,&#x27;privategateway&#x27;,&#x27;location&#x27;,&#x27;certificate&#x27;,&#x27;macro&#x27;,&#x27;sshkey&#x27;,&#x27;alert&#x27;,&#x27;spectrocluster&#x27;,&#x27;edgehost&#x27;.
 */
@Schema(description = "System resource limits. Supported resources keys are 'user','project','apiKey','team','role','cloudaccount','clusterprofile','workspace','registry','privategateway','location','certificate','macro','sshkey','alert','spectrocluster','edgehost'.")


public class V1SystemResourceLimits {
  @SerializedName("resources")
  private List<V1SystemResourceLimit> resources = null;

  public V1SystemResourceLimits resources(List<V1SystemResourceLimit> resources) {
    this.resources = resources;
    return this;
  }

  public V1SystemResourceLimits addResourcesItem(V1SystemResourceLimit resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<V1SystemResourceLimit>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Schema(description = "")
  public List<V1SystemResourceLimit> getResources() {
    return resources;
  }

  public void setResources(List<V1SystemResourceLimit> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemResourceLimits v1SystemResourceLimits = (V1SystemResourceLimits) o;
    return Objects.equals(this.resources, v1SystemResourceLimits.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemResourceLimits {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
