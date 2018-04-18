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
 * ReportsThreatsReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ReportsThreatsReport {
  @SerializedName("file")
  private String file = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("policy_id")
  private String policyId = null;

  @SerializedName("remediation")
  private String remediation = null;

  @SerializedName("scan_id")
  private String scanId = null;

  @SerializedName("threat")
  private String threat = null;

  @SerializedName("time")
  private Integer time = null;

  public ReportsThreatsReport file(String file) {
    this.file = file;
    return this;
  }

   /**
   * The file that contained the threat.
   * @return file
  **/
  @ApiModelProperty(value = "The file that contained the threat.")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public ReportsThreatsReport id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the report.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the report.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportsThreatsReport policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * The id of the policy that found this threat.
   * @return policyId
  **/
  @ApiModelProperty(value = "The id of the policy that found this threat.")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public ReportsThreatsReport remediation(String remediation) {
    this.remediation = remediation;
    return this;
  }

   /**
   * The action that was taken to remediate the threat.
   * @return remediation
  **/
  @ApiModelProperty(value = "The action that was taken to remediate the threat.")
  public String getRemediation() {
    return remediation;
  }

  public void setRemediation(String remediation) {
    this.remediation = remediation;
  }

  public ReportsThreatsReport scanId(String scanId) {
    this.scanId = scanId;
    return this;
  }

   /**
   * The id of the scan report this threat is associated with.
   * @return scanId
  **/
  @ApiModelProperty(value = "The id of the scan report this threat is associated with.")
  public String getScanId() {
    return scanId;
  }

  public void setScanId(String scanId) {
    this.scanId = scanId;
  }

  public ReportsThreatsReport threat(String threat) {
    this.threat = threat;
    return this;
  }

   /**
   * A description of the threat that was found.
   * @return threat
  **/
  @ApiModelProperty(value = "A description of the threat that was found.")
  public String getThreat() {
    return threat;
  }

  public void setThreat(String threat) {
    this.threat = threat;
  }

  public ReportsThreatsReport time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * minimum: 0
   * maximum: 4294967295
   * @return time
  **/
  @ApiModelProperty(value = "")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportsThreatsReport reportsThreatsReport = (ReportsThreatsReport) o;
    return Objects.equals(this.file, reportsThreatsReport.file) &&
        Objects.equals(this.id, reportsThreatsReport.id) &&
        Objects.equals(this.policyId, reportsThreatsReport.policyId) &&
        Objects.equals(this.remediation, reportsThreatsReport.remediation) &&
        Objects.equals(this.scanId, reportsThreatsReport.scanId) &&
        Objects.equals(this.threat, reportsThreatsReport.threat) &&
        Objects.equals(this.time, reportsThreatsReport.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, id, policyId, remediation, scanId, threat, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsThreatsReport {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
    sb.append("    threat: ").append(toIndentedString(threat)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

