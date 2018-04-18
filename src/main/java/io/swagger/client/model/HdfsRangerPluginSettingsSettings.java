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
 * HdfsRangerPluginSettingsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class HdfsRangerPluginSettingsSettings {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("policy_manager_url")
  private String policyManagerUrl = null;

  @SerializedName("repository_name")
  private String repositoryName = null;

  public HdfsRangerPluginSettingsSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable or disable the HDFS ranger plugin
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable the HDFS ranger plugin")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public HdfsRangerPluginSettingsSettings policyManagerUrl(String policyManagerUrl) {
    this.policyManagerUrl = policyManagerUrl;
    return this;
  }

   /**
   * The scheme, hostname, and port of the Apache Ranger server (e.g. http://ranger.com:6080)
   * @return policyManagerUrl
  **/
  @ApiModelProperty(value = "The scheme, hostname, and port of the Apache Ranger server (e.g. http://ranger.com:6080)")
  public String getPolicyManagerUrl() {
    return policyManagerUrl;
  }

  public void setPolicyManagerUrl(String policyManagerUrl) {
    this.policyManagerUrl = policyManagerUrl;
  }

  public HdfsRangerPluginSettingsSettings repositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

   /**
   * The HDFS repository name that is registered with Apache Ranger server
   * @return repositoryName
  **/
  @ApiModelProperty(value = "The HDFS repository name that is registered with Apache Ranger server")
  public String getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdfsRangerPluginSettingsSettings hdfsRangerPluginSettingsSettings = (HdfsRangerPluginSettingsSettings) o;
    return Objects.equals(this.enabled, hdfsRangerPluginSettingsSettings.enabled) &&
        Objects.equals(this.policyManagerUrl, hdfsRangerPluginSettingsSettings.policyManagerUrl) &&
        Objects.equals(this.repositoryName, hdfsRangerPluginSettingsSettings.repositoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, policyManagerUrl, repositoryName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdfsRangerPluginSettingsSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    policyManagerUrl: ").append(toIndentedString(policyManagerUrl)).append("\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
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

