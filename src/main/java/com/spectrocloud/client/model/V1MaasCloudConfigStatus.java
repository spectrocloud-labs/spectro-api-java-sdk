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
import com.spectrocloud.client.model.V1ClusterCondition;
import com.spectrocloud.client.model.V1MaasImage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * MaasCloudConfigStatus defines the observed state of MaasCloudConfig The cloudimage info built by Mold is stored here image should be mapped to a specific machinepool
 */
@Schema(description = "MaasCloudConfigStatus defines the observed state of MaasCloudConfig The cloudimage info built by Mold is stored here image should be mapped to a specific machinepool")


public class V1MaasCloudConfigStatus {
  @SerializedName("ansibleRoleDigest")
  private String ansibleRoleDigest = null;

  @SerializedName("conditions")
  private List<V1ClusterCondition> conditions = null;

  @SerializedName("isAddonLayer")
  private Boolean isAddonLayer = null;

  @SerializedName("nodeImage")
  private V1MaasImage nodeImage = null;

  @SerializedName("roleDigest")
  private Map<String, String> roleDigest = null;

  @SerializedName("sourceImageId")
  private String sourceImageId = null;

  @SerializedName("useCapiImage")
  private Boolean useCapiImage = null;

  public V1MaasCloudConfigStatus ansibleRoleDigest(String ansibleRoleDigest) {
    this.ansibleRoleDigest = ansibleRoleDigest;
    return this;
  }

   /**
   * For mold controller to identify if is there any changes in Pack
   * @return ansibleRoleDigest
  **/
  @Schema(description = "For mold controller to identify if is there any changes in Pack")
  public String getAnsibleRoleDigest() {
    return ansibleRoleDigest;
  }

  public void setAnsibleRoleDigest(String ansibleRoleDigest) {
    this.ansibleRoleDigest = ansibleRoleDigest;
  }

  public V1MaasCloudConfigStatus conditions(List<V1ClusterCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1MaasCloudConfigStatus addConditionsItem(V1ClusterCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1ClusterCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(description = "")
  public List<V1ClusterCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1ClusterCondition> conditions) {
    this.conditions = conditions;
  }

  public V1MaasCloudConfigStatus isAddonLayer(Boolean isAddonLayer) {
    this.isAddonLayer = isAddonLayer;
    return this;
  }

   /**
   * addon layers present in spc
   * @return isAddonLayer
  **/
  @Schema(description = "addon layers present in spc")
  public Boolean isIsAddonLayer() {
    return isAddonLayer;
  }

  public void setIsAddonLayer(Boolean isAddonLayer) {
    this.isAddonLayer = isAddonLayer;
  }

  public V1MaasCloudConfigStatus nodeImage(V1MaasImage nodeImage) {
    this.nodeImage = nodeImage;
    return this;
  }

   /**
   * Get nodeImage
   * @return nodeImage
  **/
  @Schema(description = "")
  public V1MaasImage getNodeImage() {
    return nodeImage;
  }

  public void setNodeImage(V1MaasImage nodeImage) {
    this.nodeImage = nodeImage;
  }

  public V1MaasCloudConfigStatus roleDigest(Map<String, String> roleDigest) {
    this.roleDigest = roleDigest;
    return this;
  }

  public V1MaasCloudConfigStatus putRoleDigestItem(String key, String roleDigestItem) {
    if (this.roleDigest == null) {
      this.roleDigest = new HashMap<String, String>();
    }
    this.roleDigest.put(key, roleDigestItem);
    return this;
  }

   /**
   * this map will be for ansible roles present in eack pack
   * @return roleDigest
  **/
  @Schema(description = "this map will be for ansible roles present in eack pack")
  public Map<String, String> getRoleDigest() {
    return roleDigest;
  }

  public void setRoleDigest(Map<String, String> roleDigest) {
    this.roleDigest = roleDigest;
  }

  public V1MaasCloudConfigStatus sourceImageId(String sourceImageId) {
    this.sourceImageId = sourceImageId;
    return this;
  }

   /**
   * sourceImageId, it can be from packref&#x27;s annotations or from pack.json
   * @return sourceImageId
  **/
  @Schema(description = "sourceImageId, it can be from packref's annotations or from pack.json")
  public String getSourceImageId() {
    return sourceImageId;
  }

  public void setSourceImageId(String sourceImageId) {
    this.sourceImageId = sourceImageId;
  }

  public V1MaasCloudConfigStatus useCapiImage(Boolean useCapiImage) {
    this.useCapiImage = useCapiImage;
    return this;
  }

   /**
   * PackerVariableDigest string &#x60;json:\&quot;packerDigest,omitempty\&quot;&#x60; If no ansible roles found in Packs then Mold should tell Drive to use capi image and not create custom image, because there is nothing to add
   * @return useCapiImage
  **/
  @Schema(description = "PackerVariableDigest string `json:\"packerDigest,omitempty\"` If no ansible roles found in Packs then Mold should tell Drive to use capi image and not create custom image, because there is nothing to add")
  public Boolean isUseCapiImage() {
    return useCapiImage;
  }

  public void setUseCapiImage(Boolean useCapiImage) {
    this.useCapiImage = useCapiImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MaasCloudConfigStatus v1MaasCloudConfigStatus = (V1MaasCloudConfigStatus) o;
    return Objects.equals(this.ansibleRoleDigest, v1MaasCloudConfigStatus.ansibleRoleDigest) &&
        Objects.equals(this.conditions, v1MaasCloudConfigStatus.conditions) &&
        Objects.equals(this.isAddonLayer, v1MaasCloudConfigStatus.isAddonLayer) &&
        Objects.equals(this.nodeImage, v1MaasCloudConfigStatus.nodeImage) &&
        Objects.equals(this.roleDigest, v1MaasCloudConfigStatus.roleDigest) &&
        Objects.equals(this.sourceImageId, v1MaasCloudConfigStatus.sourceImageId) &&
        Objects.equals(this.useCapiImage, v1MaasCloudConfigStatus.useCapiImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ansibleRoleDigest, conditions, isAddonLayer, nodeImage, roleDigest, sourceImageId, useCapiImage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MaasCloudConfigStatus {\n");
    
    sb.append("    ansibleRoleDigest: ").append(toIndentedString(ansibleRoleDigest)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    isAddonLayer: ").append(toIndentedString(isAddonLayer)).append("\n");
    sb.append("    nodeImage: ").append(toIndentedString(nodeImage)).append("\n");
    sb.append("    roleDigest: ").append(toIndentedString(roleDigest)).append("\n");
    sb.append("    sourceImageId: ").append(toIndentedString(sourceImageId)).append("\n");
    sb.append("    useCapiImage: ").append(toIndentedString(useCapiImage)).append("\n");
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
