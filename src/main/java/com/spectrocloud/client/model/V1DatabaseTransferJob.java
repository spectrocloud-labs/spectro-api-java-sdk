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
import com.spectrocloud.client.model.V1TransferJob;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * database transfer job details
 */
@Schema(description = "database transfer job details")


public class V1DatabaseTransferJob {
  @SerializedName("backupStatus")
  private V1TransferJob backupStatus = null;

  @SerializedName("backupUid")
  private String backupUid = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    FILESYSTEM("FileSystem"),
    FTP("Ftp");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModeEnum fromValue(String input) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("mode")
  private ModeEnum mode = null;

  public V1DatabaseTransferJob backupStatus(V1TransferJob backupStatus) {
    this.backupStatus = backupStatus;
    return this;
  }

   /**
   * Get backupStatus
   * @return backupStatus
  **/
  @Schema(description = "")
  public V1TransferJob getBackupStatus() {
    return backupStatus;
  }

  public void setBackupStatus(V1TransferJob backupStatus) {
    this.backupStatus = backupStatus;
  }

  public V1DatabaseTransferJob backupUid(String backupUid) {
    this.backupUid = backupUid;
    return this;
  }

   /**
   * Get backupUid
   * @return backupUid
  **/
  @Schema(description = "")
  public String getBackupUid() {
    return backupUid;
  }

  public void setBackupUid(String backupUid) {
    this.backupUid = backupUid;
  }

  public V1DatabaseTransferJob mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DatabaseTransferJob v1DatabaseTransferJob = (V1DatabaseTransferJob) o;
    return Objects.equals(this.backupStatus, v1DatabaseTransferJob.backupStatus) &&
        Objects.equals(this.backupUid, v1DatabaseTransferJob.backupUid) &&
        Objects.equals(this.mode, v1DatabaseTransferJob.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupStatus, backupUid, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DatabaseTransferJob {\n");
    
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    backupUid: ").append(toIndentedString(backupUid)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
