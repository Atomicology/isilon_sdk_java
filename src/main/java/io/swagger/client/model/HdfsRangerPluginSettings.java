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
import io.swagger.client.model.HdfsRangerPluginSettingsSettings;
import java.io.IOException;

/**
 * HdfsRangerPluginSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class HdfsRangerPluginSettings {
  @SerializedName("settings")
  private HdfsRangerPluginSettingsSettings settings = null;

  public HdfsRangerPluginSettings settings(HdfsRangerPluginSettingsSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Settings for the HDFS ranger plugin
   * @return settings
  **/
  @ApiModelProperty(value = "Settings for the HDFS ranger plugin")
  public HdfsRangerPluginSettingsSettings getSettings() {
    return settings;
  }

  public void setSettings(HdfsRangerPluginSettingsSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdfsRangerPluginSettings hdfsRangerPluginSettings = (HdfsRangerPluginSettings) o;
    return Objects.equals(this.settings, hdfsRangerPluginSettings.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdfsRangerPluginSettings {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

