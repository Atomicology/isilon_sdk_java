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
import io.swagger.client.model.AntivirusPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AntivirusPolicyExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AntivirusPolicyExtended {
  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("force_run")
  private Boolean forceRun = null;

  @SerializedName("impact")
  private String impact = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("paths")
  private List<String> paths = null;

  @SerializedName("recursion_depth")
  private Integer recursionDepth = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("last_run")
  private Integer lastRun = null;

  public AntivirusPolicyExtended description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the policy.
   * @return description
  **/
  @ApiModelProperty(value = "A description for the policy.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AntivirusPolicyExtended enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the policy is enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether the policy is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AntivirusPolicyExtended forceRun(Boolean forceRun) {
    this.forceRun = forceRun;
    return this;
  }

   /**
   * Forces the scan to run regardless of whether the files were recently scanned.
   * @return forceRun
  **/
  @ApiModelProperty(value = "Forces the scan to run regardless of whether the files were recently scanned.")
  public Boolean isForceRun() {
    return forceRun;
  }

  public void setForceRun(Boolean forceRun) {
    this.forceRun = forceRun;
  }

  public AntivirusPolicyExtended impact(String impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @ApiModelProperty(value = "")
  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }

  public AntivirusPolicyExtended name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the policy.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the policy.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AntivirusPolicyExtended paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public AntivirusPolicyExtended addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<String>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Paths to include in the scan.
   * @return paths
  **/
  @ApiModelProperty(value = "Paths to include in the scan.")
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }

  public AntivirusPolicyExtended recursionDepth(Integer recursionDepth) {
    this.recursionDepth = recursionDepth;
    return this;
  }

   /**
   * The depth to recurse in directories.  The default of -1 gives unlimited recursion.
   * minimum: -1
   * maximum: 2147483647
   * @return recursionDepth
  **/
  @ApiModelProperty(value = "The depth to recurse in directories.  The default of -1 gives unlimited recursion.")
  public Integer getRecursionDepth() {
    return recursionDepth;
  }

  public void setRecursionDepth(Integer recursionDepth) {
    this.recursionDepth = recursionDepth;
  }

  public AntivirusPolicyExtended schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public AntivirusPolicyExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the policy.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the policy.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AntivirusPolicyExtended lastRun(Integer lastRun) {
    this.lastRun = lastRun;
    return this;
  }

   /**
   * The epoch time of the last run of this policy.
   * minimum: 0
   * maximum: 4294967295
   * @return lastRun
  **/
  @ApiModelProperty(value = "The epoch time of the last run of this policy.")
  public Integer getLastRun() {
    return lastRun;
  }

  public void setLastRun(Integer lastRun) {
    this.lastRun = lastRun;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntivirusPolicyExtended antivirusPolicyExtended = (AntivirusPolicyExtended) o;
    return Objects.equals(this.description, antivirusPolicyExtended.description) &&
        Objects.equals(this.enabled, antivirusPolicyExtended.enabled) &&
        Objects.equals(this.forceRun, antivirusPolicyExtended.forceRun) &&
        Objects.equals(this.impact, antivirusPolicyExtended.impact) &&
        Objects.equals(this.name, antivirusPolicyExtended.name) &&
        Objects.equals(this.paths, antivirusPolicyExtended.paths) &&
        Objects.equals(this.recursionDepth, antivirusPolicyExtended.recursionDepth) &&
        Objects.equals(this.schedule, antivirusPolicyExtended.schedule) &&
        Objects.equals(this.id, antivirusPolicyExtended.id) &&
        Objects.equals(this.lastRun, antivirusPolicyExtended.lastRun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, forceRun, impact, name, paths, recursionDepth, schedule, id, lastRun);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntivirusPolicyExtended {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    forceRun: ").append(toIndentedString(forceRun)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    recursionDepth: ").append(toIndentedString(recursionDepth)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
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

