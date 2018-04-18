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
 * SnapshotSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SnapshotSchedule {
  @SerializedName("alias")
  private String alias = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("schedule")
  private String schedule = null;

  public SnapshotSchedule alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias name to create for each snapshot.
   * @return alias
  **/
  @ApiModelProperty(value = "Alias name to create for each snapshot.")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public SnapshotSchedule duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Time in seconds added to creation time to construction expiration time.
   * minimum: 0
   * @return duration
  **/
  @ApiModelProperty(value = "Time in seconds added to creation time to construction expiration time.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public SnapshotSchedule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The schedule name.
   * @return name
  **/
  @ApiModelProperty(value = "The schedule name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SnapshotSchedule path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The /ifs path snapshotted.
   * @return path
  **/
  @ApiModelProperty(value = "The /ifs path snapshotted.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public SnapshotSchedule pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Pattern expanded with strftime to create snapshot names.
   * @return pattern
  **/
  @ApiModelProperty(value = "Pattern expanded with strftime to create snapshot names.")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public SnapshotSchedule schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The isidate compatible natural language description of the schedule.
   * @return schedule
  **/
  @ApiModelProperty(value = "The isidate compatible natural language description of the schedule.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
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
    SnapshotSchedule snapshotSchedule = (SnapshotSchedule) o;
    return Objects.equals(this.alias, snapshotSchedule.alias) &&
        Objects.equals(this.duration, snapshotSchedule.duration) &&
        Objects.equals(this.name, snapshotSchedule.name) &&
        Objects.equals(this.path, snapshotSchedule.path) &&
        Objects.equals(this.pattern, snapshotSchedule.pattern) &&
        Objects.equals(this.schedule, snapshotSchedule.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, duration, name, path, pattern, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotSchedule {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
