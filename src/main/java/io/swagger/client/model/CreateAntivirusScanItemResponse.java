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
 * The result of a manual antivirus scan.
 */
@ApiModel(description = "The result of a manual antivirus scan.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class CreateAntivirusScanItemResponse {
  @SerializedName("report_id")
  private String reportId = null;

  @SerializedName("result")
  private String result = null;

  public CreateAntivirusScanItemResponse reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The ID for the report for this scan. A report ID will be generated if one is not provided. 
   * @return reportId
  **/
  @ApiModelProperty(value = "The ID for the report for this scan. A report ID will be generated if one is not provided. ")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public CreateAntivirusScanItemResponse result(String result) {
    this.result = result;
    return this;
  }

   /**
   * The result of the scan.
   * @return result
  **/
  @ApiModelProperty(value = "The result of the scan.")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAntivirusScanItemResponse createAntivirusScanItemResponse = (CreateAntivirusScanItemResponse) o;
    return Objects.equals(this.reportId, createAntivirusScanItemResponse.reportId) &&
        Objects.equals(this.result, createAntivirusScanItemResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAntivirusScanItemResponse {\n");
    
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
