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
import com.spectrocloud.client.model.V1ManifestRefUpdateEntity;
import com.spectrocloud.client.model.V1PackType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Pack input entity with values to overwrite and manifests for the intial creation
 */
@Schema(description = "Pack input entity with values to overwrite and manifests for the intial creation")


public class V1PackManifestUpdateEntity {
  @SerializedName("layer")
  private String layer = null;

  @SerializedName("manifests")
  private List<V1ManifestRefUpdateEntity> manifests = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("registryUid")
  private String registryUid = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("type")
  private V1PackType type = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("values")
  private String values = null;

  public V1PackManifestUpdateEntity layer(String layer) {
    this.layer = layer;
    return this;
  }

   /**
   * Pack layer
   * @return layer
  **/
  @Schema(description = "Pack layer")
  public String getLayer() {
    return layer;
  }

  public void setLayer(String layer) {
    this.layer = layer;
  }

  public V1PackManifestUpdateEntity manifests(List<V1ManifestRefUpdateEntity> manifests) {
    this.manifests = manifests;
    return this;
  }

  public V1PackManifestUpdateEntity addManifestsItem(V1ManifestRefUpdateEntity manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<V1ManifestRefUpdateEntity>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

   /**
   * Pack manifests are additional content as part of the profile
   * @return manifests
  **/
  @Schema(description = "Pack manifests are additional content as part of the profile")
  public List<V1ManifestRefUpdateEntity> getManifests() {
    return manifests;
  }

  public void setManifests(List<V1ManifestRefUpdateEntity> manifests) {
    this.manifests = manifests;
  }

  public V1PackManifestUpdateEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Pack name
   * @return name
  **/
  @Schema(required = true, description = "Pack name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PackManifestUpdateEntity registryUid(String registryUid) {
    this.registryUid = registryUid;
    return this;
  }

   /**
   * Pack registry uid
   * @return registryUid
  **/
  @Schema(description = "Pack registry uid")
  public String getRegistryUid() {
    return registryUid;
  }

  public void setRegistryUid(String registryUid) {
    this.registryUid = registryUid;
  }

  public V1PackManifestUpdateEntity tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Pack tag
   * @return tag
  **/
  @Schema(description = "Pack tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public V1PackManifestUpdateEntity type(V1PackType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public V1PackType getType() {
    return type;
  }

  public void setType(V1PackType type) {
    this.type = type;
  }

  public V1PackManifestUpdateEntity uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Pack uid
   * @return uid
  **/
  @Schema(description = "Pack uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1PackManifestUpdateEntity values(String values) {
    this.values = values;
    return this;
  }

   /**
   * Pack values represents the values.yaml used as input parameters either Params OR Values should be used, not both If both applied at the same time, will only use Values
   * @return values
  **/
  @Schema(description = "Pack values represents the values.yaml used as input parameters either Params OR Values should be used, not both If both applied at the same time, will only use Values")
  public String getValues() {
    return values;
  }

  public void setValues(String values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PackManifestUpdateEntity v1PackManifestUpdateEntity = (V1PackManifestUpdateEntity) o;
    return Objects.equals(this.layer, v1PackManifestUpdateEntity.layer) &&
        Objects.equals(this.manifests, v1PackManifestUpdateEntity.manifests) &&
        Objects.equals(this.name, v1PackManifestUpdateEntity.name) &&
        Objects.equals(this.registryUid, v1PackManifestUpdateEntity.registryUid) &&
        Objects.equals(this.tag, v1PackManifestUpdateEntity.tag) &&
        Objects.equals(this.type, v1PackManifestUpdateEntity.type) &&
        Objects.equals(this.uid, v1PackManifestUpdateEntity.uid) &&
        Objects.equals(this.values, v1PackManifestUpdateEntity.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layer, manifests, name, registryUid, tag, type, uid, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackManifestUpdateEntity {\n");
    
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registryUid: ").append(toIndentedString(registryUid)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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