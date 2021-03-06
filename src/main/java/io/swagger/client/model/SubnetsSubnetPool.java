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
import io.swagger.client.model.SubnetsSubnetPoolIface;
import io.swagger.client.model.SubnetsSubnetPoolRange;
import io.swagger.client.model.SubnetsSubnetPoolStaticRoute;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubnetsSubnetPool
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SubnetsSubnetPool {
  @SerializedName("access_zone")
  private String accessZone = null;

  @SerializedName("aggregation_mode")
  private String aggregationMode = null;

  @SerializedName("alloc_method")
  private String allocMethod = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("ifaces")
  private List<SubnetsSubnetPoolIface> ifaces = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ranges")
  private List<SubnetsSubnetPoolRange> ranges = null;

  @SerializedName("rebalance_policy")
  private String rebalancePolicy = null;

  @SerializedName("sc_auto_unsuspend_delay")
  private Integer scAutoUnsuspendDelay = null;

  @SerializedName("sc_connect_policy")
  private String scConnectPolicy = null;

  @SerializedName("sc_dns_zone")
  private String scDnsZone = null;

  @SerializedName("sc_dns_zone_aliases")
  private List<String> scDnsZoneAliases = null;

  @SerializedName("sc_failover_policy")
  private String scFailoverPolicy = null;

  @SerializedName("sc_subnet")
  private String scSubnet = null;

  @SerializedName("sc_ttl")
  private Integer scTtl = null;

  @SerializedName("static_routes")
  private List<SubnetsSubnetPoolStaticRoute> staticRoutes = null;

  public SubnetsSubnetPool accessZone(String accessZone) {
    this.accessZone = accessZone;
    return this;
  }

   /**
   * Name of a valid access zone to map IP address pool to the zone.
   * @return accessZone
  **/
  @ApiModelProperty(value = "Name of a valid access zone to map IP address pool to the zone.")
  public String getAccessZone() {
    return accessZone;
  }

  public void setAccessZone(String accessZone) {
    this.accessZone = accessZone;
  }

  public SubnetsSubnetPool aggregationMode(String aggregationMode) {
    this.aggregationMode = aggregationMode;
    return this;
  }

   /**
   * OneFS supports the following NIC aggregation modes.
   * @return aggregationMode
  **/
  @ApiModelProperty(value = "OneFS supports the following NIC aggregation modes.")
  public String getAggregationMode() {
    return aggregationMode;
  }

  public void setAggregationMode(String aggregationMode) {
    this.aggregationMode = aggregationMode;
  }

  public SubnetsSubnetPool allocMethod(String allocMethod) {
    this.allocMethod = allocMethod;
    return this;
  }

   /**
   * Specifies how IP address allocation is done among pool members.
   * @return allocMethod
  **/
  @ApiModelProperty(value = "Specifies how IP address allocation is done among pool members.")
  public String getAllocMethod() {
    return allocMethod;
  }

  public void setAllocMethod(String allocMethod) {
    this.allocMethod = allocMethod;
  }

  public SubnetsSubnetPool description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the pool.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the pool.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SubnetsSubnetPool ifaces(List<SubnetsSubnetPoolIface> ifaces) {
    this.ifaces = ifaces;
    return this;
  }

  public SubnetsSubnetPool addIfacesItem(SubnetsSubnetPoolIface ifacesItem) {
    if (this.ifaces == null) {
      this.ifaces = new ArrayList<SubnetsSubnetPoolIface>();
    }
    this.ifaces.add(ifacesItem);
    return this;
  }

   /**
   * List of interface members in this pool.
   * @return ifaces
  **/
  @ApiModelProperty(value = "List of interface members in this pool.")
  public List<SubnetsSubnetPoolIface> getIfaces() {
    return ifaces;
  }

  public void setIfaces(List<SubnetsSubnetPoolIface> ifaces) {
    this.ifaces = ifaces;
  }

  public SubnetsSubnetPool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the pool. It must be unique throughout the given subnet.It&#39;s a required field with POST method.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the pool. It must be unique throughout the given subnet.It's a required field with POST method.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubnetsSubnetPool ranges(List<SubnetsSubnetPoolRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public SubnetsSubnetPool addRangesItem(SubnetsSubnetPoolRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<SubnetsSubnetPoolRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * List of IP address ranges in this pool.
   * @return ranges
  **/
  @ApiModelProperty(value = "List of IP address ranges in this pool.")
  public List<SubnetsSubnetPoolRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<SubnetsSubnetPoolRange> ranges) {
    this.ranges = ranges;
  }

  public SubnetsSubnetPool rebalancePolicy(String rebalancePolicy) {
    this.rebalancePolicy = rebalancePolicy;
    return this;
  }

   /**
   * Rebalance policy..
   * @return rebalancePolicy
  **/
  @ApiModelProperty(value = "Rebalance policy..")
  public String getRebalancePolicy() {
    return rebalancePolicy;
  }

  public void setRebalancePolicy(String rebalancePolicy) {
    this.rebalancePolicy = rebalancePolicy;
  }

  public SubnetsSubnetPool scAutoUnsuspendDelay(Integer scAutoUnsuspendDelay) {
    this.scAutoUnsuspendDelay = scAutoUnsuspendDelay;
    return this;
  }

   /**
   * Time delay in seconds before a node which has been                 automatically unsuspended becomes usable in SmartConnect                responses for pool zones.
   * minimum: 0
   * maximum: 86400
   * @return scAutoUnsuspendDelay
  **/
  @ApiModelProperty(value = "Time delay in seconds before a node which has been                 automatically unsuspended becomes usable in SmartConnect                responses for pool zones.")
  public Integer getScAutoUnsuspendDelay() {
    return scAutoUnsuspendDelay;
  }

  public void setScAutoUnsuspendDelay(Integer scAutoUnsuspendDelay) {
    this.scAutoUnsuspendDelay = scAutoUnsuspendDelay;
  }

  public SubnetsSubnetPool scConnectPolicy(String scConnectPolicy) {
    this.scConnectPolicy = scConnectPolicy;
    return this;
  }

   /**
   * SmartConnect client connection balancing policy.
   * @return scConnectPolicy
  **/
  @ApiModelProperty(value = "SmartConnect client connection balancing policy.")
  public String getScConnectPolicy() {
    return scConnectPolicy;
  }

  public void setScConnectPolicy(String scConnectPolicy) {
    this.scConnectPolicy = scConnectPolicy;
  }

  public SubnetsSubnetPool scDnsZone(String scDnsZone) {
    this.scDnsZone = scDnsZone;
    return this;
  }

   /**
   * SmartConnect zone name for the pool.
   * @return scDnsZone
  **/
  @ApiModelProperty(value = "SmartConnect zone name for the pool.")
  public String getScDnsZone() {
    return scDnsZone;
  }

  public void setScDnsZone(String scDnsZone) {
    this.scDnsZone = scDnsZone;
  }

  public SubnetsSubnetPool scDnsZoneAliases(List<String> scDnsZoneAliases) {
    this.scDnsZoneAliases = scDnsZoneAliases;
    return this;
  }

  public SubnetsSubnetPool addScDnsZoneAliasesItem(String scDnsZoneAliasesItem) {
    if (this.scDnsZoneAliases == null) {
      this.scDnsZoneAliases = new ArrayList<String>();
    }
    this.scDnsZoneAliases.add(scDnsZoneAliasesItem);
    return this;
  }

   /**
   * List of SmartConnect zone aliases (DNS names) to the pool.
   * @return scDnsZoneAliases
  **/
  @ApiModelProperty(value = "List of SmartConnect zone aliases (DNS names) to the pool.")
  public List<String> getScDnsZoneAliases() {
    return scDnsZoneAliases;
  }

  public void setScDnsZoneAliases(List<String> scDnsZoneAliases) {
    this.scDnsZoneAliases = scDnsZoneAliases;
  }

  public SubnetsSubnetPool scFailoverPolicy(String scFailoverPolicy) {
    this.scFailoverPolicy = scFailoverPolicy;
    return this;
  }

   /**
   * SmartConnect IP failover policy.
   * @return scFailoverPolicy
  **/
  @ApiModelProperty(value = "SmartConnect IP failover policy.")
  public String getScFailoverPolicy() {
    return scFailoverPolicy;
  }

  public void setScFailoverPolicy(String scFailoverPolicy) {
    this.scFailoverPolicy = scFailoverPolicy;
  }

  public SubnetsSubnetPool scSubnet(String scSubnet) {
    this.scSubnet = scSubnet;
    return this;
  }

   /**
   * Name of SmartConnect service subnet for this pool.
   * @return scSubnet
  **/
  @ApiModelProperty(value = "Name of SmartConnect service subnet for this pool.")
  public String getScSubnet() {
    return scSubnet;
  }

  public void setScSubnet(String scSubnet) {
    this.scSubnet = scSubnet;
  }

  public SubnetsSubnetPool scTtl(Integer scTtl) {
    this.scTtl = scTtl;
    return this;
  }

   /**
   * Time to live value for SmartConnect DNS query responses in seconds.
   * minimum: 0
   * maximum: 2147483647
   * @return scTtl
  **/
  @ApiModelProperty(value = "Time to live value for SmartConnect DNS query responses in seconds.")
  public Integer getScTtl() {
    return scTtl;
  }

  public void setScTtl(Integer scTtl) {
    this.scTtl = scTtl;
  }

  public SubnetsSubnetPool staticRoutes(List<SubnetsSubnetPoolStaticRoute> staticRoutes) {
    this.staticRoutes = staticRoutes;
    return this;
  }

  public SubnetsSubnetPool addStaticRoutesItem(SubnetsSubnetPoolStaticRoute staticRoutesItem) {
    if (this.staticRoutes == null) {
      this.staticRoutes = new ArrayList<SubnetsSubnetPoolStaticRoute>();
    }
    this.staticRoutes.add(staticRoutesItem);
    return this;
  }

   /**
   * List of interface members in this pool.
   * @return staticRoutes
  **/
  @ApiModelProperty(value = "List of interface members in this pool.")
  public List<SubnetsSubnetPoolStaticRoute> getStaticRoutes() {
    return staticRoutes;
  }

  public void setStaticRoutes(List<SubnetsSubnetPoolStaticRoute> staticRoutes) {
    this.staticRoutes = staticRoutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetsSubnetPool subnetsSubnetPool = (SubnetsSubnetPool) o;
    return Objects.equals(this.accessZone, subnetsSubnetPool.accessZone) &&
        Objects.equals(this.aggregationMode, subnetsSubnetPool.aggregationMode) &&
        Objects.equals(this.allocMethod, subnetsSubnetPool.allocMethod) &&
        Objects.equals(this.description, subnetsSubnetPool.description) &&
        Objects.equals(this.ifaces, subnetsSubnetPool.ifaces) &&
        Objects.equals(this.name, subnetsSubnetPool.name) &&
        Objects.equals(this.ranges, subnetsSubnetPool.ranges) &&
        Objects.equals(this.rebalancePolicy, subnetsSubnetPool.rebalancePolicy) &&
        Objects.equals(this.scAutoUnsuspendDelay, subnetsSubnetPool.scAutoUnsuspendDelay) &&
        Objects.equals(this.scConnectPolicy, subnetsSubnetPool.scConnectPolicy) &&
        Objects.equals(this.scDnsZone, subnetsSubnetPool.scDnsZone) &&
        Objects.equals(this.scDnsZoneAliases, subnetsSubnetPool.scDnsZoneAliases) &&
        Objects.equals(this.scFailoverPolicy, subnetsSubnetPool.scFailoverPolicy) &&
        Objects.equals(this.scSubnet, subnetsSubnetPool.scSubnet) &&
        Objects.equals(this.scTtl, subnetsSubnetPool.scTtl) &&
        Objects.equals(this.staticRoutes, subnetsSubnetPool.staticRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessZone, aggregationMode, allocMethod, description, ifaces, name, ranges, rebalancePolicy, scAutoUnsuspendDelay, scConnectPolicy, scDnsZone, scDnsZoneAliases, scFailoverPolicy, scSubnet, scTtl, staticRoutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetsSubnetPool {\n");
    
    sb.append("    accessZone: ").append(toIndentedString(accessZone)).append("\n");
    sb.append("    aggregationMode: ").append(toIndentedString(aggregationMode)).append("\n");
    sb.append("    allocMethod: ").append(toIndentedString(allocMethod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ifaces: ").append(toIndentedString(ifaces)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rebalancePolicy: ").append(toIndentedString(rebalancePolicy)).append("\n");
    sb.append("    scAutoUnsuspendDelay: ").append(toIndentedString(scAutoUnsuspendDelay)).append("\n");
    sb.append("    scConnectPolicy: ").append(toIndentedString(scConnectPolicy)).append("\n");
    sb.append("    scDnsZone: ").append(toIndentedString(scDnsZone)).append("\n");
    sb.append("    scDnsZoneAliases: ").append(toIndentedString(scDnsZoneAliases)).append("\n");
    sb.append("    scFailoverPolicy: ").append(toIndentedString(scFailoverPolicy)).append("\n");
    sb.append("    scSubnet: ").append(toIndentedString(scSubnet)).append("\n");
    sb.append("    scTtl: ").append(toIndentedString(scTtl)).append("\n");
    sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
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

