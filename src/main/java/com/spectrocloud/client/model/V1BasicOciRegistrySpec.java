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
import com.spectrocloud.client.model.V1RegistryAuth;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Basic oci registry spec
 */
@Schema(description = "Basic oci registry spec")


public class V1BasicOciRegistrySpec {
  @SerializedName("auth")
  private V1RegistryAuth auth = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  /**
   * Gets or Sets providerType
   */
  @JsonAdapter(ProviderTypeEnum.Adapter.class)
  public enum ProviderTypeEnum {
    HELM("helm"),
    ZARF("zarf");

    private String value;

    ProviderTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProviderTypeEnum fromValue(String input) {
      for (ProviderTypeEnum b : ProviderTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProviderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProviderTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProviderTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("providerType")
  private ProviderTypeEnum providerType = ProviderTypeEnum.HELM;

  @SerializedName("scope")
  private String scope = null;

  public V1BasicOciRegistrySpec auth(V1RegistryAuth auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @Schema(required = true, description = "")
  public V1RegistryAuth getAuth() {
    return auth;
  }

  public void setAuth(V1RegistryAuth auth) {
    this.auth = auth;
  }

  public V1BasicOciRegistrySpec endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(required = true, description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public V1BasicOciRegistrySpec providerType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * Get providerType
   * @return providerType
  **/
  @Schema(description = "")
  public ProviderTypeEnum getProviderType() {
    return providerType;
  }

  public void setProviderType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
  }

  public V1BasicOciRegistrySpec scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1BasicOciRegistrySpec v1BasicOciRegistrySpec = (V1BasicOciRegistrySpec) o;
    return Objects.equals(this.auth, v1BasicOciRegistrySpec.auth) &&
        Objects.equals(this.endpoint, v1BasicOciRegistrySpec.endpoint) &&
        Objects.equals(this.providerType, v1BasicOciRegistrySpec.providerType) &&
        Objects.equals(this.scope, v1BasicOciRegistrySpec.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, endpoint, providerType, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1BasicOciRegistrySpec {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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