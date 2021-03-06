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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MappingImport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class MappingImport {
  @SerializedName("identities")
  private List<List<String>> identities = null;

  public MappingImport identities(List<List<String>> identities) {
    this.identities = identities;
    return this;
  }

  public MappingImport addIdentitiesItem(List<String> identitiesItem) {
    if (this.identities == null) {
      this.identities = new ArrayList<List<String>>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * Get identities
   * @return identities
  **/
  @ApiModelProperty(value = "")
  public List<List<String>> getIdentities() {
    return identities;
  }

  public void setIdentities(List<List<String>> identities) {
    this.identities = identities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingImport mappingImport = (MappingImport) o;
    return Objects.equals(this.identities, mappingImport.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingImport {\n");
    
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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

