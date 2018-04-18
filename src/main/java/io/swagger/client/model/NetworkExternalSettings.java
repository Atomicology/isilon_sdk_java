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
 * NetworkExternalSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NetworkExternalSettings {
  @SerializedName("default_groupnet")
  private String defaultGroupnet = null;

  @SerializedName("sbr")
  private Boolean sbr = null;

  @SerializedName("sc_rebalance_delay")
  private Integer scRebalanceDelay = null;

  @SerializedName("tcp_ports")
  private List<Integer> tcpPorts = new ArrayList<Integer>();

  public NetworkExternalSettings defaultGroupnet(String defaultGroupnet) {
    this.defaultGroupnet = defaultGroupnet;
    return this;
  }

   /**
   * Default client-side DNS settings for non-multitenancy aware programs
   * @return defaultGroupnet
  **/
  @ApiModelProperty(required = true, value = "Default client-side DNS settings for non-multitenancy aware programs")
  public String getDefaultGroupnet() {
    return defaultGroupnet;
  }

  public void setDefaultGroupnet(String defaultGroupnet) {
    this.defaultGroupnet = defaultGroupnet;
  }

  public NetworkExternalSettings sbr(Boolean sbr) {
    this.sbr = sbr;
    return this;
  }

   /**
   * Enable or disable Source Based Routing (Defaults to false)
   * @return sbr
  **/
  @ApiModelProperty(required = true, value = "Enable or disable Source Based Routing (Defaults to false)")
  public Boolean isSbr() {
    return sbr;
  }

  public void setSbr(Boolean sbr) {
    this.sbr = sbr;
  }

  public NetworkExternalSettings scRebalanceDelay(Integer scRebalanceDelay) {
    this.scRebalanceDelay = scRebalanceDelay;
    return this;
  }

   /**
   * Delay in seconds for IP rebalance.
   * minimum: 0
   * maximum: 10
   * @return scRebalanceDelay
  **/
  @ApiModelProperty(required = true, value = "Delay in seconds for IP rebalance.")
  public Integer getScRebalanceDelay() {
    return scRebalanceDelay;
  }

  public void setScRebalanceDelay(Integer scRebalanceDelay) {
    this.scRebalanceDelay = scRebalanceDelay;
  }

  public NetworkExternalSettings tcpPorts(List<Integer> tcpPorts) {
    this.tcpPorts = tcpPorts;
    return this;
  }

  public NetworkExternalSettings addTcpPortsItem(Integer tcpPortsItem) {
    this.tcpPorts.add(tcpPortsItem);
    return this;
  }

   /**
   * List of client TCP ports.
   * @return tcpPorts
  **/
  @ApiModelProperty(required = true, value = "List of client TCP ports.")
  public List<Integer> getTcpPorts() {
    return tcpPorts;
  }

  public void setTcpPorts(List<Integer> tcpPorts) {
    this.tcpPorts = tcpPorts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkExternalSettings networkExternalSettings = (NetworkExternalSettings) o;
    return Objects.equals(this.defaultGroupnet, networkExternalSettings.defaultGroupnet) &&
        Objects.equals(this.sbr, networkExternalSettings.sbr) &&
        Objects.equals(this.scRebalanceDelay, networkExternalSettings.scRebalanceDelay) &&
        Objects.equals(this.tcpPorts, networkExternalSettings.tcpPorts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultGroupnet, sbr, scRebalanceDelay, tcpPorts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkExternalSettings {\n");
    
    sb.append("    defaultGroupnet: ").append(toIndentedString(defaultGroupnet)).append("\n");
    sb.append("    sbr: ").append(toIndentedString(sbr)).append("\n");
    sb.append("    scRebalanceDelay: ").append(toIndentedString(scRebalanceDelay)).append("\n");
    sb.append("    tcpPorts: ").append(toIndentedString(tcpPorts)).append("\n");
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

