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
import java.util.ArrayList;
import java.util.List;
/**
 * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.  Each key is either a &#x27;.&#x27; representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: &#x27;f:&lt;name&gt;&#x27;, where &lt;name&gt; is the name of a field in a struct, or key in a map &#x27;v:&lt;value&gt;&#x27;, where &lt;value&gt; is the exact json formatted value of a list item &#x27;i:&lt;index&gt;&#x27;, where &lt;index&gt; is position of a item in a list &#x27;k:&lt;keys&gt;&#x27;, where &lt;keys&gt; is a map of  a list item&#x27;s key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.  The exact format is defined in sigs.k8s.io/structured-merge-diff
 */
@Schema(description = "FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.  Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.  The exact format is defined in sigs.k8s.io/structured-merge-diff")


public class V1VmFieldsV1 {
  @SerializedName("Raw")
  private List<byte[]> raw = null;

  public V1VmFieldsV1 raw(List<byte[]> raw) {
    this.raw = raw;
    return this;
  }

  public V1VmFieldsV1 addRawItem(byte[] rawItem) {
    if (this.raw == null) {
      this.raw = new ArrayList<byte[]>();
    }
    this.raw.add(rawItem);
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @Schema(description = "")
  public List<byte[]> getRaw() {
    return raw;
  }

  public void setRaw(List<byte[]> raw) {
    this.raw = raw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmFieldsV1 v1VmFieldsV1 = (V1VmFieldsV1) o;
    return Objects.equals(this.raw, v1VmFieldsV1.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmFieldsV1 {\n");
    
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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