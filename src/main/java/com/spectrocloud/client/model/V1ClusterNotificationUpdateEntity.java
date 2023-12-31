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
import com.spectrocloud.client.model.V1ClusterProfileNotificationUpdateEntity;
import com.spectrocloud.client.model.V1SpcApplySettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster input for notification update
 */
@Schema(description = "Cluster input for notification update")


public class V1ClusterNotificationUpdateEntity {
  @SerializedName("profiles")
  private List<V1ClusterProfileNotificationUpdateEntity> profiles = null;

  @SerializedName("spcApplySettings")
  private V1SpcApplySettings spcApplySettings = null;

  public V1ClusterNotificationUpdateEntity profiles(List<V1ClusterProfileNotificationUpdateEntity> profiles) {
    this.profiles = profiles;
    return this;
  }

  public V1ClusterNotificationUpdateEntity addProfilesItem(V1ClusterProfileNotificationUpdateEntity profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<V1ClusterProfileNotificationUpdateEntity>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @Schema(description = "")
  public List<V1ClusterProfileNotificationUpdateEntity> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<V1ClusterProfileNotificationUpdateEntity> profiles) {
    this.profiles = profiles;
  }

  public V1ClusterNotificationUpdateEntity spcApplySettings(V1SpcApplySettings spcApplySettings) {
    this.spcApplySettings = spcApplySettings;
    return this;
  }

   /**
   * Get spcApplySettings
   * @return spcApplySettings
  **/
  @Schema(description = "")
  public V1SpcApplySettings getSpcApplySettings() {
    return spcApplySettings;
  }

  public void setSpcApplySettings(V1SpcApplySettings spcApplySettings) {
    this.spcApplySettings = spcApplySettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterNotificationUpdateEntity v1ClusterNotificationUpdateEntity = (V1ClusterNotificationUpdateEntity) o;
    return Objects.equals(this.profiles, v1ClusterNotificationUpdateEntity.profiles) &&
        Objects.equals(this.spcApplySettings, v1ClusterNotificationUpdateEntity.spcApplySettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profiles, spcApplySettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterNotificationUpdateEntity {\n");
    
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    spcApplySettings: ").append(toIndentedString(spcApplySettings)).append("\n");
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
