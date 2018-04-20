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
import io.swagger.client.model.HdfsRack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HdfsRackCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class HdfsRackCreateParams {
  @SerializedName("client_ip_ranges")
  private List<String> clientIpRanges = null;

  @SerializedName("ip_pools")
  private List<String> ipPools = null;

  @SerializedName("name")
  private String name = null;

  public HdfsRackCreateParams clientIpRanges(List<String> clientIpRanges) {
    this.clientIpRanges = clientIpRanges;
    return this;
  }

  public HdfsRackCreateParams addClientIpRangesItem(String clientIpRangesItem) {
    if (this.clientIpRanges == null) {
      this.clientIpRanges = new ArrayList<String>();
    }
    this.clientIpRanges.add(clientIpRangesItem);
    return this;
  }

   /**
   * Array of IP ranges. Clients from one of these IP ranges are served by corresponding nodes from ip_pools array.
   * @return clientIpRanges
  **/
  @ApiModelProperty(value = "Array of IP ranges. Clients from one of these IP ranges are served by corresponding nodes from ip_pools array.")
  public List<String> getClientIpRanges() {
    return clientIpRanges;
  }

  public void setClientIpRanges(List<String> clientIpRanges) {
    this.clientIpRanges = clientIpRanges;
  }

  public HdfsRackCreateParams ipPools(List<String> ipPools) {
    this.ipPools = ipPools;
    return this;
  }

  public HdfsRackCreateParams addIpPoolsItem(String ipPoolsItem) {
    if (this.ipPools == null) {
      this.ipPools = new ArrayList<String>();
    }
    this.ipPools.add(ipPoolsItem);
    return this;
  }

   /**
   * Array of IP pool names to use for serving clients from client_ip_ranges.
   * @return ipPools
  **/
  @ApiModelProperty(value = "Array of IP pool names to use for serving clients from client_ip_ranges.")
  public List<String> getIpPools() {
    return ipPools;
  }

  public void setIpPools(List<String> ipPools) {
    this.ipPools = ipPools;
  }

  public HdfsRackCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the rack
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the rack")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdfsRackCreateParams hdfsRackCreateParams = (HdfsRackCreateParams) o;
    return Objects.equals(this.clientIpRanges, hdfsRackCreateParams.clientIpRanges) &&
        Objects.equals(this.ipPools, hdfsRackCreateParams.ipPools) &&
        Objects.equals(this.name, hdfsRackCreateParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIpRanges, ipPools, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdfsRackCreateParams {\n");
    
    sb.append("    clientIpRanges: ").append(toIndentedString(clientIpRanges)).append("\n");
    sb.append("    ipPools: ").append(toIndentedString(ipPools)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

