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
import io.swagger.client.model.CloudJobExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CloudJobs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class CloudJobs {
  @SerializedName("jobs")
  private List<CloudJobExtended> jobs = null;

  @SerializedName("resume")
  private String resume = null;

  public CloudJobs jobs(List<CloudJobExtended> jobs) {
    this.jobs = jobs;
    return this;
  }

  public CloudJobs addJobsItem(CloudJobExtended jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<CloudJobExtended>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @ApiModelProperty(value = "")
  public List<CloudJobExtended> getJobs() {
    return jobs;
  }

  public void setJobs(List<CloudJobExtended> jobs) {
    this.jobs = jobs;
  }

  public CloudJobs resume(String resume) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudJobs cloudJobs = (CloudJobs) o;
    return Objects.equals(this.jobs, cloudJobs.jobs) &&
        Objects.equals(this.resume, cloudJobs.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, resume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudJobs {\n");
    
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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

