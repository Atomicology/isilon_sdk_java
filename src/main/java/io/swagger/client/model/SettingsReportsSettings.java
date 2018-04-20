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
 * SettingsReportsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SettingsReportsSettings {
  @SerializedName("live_dir")
  private String liveDir = null;

  @SerializedName("live_retain")
  private Integer liveRetain = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("scheduled_dir")
  private String scheduledDir = null;

  @SerializedName("scheduled_retain")
  private Integer scheduledRetain = null;

  public SettingsReportsSettings liveDir(String liveDir) {
    this.liveDir = liveDir;
    return this;
  }

   /**
   * The directory on /ifs where manual or live reports will be placed.
   * @return liveDir
  **/
  @ApiModelProperty(required = true, value = "The directory on /ifs where manual or live reports will be placed.")
  public String getLiveDir() {
    return liveDir;
  }

  public void setLiveDir(String liveDir) {
    this.liveDir = liveDir;
  }

  public SettingsReportsSettings liveRetain(Integer liveRetain) {
    this.liveRetain = liveRetain;
    return this;
  }

   /**
   * The number of manual reports to keep.
   * minimum: 1
   * @return liveRetain
  **/
  @ApiModelProperty(required = true, value = "The number of manual reports to keep.")
  public Integer getLiveRetain() {
    return liveRetain;
  }

  public void setLiveRetain(Integer liveRetain) {
    this.liveRetain = liveRetain;
  }

  public SettingsReportsSettings schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The isidate schedule used to generate reports.
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "The isidate schedule used to generate reports.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public SettingsReportsSettings scheduledDir(String scheduledDir) {
    this.scheduledDir = scheduledDir;
    return this;
  }

   /**
   * The directory on /ifs where schedule reports will be placed.
   * @return scheduledDir
  **/
  @ApiModelProperty(required = true, value = "The directory on /ifs where schedule reports will be placed.")
  public String getScheduledDir() {
    return scheduledDir;
  }

  public void setScheduledDir(String scheduledDir) {
    this.scheduledDir = scheduledDir;
  }

  public SettingsReportsSettings scheduledRetain(Integer scheduledRetain) {
    this.scheduledRetain = scheduledRetain;
    return this;
  }

   /**
   * The number of scheduled reports to keep.
   * minimum: 1
   * @return scheduledRetain
  **/
  @ApiModelProperty(required = true, value = "The number of scheduled reports to keep.")
  public Integer getScheduledRetain() {
    return scheduledRetain;
  }

  public void setScheduledRetain(Integer scheduledRetain) {
    this.scheduledRetain = scheduledRetain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsReportsSettings settingsReportsSettings = (SettingsReportsSettings) o;
    return Objects.equals(this.liveDir, settingsReportsSettings.liveDir) &&
        Objects.equals(this.liveRetain, settingsReportsSettings.liveRetain) &&
        Objects.equals(this.schedule, settingsReportsSettings.schedule) &&
        Objects.equals(this.scheduledDir, settingsReportsSettings.scheduledDir) &&
        Objects.equals(this.scheduledRetain, settingsReportsSettings.scheduledRetain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveDir, liveRetain, schedule, scheduledDir, scheduledRetain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsReportsSettings {\n");
    
    sb.append("    liveDir: ").append(toIndentedString(liveDir)).append("\n");
    sb.append("    liveRetain: ").append(toIndentedString(liveRetain)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scheduledDir: ").append(toIndentedString(scheduledDir)).append("\n");
    sb.append("    scheduledRetain: ").append(toIndentedString(scheduledRetain)).append("\n");
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

