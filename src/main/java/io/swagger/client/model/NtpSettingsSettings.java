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
 * NtpSettingsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NtpSettingsSettings {
  @SerializedName("chimers")
  private Integer chimers = null;

  @SerializedName("excluded")
  private List<String> excluded = null;

  @SerializedName("key_file")
  private String keyFile = null;

  public NtpSettingsSettings chimers(Integer chimers) {
    this.chimers = chimers;
    return this;
  }

   /**
   * Number of nodes that will contact the NTP servers.
   * minimum: 1
   * @return chimers
  **/
  @ApiModelProperty(value = "Number of nodes that will contact the NTP servers.")
  public Integer getChimers() {
    return chimers;
  }

  public void setChimers(Integer chimers) {
    this.chimers = chimers;
  }

  public NtpSettingsSettings excluded(List<String> excluded) {
    this.excluded = excluded;
    return this;
  }

  public NtpSettingsSettings addExcludedItem(String excludedItem) {
    if (this.excluded == null) {
      this.excluded = new ArrayList<String>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

   /**
   * Node number (LNN) for nodes excluded from chimer duty.
   * @return excluded
  **/
  @ApiModelProperty(value = "Node number (LNN) for nodes excluded from chimer duty.")
  public List<String> getExcluded() {
    return excluded;
  }

  public void setExcluded(List<String> excluded) {
    this.excluded = excluded;
  }

  public NtpSettingsSettings keyFile(String keyFile) {
    this.keyFile = keyFile;
    return this;
  }

   /**
   * Path to NTP key file within /ifs.
   * @return keyFile
  **/
  @ApiModelProperty(value = "Path to NTP key file within /ifs.")
  public String getKeyFile() {
    return keyFile;
  }

  public void setKeyFile(String keyFile) {
    this.keyFile = keyFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NtpSettingsSettings ntpSettingsSettings = (NtpSettingsSettings) o;
    return Objects.equals(this.chimers, ntpSettingsSettings.chimers) &&
        Objects.equals(this.excluded, ntpSettingsSettings.excluded) &&
        Objects.equals(this.keyFile, ntpSettingsSettings.keyFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chimers, excluded, keyFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NtpSettingsSettings {\n");
    
    sb.append("    chimers: ").append(toIndentedString(chimers)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    keyFile: ").append(toIndentedString(keyFile)).append("\n");
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

