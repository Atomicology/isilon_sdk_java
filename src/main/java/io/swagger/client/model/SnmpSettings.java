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
import io.swagger.client.model.SnmpSettingsSettings;
import java.io.IOException;

/**
 * SnmpSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SnmpSettings {
  @SerializedName("settings")
  private SnmpSettingsSettings settings = null;

  public SnmpSettings settings(SnmpSettingsSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * SNMP settings.
   * @return settings
  **/
  @ApiModelProperty(value = "SNMP settings.")
  public SnmpSettingsSettings getSettings() {
    return settings;
  }

  public void setSettings(SnmpSettingsSettings settings) {
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
    SnmpSettings snmpSettings = (SnmpSettings) o;
    return Objects.equals(this.settings, snmpSettings.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpSettings {\n");
    
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

