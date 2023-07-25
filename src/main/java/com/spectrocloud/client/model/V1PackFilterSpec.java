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
import com.spectrocloud.client.model.V1CloudType;
import com.spectrocloud.client.model.V1FilterString;
import com.spectrocloud.client.model.V1PackLayer;
import com.spectrocloud.client.model.V1PackType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Packs filter spec
 */
@Schema(description = "Packs filter spec")


public class V1PackFilterSpec {
  @SerializedName("addOnSubType")
  private List<String> addOnSubType = null;

  @SerializedName("addOnType")
  private List<String> addOnType = null;

  @SerializedName("displayName")
  private V1FilterString displayName = null;

  @SerializedName("environment")
  private List<V1CloudType> environment = null;

  @SerializedName("layer")
  private List<V1PackLayer> layer = null;

  @SerializedName("name")
  private V1FilterString name = null;

  @SerializedName("registryUid")
  private List<String> registryUid = null;

  @SerializedName("type")
  private List<V1PackType> type = null;

  public V1PackFilterSpec addOnSubType(List<String> addOnSubType) {
    this.addOnSubType = addOnSubType;
    return this;
  }

  public V1PackFilterSpec addAddOnSubTypeItem(String addOnSubTypeItem) {
    if (this.addOnSubType == null) {
      this.addOnSubType = new ArrayList<String>();
    }
    this.addOnSubType.add(addOnSubTypeItem);
    return this;
  }

   /**
   * Pack add-on sub type such as monitoring, db etc
   * @return addOnSubType
  **/
  @Schema(description = "Pack add-on sub type such as monitoring, db etc")
  public List<String> getAddOnSubType() {
    return addOnSubType;
  }

  public void setAddOnSubType(List<String> addOnSubType) {
    this.addOnSubType = addOnSubType;
  }

  public V1PackFilterSpec addOnType(List<String> addOnType) {
    this.addOnType = addOnType;
    return this;
  }

  public V1PackFilterSpec addAddOnTypeItem(String addOnTypeItem) {
    if (this.addOnType == null) {
      this.addOnType = new ArrayList<String>();
    }
    this.addOnType.add(addOnTypeItem);
    return this;
  }

   /**
   * Pack add-on type such as logging, monitoring, security etc
   * @return addOnType
  **/
  @Schema(description = "Pack add-on type such as logging, monitoring, security etc")
  public List<String> getAddOnType() {
    return addOnType;
  }

  public void setAddOnType(List<String> addOnType) {
    this.addOnType = addOnType;
  }

  public V1PackFilterSpec displayName(V1FilterString displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public V1FilterString getDisplayName() {
    return displayName;
  }

  public void setDisplayName(V1FilterString displayName) {
    this.displayName = displayName;
  }

  public V1PackFilterSpec environment(List<V1CloudType> environment) {
    this.environment = environment;
    return this;
  }

  public V1PackFilterSpec addEnvironmentItem(V1CloudType environmentItem) {
    if (this.environment == null) {
      this.environment = new ArrayList<V1CloudType>();
    }
    this.environment.add(environmentItem);
    return this;
  }

   /**
   * Pack supported cloud types
   * @return environment
  **/
  @Schema(description = "Pack supported cloud types")
  public List<V1CloudType> getEnvironment() {
    return environment;
  }

  public void setEnvironment(List<V1CloudType> environment) {
    this.environment = environment;
  }

  public V1PackFilterSpec layer(List<V1PackLayer> layer) {
    this.layer = layer;
    return this;
  }

  public V1PackFilterSpec addLayerItem(V1PackLayer layerItem) {
    if (this.layer == null) {
      this.layer = new ArrayList<V1PackLayer>();
    }
    this.layer.add(layerItem);
    return this;
  }

   /**
   * Pack layer
   * @return layer
  **/
  @Schema(description = "Pack layer")
  public List<V1PackLayer> getLayer() {
    return layer;
  }

  public void setLayer(List<V1PackLayer> layer) {
    this.layer = layer;
  }

  public V1PackFilterSpec name(V1FilterString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public V1FilterString getName() {
    return name;
  }

  public void setName(V1FilterString name) {
    this.name = name;
  }

  public V1PackFilterSpec registryUid(List<String> registryUid) {
    this.registryUid = registryUid;
    return this;
  }

  public V1PackFilterSpec addRegistryUidItem(String registryUidItem) {
    if (this.registryUid == null) {
      this.registryUid = new ArrayList<String>();
    }
    this.registryUid.add(registryUidItem);
    return this;
  }

   /**
   * Pack registry uid
   * @return registryUid
  **/
  @Schema(description = "Pack registry uid")
  public List<String> getRegistryUid() {
    return registryUid;
  }

  public void setRegistryUid(List<String> registryUid) {
    this.registryUid = registryUid;
  }

  public V1PackFilterSpec type(List<V1PackType> type) {
    this.type = type;
    return this;
  }

  public V1PackFilterSpec addTypeItem(V1PackType typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<V1PackType>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Pack type
   * @return type
  **/
  @Schema(description = "Pack type")
  public List<V1PackType> getType() {
    return type;
  }

  public void setType(List<V1PackType> type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PackFilterSpec v1PackFilterSpec = (V1PackFilterSpec) o;
    return Objects.equals(this.addOnSubType, v1PackFilterSpec.addOnSubType) &&
        Objects.equals(this.addOnType, v1PackFilterSpec.addOnType) &&
        Objects.equals(this.displayName, v1PackFilterSpec.displayName) &&
        Objects.equals(this.environment, v1PackFilterSpec.environment) &&
        Objects.equals(this.layer, v1PackFilterSpec.layer) &&
        Objects.equals(this.name, v1PackFilterSpec.name) &&
        Objects.equals(this.registryUid, v1PackFilterSpec.registryUid) &&
        Objects.equals(this.type, v1PackFilterSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOnSubType, addOnType, displayName, environment, layer, name, registryUid, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackFilterSpec {\n");
    
    sb.append("    addOnSubType: ").append(toIndentedString(addOnSubType)).append("\n");
    sb.append("    addOnType: ").append(toIndentedString(addOnType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registryUid: ").append(toIndentedString(registryUid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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