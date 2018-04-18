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
import io.swagger.client.model.QuotaNotificationExtended;
import io.swagger.client.model.QuotaNotifications;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QuotaNotificationsExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class QuotaNotificationsExtended {
  @SerializedName("notifications")
  private List<QuotaNotificationExtended> notifications = null;

  @SerializedName("total")
  private Integer total = null;

  public QuotaNotificationsExtended notifications(List<QuotaNotificationExtended> notifications) {
    this.notifications = notifications;
    return this;
  }

  public QuotaNotificationsExtended addNotificationsItem(QuotaNotificationExtended notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<QuotaNotificationExtended>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @ApiModelProperty(value = "")
  public List<QuotaNotificationExtended> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<QuotaNotificationExtended> notifications) {
    this.notifications = notifications;
  }

  public QuotaNotificationsExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaNotificationsExtended quotaNotificationsExtended = (QuotaNotificationsExtended) o;
    return Objects.equals(this.notifications, quotaNotificationsExtended.notifications) &&
        Objects.equals(this.total, quotaNotificationsExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaNotificationsExtended {\n");
    
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

