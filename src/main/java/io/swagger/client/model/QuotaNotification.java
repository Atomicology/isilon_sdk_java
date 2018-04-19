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
 * QuotaNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class QuotaNotification {
  @SerializedName("action_alert")
  private Boolean actionAlert = null;

  @SerializedName("action_email_address")
  private String actionEmailAddress = null;

  @SerializedName("action_email_owner")
  private Boolean actionEmailOwner = null;

  @SerializedName("email_template")
  private String emailTemplate = null;

  @SerializedName("holdoff")
  private Integer holdoff = null;

  @SerializedName("schedule")
  private String schedule = null;

  public QuotaNotification actionAlert(Boolean actionAlert) {
    this.actionAlert = actionAlert;
    return this;
  }

   /**
   * Send alert when rule matches.
   * @return actionAlert
  **/
  @ApiModelProperty(value = "Send alert when rule matches.")
  public Boolean isActionAlert() {
    return actionAlert;
  }

  public void setActionAlert(Boolean actionAlert) {
    this.actionAlert = actionAlert;
  }

  public QuotaNotification actionEmailAddress(String actionEmailAddress) {
    this.actionEmailAddress = actionEmailAddress;
    return this;
  }

   /**
   * Email a specific email address when rule matches.
   * @return actionEmailAddress
  **/
  @ApiModelProperty(value = "Email a specific email address when rule matches.")
  public String getActionEmailAddress() {
    return actionEmailAddress;
  }

  public void setActionEmailAddress(String actionEmailAddress) {
    this.actionEmailAddress = actionEmailAddress;
  }

  public QuotaNotification actionEmailOwner(Boolean actionEmailOwner) {
    this.actionEmailOwner = actionEmailOwner;
    return this;
  }

   /**
   * Email quota domain owner when rule matches.
   * @return actionEmailOwner
  **/
  @ApiModelProperty(value = "Email quota domain owner when rule matches.")
  public Boolean isActionEmailOwner() {
    return actionEmailOwner;
  }

  public void setActionEmailOwner(Boolean actionEmailOwner) {
    this.actionEmailOwner = actionEmailOwner;
  }

  public QuotaNotification emailTemplate(String emailTemplate) {
    this.emailTemplate = emailTemplate;
    return this;
  }

   /**
   * Path of optional /ifs template file used for email actions.
   * @return emailTemplate
  **/
  @ApiModelProperty(value = "Path of optional /ifs template file used for email actions.")
  public String getEmailTemplate() {
    return emailTemplate;
  }

  public void setEmailTemplate(String emailTemplate) {
    this.emailTemplate = emailTemplate;
  }

  public QuotaNotification holdoff(Integer holdoff) {
    this.holdoff = holdoff;
    return this;
  }

   /**
   * Time to wait between detections for rules triggered by user actions.
   * @return holdoff
  **/
  @ApiModelProperty(value = "Time to wait between detections for rules triggered by user actions.")
  public Integer getHoldoff() {
    return holdoff;
  }

  public void setHoldoff(Integer holdoff) {
    this.holdoff = holdoff;
  }

  public QuotaNotification schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Schedule for rules that repeatedly notify.
   * @return schedule
  **/
  @ApiModelProperty(value = "Schedule for rules that repeatedly notify.")
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
    QuotaNotification quotaNotification = (QuotaNotification) o;
    return Objects.equals(this.actionAlert, quotaNotification.actionAlert) &&
        Objects.equals(this.actionEmailAddress, quotaNotification.actionEmailAddress) &&
        Objects.equals(this.actionEmailOwner, quotaNotification.actionEmailOwner) &&
        Objects.equals(this.emailTemplate, quotaNotification.emailTemplate) &&
        Objects.equals(this.holdoff, quotaNotification.holdoff) &&
        Objects.equals(this.schedule, quotaNotification.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionAlert, actionEmailAddress, actionEmailOwner, emailTemplate, holdoff, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaNotification {\n");
    
    sb.append("    actionAlert: ").append(toIndentedString(actionAlert)).append("\n");
    sb.append("    actionEmailAddress: ").append(toIndentedString(actionEmailAddress)).append("\n");
    sb.append("    actionEmailOwner: ").append(toIndentedString(actionEmailOwner)).append("\n");
    sb.append("    emailTemplate: ").append(toIndentedString(emailTemplate)).append("\n");
    sb.append("    holdoff: ").append(toIndentedString(holdoff)).append("\n");
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

