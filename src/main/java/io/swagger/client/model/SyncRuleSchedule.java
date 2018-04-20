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
 * SyncRuleSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SyncRuleSchedule {
  @SerializedName("begin")
  private String begin = null;

  @SerializedName("end")
  private String end = null;

  @SerializedName("friday")
  private Boolean friday = null;

  @SerializedName("monday")
  private Boolean monday = null;

  @SerializedName("saturday")
  private Boolean saturday = null;

  @SerializedName("sunday")
  private Boolean sunday = null;

  @SerializedName("thursday")
  private Boolean thursday = null;

  @SerializedName("tuesday")
  private Boolean tuesday = null;

  @SerializedName("wednesday")
  private Boolean wednesday = null;

  public SyncRuleSchedule begin(String begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Start time (inclusive) for this schedule, during its specified days.  Format is \&quot;hh:mm\&quot; (24h format hour, and minute).  A null value indicates the beginning of the day (\&quot;00:00\&quot;).
   * @return begin
  **/
  @ApiModelProperty(value = "Start time (inclusive) for this schedule, during its specified days.  Format is \"hh:mm\" (24h format hour, and minute).  A null value indicates the beginning of the day (\"00:00\").")
  public String getBegin() {
    return begin;
  }

  public void setBegin(String begin) {
    this.begin = begin;
  }

  public SyncRuleSchedule end(String end) {
    this.end = end;
    return this;
  }

   /**
   * End time (inclusive) for this schedule, during its specified days.  Format is \&quot;hh:mm\&quot; (three-letter weekday name abbreviation, 24h format hour, and minute).  A null value indicates the end of the day (\&quot;23:59\&quot;).
   * @return end
  **/
  @ApiModelProperty(value = "End time (inclusive) for this schedule, during its specified days.  Format is \"hh:mm\" (three-letter weekday name abbreviation, 24h format hour, and minute).  A null value indicates the end of the day (\"23:59\").")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public SyncRuleSchedule friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * If true, this rule is in effect on Friday.  If false, or unspecified, it is not.
   * @return friday
  **/
  @ApiModelProperty(value = "If true, this rule is in effect on Friday.  If false, or unspecified, it is not.")
  public Boolean isFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public SyncRuleSchedule monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * If true, this rule is in effect on Monday.  If false, or unspecified, it is not.
   * @return monday
  **/
  @ApiModelProperty(value = "If true, this rule is in effect on Monday.  If false, or unspecified, it is not.")
  public Boolean isMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  public SyncRuleSchedule saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * If true, this rule is in effect on Saturday.  If false, or unspecified, it is not.
   * @return saturday
  **/
  @ApiModelProperty(value = "If true, this rule is in effect on Saturday.  If false, or unspecified, it is not.")
  public Boolean isSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public SyncRuleSchedule sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * If true, this rule is in effect on Sunday.  If false, or unspecified, it is not.
   * @return sunday
  **/
  @ApiModelProperty(value = "If true, this rule is in effect on Sunday.  If false, or unspecified, it is not.")
  public Boolean isSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public SyncRuleSchedule thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * If true, this rule is in effect on Thursday.  If false, or unspecified, it is not.
   * @return thursday
  **/
  @ApiModelProperty(value = "If true, this rule is in effect on Thursday.  If false, or unspecified, it is not.")
  public Boolean isThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public SyncRuleSchedule tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * If true, this rule is in effect on Tuesday.  If false, or unspecified, it is not.
   * @return tuesday
  **/
  @ApiModelProperty(value = "If true, this rule is in effect on Tuesday.  If false, or unspecified, it is not.")
  public Boolean isTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public SyncRuleSchedule wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * If true, this rule is in effect on Wednesday.  If false, or unspecified, it is not.
   * @return wednesday
  **/
  @ApiModelProperty(value = "If true, this rule is in effect on Wednesday.  If false, or unspecified, it is not.")
  public Boolean isWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncRuleSchedule syncRuleSchedule = (SyncRuleSchedule) o;
    return Objects.equals(this.begin, syncRuleSchedule.begin) &&
        Objects.equals(this.end, syncRuleSchedule.end) &&
        Objects.equals(this.friday, syncRuleSchedule.friday) &&
        Objects.equals(this.monday, syncRuleSchedule.monday) &&
        Objects.equals(this.saturday, syncRuleSchedule.saturday) &&
        Objects.equals(this.sunday, syncRuleSchedule.sunday) &&
        Objects.equals(this.thursday, syncRuleSchedule.thursday) &&
        Objects.equals(this.tuesday, syncRuleSchedule.tuesday) &&
        Objects.equals(this.wednesday, syncRuleSchedule.wednesday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, end, friday, monday, saturday, sunday, thursday, tuesday, wednesday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncRuleSchedule {\n");
    
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
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

