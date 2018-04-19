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
import io.swagger.client.model.DedupeReportExtended;
import io.swagger.client.model.DedupeReports;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DedupeReportsExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class DedupeReportsExtended {
  @SerializedName("reports")
  private List<DedupeReportExtended> reports = null;

  @SerializedName("resume")
  private String resume = null;

  public DedupeReportsExtended reports(List<DedupeReportExtended> reports) {
    this.reports = reports;
    return this;
  }

  public DedupeReportsExtended addReportsItem(DedupeReportExtended reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<DedupeReportExtended>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(value = "")
  public List<DedupeReportExtended> getReports() {
    return reports;
  }

  public void setReports(List<DedupeReportExtended> reports) {
    this.reports = reports;
  }

  public DedupeReportsExtended resume(String resume) {
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
    DedupeReportsExtended dedupeReportsExtended = (DedupeReportsExtended) o;
    return Objects.equals(this.reports, dedupeReportsExtended.reports) &&
        Objects.equals(this.resume, dedupeReportsExtended.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports, resume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DedupeReportsExtended {\n");
    
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

