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
import org.threeten.bp.OffsetDateTime;
/**
 * User Profile status
 */
@Schema(description = "User Profile status")


public class V1UserProfileStatus {
  @SerializedName("lastPasswordPolicyMail")
  private OffsetDateTime lastPasswordPolicyMail = null;

  @SerializedName("lastPasswordUpdate")
  private OffsetDateTime lastPasswordUpdate = null;

  public V1UserProfileStatus lastPasswordPolicyMail(OffsetDateTime lastPasswordPolicyMail) {
    this.lastPasswordPolicyMail = lastPasswordPolicyMail;
    return this;
  }

   /**
   * Get lastPasswordPolicyMail
   * @return lastPasswordPolicyMail
  **/
  @Schema(description = "")
  public OffsetDateTime getLastPasswordPolicyMail() {
    return lastPasswordPolicyMail;
  }

  public void setLastPasswordPolicyMail(OffsetDateTime lastPasswordPolicyMail) {
    this.lastPasswordPolicyMail = lastPasswordPolicyMail;
  }

  public V1UserProfileStatus lastPasswordUpdate(OffsetDateTime lastPasswordUpdate) {
    this.lastPasswordUpdate = lastPasswordUpdate;
    return this;
  }

   /**
   * Get lastPasswordUpdate
   * @return lastPasswordUpdate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastPasswordUpdate() {
    return lastPasswordUpdate;
  }

  public void setLastPasswordUpdate(OffsetDateTime lastPasswordUpdate) {
    this.lastPasswordUpdate = lastPasswordUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserProfileStatus v1UserProfileStatus = (V1UserProfileStatus) o;
    return Objects.equals(this.lastPasswordPolicyMail, v1UserProfileStatus.lastPasswordPolicyMail) &&
        Objects.equals(this.lastPasswordUpdate, v1UserProfileStatus.lastPasswordUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPasswordPolicyMail, lastPasswordUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserProfileStatus {\n");
    
    sb.append("    lastPasswordPolicyMail: ").append(toIndentedString(lastPasswordPolicyMail)).append("\n");
    sb.append("    lastPasswordUpdate: ").append(toIndentedString(lastPasswordUpdate)).append("\n");
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
