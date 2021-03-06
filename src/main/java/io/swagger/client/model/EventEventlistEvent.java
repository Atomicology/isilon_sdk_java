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
import io.swagger.client.model.Empty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EventEventlistEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class EventEventlistEvent {
  @SerializedName("devid")
  private Integer devid = null;

  @SerializedName("ended")
  private BigDecimal ended = null;

  @SerializedName("event")
  private Integer event = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("resolve_time")
  private Integer resolveTime = null;

  /**
   * Severity of event occurrence.
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    INFORMATION("information"),
    
    WARNING("warning"),
    
    CRITICAL("critical"),
    
    EMERGENCY("emergency"),
    
    UNKNOWN("unknown");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("severity")
  private SeverityEnum severity = null;

  @SerializedName("specifier")
  private Empty specifier = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("value")
  private BigDecimal value = null;

  public EventEventlistEvent devid(Integer devid) {
    this.devid = devid;
    return this;
  }

   /**
   * The device id of the node if it is still part of the cluster otherwise None.
   * @return devid
  **/
  @ApiModelProperty(value = "The device id of the node if it is still part of the cluster otherwise None.")
  public Integer getDevid() {
    return devid;
  }

  public void setDevid(Integer devid) {
    this.devid = devid;
  }

  public EventEventlistEvent ended(BigDecimal ended) {
    this.ended = ended;
    return this;
  }

   /**
   * Time event was ended (eventgroup resolved)
   * @return ended
  **/
  @ApiModelProperty(value = "Time event was ended (eventgroup resolved)")
  public BigDecimal getEnded() {
    return ended;
  }

  public void setEnded(BigDecimal ended) {
    this.ended = ended;
  }

  public EventEventlistEvent event(Integer event) {
    this.event = event;
    return this;
  }

   /**
   * Integer identifier of the event type
   * @return event
  **/
  @ApiModelProperty(value = "Integer identifier of the event type")
  public Integer getEvent() {
    return event;
  }

  public void setEvent(Integer event) {
    this.event = event;
  }

  public EventEventlistEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of event occurrence.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of event occurrence.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EventEventlistEvent lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * The lnn of the node if it is still part of the cluster, otherwise None.
   * @return lnn
  **/
  @ApiModelProperty(value = "The lnn of the node if it is still part of the cluster, otherwise None.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }

  public EventEventlistEvent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human readable description
   * @return message
  **/
  @ApiModelProperty(value = "Human readable description")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public EventEventlistEvent resolveTime(Integer resolveTime) {
    this.resolveTime = resolveTime;
    return this;
  }

   /**
   * Time the event was resolved.
   * @return resolveTime
  **/
  @ApiModelProperty(value = "Time the event was resolved.")
  public Integer getResolveTime() {
    return resolveTime;
  }

  public void setResolveTime(Integer resolveTime) {
    this.resolveTime = resolveTime;
  }

  public EventEventlistEvent severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Severity of event occurrence.
   * @return severity
  **/
  @ApiModelProperty(value = "Severity of event occurrence.")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public EventEventlistEvent specifier(Empty specifier) {
    this.specifier = specifier;
    return this;
  }

   /**
   * A collection of parameters defined per event.
   * @return specifier
  **/
  @ApiModelProperty(value = "A collection of parameters defined per event.")
  public Empty getSpecifier() {
    return specifier;
  }

  public void setSpecifier(Empty specifier) {
    this.specifier = specifier;
  }

  public EventEventlistEvent time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Time event was detected as UNIX timestamp.
   * @return time
  **/
  @ApiModelProperty(value = "Time event was detected as UNIX timestamp.")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public EventEventlistEvent value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of measurement associated with this event.
   * @return value
  **/
  @ApiModelProperty(value = "Value of measurement associated with this event.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEventlistEvent eventEventlistEvent = (EventEventlistEvent) o;
    return Objects.equals(this.devid, eventEventlistEvent.devid) &&
        Objects.equals(this.ended, eventEventlistEvent.ended) &&
        Objects.equals(this.event, eventEventlistEvent.event) &&
        Objects.equals(this.id, eventEventlistEvent.id) &&
        Objects.equals(this.lnn, eventEventlistEvent.lnn) &&
        Objects.equals(this.message, eventEventlistEvent.message) &&
        Objects.equals(this.resolveTime, eventEventlistEvent.resolveTime) &&
        Objects.equals(this.severity, eventEventlistEvent.severity) &&
        Objects.equals(this.specifier, eventEventlistEvent.specifier) &&
        Objects.equals(this.time, eventEventlistEvent.time) &&
        Objects.equals(this.value, eventEventlistEvent.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devid, ended, event, id, lnn, message, resolveTime, severity, specifier, time, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEventlistEvent {\n");
    
    sb.append("    devid: ").append(toIndentedString(devid)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resolveTime: ").append(toIndentedString(resolveTime)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    specifier: ").append(toIndentedString(specifier)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

