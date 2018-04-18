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
 * SyncJobPhase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SyncJobPhase {
  @SerializedName("end_time")
  private Integer endTime = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("start_time")
  private Integer startTime = null;

  public SyncJobPhase endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The time the job ended this phase.
   * @return endTime
  **/
  @ApiModelProperty(value = "The time the job ended this phase.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public SyncJobPhase phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * The phase that the job was in.
   * @return phase
  **/
  @ApiModelProperty(value = "The phase that the job was in.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public SyncJobPhase startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The time the job began this phase.
   * @return startTime
  **/
  @ApiModelProperty(value = "The time the job began this phase.")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncJobPhase syncJobPhase = (SyncJobPhase) o;
    return Objects.equals(this.endTime, syncJobPhase.endTime) &&
        Objects.equals(this.phase, syncJobPhase.phase) &&
        Objects.equals(this.startTime, syncJobPhase.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, phase, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncJobPhase {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
