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
import io.swagger.client.model.HistogramStatByBreakout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HistogramStatBy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class HistogramStatBy {
  @SerializedName("begin_time")
  private Integer beginTime = null;

  @SerializedName("breakouts")
  private List<HistogramStatByBreakout> breakouts = new ArrayList<HistogramStatByBreakout>();

  @SerializedName("result_length")
  private Integer resultLength = null;

  public HistogramStatBy beginTime(Integer beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Unix Epoch time of start of results collection job.
   * @return beginTime
  **/
  @ApiModelProperty(required = true, value = "Unix Epoch time of start of results collection job.")
  public Integer getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(Integer beginTime) {
    this.beginTime = beginTime;
  }

  public HistogramStatBy breakouts(List<HistogramStatByBreakout> breakouts) {
    this.breakouts = breakouts;
    return this;
  }

  public HistogramStatBy addBreakoutsItem(HistogramStatByBreakout breakoutsItem) {
    this.breakouts.add(breakoutsItem);
    return this;
  }

   /**
   * Histogram breakout data according to breakout parameter.
   * @return breakouts
  **/
  @ApiModelProperty(required = true, value = "Histogram breakout data according to breakout parameter.")
  public List<HistogramStatByBreakout> getBreakouts() {
    return breakouts;
  }

  public void setBreakouts(List<HistogramStatByBreakout> breakouts) {
    this.breakouts = breakouts;
  }

  public HistogramStatBy resultLength(Integer resultLength) {
    this.resultLength = resultLength;
    return this;
  }

   /**
   * Total length of the result list.
   * @return resultLength
  **/
  @ApiModelProperty(required = true, value = "Total length of the result list.")
  public Integer getResultLength() {
    return resultLength;
  }

  public void setResultLength(Integer resultLength) {
    this.resultLength = resultLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistogramStatBy histogramStatBy = (HistogramStatBy) o;
    return Objects.equals(this.beginTime, histogramStatBy.beginTime) &&
        Objects.equals(this.breakouts, histogramStatBy.breakouts) &&
        Objects.equals(this.resultLength, histogramStatBy.resultLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, breakouts, resultLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistogramStatBy {\n");
    
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    breakouts: ").append(toIndentedString(breakouts)).append("\n");
    sb.append("    resultLength: ").append(toIndentedString(resultLength)).append("\n");
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

