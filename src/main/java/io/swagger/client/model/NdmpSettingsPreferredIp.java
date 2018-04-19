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
 * NdmpSettingsPreferredIp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NdmpSettingsPreferredIp {
  @SerializedName("data_subnets")
  private List<NdmpSettingsPreferredIpDataSubnet> dataSubnets = new ArrayList<NdmpSettingsPreferredIpDataSubnet>();

  public NdmpSettingsPreferredIp dataSubnets(List<NdmpSettingsPreferredIpDataSubnet> dataSubnets) {
    this.dataSubnets = dataSubnets;
    return this;
  }

  public NdmpSettingsPreferredIp addDataSubnetsItem(NdmpSettingsPreferredIpDataSubnet dataSubnetsItem) {
    this.dataSubnets.add(dataSubnetsItem);
    return this;
  }

   /**
   * Get dataSubnets
   * @return dataSubnets
  **/
  @ApiModelProperty(required = true, value = "")
  public List<NdmpSettingsPreferredIpDataSubnet> getDataSubnets() {
    return dataSubnets;
  }

  public void setDataSubnets(List<NdmpSettingsPreferredIpDataSubnet> dataSubnets) {
    this.dataSubnets = dataSubnets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSettingsPreferredIp ndmpSettingsPreferredIp = (NdmpSettingsPreferredIp) o;
    return Objects.equals(this.dataSubnets, ndmpSettingsPreferredIp.dataSubnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSubnets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSettingsPreferredIp {\n");
    
    sb.append("    dataSubnets: ").append(toIndentedString(dataSubnets)).append("\n");
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

