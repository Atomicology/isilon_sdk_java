/*
 * Isilon SDK
 * Isilon SDK - Language bindings for the OneFS API
 *
 * OpenAPI spec version: 5
 * Contact: sdk@isilon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MappingUsersLookupMappingItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MappingUsersLookup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class MappingUsersLookup {
  @SerializedName("mapping")
  private List<MappingUsersLookupMappingItem> mapping = null;

  public MappingUsersLookup mapping(List<MappingUsersLookupMappingItem> mapping) {
    this.mapping = mapping;
    return this;
  }

  public MappingUsersLookup addMappingItem(MappingUsersLookupMappingItem mappingItem) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<MappingUsersLookupMappingItem>();
    }
    this.mapping.add(mappingItem);
    return this;
  }

   /**
   * Lookup a user access token.
   * @return mapping
  **/
  @ApiModelProperty(value = "Lookup a user access token.")
  public List<MappingUsersLookupMappingItem> getMapping() {
    return mapping;
  }

  public void setMapping(List<MappingUsersLookupMappingItem> mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingUsersLookup mappingUsersLookup = (MappingUsersLookup) o;
    return Objects.equals(this.mapping, mappingUsersLookup.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingUsersLookup {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
