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
 * Describes actions for the notification
 */
@Schema(description = "Describes actions for the notification")


public class V1NotificationAction {
  @SerializedName("ack")
  private Boolean ack = null;

  @SerializedName("actionMessage")
  private String actionMessage = null;

  /**
   * Describes action type for the notification. Possible Values [NotifyActionPacksUpdate, NotifyActionClusterProfileUpdate, NotifyActionPackRegistryUpdate, NotifyActionClusterUpdate, NotifyActionNone]
   */
  @JsonAdapter(ActionTypeEnum.Adapter.class)
  public enum ActionTypeEnum {
    NOTIFYACTIONPACKSUPDATE("NotifyActionPacksUpdate"),
    NOTIFYACTIONCLUSTERPROFILEUPDATE("NotifyActionClusterProfileUpdate"),
    NOTIFYACTIONPACKREGISTRYUPDATE("NotifyActionPackRegistryUpdate"),
    NOTIFYACTIONCLUSTERUPDATE("NotifyActionClusterUpdate"),
    NOTIFYACTIONNONE("NotifyActionNone");

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

  @SerializedName("events")
  private Map<String, Map<String, String>> events = null;

  @SerializedName("isDone")
  private Boolean isDone = null;

  @SerializedName("isInfo")
  private Boolean isInfo = null;

  @SerializedName("link")
  private String link = null;

  public V1NotificationAction ack(Boolean ack) {
    this.ack = ack;
    return this;
  }

   /**
   * Describes the acknowledgement status for the notification
   * @return ack
  **/
  @Schema(description = "Describes the acknowledgement status for the notification")
  public Boolean isAck() {
    return ack;
  }

  public void setAck(Boolean ack) {
    this.ack = ack;
  }

  public V1NotificationAction actionMessage(String actionMessage) {
    this.actionMessage = actionMessage;
    return this;
  }

   /**
   * Describes information related to notification action
   * @return actionMessage
  **/
  @Schema(description = "Describes information related to notification action")
  public String getActionMessage() {
    return actionMessage;
  }

  public void setActionMessage(String actionMessage) {
    this.actionMessage = actionMessage;
  }

  public V1NotificationAction actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Describes action type for the notification. Possible Values [NotifyActionPacksUpdate, NotifyActionClusterProfileUpdate, NotifyActionPackRegistryUpdate, NotifyActionClusterUpdate, NotifyActionNone]
   * @return actionType
  **/
  @Schema(description = "Describes action type for the notification. Possible Values [NotifyActionPacksUpdate, NotifyActionClusterProfileUpdate, NotifyActionPackRegistryUpdate, NotifyActionClusterUpdate, NotifyActionNone]")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public V1NotificationAction events(Map<String, Map<String, String>> events) {
    this.events = events;
    return this;
  }

  public V1NotificationAction putEventsItem(String key, Map<String, String> eventsItem) {
    if (this.events == null) {
      this.events = new HashMap<String, Map<String, String>>();
    }
    this.events.put(key, eventsItem);
    return this;
  }

   /**
   * Describes the events happened for the notifications
   * @return events
  **/
  @Schema(description = "Describes the events happened for the notifications")
  public Map<String, Map<String, String>> getEvents() {
    return events;
  }

  public void setEvents(Map<String, Map<String, String>> events) {
    this.events = events;
  }

  public V1NotificationAction isDone(Boolean isDone) {
    this.isDone = isDone;
    return this;
  }

   /**
   * Describes the \&quot;Done\&quot; status for the notification
   * @return isDone
  **/
  @Schema(description = "Describes the \"Done\" status for the notification")
  public Boolean isIsDone() {
    return isDone;
  }

  public void setIsDone(Boolean isDone) {
    this.isDone = isDone;
  }

  public V1NotificationAction isInfo(Boolean isInfo) {
    this.isInfo = isInfo;
    return this;
  }

   /**
   * Describes the notification as a information
   * @return isInfo
  **/
  @Schema(description = "Describes the notification as a information")
  public Boolean isIsInfo() {
    return isInfo;
  }

  public void setIsInfo(Boolean isInfo) {
    this.isInfo = isInfo;
  }

  public V1NotificationAction link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @Schema(description = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NotificationAction v1NotificationAction = (V1NotificationAction) o;
    return Objects.equals(this.ack, v1NotificationAction.ack) &&
        Objects.equals(this.actionMessage, v1NotificationAction.actionMessage) &&
        Objects.equals(this.actionType, v1NotificationAction.actionType) &&
        Objects.equals(this.events, v1NotificationAction.events) &&
        Objects.equals(this.isDone, v1NotificationAction.isDone) &&
        Objects.equals(this.isInfo, v1NotificationAction.isInfo) &&
        Objects.equals(this.link, v1NotificationAction.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ack, actionMessage, actionType, events, isDone, isInfo, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NotificationAction {\n");
    
    sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
    sb.append("    actionMessage: ").append(toIndentedString(actionMessage)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    isDone: ").append(toIndentedString(isDone)).append("\n");
    sb.append("    isInfo: ").append(toIndentedString(isInfo)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
