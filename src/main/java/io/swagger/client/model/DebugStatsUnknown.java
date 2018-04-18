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
import java.math.BigDecimal;

/**
 * DebugStatsUnknown
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class DebugStatsUnknown {
  @SerializedName("calls")
  private Integer calls = null;

  @SerializedName("errors")
  private Integer errors = null;

  @SerializedName("time")
  private BigDecimal time = null;

  public DebugStatsUnknown calls(Integer calls) {
    this.calls = calls;
    return this;
  }

   /**
   * The number of calls.
   * @return calls
  **/
  @ApiModelProperty(value = "The number of calls.")
  public Integer getCalls() {
    return calls;
  }

  public void setCalls(Integer calls) {
    this.calls = calls;
  }

  public DebugStatsUnknown errors(Integer errors) {
    this.errors = errors;
    return this;
  }

   /**
   * The number of errors.
   * @return errors
  **/
  @ApiModelProperty(value = "The number of errors.")
  public Integer getErrors() {
    return errors;
  }

  public void setErrors(Integer errors) {
    this.errors = errors;
  }

  public DebugStatsUnknown time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * The total amount of time spent in this method.
   * @return time
  **/
  @ApiModelProperty(value = "The total amount of time spent in this method.")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugStatsUnknown debugStatsUnknown = (DebugStatsUnknown) o;
    return Objects.equals(this.calls, debugStatsUnknown.calls) &&
        Objects.equals(this.errors, debugStatsUnknown.errors) &&
        Objects.equals(this.time, debugStatsUnknown.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls, errors, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugStatsUnknown {\n");
    
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
