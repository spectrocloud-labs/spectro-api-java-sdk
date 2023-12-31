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
 * Taint
 */
@Schema(description = "Taint")


public class V1Taint {
  /**
   * Gets or Sets effect
   */
  @JsonAdapter(EffectEnum.Adapter.class)
  public enum EffectEnum {
    NOSCHEDULE("NoSchedule"),
    PREFERNOSCHEDULE("PreferNoSchedule"),
    NOEXECUTE("NoExecute");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EffectEnum fromValue(String input) {
      for (EffectEnum b : EffectEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EffectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EffectEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EffectEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("effect")
  private EffectEnum effect = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("timeAdded")
  private OffsetDateTime timeAdded = null;

  @SerializedName("value")
  private String value = null;

  public V1Taint effect(EffectEnum effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @Schema(description = "")
  public EffectEnum getEffect() {
    return effect;
  }

  public void setEffect(EffectEnum effect) {
    this.effect = effect;
  }

  public V1Taint key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The taint key to be applied to a node
   * @return key
  **/
  @Schema(description = "The taint key to be applied to a node")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1Taint timeAdded(OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
    return this;
  }

   /**
   * Get timeAdded
   * @return timeAdded
  **/
  @Schema(description = "")
  public OffsetDateTime getTimeAdded() {
    return timeAdded;
  }

  public void setTimeAdded(OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
  }

  public V1Taint value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The taint value corresponding to the taint key.
   * @return value
  **/
  @Schema(description = "The taint value corresponding to the taint key.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Taint v1Taint = (V1Taint) o;
    return Objects.equals(this.effect, v1Taint.effect) &&
        Objects.equals(this.key, v1Taint.key) &&
        Objects.equals(this.timeAdded, v1Taint.timeAdded) &&
        Objects.equals(this.value, v1Taint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, timeAdded, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Taint {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeAdded: ").append(toIndentedString(timeAdded)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
