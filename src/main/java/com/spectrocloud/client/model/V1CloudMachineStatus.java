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
import com.spectrocloud.client.model.V1MachineHealth;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * cloud machine status
 */
@Schema(description = "cloud machine status")


public class V1CloudMachineStatus {
  @SerializedName("health")
  private V1MachineHealth health = null;

  /**
   * Gets or Sets instanceState
   */
  @JsonAdapter(InstanceStateEnum.Adapter.class)
  public enum InstanceStateEnum {
    PENDING("Pending"),
    PROVISIONING("Provisioning"),
    PROVISIONED("Provisioned"),
    RUNNING("Running"),
    DELETING("Deleting"),
    DELETED("Deleted"),
    FAILED("Failed"),
    UNKNOWN("Unknown");

    private String value;

    InstanceStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceStateEnum fromValue(String input) {
      for (InstanceStateEnum b : InstanceStateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceStateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InstanceStateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceStateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("instanceState")
  private InstanceStateEnum instanceState = null;

  public V1CloudMachineStatus health(V1MachineHealth health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  @Schema(description = "")
  public V1MachineHealth getHealth() {
    return health;
  }

  public void setHealth(V1MachineHealth health) {
    this.health = health;
  }

  public V1CloudMachineStatus instanceState(InstanceStateEnum instanceState) {
    this.instanceState = instanceState;
    return this;
  }

   /**
   * Get instanceState
   * @return instanceState
  **/
  @Schema(description = "")
  public InstanceStateEnum getInstanceState() {
    return instanceState;
  }

  public void setInstanceState(InstanceStateEnum instanceState) {
    this.instanceState = instanceState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CloudMachineStatus v1CloudMachineStatus = (V1CloudMachineStatus) o;
    return Objects.equals(this.health, v1CloudMachineStatus.health) &&
        Objects.equals(this.instanceState, v1CloudMachineStatus.instanceState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health, instanceState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CloudMachineStatus {\n");
    
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    instanceState: ").append(toIndentedString(instanceState)).append("\n");
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
