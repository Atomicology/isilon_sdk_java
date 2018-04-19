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
 * GroupnetSubnet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class GroupnetSubnet {
  @SerializedName("description")
  private String description = null;

  @SerializedName("dsr_addrs")
  private List<String> dsrAddrs = null;

  @SerializedName("gateway")
  private String gateway = null;

  @SerializedName("gateway_priority")
  private Integer gatewayPriority = null;

  @SerializedName("mtu")
  private Integer mtu = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prefixlen")
  private Integer prefixlen = null;

  @SerializedName("sc_service_addr")
  private String scServiceAddr = null;

  @SerializedName("sc_service_name")
  private String scServiceName = null;

  @SerializedName("vlan_enabled")
  private Boolean vlanEnabled = null;

  @SerializedName("vlan_id")
  private Integer vlanId = null;

  public GroupnetSubnet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the subnet.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the subnet.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GroupnetSubnet dsrAddrs(List<String> dsrAddrs) {
    this.dsrAddrs = dsrAddrs;
    return this;
  }

  public GroupnetSubnet addDsrAddrsItem(String dsrAddrsItem) {
    if (this.dsrAddrs == null) {
      this.dsrAddrs = new ArrayList<String>();
    }
    this.dsrAddrs.add(dsrAddrsItem);
    return this;
  }

   /**
   * List of Direct Server Return addresses.
   * @return dsrAddrs
  **/
  @ApiModelProperty(value = "List of Direct Server Return addresses.")
  public List<String> getDsrAddrs() {
    return dsrAddrs;
  }

  public void setDsrAddrs(List<String> dsrAddrs) {
    this.dsrAddrs = dsrAddrs;
  }

  public GroupnetSubnet gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Gateway IP address.
   * @return gateway
  **/
  @ApiModelProperty(value = "Gateway IP address.")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public GroupnetSubnet gatewayPriority(Integer gatewayPriority) {
    this.gatewayPriority = gatewayPriority;
    return this;
  }

   /**
   * Gateway priority.
   * minimum: 1
   * maximum: 2147483647
   * @return gatewayPriority
  **/
  @ApiModelProperty(value = "Gateway priority.")
  public Integer getGatewayPriority() {
    return gatewayPriority;
  }

  public void setGatewayPriority(Integer gatewayPriority) {
    this.gatewayPriority = gatewayPriority;
  }

  public GroupnetSubnet mtu(Integer mtu) {
    this.mtu = mtu;
    return this;
  }

   /**
   * MTU of the subnet.
   * minimum: 576
   * maximum: 9000
   * @return mtu
  **/
  @ApiModelProperty(value = "MTU of the subnet.")
  public Integer getMtu() {
    return mtu;
  }

  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }

  public GroupnetSubnet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the subnet.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the subnet.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupnetSubnet prefixlen(Integer prefixlen) {
    this.prefixlen = prefixlen;
    return this;
  }

   /**
   * Subnet Prefix Length.
   * minimum: 1
   * maximum: 128
   * @return prefixlen
  **/
  @ApiModelProperty(value = "Subnet Prefix Length.")
  public Integer getPrefixlen() {
    return prefixlen;
  }

  public void setPrefixlen(Integer prefixlen) {
    this.prefixlen = prefixlen;
  }

  public GroupnetSubnet scServiceAddr(String scServiceAddr) {
    this.scServiceAddr = scServiceAddr;
    return this;
  }

   /**
   * The address that SmartConnect listens for DNS requests.
   * @return scServiceAddr
  **/
  @ApiModelProperty(value = "The address that SmartConnect listens for DNS requests.")
  public String getScServiceAddr() {
    return scServiceAddr;
  }

  public void setScServiceAddr(String scServiceAddr) {
    this.scServiceAddr = scServiceAddr;
  }

  public GroupnetSubnet scServiceName(String scServiceName) {
    this.scServiceName = scServiceName;
    return this;
  }

   /**
   * Domain Name corresponding to the SmartConnect Service Address.
   * @return scServiceName
  **/
  @ApiModelProperty(value = "Domain Name corresponding to the SmartConnect Service Address.")
  public String getScServiceName() {
    return scServiceName;
  }

  public void setScServiceName(String scServiceName) {
    this.scServiceName = scServiceName;
  }

  public GroupnetSubnet vlanEnabled(Boolean vlanEnabled) {
    this.vlanEnabled = vlanEnabled;
    return this;
  }

   /**
   * VLAN tagging enabled or disabled.
   * @return vlanEnabled
  **/
  @ApiModelProperty(value = "VLAN tagging enabled or disabled.")
  public Boolean isVlanEnabled() {
    return vlanEnabled;
  }

  public void setVlanEnabled(Boolean vlanEnabled) {
    this.vlanEnabled = vlanEnabled;
  }

  public GroupnetSubnet vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * VLAN ID for all interfaces in the subnet.
   * minimum: 2
   * maximum: 4094
   * @return vlanId
  **/
  @ApiModelProperty(value = "VLAN ID for all interfaces in the subnet.")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupnetSubnet groupnetSubnet = (GroupnetSubnet) o;
    return Objects.equals(this.description, groupnetSubnet.description) &&
        Objects.equals(this.dsrAddrs, groupnetSubnet.dsrAddrs) &&
        Objects.equals(this.gateway, groupnetSubnet.gateway) &&
        Objects.equals(this.gatewayPriority, groupnetSubnet.gatewayPriority) &&
        Objects.equals(this.mtu, groupnetSubnet.mtu) &&
        Objects.equals(this.name, groupnetSubnet.name) &&
        Objects.equals(this.prefixlen, groupnetSubnet.prefixlen) &&
        Objects.equals(this.scServiceAddr, groupnetSubnet.scServiceAddr) &&
        Objects.equals(this.scServiceName, groupnetSubnet.scServiceName) &&
        Objects.equals(this.vlanEnabled, groupnetSubnet.vlanEnabled) &&
        Objects.equals(this.vlanId, groupnetSubnet.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dsrAddrs, gateway, gatewayPriority, mtu, name, prefixlen, scServiceAddr, scServiceName, vlanEnabled, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupnetSubnet {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dsrAddrs: ").append(toIndentedString(dsrAddrs)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    gatewayPriority: ").append(toIndentedString(gatewayPriority)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefixlen: ").append(toIndentedString(prefixlen)).append("\n");
    sb.append("    scServiceAddr: ").append(toIndentedString(scServiceAddr)).append("\n");
    sb.append("    scServiceName: ").append(toIndentedString(scServiceName)).append("\n");
    sb.append("    vlanEnabled: ").append(toIndentedString(vlanEnabled)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

