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
import com.spectrocloud.client.model.V1Certificate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Certificate Authority
 */
@Schema(description = "Certificate Authority")


public class V1CertificateAuthority {
  @SerializedName("certificates")
  private List<V1Certificate> certificates = null;

  @SerializedName("expiry")
  private OffsetDateTime expiry = null;

  @SerializedName("name")
  private String name = null;

  public V1CertificateAuthority certificates(List<V1Certificate> certificates) {
    this.certificates = certificates;
    return this;
  }

  public V1CertificateAuthority addCertificatesItem(V1Certificate certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<V1Certificate>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @Schema(description = "")
  public List<V1Certificate> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<V1Certificate> certificates) {
    this.certificates = certificates;
  }

  public V1CertificateAuthority expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @Schema(description = "")
  public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  public V1CertificateAuthority name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateAuthority v1CertificateAuthority = (V1CertificateAuthority) o;
    return Objects.equals(this.certificates, v1CertificateAuthority.certificates) &&
        Objects.equals(this.expiry, v1CertificateAuthority.expiry) &&
        Objects.equals(this.name, v1CertificateAuthority.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, expiry, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateAuthority {\n");
    
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
