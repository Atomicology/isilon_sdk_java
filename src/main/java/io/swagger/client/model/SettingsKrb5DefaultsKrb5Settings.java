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

/**
 * SettingsKrb5DefaultsKrb5Settings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SettingsKrb5DefaultsKrb5Settings {
  @SerializedName("allow_weak_crypto")
  private Boolean allowWeakCrypto = null;

  @SerializedName("always_send_preauth")
  private Boolean alwaysSendPreauth = null;

  @SerializedName("default_realm")
  private String defaultRealm = null;

  @SerializedName("dns_lookup_kdc")
  private Boolean dnsLookupKdc = null;

  @SerializedName("dns_lookup_realm")
  private Boolean dnsLookupRealm = null;

  public SettingsKrb5DefaultsKrb5Settings allowWeakCrypto(Boolean allowWeakCrypto) {
    this.allowWeakCrypto = allowWeakCrypto;
    return this;
  }

   /**
   * If true, allow the use of DES encryption
   * @return allowWeakCrypto
  **/
  @ApiModelProperty(value = "If true, allow the use of DES encryption")
  public Boolean isAllowWeakCrypto() {
    return allowWeakCrypto;
  }

  public void setAllowWeakCrypto(Boolean allowWeakCrypto) {
    this.allowWeakCrypto = allowWeakCrypto;
  }

  public SettingsKrb5DefaultsKrb5Settings alwaysSendPreauth(Boolean alwaysSendPreauth) {
    this.alwaysSendPreauth = alwaysSendPreauth;
    return this;
  }

   /**
   * If true, always attempts to preauthenticate to the domain controller.
   * @return alwaysSendPreauth
  **/
  @ApiModelProperty(value = "If true, always attempts to preauthenticate to the domain controller.")
  public Boolean isAlwaysSendPreauth() {
    return alwaysSendPreauth;
  }

  public void setAlwaysSendPreauth(Boolean alwaysSendPreauth) {
    this.alwaysSendPreauth = alwaysSendPreauth;
  }

  public SettingsKrb5DefaultsKrb5Settings defaultRealm(String defaultRealm) {
    this.defaultRealm = defaultRealm;
    return this;
  }

   /**
   * Specifies the realm for unqualified names.
   * @return defaultRealm
  **/
  @ApiModelProperty(value = "Specifies the realm for unqualified names.")
  public String getDefaultRealm() {
    return defaultRealm;
  }

  public void setDefaultRealm(String defaultRealm) {
    this.defaultRealm = defaultRealm;
  }

  public SettingsKrb5DefaultsKrb5Settings dnsLookupKdc(Boolean dnsLookupKdc) {
    this.dnsLookupKdc = dnsLookupKdc;
    return this;
  }

   /**
   * If true, find KDCs through the DNS.
   * @return dnsLookupKdc
  **/
  @ApiModelProperty(value = "If true, find KDCs through the DNS.")
  public Boolean isDnsLookupKdc() {
    return dnsLookupKdc;
  }

  public void setDnsLookupKdc(Boolean dnsLookupKdc) {
    this.dnsLookupKdc = dnsLookupKdc;
  }

  public SettingsKrb5DefaultsKrb5Settings dnsLookupRealm(Boolean dnsLookupRealm) {
    this.dnsLookupRealm = dnsLookupRealm;
    return this;
  }

   /**
   * If true, find realm names through the DNS.
   * @return dnsLookupRealm
  **/
  @ApiModelProperty(value = "If true, find realm names through the DNS.")
  public Boolean isDnsLookupRealm() {
    return dnsLookupRealm;
  }

  public void setDnsLookupRealm(Boolean dnsLookupRealm) {
    this.dnsLookupRealm = dnsLookupRealm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsKrb5DefaultsKrb5Settings settingsKrb5DefaultsKrb5Settings = (SettingsKrb5DefaultsKrb5Settings) o;
    return Objects.equals(this.allowWeakCrypto, settingsKrb5DefaultsKrb5Settings.allowWeakCrypto) &&
        Objects.equals(this.alwaysSendPreauth, settingsKrb5DefaultsKrb5Settings.alwaysSendPreauth) &&
        Objects.equals(this.defaultRealm, settingsKrb5DefaultsKrb5Settings.defaultRealm) &&
        Objects.equals(this.dnsLookupKdc, settingsKrb5DefaultsKrb5Settings.dnsLookupKdc) &&
        Objects.equals(this.dnsLookupRealm, settingsKrb5DefaultsKrb5Settings.dnsLookupRealm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowWeakCrypto, alwaysSendPreauth, defaultRealm, dnsLookupKdc, dnsLookupRealm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsKrb5DefaultsKrb5Settings {\n");
    
    sb.append("    allowWeakCrypto: ").append(toIndentedString(allowWeakCrypto)).append("\n");
    sb.append("    alwaysSendPreauth: ").append(toIndentedString(alwaysSendPreauth)).append("\n");
    sb.append("    defaultRealm: ").append(toIndentedString(defaultRealm)).append("\n");
    sb.append("    dnsLookupKdc: ").append(toIndentedString(dnsLookupKdc)).append("\n");
    sb.append("    dnsLookupRealm: ").append(toIndentedString(dnsLookupRealm)).append("\n");
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

