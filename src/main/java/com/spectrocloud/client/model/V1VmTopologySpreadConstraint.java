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
import com.spectrocloud.client.model.V1VmLabelSelector;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
@Schema(description = "TopologySpreadConstraint specifies how to spread matching pods among the given topology.")


public class V1VmTopologySpreadConstraint {
  @SerializedName("labelSelector")
  private V1VmLabelSelector labelSelector = null;

  @SerializedName("maxSkew")
  private Integer maxSkew = null;

  @SerializedName("topologyKey")
  private String topologyKey = null;

  @SerializedName("whenUnsatisfiable")
  private String whenUnsatisfiable = null;

  public V1VmTopologySpreadConstraint labelSelector(V1VmLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @Schema(description = "")
  public V1VmLabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(V1VmLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public V1VmTopologySpreadConstraint maxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
    return this;
  }

   /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. When &#x60;whenUnsatisfiable&#x3D;DoNotSchedule&#x60;, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When &#x60;whenUnsatisfiable&#x3D;ScheduleAnyway&#x60;, it is used to give higher precedence to topologies that satisfy it. It&#x27;s a required field. Default value is 1 and 0 is not allowed.
   * @return maxSkew
  **/
  @Schema(required = true, description = "MaxSkew describes the degree to which pods may be unevenly distributed. When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.")
  public Integer getMaxSkew() {
    return maxSkew;
  }

  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }

  public V1VmTopologySpreadConstraint topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. It&#x27;s a required field.
   * @return topologyKey
  **/
  @Schema(required = true, description = "TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a \"bucket\", and try to put balanced number of pods into each bucket. It's a required field.")
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }

  public V1VmTopologySpreadConstraint whenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

   /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#x27;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,   but giving higher precedence to topologies that would help reduce the   skew. A constraint is considered \&quot;Unsatisfiable\&quot; for an incoming pod if and only if every possible node assignment for that pod would violate \&quot;MaxSkew\&quot; on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#x27;t make it *more* imbalanced. It&#x27;s a required field.
   * @return whenUnsatisfiable
  **/
  @Schema(required = true, description = "WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,   but giving higher precedence to topologies that would help reduce the   skew. A constraint is considered \"Unsatisfiable\" for an incoming pod if and only if every possible node assignment for that pod would violate \"MaxSkew\" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.")
  public String getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }

  public void setWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmTopologySpreadConstraint v1VmTopologySpreadConstraint = (V1VmTopologySpreadConstraint) o;
    return Objects.equals(this.labelSelector, v1VmTopologySpreadConstraint.labelSelector) &&
        Objects.equals(this.maxSkew, v1VmTopologySpreadConstraint.maxSkew) &&
        Objects.equals(this.topologyKey, v1VmTopologySpreadConstraint.topologyKey) &&
        Objects.equals(this.whenUnsatisfiable, v1VmTopologySpreadConstraint.whenUnsatisfiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, maxSkew, topologyKey, whenUnsatisfiable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmTopologySpreadConstraint {\n");
    
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
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