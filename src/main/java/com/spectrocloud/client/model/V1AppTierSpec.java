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
import com.spectrocloud.client.model.V1AppTierProperty;
import com.spectrocloud.client.model.V1AppTierType;
import com.spectrocloud.client.model.V1ObjectReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Application tier specs
 */
@Schema(description = "Application tier specs")


public class V1AppTierSpec {
  @SerializedName("containerRegistryUid")
  private String containerRegistryUid = null;

  @SerializedName("installOrder")
  private Integer installOrder = null;

  @SerializedName("manifests")
  private List<V1ObjectReference> manifests = null;

  @SerializedName("properties")
  private List<V1AppTierProperty> properties = null;

  @SerializedName("registryUid")
  private String registryUid = null;

  @SerializedName("sourceAppTierUid")
  private String sourceAppTierUid = null;

  @SerializedName("type")
  private V1AppTierType type = null;

  @SerializedName("values")
  private String values = null;

  @SerializedName("version")
  private String version = null;

  public V1AppTierSpec containerRegistryUid(String containerRegistryUid) {
    this.containerRegistryUid = containerRegistryUid;
    return this;
  }

   /**
   * Application tier container registry uid
   * @return containerRegistryUid
  **/
  @Schema(description = "Application tier container registry uid")
  public String getContainerRegistryUid() {
    return containerRegistryUid;
  }

  public void setContainerRegistryUid(String containerRegistryUid) {
    this.containerRegistryUid = containerRegistryUid;
  }

  public V1AppTierSpec installOrder(Integer installOrder) {
    this.installOrder = installOrder;
    return this;
  }

   /**
   * Application tier installation order
   * @return installOrder
  **/
  @Schema(description = "Application tier installation order")
  public Integer getInstallOrder() {
    return installOrder;
  }

  public void setInstallOrder(Integer installOrder) {
    this.installOrder = installOrder;
  }

  public V1AppTierSpec manifests(List<V1ObjectReference> manifests) {
    this.manifests = manifests;
    return this;
  }

  public V1AppTierSpec addManifestsItem(V1ObjectReference manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<V1ObjectReference>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

   /**
   * Application tier attached manifest content in yaml format
   * @return manifests
  **/
  @Schema(description = "Application tier attached manifest content in yaml format")
  public List<V1ObjectReference> getManifests() {
    return manifests;
  }

  public void setManifests(List<V1ObjectReference> manifests) {
    this.manifests = manifests;
  }

  public V1AppTierSpec properties(List<V1AppTierProperty> properties) {
    this.properties = properties;
    return this;
  }

  public V1AppTierSpec addPropertiesItem(V1AppTierProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<V1AppTierProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Application tier properties
   * @return properties
  **/
  @Schema(description = "Application tier properties")
  public List<V1AppTierProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<V1AppTierProperty> properties) {
    this.properties = properties;
  }

  public V1AppTierSpec registryUid(String registryUid) {
    this.registryUid = registryUid;
    return this;
  }

   /**
   * Registry uid
   * @return registryUid
  **/
  @Schema(description = "Registry uid")
  public String getRegistryUid() {
    return registryUid;
  }

  public void setRegistryUid(String registryUid) {
    this.registryUid = registryUid;
  }

  public V1AppTierSpec sourceAppTierUid(String sourceAppTierUid) {
    this.sourceAppTierUid = sourceAppTierUid;
    return this;
  }

   /**
   * Application tier source pack uid
   * @return sourceAppTierUid
  **/
  @Schema(description = "Application tier source pack uid")
  public String getSourceAppTierUid() {
    return sourceAppTierUid;
  }

  public void setSourceAppTierUid(String sourceAppTierUid) {
    this.sourceAppTierUid = sourceAppTierUid;
  }

  public V1AppTierSpec type(V1AppTierType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public V1AppTierType getType() {
    return type;
  }

  public void setType(V1AppTierType type) {
    this.type = type;
  }

  public V1AppTierSpec values(String values) {
    this.values = values;
    return this;
  }

   /**
   * Application tier configuration values in yaml format
   * @return values
  **/
  @Schema(description = "Application tier configuration values in yaml format")
  public String getValues() {
    return values;
  }

  public void setValues(String values) {
    this.values = values;
  }

  public V1AppTierSpec version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Application tier version
   * @return version
  **/
  @Schema(description = "Application tier version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppTierSpec v1AppTierSpec = (V1AppTierSpec) o;
    return Objects.equals(this.containerRegistryUid, v1AppTierSpec.containerRegistryUid) &&
        Objects.equals(this.installOrder, v1AppTierSpec.installOrder) &&
        Objects.equals(this.manifests, v1AppTierSpec.manifests) &&
        Objects.equals(this.properties, v1AppTierSpec.properties) &&
        Objects.equals(this.registryUid, v1AppTierSpec.registryUid) &&
        Objects.equals(this.sourceAppTierUid, v1AppTierSpec.sourceAppTierUid) &&
        Objects.equals(this.type, v1AppTierSpec.type) &&
        Objects.equals(this.values, v1AppTierSpec.values) &&
        Objects.equals(this.version, v1AppTierSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerRegistryUid, installOrder, manifests, properties, registryUid, sourceAppTierUid, type, values, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppTierSpec {\n");
    
    sb.append("    containerRegistryUid: ").append(toIndentedString(containerRegistryUid)).append("\n");
    sb.append("    installOrder: ").append(toIndentedString(installOrder)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    registryUid: ").append(toIndentedString(registryUid)).append("\n");
    sb.append("    sourceAppTierUid: ").append(toIndentedString(sourceAppTierUid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
