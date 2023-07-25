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
import com.spectrocloud.client.model.V1PackManifestUpdateEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster profile notification update request payload
 */
@Schema(description = "Cluster profile notification update request payload")


public class V1ClusterProfileNotificationUpdateEntity {
  @SerializedName("packs")
  private List<V1PackManifestUpdateEntity> packs = null;

  @SerializedName("uid")
  private String uid = null;

  public V1ClusterProfileNotificationUpdateEntity packs(List<V1PackManifestUpdateEntity> packs) {
    this.packs = packs;
    return this;
  }

  public V1ClusterProfileNotificationUpdateEntity addPacksItem(V1PackManifestUpdateEntity packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<V1PackManifestUpdateEntity>();
    }
    this.packs.add(packsItem);
    return this;
  }

   /**
   * Cluster profile packs array
   * @return packs
  **/
  @Schema(description = "Cluster profile packs array")
  public List<V1PackManifestUpdateEntity> getPacks() {
    return packs;
  }

  public void setPacks(List<V1PackManifestUpdateEntity> packs) {
    this.packs = packs;
  }

  public V1ClusterProfileNotificationUpdateEntity uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Cluster profile uid
   * @return uid
  **/
  @Schema(description = "Cluster profile uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterProfileNotificationUpdateEntity v1ClusterProfileNotificationUpdateEntity = (V1ClusterProfileNotificationUpdateEntity) o;
    return Objects.equals(this.packs, v1ClusterProfileNotificationUpdateEntity.packs) &&
        Objects.equals(this.uid, v1ClusterProfileNotificationUpdateEntity.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packs, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProfileNotificationUpdateEntity {\n");
    
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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