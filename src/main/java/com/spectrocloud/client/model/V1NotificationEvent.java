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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Describes notification event details
 */
@Schema(description = "Describes notification event details")


public class V1NotificationEvent {
  @SerializedName("component")
  private String component = null;

  @SerializedName("digest")
  private String digest = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("meta")
  private Map<String, String> meta = null;

  /**
   * Describes notification event type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NOTIFICATIONPACKSYNC("NotificationPackSync"),
    NOTIFICATIONCLUSTERPROFILESYNC("NotificationClusterProfileSync");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public V1NotificationEvent component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Describes component of notification event
   * @return component
  **/
  @Schema(description = "Describes component of notification event")
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public V1NotificationEvent digest(String digest) {
    this.digest = digest;
    return this;
  }

   /**
   * Describes notification event digest
   * @return digest
  **/
  @Schema(description = "Describes notification event digest")
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  public V1NotificationEvent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Describes a information for the notification event
   * @return message
  **/
  @Schema(description = "Describes a information for the notification event")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1NotificationEvent meta(Map<String, String> meta) {
    this.meta = meta;
    return this;
  }

  public V1NotificationEvent putMetaItem(String key, String metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<String, String>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Describes a event messages with meta digest as the key
   * @return meta
  **/
  @Schema(description = "Describes a event messages with meta digest as the key")
  public Map<String, String> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }

  public V1NotificationEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Describes notification event type
   * @return type
  **/
  @Schema(description = "Describes notification event type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NotificationEvent v1NotificationEvent = (V1NotificationEvent) o;
    return Objects.equals(this.component, v1NotificationEvent.component) &&
        Objects.equals(this.digest, v1NotificationEvent.digest) &&
        Objects.equals(this.message, v1NotificationEvent.message) &&
        Objects.equals(this.meta, v1NotificationEvent.meta) &&
        Objects.equals(this.type, v1NotificationEvent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, digest, message, meta, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NotificationEvent {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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