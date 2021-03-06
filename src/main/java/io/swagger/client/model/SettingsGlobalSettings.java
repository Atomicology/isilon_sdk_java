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
 * SettingsGlobalSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SettingsGlobalSettings {
  @SerializedName("audited_zones")
  private List<String> auditedZones = null;

  @SerializedName("cee_log_time")
  private String ceeLogTime = null;

  @SerializedName("cee_server_uris")
  private List<String> ceeServerUris = null;

  @SerializedName("config_auditing_enabled")
  private Boolean configAuditingEnabled = null;

  @SerializedName("config_syslog_enabled")
  private Boolean configSyslogEnabled = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("protocol_auditing_enabled")
  private Boolean protocolAuditingEnabled = null;

  @SerializedName("syslog_log_time")
  private String syslogLogTime = null;

  public SettingsGlobalSettings auditedZones(List<String> auditedZones) {
    this.auditedZones = auditedZones;
    return this;
  }

  public SettingsGlobalSettings addAuditedZonesItem(String auditedZonesItem) {
    if (this.auditedZones == null) {
      this.auditedZones = new ArrayList<String>();
    }
    this.auditedZones.add(auditedZonesItem);
    return this;
  }

   /**
   * Specifies zones that are audited when the protocol_auditing_enabled property is enabled.
   * @return auditedZones
  **/
  @ApiModelProperty(value = "Specifies zones that are audited when the protocol_auditing_enabled property is enabled.")
  public List<String> getAuditedZones() {
    return auditedZones;
  }

  public void setAuditedZones(List<String> auditedZones) {
    this.auditedZones = auditedZones;
  }

  public SettingsGlobalSettings ceeLogTime(String ceeLogTime) {
    this.ceeLogTime = ceeLogTime;
    return this;
  }

   /**
   * Specifies that events past a certain date are forwarded by the audit CEE forwarder. Format these events as follows: &#39;Topic@YYYY-MM-DD HH:MM:SS&#39;.
   * @return ceeLogTime
  **/
  @ApiModelProperty(value = "Specifies that events past a certain date are forwarded by the audit CEE forwarder. Format these events as follows: 'Topic@YYYY-MM-DD HH:MM:SS'.")
  public String getCeeLogTime() {
    return ceeLogTime;
  }

  public void setCeeLogTime(String ceeLogTime) {
    this.ceeLogTime = ceeLogTime;
  }

  public SettingsGlobalSettings ceeServerUris(List<String> ceeServerUris) {
    this.ceeServerUris = ceeServerUris;
    return this;
  }

  public SettingsGlobalSettings addCeeServerUrisItem(String ceeServerUrisItem) {
    if (this.ceeServerUris == null) {
      this.ceeServerUris = new ArrayList<String>();
    }
    this.ceeServerUris.add(ceeServerUrisItem);
    return this;
  }

   /**
   * Specifies a list of Common Event Enabler (CEE) server URIs. Protocol audit logs are sent to these URIs for external processing.
   * @return ceeServerUris
  **/
  @ApiModelProperty(value = "Specifies a list of Common Event Enabler (CEE) server URIs. Protocol audit logs are sent to these URIs for external processing.")
  public List<String> getCeeServerUris() {
    return ceeServerUris;
  }

  public void setCeeServerUris(List<String> ceeServerUris) {
    this.ceeServerUris = ceeServerUris;
  }

  public SettingsGlobalSettings configAuditingEnabled(Boolean configAuditingEnabled) {
    this.configAuditingEnabled = configAuditingEnabled;
    return this;
  }

   /**
   * Specifies whether logging for API configuration changes are enabled.
   * @return configAuditingEnabled
  **/
  @ApiModelProperty(value = "Specifies whether logging for API configuration changes are enabled.")
  public Boolean isConfigAuditingEnabled() {
    return configAuditingEnabled;
  }

  public void setConfigAuditingEnabled(Boolean configAuditingEnabled) {
    this.configAuditingEnabled = configAuditingEnabled;
  }

  public SettingsGlobalSettings configSyslogEnabled(Boolean configSyslogEnabled) {
    this.configSyslogEnabled = configSyslogEnabled;
    return this;
  }

   /**
   * Specifies whether configuration audit syslog messages are forwarded.
   * @return configSyslogEnabled
  **/
  @ApiModelProperty(value = "Specifies whether configuration audit syslog messages are forwarded.")
  public Boolean isConfigSyslogEnabled() {
    return configSyslogEnabled;
  }

  public void setConfigSyslogEnabled(Boolean configSyslogEnabled) {
    this.configSyslogEnabled = configSyslogEnabled;
  }

  public SettingsGlobalSettings hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Specifies the hostname that is reported in protocol events from this cluster.
   * @return hostname
  **/
  @ApiModelProperty(value = "Specifies the hostname that is reported in protocol events from this cluster.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public SettingsGlobalSettings protocolAuditingEnabled(Boolean protocolAuditingEnabled) {
    this.protocolAuditingEnabled = protocolAuditingEnabled;
    return this;
  }

   /**
   * Specifies if logging for the I/O stream is enabled.
   * @return protocolAuditingEnabled
  **/
  @ApiModelProperty(value = "Specifies if logging for the I/O stream is enabled.")
  public Boolean isProtocolAuditingEnabled() {
    return protocolAuditingEnabled;
  }

  public void setProtocolAuditingEnabled(Boolean protocolAuditingEnabled) {
    this.protocolAuditingEnabled = protocolAuditingEnabled;
  }

  public SettingsGlobalSettings syslogLogTime(String syslogLogTime) {
    this.syslogLogTime = syslogLogTime;
    return this;
  }

   /**
   * Specifies that events past a specified date are forwarded by the audit syslog forwarder. Format these events as follows: &#39;Topic@YYYY-MM-DD HH:MM:SS&#39; format
   * @return syslogLogTime
  **/
  @ApiModelProperty(value = "Specifies that events past a specified date are forwarded by the audit syslog forwarder. Format these events as follows: 'Topic@YYYY-MM-DD HH:MM:SS' format")
  public String getSyslogLogTime() {
    return syslogLogTime;
  }

  public void setSyslogLogTime(String syslogLogTime) {
    this.syslogLogTime = syslogLogTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsGlobalSettings settingsGlobalSettings = (SettingsGlobalSettings) o;
    return Objects.equals(this.auditedZones, settingsGlobalSettings.auditedZones) &&
        Objects.equals(this.ceeLogTime, settingsGlobalSettings.ceeLogTime) &&
        Objects.equals(this.ceeServerUris, settingsGlobalSettings.ceeServerUris) &&
        Objects.equals(this.configAuditingEnabled, settingsGlobalSettings.configAuditingEnabled) &&
        Objects.equals(this.configSyslogEnabled, settingsGlobalSettings.configSyslogEnabled) &&
        Objects.equals(this.hostname, settingsGlobalSettings.hostname) &&
        Objects.equals(this.protocolAuditingEnabled, settingsGlobalSettings.protocolAuditingEnabled) &&
        Objects.equals(this.syslogLogTime, settingsGlobalSettings.syslogLogTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditedZones, ceeLogTime, ceeServerUris, configAuditingEnabled, configSyslogEnabled, hostname, protocolAuditingEnabled, syslogLogTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsGlobalSettings {\n");
    
    sb.append("    auditedZones: ").append(toIndentedString(auditedZones)).append("\n");
    sb.append("    ceeLogTime: ").append(toIndentedString(ceeLogTime)).append("\n");
    sb.append("    ceeServerUris: ").append(toIndentedString(ceeServerUris)).append("\n");
    sb.append("    configAuditingEnabled: ").append(toIndentedString(configAuditingEnabled)).append("\n");
    sb.append("    configSyslogEnabled: ").append(toIndentedString(configSyslogEnabled)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    protocolAuditingEnabled: ").append(toIndentedString(protocolAuditingEnabled)).append("\n");
    sb.append("    syslogLogTime: ").append(toIndentedString(syslogLogTime)).append("\n");
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

