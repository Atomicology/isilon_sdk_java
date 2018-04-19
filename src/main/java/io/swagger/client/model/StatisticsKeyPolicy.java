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
 * StatisticsKeyPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class StatisticsKeyPolicy {
  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("persistent")
  private Boolean persistent = null;

  @SerializedName("retention")
  private Integer retention = null;

  public StatisticsKeyPolicy interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Time between samples in seconds.
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "Time between samples in seconds.")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public StatisticsKeyPolicy persistent(Boolean persistent) {
    this.persistent = persistent;
    return this;
  }

   /**
   * If true, history is persisted.
   * @return persistent
  **/
  @ApiModelProperty(required = true, value = "If true, history is persisted.")
  public Boolean isPersistent() {
    return persistent;
  }

  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  public StatisticsKeyPolicy retention(Integer retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Time in seconds to keep data.
   * @return retention
  **/
  @ApiModelProperty(required = true, value = "Time in seconds to keep data.")
  public Integer getRetention() {
    return retention;
  }

  public void setRetention(Integer retention) {
    this.retention = retention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsKeyPolicy statisticsKeyPolicy = (StatisticsKeyPolicy) o;
    return Objects.equals(this.interval, statisticsKeyPolicy.interval) &&
        Objects.equals(this.persistent, statisticsKeyPolicy.persistent) &&
        Objects.equals(this.retention, statisticsKeyPolicy.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, persistent, retention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsKeyPolicy {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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

