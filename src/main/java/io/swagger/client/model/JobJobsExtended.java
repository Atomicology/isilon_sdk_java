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
import io.swagger.client.model.JobJobs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobJobsExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class JobJobsExtended {
  @SerializedName("jobs")
  private List<JobJobExtended> jobs = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public JobJobsExtended jobs(List<JobJobExtended> jobs) {
    this.jobs = jobs;
    return this;
  }

  public JobJobsExtended addJobsItem(JobJobExtended jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<JobJobExtended>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @ApiModelProperty(value = "")
  public List<JobJobExtended> getJobs() {
    return jobs;
  }

  public void setJobs(List<JobJobExtended> jobs) {
    this.jobs = jobs;
  }

  public JobJobsExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
   * @return resume
  **/
  @ApiModelProperty(value = "Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public JobJobsExtended total(Integer total) {
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
    JobJobsExtended jobJobsExtended = (JobJobsExtended) o;
    return Objects.equals(this.jobs, jobJobsExtended.jobs) &&
        Objects.equals(this.resume, jobJobsExtended.resume) &&
        Objects.equals(this.total, jobJobsExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobJobsExtended {\n");
    
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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
