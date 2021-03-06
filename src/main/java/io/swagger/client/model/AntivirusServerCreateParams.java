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
import io.swagger.client.model.AntivirusServer;
import java.io.IOException;

/**
 * AntivirusServerCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AntivirusServerCreateParams {
  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("url")
  private String url = null;

  public AntivirusServerCreateParams description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the server.
   * @return description
  **/
  @ApiModelProperty(value = "A description for the server.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AntivirusServerCreateParams enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the server is enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether the server is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AntivirusServerCreateParams url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The icap url for the server.  This should have a format of: icap://host.domain:port/path
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The icap url for the server.  This should have a format of: icap://host.domain:port/path")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntivirusServerCreateParams antivirusServerCreateParams = (AntivirusServerCreateParams) o;
    return Objects.equals(this.description, antivirusServerCreateParams.description) &&
        Objects.equals(this.enabled, antivirusServerCreateParams.enabled) &&
        Objects.equals(this.url, antivirusServerCreateParams.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntivirusServerCreateParams {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

