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
import io.swagger.client.model.EventEventlist;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventEventlists
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class EventEventlists {
  @SerializedName("eventlists")
  private List<EventEventlist> eventlists = null;

  public EventEventlists eventlists(List<EventEventlist> eventlists) {
    this.eventlists = eventlists;
    return this;
  }

  public EventEventlists addEventlistsItem(EventEventlist eventlistsItem) {
    if (this.eventlists == null) {
      this.eventlists = new ArrayList<EventEventlist>();
    }
    this.eventlists.add(eventlistsItem);
    return this;
  }

   /**
   * Get eventlists
   * @return eventlists
  **/
  @ApiModelProperty(value = "")
  public List<EventEventlist> getEventlists() {
    return eventlists;
  }

  public void setEventlists(List<EventEventlist> eventlists) {
    this.eventlists = eventlists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEventlists eventEventlists = (EventEventlists) o;
    return Objects.equals(this.eventlists, eventEventlists.eventlists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventlists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEventlists {\n");
    
    sb.append("    eventlists: ").append(toIndentedString(eventlists)).append("\n");
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

