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
 * DedupeReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class DedupeReport {
  @SerializedName("phase")
  private Integer phase = null;

  @SerializedName("results")
  private String results = null;

  @SerializedName("time")
  private Integer time = null;

  public DedupeReport phase(Integer phase) {
    this.phase = phase;
    return this;
  }

   /**
   * The phase of the job this report was generated for.
   * @return phase
  **/
  @ApiModelProperty(value = "The phase of the job this report was generated for.")
  public Integer getPhase() {
    return phase;
  }

  public void setPhase(Integer phase) {
    this.phase = phase;
  }

  public DedupeReport results(String results) {
    this.results = results;
    return this;
  }

   /**
   * The report results.
   * @return results
  **/
  @ApiModelProperty(value = "The report results.")
  public String getResults() {
    return results;
  }

  public void setResults(String results) {
    this.results = results;
  }

  public DedupeReport time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * The time this report was generated in Unix epoch seconds.
   * @return time
  **/
  @ApiModelProperty(value = "The time this report was generated in Unix epoch seconds.")
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
    DedupeReport dedupeReport = (DedupeReport) o;
    return Objects.equals(this.phase, dedupeReport.phase) &&
        Objects.equals(this.results, dedupeReport.results) &&
        Objects.equals(this.time, dedupeReport.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phase, results, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DedupeReport {\n");
    
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

