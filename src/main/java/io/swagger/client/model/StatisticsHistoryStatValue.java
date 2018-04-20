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
 * StatisticsHistoryStatValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class StatisticsHistoryStatValue {
  @SerializedName("time")
  private Integer time = null;

  @SerializedName("value")
  private String value = null;

  public StatisticsHistoryStatValue time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Unix Epoch time in seconds that statistic was collected.
   * @return time
  **/
  @ApiModelProperty(required = true, value = "Unix Epoch time in seconds that statistic was collected.")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public StatisticsHistoryStatValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Key dependent value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Key dependent value.")
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
    StatisticsHistoryStatValue statisticsHistoryStatValue = (StatisticsHistoryStatValue) o;
    return Objects.equals(this.time, statisticsHistoryStatValue.time) &&
        Objects.equals(this.value, statisticsHistoryStatValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsHistoryStatValue {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

