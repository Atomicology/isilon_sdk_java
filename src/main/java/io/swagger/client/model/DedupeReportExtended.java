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
import io.swagger.client.model.DedupeReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DedupeReportExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class DedupeReportExtended {
  @SerializedName("dedupe_percent")
  private String dedupePercent = null;

  @SerializedName("elapsed_time")
  private Integer elapsedTime = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("job_id")
  private Integer jobId = null;

  @SerializedName("job_type")
  private String jobType = null;

  @SerializedName("reports")
  private List<DedupeReport> reports = null;

  public DedupeReportExtended dedupePercent(String dedupePercent) {
    this.dedupePercent = dedupePercent;
    return this;
  }

   /**
   * The amount of space the directory trees under this job&#39;s paths now take up, compared to what they would take up if not deduplicated (0 ~ 100).
   * @return dedupePercent
  **/
  @ApiModelProperty(value = "The amount of space the directory trees under this job's paths now take up, compared to what they would take up if not deduplicated (0 ~ 100).")
  public String getDedupePercent() {
    return dedupePercent;
  }

  public void setDedupePercent(String dedupePercent) {
    this.dedupePercent = dedupePercent;
  }

  public DedupeReportExtended elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The amount of time in seconds it took to run this job.
   * @return elapsedTime
  **/
  @ApiModelProperty(value = "The amount of time in seconds it took to run this job.")
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public DedupeReportExtended id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identifier for this report.
   * @return id
  **/
  @ApiModelProperty(value = "An unique identifier for this report.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DedupeReportExtended jobId(Integer jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * The job id this report refers to.
   * @return jobId
  **/
  @ApiModelProperty(value = "The job id this report refers to.")
  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  public DedupeReportExtended jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * The type of dedupe job this report refers to.
   * @return jobType
  **/
  @ApiModelProperty(value = "The type of dedupe job this report refers to.")
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public DedupeReportExtended reports(List<DedupeReport> reports) {
    this.reports = reports;
    return this;
  }

  public DedupeReportExtended addReportsItem(DedupeReport reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<DedupeReport>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * A list of report entries for this dedupe job.
   * @return reports
  **/
  @ApiModelProperty(value = "A list of report entries for this dedupe job.")
  public List<DedupeReport> getReports() {
    return reports;
  }

  public void setReports(List<DedupeReport> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DedupeReportExtended dedupeReportExtended = (DedupeReportExtended) o;
    return Objects.equals(this.dedupePercent, dedupeReportExtended.dedupePercent) &&
        Objects.equals(this.elapsedTime, dedupeReportExtended.elapsedTime) &&
        Objects.equals(this.id, dedupeReportExtended.id) &&
        Objects.equals(this.jobId, dedupeReportExtended.jobId) &&
        Objects.equals(this.jobType, dedupeReportExtended.jobType) &&
        Objects.equals(this.reports, dedupeReportExtended.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedupePercent, elapsedTime, id, jobId, jobType, reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DedupeReportExtended {\n");
    
    sb.append("    dedupePercent: ").append(toIndentedString(dedupePercent)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

