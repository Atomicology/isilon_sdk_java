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
import io.swagger.client.model.StatisticsHistoryStatValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatisticsHistoryStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class StatisticsHistoryStat {
  @SerializedName("devid")
  private Integer devid = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("resolution")
  private Integer resolution = null;

  @SerializedName("values")
  private List<StatisticsHistoryStatValue> values = null;

  public StatisticsHistoryStat devid(Integer devid) {
    this.devid = devid;
    return this;
  }

   /**
   * Devid of node of statistic or 0 for cluster scoped statistics.
   * @return devid
  **/
  @ApiModelProperty(required = true, value = "Devid of node of statistic or 0 for cluster scoped statistics.")
  public Integer getDevid() {
    return devid;
  }

  public void setDevid(Integer devid) {
    this.devid = devid;
  }

  public StatisticsHistoryStat error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Key specific error string, if applicable.
   * @return error
  **/
  @ApiModelProperty(value = "Key specific error string, if applicable.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public StatisticsHistoryStat errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Key specific error number, if applicable.
   * @return errorCode
  **/
  @ApiModelProperty(value = "Key specific error number, if applicable.")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public StatisticsHistoryStat key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key name of statistic.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key name of statistic.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public StatisticsHistoryStat resolution(Integer resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * The interval for which these results were figured (averaged against.)
   * @return resolution
  **/
  @ApiModelProperty(required = true, value = "The interval for which these results were figured (averaged against.)")
  public Integer getResolution() {
    return resolution;
  }

  public void setResolution(Integer resolution) {
    this.resolution = resolution;
  }

  public StatisticsHistoryStat values(List<StatisticsHistoryStatValue> values) {
    this.values = values;
    return this;
  }

  public StatisticsHistoryStat addValuesItem(StatisticsHistoryStatValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<StatisticsHistoryStatValue>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Time-series values.
   * @return values
  **/
  @ApiModelProperty(value = "Time-series values.")
  public List<StatisticsHistoryStatValue> getValues() {
    return values;
  }

  public void setValues(List<StatisticsHistoryStatValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsHistoryStat statisticsHistoryStat = (StatisticsHistoryStat) o;
    return Objects.equals(this.devid, statisticsHistoryStat.devid) &&
        Objects.equals(this.error, statisticsHistoryStat.error) &&
        Objects.equals(this.errorCode, statisticsHistoryStat.errorCode) &&
        Objects.equals(this.key, statisticsHistoryStat.key) &&
        Objects.equals(this.resolution, statisticsHistoryStat.resolution) &&
        Objects.equals(this.values, statisticsHistoryStat.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devid, error, errorCode, key, resolution, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsHistoryStat {\n");
    
    sb.append("    devid: ").append(toIndentedString(devid)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

