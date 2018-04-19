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
import io.swagger.client.model.ResultHistogramHistogramItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResultHistogram
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ResultHistogram {
  @SerializedName("atime_enabled")
  private Boolean atimeEnabled = null;

  @SerializedName("attribute_count")
  private Integer attributeCount = null;

  @SerializedName("begin_time")
  private Integer beginTime = null;

  @SerializedName("histogram")
  private List<ResultHistogramHistogramItem> histogram = new ArrayList<ResultHistogramHistogramItem>();

  public ResultHistogram atimeEnabled(Boolean atimeEnabled) {
    this.atimeEnabled = atimeEnabled;
    return this;
  }

   /**
   * Access time enabled.
   * @return atimeEnabled
  **/
  @ApiModelProperty(required = true, value = "Access time enabled.")
  public Boolean isAtimeEnabled() {
    return atimeEnabled;
  }

  public void setAtimeEnabled(Boolean atimeEnabled) {
    this.atimeEnabled = atimeEnabled;
  }

  public ResultHistogram attributeCount(Integer attributeCount) {
    this.attributeCount = attributeCount;
    return this;
  }

   /**
   * User attribute count.
   * @return attributeCount
  **/
  @ApiModelProperty(required = true, value = "User attribute count.")
  public Integer getAttributeCount() {
    return attributeCount;
  }

  public void setAttributeCount(Integer attributeCount) {
    this.attributeCount = attributeCount;
  }

  public ResultHistogram beginTime(Integer beginTime) {
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

  public ResultHistogram histogram(List<ResultHistogramHistogramItem> histogram) {
    this.histogram = histogram;
    return this;
  }

  public ResultHistogram addHistogramItem(ResultHistogramHistogramItem histogramItem) {
    this.histogram.add(histogramItem);
    return this;
  }

   /**
   * Histogram data of specified file count parameter.
   * @return histogram
  **/
  @ApiModelProperty(required = true, value = "Histogram data of specified file count parameter.")
  public List<ResultHistogramHistogramItem> getHistogram() {
    return histogram;
  }

  public void setHistogram(List<ResultHistogramHistogramItem> histogram) {
    this.histogram = histogram;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultHistogram resultHistogram = (ResultHistogram) o;
    return Objects.equals(this.atimeEnabled, resultHistogram.atimeEnabled) &&
        Objects.equals(this.attributeCount, resultHistogram.attributeCount) &&
        Objects.equals(this.beginTime, resultHistogram.beginTime) &&
        Objects.equals(this.histogram, resultHistogram.histogram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atimeEnabled, attributeCount, beginTime, histogram);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultHistogram {\n");
    
    sb.append("    atimeEnabled: ").append(toIndentedString(atimeEnabled)).append("\n");
    sb.append("    attributeCount: ").append(toIndentedString(attributeCount)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
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

