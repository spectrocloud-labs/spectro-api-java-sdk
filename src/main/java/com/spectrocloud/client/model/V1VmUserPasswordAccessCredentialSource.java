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
import com.spectrocloud.client.model.V1VmAccessCredentialSecretSource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserPasswordAccessCredentialSource represents where to retrieve the user password credentials Only one of its members may be specified.
 */
@Schema(description = "UserPasswordAccessCredentialSource represents where to retrieve the user password credentials Only one of its members may be specified.")


public class V1VmUserPasswordAccessCredentialSource {
  @SerializedName("secret")
  private V1VmAccessCredentialSecretSource secret = null;

  public V1VmUserPasswordAccessCredentialSource secret(V1VmAccessCredentialSecretSource secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @Schema(description = "")
  public V1VmAccessCredentialSecretSource getSecret() {
    return secret;
  }

  public void setSecret(V1VmAccessCredentialSecretSource secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmUserPasswordAccessCredentialSource v1VmUserPasswordAccessCredentialSource = (V1VmUserPasswordAccessCredentialSource) o;
    return Objects.equals(this.secret, v1VmUserPasswordAccessCredentialSource.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmUserPasswordAccessCredentialSource {\n");
    
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
