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
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies under what conditions and over which channel an alert should be sent
 */
@ApiModel(description = "Specifies under what conditions and over which channel an alert should be sent")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class EventAlertCondition {
  /**
   * Gets or Sets categories
   */
  @JsonAdapter(CategoriesEnum.Adapter.class)
  public enum CategoriesEnum {
    ALL("all"),
    
    SYS_DISK_EVENTS("SYS_DISK_EVENTS"),
    
    _100000000("100000000"),
    
    NODE_STATUS_EVENTS("NODE_STATUS_EVENTS"),
    
    _200000000("200000000"),
    
    REBOOT_EVENTS("REBOOT_EVENTS"),
    
    _300000000("300000000"),
    
    SW_EVENTS("SW_EVENTS"),
    
    _400000000("400000000"),
    
    QUOTA_EVENTS("QUOTA_EVENTS"),
    
    _500000000("500000000"),
    
    SNAP_EVENTS("SNAP_EVENTS"),
    
    _600000000("600000000"),
    
    WINNET_EVENTS("WINNET_EVENTS"),
    
    _700000000("700000000"),
    
    FILESYS_EVENTS("FILESYS_EVENTS"),
    
    _800000000("800000000"),
    
    HW_EVENTS("HW_EVENTS"),
    
    _900000000("900000000"),
    
    CPOOL_EVENTS("CPOOL_EVENTS"),
    
    _1100000000("1100000000");

    private String value;

    CategoriesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoriesEnum fromValue(String text) {
      for (CategoriesEnum b : CategoriesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoriesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoriesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoriesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoriesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("categories")
  private List<CategoriesEnum> categories = null;

  @SerializedName("channels")
  private List<String> channels = null;

  /**
   * Trigger condition for alert
   */
  @JsonAdapter(ConditionEnum.Adapter.class)
  public enum ConditionEnum {
    NEW("NEW"),
    
    NEW_EVENTS("NEW EVENTS"),
    
    ONGOING("ONGOING"),
    
    SEVERITY_INCREASE("SEVERITY INCREASE"),
    
    SEVERITY_DECREASE("SEVERITY DECREASE"),
    
    RESOLVED("RESOLVED");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionEnum fromValue(String text) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConditionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("condition")
  private ConditionEnum condition = null;

  @SerializedName("eventgroup_ids")
  private List<String> eventgroupIds = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("limit")
  private Integer limit = null;

  /**
   * Gets or Sets severities
   */
  @JsonAdapter(SeveritiesEnum.Adapter.class)
  public enum SeveritiesEnum {
    EMERGENCY("emergency"),
    
    CRITICAL("critical"),
    
    WARNING("warning"),
    
    INFORMATION("information");

    private String value;

    SeveritiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeveritiesEnum fromValue(String text) {
      for (SeveritiesEnum b : SeveritiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeveritiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeveritiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeveritiesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeveritiesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("severities")
  private List<SeveritiesEnum> severities = null;

  @SerializedName("transient")
  private Integer _transient = null;

  public EventAlertCondition categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }

  public EventAlertCondition addCategoriesItem(CategoriesEnum categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoriesEnum>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Event Group categories to be alerted: all, 100000000 (SYS_DISK_EVENTS), 200000000 (NODE_STATUS_EVENTS), 300000000 (REBOOT_EVENTS), 400000000 (SW_EVENTS), 500000000 (QUOTA_EVENTS), 600000000 (SNAP_EVENTS), 700000000 (WINNET_EVENTS), 800000000 (FILESYS_EVENTS), 900000000 (HW_EVENTS), 1100000000 (CPOOL_EVENTS)
   * @return categories
  **/
  @ApiModelProperty(value = "Event Group categories to be alerted: all, 100000000 (SYS_DISK_EVENTS), 200000000 (NODE_STATUS_EVENTS), 300000000 (REBOOT_EVENTS), 400000000 (SW_EVENTS), 500000000 (QUOTA_EVENTS), 600000000 (SNAP_EVENTS), 700000000 (WINNET_EVENTS), 800000000 (FILESYS_EVENTS), 900000000 (HW_EVENTS), 1100000000 (CPOOL_EVENTS)")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  public EventAlertCondition channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public EventAlertCondition addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<String>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Channels for alert
   * @return channels
  **/
  @ApiModelProperty(value = "Channels for alert")
  public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }

  public EventAlertCondition condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Trigger condition for alert
   * @return condition
  **/
  @ApiModelProperty(value = "Trigger condition for alert")
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public EventAlertCondition eventgroupIds(List<String> eventgroupIds) {
    this.eventgroupIds = eventgroupIds;
    return this;
  }

  public EventAlertCondition addEventgroupIdsItem(String eventgroupIdsItem) {
    if (this.eventgroupIds == null) {
      this.eventgroupIds = new ArrayList<String>();
    }
    this.eventgroupIds.add(eventgroupIdsItem);
    return this;
  }

   /**
   * Event Group IDs to be alerted
   * @return eventgroupIds
  **/
  @ApiModelProperty(value = "Event Group IDs to be alerted")
  public List<String> getEventgroupIds() {
    return eventgroupIds;
  }

  public void setEventgroupIds(List<String> eventgroupIds) {
    this.eventgroupIds = eventgroupIds;
  }

  public EventAlertCondition interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Required with ONGOING condition only, period in seconds between alerts of ongoing conditions
   * @return interval
  **/
  @ApiModelProperty(value = "Required with ONGOING condition only, period in seconds between alerts of ongoing conditions")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public EventAlertCondition limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Required with NEW EVENTS condition only, limits the number of alerts sent as events are added
   * @return limit
  **/
  @ApiModelProperty(value = "Required with NEW EVENTS condition only, limits the number of alerts sent as events are added")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public EventAlertCondition severities(List<SeveritiesEnum> severities) {
    this.severities = severities;
    return this;
  }

  public EventAlertCondition addSeveritiesItem(SeveritiesEnum severitiesItem) {
    if (this.severities == null) {
      this.severities = new ArrayList<SeveritiesEnum>();
    }
    this.severities.add(severitiesItem);
    return this;
  }

   /**
   * Severities to be alerted
   * @return severities
  **/
  @ApiModelProperty(value = "Severities to be alerted")
  public List<SeveritiesEnum> getSeverities() {
    return severities;
  }

  public void setSeverities(List<SeveritiesEnum> severities) {
    this.severities = severities;
  }

  public EventAlertCondition _transient(Integer _transient) {
    this._transient = _transient;
    return this;
  }

   /**
   * Any eventgroup lasting less than this many seconds is deemed transient and will not generate alerts under this condition.
   * @return _transient
  **/
  @ApiModelProperty(value = "Any eventgroup lasting less than this many seconds is deemed transient and will not generate alerts under this condition.")
  public Integer getTransient() {
    return _transient;
  }

  public void setTransient(Integer _transient) {
    this._transient = _transient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventAlertCondition eventAlertCondition = (EventAlertCondition) o;
    return Objects.equals(this.categories, eventAlertCondition.categories) &&
        Objects.equals(this.channels, eventAlertCondition.channels) &&
        Objects.equals(this.condition, eventAlertCondition.condition) &&
        Objects.equals(this.eventgroupIds, eventAlertCondition.eventgroupIds) &&
        Objects.equals(this.interval, eventAlertCondition.interval) &&
        Objects.equals(this.limit, eventAlertCondition.limit) &&
        Objects.equals(this.severities, eventAlertCondition.severities) &&
        Objects.equals(this._transient, eventAlertCondition._transient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, channels, condition, eventgroupIds, interval, limit, severities, _transient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventAlertCondition {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    eventgroupIds: ").append(toIndentedString(eventgroupIds)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    severities: ").append(toIndentedString(severities)).append("\n");
    sb.append("    _transient: ").append(toIndentedString(_transient)).append("\n");
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

