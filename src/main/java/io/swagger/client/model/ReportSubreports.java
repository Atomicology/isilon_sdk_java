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
import io.swagger.client.model.ReportSubreport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportSubreports
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ReportSubreports {
  @SerializedName("subreports")
  private List<ReportSubreport> subreports = null;

  public ReportSubreports subreports(List<ReportSubreport> subreports) {
    this.subreports = subreports;
    return this;
  }

  public ReportSubreports addSubreportsItem(ReportSubreport subreportsItem) {
    if (this.subreports == null) {
      this.subreports = new ArrayList<ReportSubreport>();
    }
    this.subreports.add(subreportsItem);
    return this;
  }

   /**
   * Get subreports
   * @return subreports
  **/
  @ApiModelProperty(value = "")
  public List<ReportSubreport> getSubreports() {
    return subreports;
  }

  public void setSubreports(List<ReportSubreport> subreports) {
    this.subreports = subreports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportSubreports reportSubreports = (ReportSubreports) o;
    return Objects.equals(this.subreports, reportSubreports.subreports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subreports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSubreports {\n");
    
    sb.append("    subreports: ").append(toIndentedString(subreports)).append("\n");
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

