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
import io.swagger.client.model.JobJobExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobRecent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobRecent {
  @SerializedName("recent_jobs")
  private List<JobJobExtended> recentJobs = null;

  @SerializedName("total")
  private Integer total = null;

  public JobRecent recentJobs(List<JobJobExtended> recentJobs) {
    this.recentJobs = recentJobs;
    return this;
  }

  public JobRecent addRecentJobsItem(JobJobExtended recentJobsItem) {
    if (this.recentJobs == null) {
      this.recentJobs = new ArrayList<JobJobExtended>();
    }
    this.recentJobs.add(recentJobsItem);
    return this;
  }

   /**
   * Get recentJobs
   * @return recentJobs
  **/
  @ApiModelProperty(value = "")
  public List<JobJobExtended> getRecentJobs() {
    return recentJobs;
  }

  public void setRecentJobs(List<JobJobExtended> recentJobs) {
    this.recentJobs = recentJobs;
  }

  public JobRecent total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobRecent jobRecent = (JobRecent) o;
    return Objects.equals(this.recentJobs, jobRecent.recentJobs) &&
        Objects.equals(this.total, jobRecent.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recentJobs, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRecent {\n");
    
    sb.append("    recentJobs: ").append(toIndentedString(recentJobs)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

