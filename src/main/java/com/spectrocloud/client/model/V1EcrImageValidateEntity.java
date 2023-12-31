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
import com.spectrocloud.client.model.V1EcrAuthorizationRequestEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Ecr registry image meta
 */
@Schema(description = "Ecr registry image meta")


public class V1EcrImageValidateEntity {
  @SerializedName("authEntity")
  private V1EcrAuthorizationRequestEntity authEntity = null;

  @SerializedName("imageTag")
  private String imageTag = null;

  @SerializedName("repoName")
  private String repoName = null;

  public V1EcrImageValidateEntity authEntity(V1EcrAuthorizationRequestEntity authEntity) {
    this.authEntity = authEntity;
    return this;
  }

   /**
   * Get authEntity
   * @return authEntity
  **/
  @Schema(description = "")
  public V1EcrAuthorizationRequestEntity getAuthEntity() {
    return authEntity;
  }

  public void setAuthEntity(V1EcrAuthorizationRequestEntity authEntity) {
    this.authEntity = authEntity;
  }

  public V1EcrImageValidateEntity imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Name of the image tag
   * @return imageTag
  **/
  @Schema(description = "Name of the image tag")
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  public V1EcrImageValidateEntity repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Name of the repo
   * @return repoName
  **/
  @Schema(description = "Name of the repo")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EcrImageValidateEntity v1EcrImageValidateEntity = (V1EcrImageValidateEntity) o;
    return Objects.equals(this.authEntity, v1EcrImageValidateEntity.authEntity) &&
        Objects.equals(this.imageTag, v1EcrImageValidateEntity.imageTag) &&
        Objects.equals(this.repoName, v1EcrImageValidateEntity.repoName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authEntity, imageTag, repoName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EcrImageValidateEntity {\n");
    
    sb.append("    authEntity: ").append(toIndentedString(authEntity)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
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
