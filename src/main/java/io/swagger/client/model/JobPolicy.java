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
import io.swagger.client.model.JobPolicyInterval;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobPolicy {
  @SerializedName("description")
  private String description = null;

  @SerializedName("intervals")
  private List<JobPolicyInterval> intervals = null;

  public JobPolicy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A helpful human-readable description of the impact policy.
   * @return description
  **/
  @ApiModelProperty(value = "A helpful human-readable description of the impact policy.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JobPolicy intervals(List<JobPolicyInterval> intervals) {
    this.intervals = intervals;
    return this;
  }

  public JobPolicy addIntervalsItem(JobPolicyInterval intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<JobPolicyInterval>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Get intervals
   * @return intervals
  **/
  @ApiModelProperty(value = "")
  public List<JobPolicyInterval> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<JobPolicyInterval> intervals) {
    this.intervals = intervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPolicy jobPolicy = (JobPolicy) o;
    return Objects.equals(this.description, jobPolicy.description) &&
        Objects.equals(this.intervals, jobPolicy.intervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, intervals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPolicy {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
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

