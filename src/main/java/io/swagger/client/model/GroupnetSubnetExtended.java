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
import io.swagger.client.model.GroupnetSubnet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupnetSubnetExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class GroupnetSubnetExtended {
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

  /**
   * IP address format.
   */
  @JsonAdapter(AddrFamilyEnum.Adapter.class)
  public enum AddrFamilyEnum {
    IPV4("ipv4"),
    
    IPV6("ipv6");

    private String value;

    AddrFamilyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddrFamilyEnum fromValue(String text) {
      for (AddrFamilyEnum b : AddrFamilyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AddrFamilyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddrFamilyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddrFamilyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddrFamilyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("addr_family")
  private AddrFamilyEnum addrFamily = null;

  @SerializedName("base_addr")
  private String baseAddr = null;

  @SerializedName("groupnet")
  private String groupnet = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("pools")
  private List<String> pools = null;

  public GroupnetSubnetExtended description(String description) {
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

  public GroupnetSubnetExtended dsrAddrs(List<String> dsrAddrs) {
    this.dsrAddrs = dsrAddrs;
    return this;
  }

  public GroupnetSubnetExtended addDsrAddrsItem(String dsrAddrsItem) {
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

  public GroupnetSubnetExtended gateway(String gateway) {
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

  public GroupnetSubnetExtended gatewayPriority(Integer gatewayPriority) {
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

  public GroupnetSubnetExtended mtu(Integer mtu) {
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

  public GroupnetSubnetExtended name(String name) {
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

  public GroupnetSubnetExtended prefixlen(Integer prefixlen) {
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

  public GroupnetSubnetExtended scServiceAddr(String scServiceAddr) {
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

  public GroupnetSubnetExtended scServiceName(String scServiceName) {
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

  public GroupnetSubnetExtended vlanEnabled(Boolean vlanEnabled) {
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

  public GroupnetSubnetExtended vlanId(Integer vlanId) {
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

  public GroupnetSubnetExtended addrFamily(AddrFamilyEnum addrFamily) {
    this.addrFamily = addrFamily;
    return this;
  }

   /**
   * IP address format.
   * @return addrFamily
  **/
  @ApiModelProperty(value = "IP address format.")
  public AddrFamilyEnum getAddrFamily() {
    return addrFamily;
  }

  public void setAddrFamily(AddrFamilyEnum addrFamily) {
    this.addrFamily = addrFamily;
  }

  public GroupnetSubnetExtended baseAddr(String baseAddr) {
    this.baseAddr = baseAddr;
    return this;
  }

   /**
   * The base IP address.
   * @return baseAddr
  **/
  @ApiModelProperty(value = "The base IP address.")
  public String getBaseAddr() {
    return baseAddr;
  }

  public void setBaseAddr(String baseAddr) {
    this.baseAddr = baseAddr;
  }

  public GroupnetSubnetExtended groupnet(String groupnet) {
    this.groupnet = groupnet;
    return this;
  }

   /**
   * Name of the groupnet this subnet belongs to.
   * @return groupnet
  **/
  @ApiModelProperty(value = "Name of the groupnet this subnet belongs to.")
  public String getGroupnet() {
    return groupnet;
  }

  public void setGroupnet(String groupnet) {
    this.groupnet = groupnet;
  }

  public GroupnetSubnetExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique Subnet ID.
   * @return id
  **/
  @ApiModelProperty(value = "Unique Subnet ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GroupnetSubnetExtended pools(List<String> pools) {
    this.pools = pools;
    return this;
  }

  public GroupnetSubnetExtended addPoolsItem(String poolsItem) {
    if (this.pools == null) {
      this.pools = new ArrayList<String>();
    }
    this.pools.add(poolsItem);
    return this;
  }

   /**
   * Name of the pools in the subnet.
   * @return pools
  **/
  @ApiModelProperty(value = "Name of the pools in the subnet.")
  public List<String> getPools() {
    return pools;
  }

  public void setPools(List<String> pools) {
    this.pools = pools;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupnetSubnetExtended groupnetSubnetExtended = (GroupnetSubnetExtended) o;
    return Objects.equals(this.description, groupnetSubnetExtended.description) &&
        Objects.equals(this.dsrAddrs, groupnetSubnetExtended.dsrAddrs) &&
        Objects.equals(this.gateway, groupnetSubnetExtended.gateway) &&
        Objects.equals(this.gatewayPriority, groupnetSubnetExtended.gatewayPriority) &&
        Objects.equals(this.mtu, groupnetSubnetExtended.mtu) &&
        Objects.equals(this.name, groupnetSubnetExtended.name) &&
        Objects.equals(this.prefixlen, groupnetSubnetExtended.prefixlen) &&
        Objects.equals(this.scServiceAddr, groupnetSubnetExtended.scServiceAddr) &&
        Objects.equals(this.scServiceName, groupnetSubnetExtended.scServiceName) &&
        Objects.equals(this.vlanEnabled, groupnetSubnetExtended.vlanEnabled) &&
        Objects.equals(this.vlanId, groupnetSubnetExtended.vlanId) &&
        Objects.equals(this.addrFamily, groupnetSubnetExtended.addrFamily) &&
        Objects.equals(this.baseAddr, groupnetSubnetExtended.baseAddr) &&
        Objects.equals(this.groupnet, groupnetSubnetExtended.groupnet) &&
        Objects.equals(this.id, groupnetSubnetExtended.id) &&
        Objects.equals(this.pools, groupnetSubnetExtended.pools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dsrAddrs, gateway, gatewayPriority, mtu, name, prefixlen, scServiceAddr, scServiceName, vlanEnabled, vlanId, addrFamily, baseAddr, groupnet, id, pools);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupnetSubnetExtended {\n");
    
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
    sb.append("    addrFamily: ").append(toIndentedString(addrFamily)).append("\n");
    sb.append("    baseAddr: ").append(toIndentedString(baseAddr)).append("\n");
    sb.append("    groupnet: ").append(toIndentedString(groupnet)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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

