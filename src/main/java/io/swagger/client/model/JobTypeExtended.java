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
import io.swagger.client.model.JobType;
import java.io.IOException;

/**
 * JobTypeExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobTypeExtended {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("allow_multiple_instances")
  private Boolean allowMultipleInstances = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("exclusion_set")
  private String exclusionSet = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("id")
  private String id = null;

  public JobTypeExtended enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the job type is enabled and able to run.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Whether the job type is enabled and able to run.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public JobTypeExtended policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Default impact policy of this job type.
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "Default impact policy of this job type.")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public JobTypeExtended priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Default priority of this job type; lower numbers preempt higher numbers.
   * minimum: 1
   * maximum: 10
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "Default priority of this job type; lower numbers preempt higher numbers.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public JobTypeExtended schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The schedule on which this job type is queued, if any.
   * @return schedule
  **/
  @ApiModelProperty(value = "The schedule on which this job type is queued, if any.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public JobTypeExtended allowMultipleInstances(Boolean allowMultipleInstances) {
    this.allowMultipleInstances = allowMultipleInstances;
    return this;
  }

   /**
   * Whether multiple instances of this job type may run simultaneously.
   * @return allowMultipleInstances
  **/
  @ApiModelProperty(required = true, value = "Whether multiple instances of this job type may run simultaneously.")
  public Boolean isAllowMultipleInstances() {
    return allowMultipleInstances;
  }

  public void setAllowMultipleInstances(Boolean allowMultipleInstances) {
    this.allowMultipleInstances = allowMultipleInstances;
  }

  public JobTypeExtended description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of the job type.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Brief description of the job type.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JobTypeExtended exclusionSet(String exclusionSet) {
    this.exclusionSet = exclusionSet;
    return this;
  }

   /**
   * The set(s) of mutually-exclusive job types to which this job belongs.  No job in this set may run with any other job in this set.  Obsolete; this value will always be an empty string, as exclusion sets are no longer a job type property.
   * @return exclusionSet
  **/
  @ApiModelProperty(required = true, value = "The set(s) of mutually-exclusive job types to which this job belongs.  No job in this set may run with any other job in this set.  Obsolete; this value will always be an empty string, as exclusion sets are no longer a job type property.")
  public String getExclusionSet() {
    return exclusionSet;
  }

  public void setExclusionSet(String exclusionSet) {
    this.exclusionSet = exclusionSet;
  }

  public JobTypeExtended hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Whether this job type is normally visible in the UI.
   * @return hidden
  **/
  @ApiModelProperty(required = true, value = "Whether this job type is normally visible in the UI.")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public JobTypeExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Job type ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Job type ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTypeExtended jobTypeExtended = (JobTypeExtended) o;
    return Objects.equals(this.enabled, jobTypeExtended.enabled) &&
        Objects.equals(this.policy, jobTypeExtended.policy) &&
        Objects.equals(this.priority, jobTypeExtended.priority) &&
        Objects.equals(this.schedule, jobTypeExtended.schedule) &&
        Objects.equals(this.allowMultipleInstances, jobTypeExtended.allowMultipleInstances) &&
        Objects.equals(this.description, jobTypeExtended.description) &&
        Objects.equals(this.exclusionSet, jobTypeExtended.exclusionSet) &&
        Objects.equals(this.hidden, jobTypeExtended.hidden) &&
        Objects.equals(this.id, jobTypeExtended.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, policy, priority, schedule, allowMultipleInstances, description, exclusionSet, hidden, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTypeExtended {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    allowMultipleInstances: ").append(toIndentedString(allowMultipleInstances)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exclusionSet: ").append(toIndentedString(exclusionSet)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

