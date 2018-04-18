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
import io.swagger.client.model.SyncRuleSchedule;
import java.io.IOException;

/**
 * A rule limiting the bandwidth, file operations, cpu usage, or worker count for all sync jobs on this cluster.
 */
@ApiModel(description = "A rule limiting the bandwidth, file operations, cpu usage, or worker count for all sync jobs on this cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SyncRule {
  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("schedule")
  private SyncRuleSchedule schedule = null;

  public SyncRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User-entered description of this performance rule.
   * @return description
  **/
  @ApiModelProperty(value = "User-entered description of this performance rule.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SyncRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether this performance rule is currently in effect during its specified intervals.
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether this performance rule is currently in effect during its specified intervals.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SyncRule limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Amount the specified system resource type is limited by this rule.  Units are kb/s for bandwidth, files/s for file-count, processing percentage used for cpu, or percentage of maximum available workers.
   * @return limit
  **/
  @ApiModelProperty(value = "Amount the specified system resource type is limited by this rule.  Units are kb/s for bandwidth, files/s for file-count, processing percentage used for cpu, or percentage of maximum available workers.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public SyncRule schedule(SyncRuleSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * A schedule defining when during a week this performance rule is in effect.  If unspecified or null, the schedule will always be in effect.
   * @return schedule
  **/
  @ApiModelProperty(value = "A schedule defining when during a week this performance rule is in effect.  If unspecified or null, the schedule will always be in effect.")
  public SyncRuleSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(SyncRuleSchedule schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncRule syncRule = (SyncRule) o;
    return Objects.equals(this.description, syncRule.description) &&
        Objects.equals(this.enabled, syncRule.enabled) &&
        Objects.equals(this.limit, syncRule.limit) &&
        Objects.equals(this.schedule, syncRule.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, limit, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncRule {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

