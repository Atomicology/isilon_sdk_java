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
import io.swagger.client.model.EventEventgroupOccurrencesEventgroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventEventgroupOccurrences
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class EventEventgroupOccurrences {
  @SerializedName("eventgroups")
  private List<EventEventgroupOccurrencesEventgroup> eventgroups = null;

  public EventEventgroupOccurrences eventgroups(List<EventEventgroupOccurrencesEventgroup> eventgroups) {
    this.eventgroups = eventgroups;
    return this;
  }

  public EventEventgroupOccurrences addEventgroupsItem(EventEventgroupOccurrencesEventgroup eventgroupsItem) {
    if (this.eventgroups == null) {
      this.eventgroups = new ArrayList<EventEventgroupOccurrencesEventgroup>();
    }
    this.eventgroups.add(eventgroupsItem);
    return this;
  }

   /**
   * Get eventgroups
   * @return eventgroups
  **/
  @ApiModelProperty(value = "")
  public List<EventEventgroupOccurrencesEventgroup> getEventgroups() {
    return eventgroups;
  }

  public void setEventgroups(List<EventEventgroupOccurrencesEventgroup> eventgroups) {
    this.eventgroups = eventgroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEventgroupOccurrences eventEventgroupOccurrences = (EventEventgroupOccurrences) o;
    return Objects.equals(this.eventgroups, eventEventgroupOccurrences.eventgroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventgroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEventgroupOccurrences {\n");
    
    sb.append("    eventgroups: ").append(toIndentedString(eventgroups)).append("\n");
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

