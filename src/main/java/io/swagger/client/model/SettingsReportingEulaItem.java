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
 * SettingsReportingEulaItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SettingsReportingEulaItem {
  @SerializedName("accepted")
  private Boolean accepted = null;

  @SerializedName("body")
  private String body = null;

  public SettingsReportingEulaItem accepted(Boolean accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * Indicates whether the telemetry collection warning has been acknowledged
   * @return accepted
  **/
  @ApiModelProperty(value = "Indicates whether the telemetry collection warning has been acknowledged")
  public Boolean isAccepted() {
    return accepted;
  }

  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }

  public SettingsReportingEulaItem body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The body of the telemetry collection warning
   * @return body
  **/
  @ApiModelProperty(value = "The body of the telemetry collection warning")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsReportingEulaItem settingsReportingEulaItem = (SettingsReportingEulaItem) o;
    return Objects.equals(this.accepted, settingsReportingEulaItem.accepted) &&
        Objects.equals(this.body, settingsReportingEulaItem.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsReportingEulaItem {\n");
    
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

