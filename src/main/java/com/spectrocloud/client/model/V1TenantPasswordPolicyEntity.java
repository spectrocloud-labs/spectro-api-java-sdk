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
 * Tenant Password Policy Entity
 */
@Schema(description = "Tenant Password Policy Entity")


public class V1TenantPasswordPolicyEntity {
  @SerializedName("creationTimestamp")
  private OffsetDateTime creationTimestamp = null;

  @SerializedName("expiryDurationInDays")
  private Integer expiryDurationInDays = null;

  @SerializedName("firstReminderInDays")
  private Integer firstReminderInDays = null;

  @SerializedName("isRegex")
  private Boolean isRegex = null;

  @SerializedName("minLength")
  private Integer minLength = null;

  @SerializedName("minNumOfBlockLetters")
  private Integer minNumOfBlockLetters = null;

  @SerializedName("minNumOfDigits")
  private Integer minNumOfDigits = null;

  @SerializedName("minNumOfSmallLetters")
  private Integer minNumOfSmallLetters = null;

  @SerializedName("minNumOfSpecialCharacters")
  private Integer minNumOfSpecialCharacters = null;

  @SerializedName("regex")
  private String regex = null;

  @SerializedName("updateTimestamp")
  private OffsetDateTime updateTimestamp = null;

  public V1TenantPasswordPolicyEntity creationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Get creationTimestamp
   * @return creationTimestamp
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public V1TenantPasswordPolicyEntity expiryDurationInDays(Integer expiryDurationInDays) {
    this.expiryDurationInDays = expiryDurationInDays;
    return this;
  }

   /**
   * Get expiryDurationInDays
   * @return expiryDurationInDays
  **/
  @Schema(description = "")
  public Integer getExpiryDurationInDays() {
    return expiryDurationInDays;
  }

  public void setExpiryDurationInDays(Integer expiryDurationInDays) {
    this.expiryDurationInDays = expiryDurationInDays;
  }

  public V1TenantPasswordPolicyEntity firstReminderInDays(Integer firstReminderInDays) {
    this.firstReminderInDays = firstReminderInDays;
    return this;
  }

   /**
   * Get firstReminderInDays
   * @return firstReminderInDays
  **/
  @Schema(description = "")
  public Integer getFirstReminderInDays() {
    return firstReminderInDays;
  }

  public void setFirstReminderInDays(Integer firstReminderInDays) {
    this.firstReminderInDays = firstReminderInDays;
  }

  public V1TenantPasswordPolicyEntity isRegex(Boolean isRegex) {
    this.isRegex = isRegex;
    return this;
  }

   /**
   * Get isRegex
   * @return isRegex
  **/
  @Schema(description = "")
  public Boolean isIsRegex() {
    return isRegex;
  }

  public void setIsRegex(Boolean isRegex) {
    this.isRegex = isRegex;
  }

  public V1TenantPasswordPolicyEntity minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @Schema(description = "")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public V1TenantPasswordPolicyEntity minNumOfBlockLetters(Integer minNumOfBlockLetters) {
    this.minNumOfBlockLetters = minNumOfBlockLetters;
    return this;
  }

   /**
   * Get minNumOfBlockLetters
   * @return minNumOfBlockLetters
  **/
  @Schema(description = "")
  public Integer getMinNumOfBlockLetters() {
    return minNumOfBlockLetters;
  }

  public void setMinNumOfBlockLetters(Integer minNumOfBlockLetters) {
    this.minNumOfBlockLetters = minNumOfBlockLetters;
  }

  public V1TenantPasswordPolicyEntity minNumOfDigits(Integer minNumOfDigits) {
    this.minNumOfDigits = minNumOfDigits;
    return this;
  }

   /**
   * Get minNumOfDigits
   * @return minNumOfDigits
  **/
  @Schema(description = "")
  public Integer getMinNumOfDigits() {
    return minNumOfDigits;
  }

  public void setMinNumOfDigits(Integer minNumOfDigits) {
    this.minNumOfDigits = minNumOfDigits;
  }

