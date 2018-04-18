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
import io.swagger.client.model.MappingIdentity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MappingIdentities
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class MappingIdentities {
  @SerializedName("identities")
  private List<MappingIdentity> identities = null;

  public MappingIdentities identities(List<MappingIdentity> identities) {
    this.identities = identities;
    return this;
  }

  public MappingIdentities addIdentitiesItem(MappingIdentity identitiesItem) {
    if (this.identities == null) {
      this.identities = new ArrayList<MappingIdentity>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * Get identities
   * @return identities
  **/
  @ApiModelProperty(value = "")
  public List<MappingIdentity> getIdentities() {
    return identities;
  }

  public void setIdentities(List<MappingIdentity> identities) {
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
    MappingIdentities mappingIdentities = (MappingIdentities) o;
    return Objects.equals(this.identities, mappingIdentities.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingIdentities {\n");
    
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
