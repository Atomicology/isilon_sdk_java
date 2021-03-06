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
 * JobStatisticsJobNodeCpu
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobStatisticsJobNodeCpu {
  @SerializedName("average")
  private BigDecimal average = null;

  @SerializedName("current")
  private BigDecimal current = null;

  @SerializedName("maximum")
  private BigDecimal maximum = null;

  @SerializedName("minimum")
  private BigDecimal minimum = null;

  public JobStatisticsJobNodeCpu average(BigDecimal average) {
    this.average = average;
    return this;
  }

   /**
   * The average CPU utilization of the job on this node.
   * @return average
  **/
  @ApiModelProperty(value = "The average CPU utilization of the job on this node.")
  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }

  public JobStatisticsJobNodeCpu current(BigDecimal current) {
    this.current = current;
    return this;
  }

   /**
   * The current CPU utilization of the job on this node.
   * @return current
  **/
  @ApiModelProperty(required = true, value = "The current CPU utilization of the job on this node.")
  public BigDecimal getCurrent() {
    return current;
  }

  public void setCurrent(BigDecimal current) {
    this.current = current;
  }

  public JobStatisticsJobNodeCpu maximum(BigDecimal maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * The maximum CPU utilization of the job on this node.
   * @return maximum
  **/
  @ApiModelProperty(required = true, value = "The maximum CPU utilization of the job on this node.")
  public BigDecimal getMaximum() {
    return maximum;
  }

  public void setMaximum(BigDecimal maximum) {
    this.maximum = maximum;
  }

  public JobStatisticsJobNodeCpu minimum(BigDecimal minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * The minimum CPU utilization of the job on this node.
   * @return minimum
  **/
  @ApiModelProperty(required = true, value = "The minimum CPU utilization of the job on this node.")
  public BigDecimal getMinimum() {
    return minimum;
  }

  public void setMinimum(BigDecimal minimum) {
    this.minimum = minimum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatisticsJobNodeCpu jobStatisticsJobNodeCpu = (JobStatisticsJobNodeCpu) o;
    return Objects.equals(this.average, jobStatisticsJobNodeCpu.average) &&
        Objects.equals(this.current, jobStatisticsJobNodeCpu.current) &&
        Objects.equals(this.maximum, jobStatisticsJobNodeCpu.maximum) &&
        Objects.equals(this.minimum, jobStatisticsJobNodeCpu.minimum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, current, maximum, minimum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatisticsJobNodeCpu {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
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

