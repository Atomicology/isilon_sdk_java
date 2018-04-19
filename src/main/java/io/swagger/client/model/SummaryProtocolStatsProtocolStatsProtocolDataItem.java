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
 * SummaryProtocolStatsProtocolStatsProtocolDataItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SummaryProtocolStatsProtocolStatsProtocolDataItem {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public SummaryProtocolStatsProtocolStatsProtocolDataItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the protocol operation.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the protocol operation.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SummaryProtocolStatsProtocolStatsProtocolDataItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Protocol specific operations per second. This is a variable number of output fields depending on the protocol being displayed.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Protocol specific operations per second. This is a variable number of output fields depending on the protocol being displayed.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryProtocolStatsProtocolStatsProtocolDataItem summaryProtocolStatsProtocolStatsProtocolDataItem = (SummaryProtocolStatsProtocolStatsProtocolDataItem) o;
    return Objects.equals(this.name, summaryProtocolStatsProtocolStatsProtocolDataItem.name) &&
        Objects.equals(this.value, summaryProtocolStatsProtocolStatsProtocolDataItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryProtocolStatsProtocolStatsProtocolDataItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

