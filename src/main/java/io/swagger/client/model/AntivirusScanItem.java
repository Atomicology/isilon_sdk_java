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

/**
 * Parameters for a manual antivirus scan.
 */
@ApiModel(description = "Parameters for a manual antivirus scan.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AntivirusScanItem {
  @SerializedName("file")
  private String file = null;

  @SerializedName("force_run")
  private Boolean forceRun = null;

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("report_id")
  private String reportId = null;

  public AntivirusScanItem file(String file) {
    this.file = file;
    return this;
  }

   /**
   * The full path of the file to scan.
   * @return file
  **/
  @ApiModelProperty(required = true, value = "The full path of the file to scan.")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public AntivirusScanItem forceRun(Boolean forceRun) {
    this.forceRun = forceRun;
    return this;
  }

   /**
   * Forces the scan to run regardless of whether the files were recently scanned. The default value is true.
   * @return forceRun
  **/
  @ApiModelProperty(value = "Forces the scan to run regardless of whether the files were recently scanned. The default value is true.")
  public Boolean isForceRun() {
    return forceRun;
  }

  public void setForceRun(Boolean forceRun) {
    this.forceRun = forceRun;
  }

  public AntivirusScanItem policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * The ID of the policy to use for the scan. By default, the scan will use the MANUAL policy.
   * @return policy
  **/
  @ApiModelProperty(value = "The ID of the policy to use for the scan. By default, the scan will use the MANUAL policy.")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public AntivirusScanItem reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The ID for the report for this scan. A report ID will be generated if one is not provided.
   * @return reportId
  **/
  @ApiModelProperty(value = "The ID for the report for this scan. A report ID will be generated if one is not provided.")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntivirusScanItem antivirusScanItem = (AntivirusScanItem) o;
    return Objects.equals(this.file, antivirusScanItem.file) &&
        Objects.equals(this.forceRun, antivirusScanItem.forceRun) &&
        Objects.equals(this.policy, antivirusScanItem.policy) &&
        Objects.equals(this.reportId, antivirusScanItem.reportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, forceRun, policy, reportId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntivirusScanItem {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    forceRun: ").append(toIndentedString(forceRun)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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

