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
import io.swagger.client.model.NdmpSettingsPreferredIpDataSubnet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NdmpSettingsPreferredIpsPreference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NdmpSettingsPreferredIpsPreference {
  @SerializedName("data_subnets")
  private List<NdmpSettingsPreferredIpDataSubnet> dataSubnets = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("scope")
  private String scope = null;

  public NdmpSettingsPreferredIpsPreference dataSubnets(List<NdmpSettingsPreferredIpDataSubnet> dataSubnets) {
    this.dataSubnets = dataSubnets;
    return this;
  }

  public NdmpSettingsPreferredIpsPreference addDataSubnetsItem(NdmpSettingsPreferredIpDataSubnet dataSubnetsItem) {
    if (this.dataSubnets == null) {
      this.dataSubnets = new ArrayList<NdmpSettingsPreferredIpDataSubnet>();
    }
    this.dataSubnets.add(dataSubnetsItem);
    return this;
  }

   /**
   * Get dataSubnets
   * @return dataSubnets
  **/
  @ApiModelProperty(value = "")
  public List<NdmpSettingsPreferredIpDataSubnet> getDataSubnets() {
    return dataSubnets;
  }

  public void setDataSubnets(List<NdmpSettingsPreferredIpDataSubnet> dataSubnets) {
    this.dataSubnets = dataSubnets;
  }

  public NdmpSettingsPreferredIpsPreference id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique display id, same as scope
   * @return id
  **/
  @ApiModelProperty(value = "The unique display id, same as scope")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NdmpSettingsPreferredIpsPreference scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Either cluster or a network subnet defined in OneFS.
   * @return scope
  **/
  @ApiModelProperty(value = "Either cluster or a network subnet defined in OneFS.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSettingsPreferredIpsPreference ndmpSettingsPreferredIpsPreference = (NdmpSettingsPreferredIpsPreference) o;
    return Objects.equals(this.dataSubnets, ndmpSettingsPreferredIpsPreference.dataSubnets) &&
        Objects.equals(this.id, ndmpSettingsPreferredIpsPreference.id) &&
        Objects.equals(this.scope, ndmpSettingsPreferredIpsPreference.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSubnets, id, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSettingsPreferredIpsPreference {\n");
    
    sb.append("    dataSubnets: ").append(toIndentedString(dataSubnets)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

