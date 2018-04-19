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
 * RemotesupportConnectemcConnectemc
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class RemotesupportConnectemcConnectemc {
  @SerializedName("email_customer_on_failure")
  private Boolean emailCustomerOnFailure = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("gateway_access_pools")
  private List<String> gatewayAccessPools = null;

  @SerializedName("primary_esrs_gateway")
  private String primaryEsrsGateway = null;

  @SerializedName("secondary_esrs_gateway")
  private String secondaryEsrsGateway = null;

  @SerializedName("use_smtp_failover")
  private Boolean useSmtpFailover = null;

  public RemotesupportConnectemcConnectemc emailCustomerOnFailure(Boolean emailCustomerOnFailure) {
    this.emailCustomerOnFailure = emailCustomerOnFailure;
    return this;
  }

   /**
   * Email the customer if all transmission methods fail.
   * @return emailCustomerOnFailure
  **/
  @ApiModelProperty(value = "Email the customer if all transmission methods fail.")
  public Boolean isEmailCustomerOnFailure() {
    return emailCustomerOnFailure;
  }

  public void setEmailCustomerOnFailure(Boolean emailCustomerOnFailure) {
    this.emailCustomerOnFailure = emailCustomerOnFailure;
  }

  public RemotesupportConnectemcConnectemc enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable ConnectEMC.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable ConnectEMC.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RemotesupportConnectemcConnectemc gatewayAccessPools(List<String> gatewayAccessPools) {
    this.gatewayAccessPools = gatewayAccessPools;
    return this;
  }

  public RemotesupportConnectemcConnectemc addGatewayAccessPoolsItem(String gatewayAccessPoolsItem) {
    if (this.gatewayAccessPools == null) {
      this.gatewayAccessPools = new ArrayList<String>();
    }
    this.gatewayAccessPools.add(gatewayAccessPoolsItem);
    return this;
  }

   /**
   * List of network pools that are able to connect to the ESRS gateway.  Necessary to enable ConnectEMC.
   * @return gatewayAccessPools
  **/
  @ApiModelProperty(value = "List of network pools that are able to connect to the ESRS gateway.  Necessary to enable ConnectEMC.")
  public List<String> getGatewayAccessPools() {
    return gatewayAccessPools;
  }

  public void setGatewayAccessPools(List<String> gatewayAccessPools) {
    this.gatewayAccessPools = gatewayAccessPools;
  }

  public RemotesupportConnectemcConnectemc primaryEsrsGateway(String primaryEsrsGateway) {
    this.primaryEsrsGateway = primaryEsrsGateway;
    return this;
  }

   /**
   * Primary ESRS Gateway. Necessary to enable ConnectEMC.
   * @return primaryEsrsGateway
  **/
  @ApiModelProperty(value = "Primary ESRS Gateway. Necessary to enable ConnectEMC.")
  public String getPrimaryEsrsGateway() {
    return primaryEsrsGateway;
  }

  public void setPrimaryEsrsGateway(String primaryEsrsGateway) {
    this.primaryEsrsGateway = primaryEsrsGateway;
  }

  public RemotesupportConnectemcConnectemc secondaryEsrsGateway(String secondaryEsrsGateway) {
    this.secondaryEsrsGateway = secondaryEsrsGateway;
    return this;
  }

   /**
   * Secondary ESRS Gateway. Used if Primary is unavailable.
   * @return secondaryEsrsGateway
  **/
  @ApiModelProperty(value = "Secondary ESRS Gateway. Used if Primary is unavailable.")
  public String getSecondaryEsrsGateway() {
    return secondaryEsrsGateway;
  }

  public void setSecondaryEsrsGateway(String secondaryEsrsGateway) {
    this.secondaryEsrsGateway = secondaryEsrsGateway;
  }

  public RemotesupportConnectemcConnectemc useSmtpFailover(Boolean useSmtpFailover) {
    this.useSmtpFailover = useSmtpFailover;
    return this;
  }

   /**
   * Use SMPT if primary and secondary gateways are unavailable.
   * @return useSmtpFailover
  **/
  @ApiModelProperty(value = "Use SMPT if primary and secondary gateways are unavailable.")
  public Boolean isUseSmtpFailover() {
    return useSmtpFailover;
  }

  public void setUseSmtpFailover(Boolean useSmtpFailover) {
    this.useSmtpFailover = useSmtpFailover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemotesupportConnectemcConnectemc remotesupportConnectemcConnectemc = (RemotesupportConnectemcConnectemc) o;
    return Objects.equals(this.emailCustomerOnFailure, remotesupportConnectemcConnectemc.emailCustomerOnFailure) &&
        Objects.equals(this.enabled, remotesupportConnectemcConnectemc.enabled) &&
        Objects.equals(this.gatewayAccessPools, remotesupportConnectemcConnectemc.gatewayAccessPools) &&
        Objects.equals(this.primaryEsrsGateway, remotesupportConnectemcConnectemc.primaryEsrsGateway) &&
        Objects.equals(this.secondaryEsrsGateway, remotesupportConnectemcConnectemc.secondaryEsrsGateway) &&
        Objects.equals(this.useSmtpFailover, remotesupportConnectemcConnectemc.useSmtpFailover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailCustomerOnFailure, enabled, gatewayAccessPools, primaryEsrsGateway, secondaryEsrsGateway, useSmtpFailover);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemotesupportConnectemcConnectemc {\n");
    
    sb.append("    emailCustomerOnFailure: ").append(toIndentedString(emailCustomerOnFailure)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    gatewayAccessPools: ").append(toIndentedString(gatewayAccessPools)).append("\n");
    sb.append("    primaryEsrsGateway: ").append(toIndentedString(primaryEsrsGateway)).append("\n");
    sb.append("    secondaryEsrsGateway: ").append(toIndentedString(secondaryEsrsGateway)).append("\n");
    sb.append("    useSmtpFailover: ").append(toIndentedString(useSmtpFailover)).append("\n");
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

