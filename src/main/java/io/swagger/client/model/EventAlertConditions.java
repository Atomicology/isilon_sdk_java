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
import io.swagger.client.model.EventAlertConditionsAlertCondition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventAlertConditions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class EventAlertConditions {
  @SerializedName("alert-conditions")
  private List<EventAlertConditionsAlertCondition> alertConditions = null;

  public EventAlertConditions alertConditions(List<EventAlertConditionsAlertCondition> alertConditions) {
    this.alertConditions = alertConditions;
    return this;
  }

  public EventAlertConditions addAlertConditionsItem(EventAlertConditionsAlertCondition alertConditionsItem) {
    if (this.alertConditions == null) {
      this.alertConditions = new ArrayList<EventAlertConditionsAlertCondition>();
    }
    this.alertConditions.add(alertConditionsItem);
    return this;
  }

   /**
   * Get alertConditions
   * @return alertConditions
  **/
  @ApiModelProperty(value = "")
  public List<EventAlertConditionsAlertCondition> getAlertConditions() {
    return alertConditions;
  }

  public void setAlertConditions(List<EventAlertConditionsAlertCondition> alertConditions) {
    this.alertConditions = alertConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventAlertConditions eventAlertConditions = (EventAlertConditions) o;
    return Objects.equals(this.alertConditions, eventAlertConditions.alertConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertConditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventAlertConditions {\n");
    
    sb.append("    alertConditions: ").append(toIndentedString(alertConditions)).append("\n");
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
