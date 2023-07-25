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
 * V1SpcApply
 */



public class V1SpcApply {
  /**
   * Gets or Sets actionType
   */
  @JsonAdapter(ActionTypeEnum.Adapter.class)
  public enum ActionTypeEnum {
    DOWNLOADANDINSTALL("DownloadAndInstall"),
    DOWNLOADANDINSTALLLATER("DownloadAndInstallLater");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionTypeEnum fromValue(String input) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ActionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("actionType")
  private ActionTypeEnum actionType = null;

  @SerializedName("canBeApplied")
  private Boolean canBeApplied = null;

  @SerializedName("lastModifiedTime")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("patchAppliedTime")
  private OffsetDateTime patchAppliedTime = null;

  public V1SpcApply actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @Schema(description = "")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public V1SpcApply canBeApplied(Boolean canBeApplied) {
    this.canBeApplied = canBeApplied;
    return this;
  }

   /**
   * If it is true then Agent can apply the changes to the palette
   * @return canBeApplied
  **/
  @Schema(description = "If it is true then Agent can apply the changes to the palette")
  public Boolean isCanBeApplied() {
    return canBeApplied;
  }

  public void setCanBeApplied(Boolean canBeApplied) {
    this.canBeApplied = canBeApplied;
  }

  public V1SpcApply lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Get lastModifiedTime
   * @return lastModifiedTime
  **/
  @Schema(description = "")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public V1SpcApply patchAppliedTime(OffsetDateTime patchAppliedTime) {
    this.patchAppliedTime = patchAppliedTime;
    return this;
  }

   /**
   * Get patchAppliedTime
   * @return patchAppliedTime
  **/
  @Schema(description = "")
  public OffsetDateTime getPatchAppliedTime() {
    return patchAppliedTime;
  }

  public void setPatchAppliedTime(OffsetDateTime patchAppliedTime) {
    this.patchAppliedTime = patchAppliedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpcApply v1SpcApply = (V1SpcApply) o;
    return Objects.equals(this.actionType, v1SpcApply.actionType) &&
        Objects.equals(this.canBeApplied, v1SpcApply.canBeApplied) &&
        Objects.equals(this.lastModifiedTime, v1SpcApply.lastModifiedTime) &&
        Objects.equals(this.patchAppliedTime, v1SpcApply.patchAppliedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, canBeApplied, lastModifiedTime, patchAppliedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpcApply {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    canBeApplied: ").append(toIndentedString(canBeApplied)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    patchAppliedTime: ").append(toIndentedString(patchAppliedTime)).append("\n");
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
