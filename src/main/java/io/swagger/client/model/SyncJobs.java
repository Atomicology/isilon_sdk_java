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
import io.swagger.client.model.SyncJobExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SyncJobs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SyncJobs {
  @SerializedName("jobs")
  private List<SyncJobExtended> jobs = null;

  public SyncJobs jobs(List<SyncJobExtended> jobs) {
    this.jobs = jobs;
    return this;
  }

  public SyncJobs addJobsItem(SyncJobExtended jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<SyncJobExtended>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @ApiModelProperty(value = "")
  public List<SyncJobExtended> getJobs() {
    return jobs;
  }

  public void setJobs(List<SyncJobExtended> jobs) {
    this.jobs = jobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncJobs syncJobs = (SyncJobs) o;
    return Objects.equals(this.jobs, syncJobs.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncJobs {\n");
    
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
