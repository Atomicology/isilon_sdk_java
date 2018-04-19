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
import io.swagger.client.model.EventSettingsSettingsMaintenance;
import java.io.IOException;

/**
 * EventSettingsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class EventSettingsSettings {
  @SerializedName("heartbeat_interval")
  private String heartbeatInterval = null;

  @SerializedName("maintenance")
  private EventSettingsSettingsMaintenance maintenance = null;

  @SerializedName("retention_days")
  private Integer retentionDays = null;

  @SerializedName("storage_limit")
  private Integer storageLimit = null;

  public EventSettingsSettings heartbeatInterval(String heartbeatInterval) {
    this.heartbeatInterval = heartbeatInterval;
    return this;
  }

   /**
   * Interval between heartbeat events. \&quot;daily\&quot;, \&quot;weekly\&quot;, or \&quot;monthly\&quot;.
   * @return heartbeatInterval
  **/
  @ApiModelProperty(value = "Interval between heartbeat events. \"daily\", \"weekly\", or \"monthly\".")
  public String getHeartbeatInterval() {
    return heartbeatInterval;
  }

  public void setHeartbeatInterval(String heartbeatInterval) {
    this.heartbeatInterval = heartbeatInterval;
  }

  public EventSettingsSettings maintenance(EventSettingsSettingsMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Specifies start and duration of maintenance period during which no alerts will be sent for new eventgroups.
   * @return maintenance
  **/
  @ApiModelProperty(value = "Specifies start and duration of maintenance period during which no alerts will be sent for new eventgroups.")
  public EventSettingsSettingsMaintenance getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(EventSettingsSettingsMaintenance maintenance) {
    this.maintenance = maintenance;
  }

  public EventSettingsSettings retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

   /**
   * Retention period in days
   * @return retentionDays
  **/
  @ApiModelProperty(value = "Retention period in days")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public EventSettingsSettings storageLimit(Integer storageLimit) {
    this.storageLimit = storageLimit;
    return this;
  }

   /**
   * Storage limit in megabytes per terabyte of available storage
   * @return storageLimit
  **/
  @ApiModelProperty(value = "Storage limit in megabytes per terabyte of available storage")
  public Integer getStorageLimit() {
    return storageLimit;
  }

  public void setStorageLimit(Integer storageLimit) {
    this.storageLimit = storageLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSettingsSettings eventSettingsSettings = (EventSettingsSettings) o;
    return Objects.equals(this.heartbeatInterval, eventSettingsSettings.heartbeatInterval) &&
        Objects.equals(this.maintenance, eventSettingsSettings.maintenance) &&
        Objects.equals(this.retentionDays, eventSettingsSettings.retentionDays) &&
        Objects.equals(this.storageLimit, eventSettingsSettings.storageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heartbeatInterval, maintenance, retentionDays, storageLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSettingsSettings {\n");
    
    sb.append("    heartbeatInterval: ").append(toIndentedString(heartbeatInterval)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    storageLimit: ").append(toIndentedString(storageLimit)).append("\n");
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