  public V1TenantPasswordPolicyEntity minNumOfSmallLetters(Integer minNumOfSmallLetters) {
    this.minNumOfSmallLetters = minNumOfSmallLetters;
    return this;
  }

   /**
   * Get minNumOfSmallLetters
   * @return minNumOfSmallLetters
  **/
  @Schema(description = "")
  public Integer getMinNumOfSmallLetters() {
    return minNumOfSmallLetters;
  }

  public void setMinNumOfSmallLetters(Integer minNumOfSmallLetters) {
    this.minNumOfSmallLetters = minNumOfSmallLetters;
  }

  public V1TenantPasswordPolicyEntity minNumOfSpecialCharacters(Integer minNumOfSpecialCharacters) {
    this.minNumOfSpecialCharacters = minNumOfSpecialCharacters;
    return this;
  }

   /**
   * Get minNumOfSpecialCharacters
   * @return minNumOfSpecialCharacters
  **/
  @Schema(description = "")
  public Integer getMinNumOfSpecialCharacters() {
    return minNumOfSpecialCharacters;
  }

  public void setMinNumOfSpecialCharacters(Integer minNumOfSpecialCharacters) {
    this.minNumOfSpecialCharacters = minNumOfSpecialCharacters;
  }

  public V1TenantPasswordPolicyEntity regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @Schema(description = "")
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public V1TenantPasswordPolicyEntity updateTimestamp(OffsetDateTime updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * Get updateTimestamp
   * @return updateTimestamp
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdateTimestamp() {
    return updateTimestamp;
  }

  public void setUpdateTimestamp(OffsetDateTime updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TenantPasswordPolicyEntity v1TenantPasswordPolicyEntity = (V1TenantPasswordPolicyEntity) o;
    return Objects.equals(this.creationTimestamp, v1TenantPasswordPolicyEntity.creationTimestamp) &&
        Objects.equals(this.expiryDurationInDays, v1TenantPasswordPolicyEntity.expiryDurationInDays) &&
        Objects.equals(this.firstReminderInDays, v1TenantPasswordPolicyEntity.firstReminderInDays) &&
        Objects.equals(this.isRegex, v1TenantPasswordPolicyEntity.isRegex) &&
        Objects.equals(this.minLength, v1TenantPasswordPolicyEntity.minLength) &&
        Objects.equals(this.minNumOfBlockLetters, v1TenantPasswordPolicyEntity.minNumOfBlockLetters) &&
        Objects.equals(this.minNumOfDigits, v1TenantPasswordPolicyEntity.minNumOfDigits) &&
        Objects.equals(this.minNumOfSmallLetters, v1TenantPasswordPolicyEntity.minNumOfSmallLetters) &&
        Objects.equals(this.minNumOfSpecialCharacters, v1TenantPasswordPolicyEntity.minNumOfSpecialCharacters) &&
        Objects.equals(this.regex, v1TenantPasswordPolicyEntity.regex) &&
        Objects.equals(this.updateTimestamp, v1TenantPasswordPolicyEntity.updateTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTimestamp, expiryDurationInDays, firstReminderInDays, isRegex, minLength, minNumOfBlockLetters, minNumOfDigits, minNumOfSmallLetters, minNumOfSpecialCharacters, regex, updateTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TenantPasswordPolicyEntity {\n");
    
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    expiryDurationInDays: ").append(toIndentedString(expiryDurationInDays)).append("\n");
    sb.append("    firstReminderInDays: ").append(toIndentedString(firstReminderInDays)).append("\n");
    sb.append("    isRegex: ").append(toIndentedString(isRegex)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minNumOfBlockLetters: ").append(toIndentedString(minNumOfBlockLetters)).append("\n");
    sb.append("    minNumOfDigits: ").append(toIndentedString(minNumOfDigits)).append("\n");
    sb.append("    minNumOfSmallLetters: ").append(toIndentedString(minNumOfSmallLetters)).append("\n");
    sb.append("    minNumOfSpecialCharacters: ").append(toIndentedString(minNumOfSpecialCharacters)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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
