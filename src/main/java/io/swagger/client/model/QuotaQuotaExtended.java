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
import io.swagger.client.model.AuthAccessAccessItemFileGroup;
import io.swagger.client.model.QuotaQuotaThresholdsExtended;
import io.swagger.client.model.QuotaQuotaUsage;
import java.io.IOException;

/**
 * QuotaQuotaExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class QuotaQuotaExtended {
  @SerializedName("container")
  private Boolean container = null;

  @SerializedName("enforced")
  private Boolean enforced = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("include_snapshots")
  private Boolean includeSnapshots = null;

  @SerializedName("linked")
  private Boolean linked = null;

  /**
   * Summary of notifications: &#39;custom&#39; indicates one or more notification rules available from the notifications sub-resource; &#39;default&#39; indicates system default rules are used; &#39;disabled&#39; indicates that no notifications will be used for this quota.
   */
  @JsonAdapter(NotificationsEnum.Adapter.class)
  public enum NotificationsEnum {
    CUSTOM("custom"),
    
    DEFAULT("default"),
    
    DISABLED("disabled");

    private String value;

    NotificationsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationsEnum fromValue(String text) {
      for (NotificationsEnum b : NotificationsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NotificationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NotificationsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("notifications")
  private NotificationsEnum notifications = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("persona")
  private AuthAccessAccessItemFileGroup persona = null;

  @SerializedName("ready")
  private Boolean ready = null;

  @SerializedName("thresholds")
  private QuotaQuotaThresholdsExtended thresholds = null;

  @SerializedName("thresholds_include_overhead")
  private Boolean thresholdsIncludeOverhead = null;

  /**
   * The type of quota.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DIRECTORY("directory"),
    
    USER("user"),
    
    GROUP("group"),
    
    DEFAULT_USER("default-user"),
    
    DEFAULT_GROUP("default-group");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("usage")
  private QuotaQuotaUsage usage = null;

  public QuotaQuotaExtended container(Boolean container) {
    this.container = container;
    return this;
  }

   /**
   * If true, SMB shares using the quota directory see the quota thresholds as share size.
   * @return container
  **/
  @ApiModelProperty(required = true, value = "If true, SMB shares using the quota directory see the quota thresholds as share size.")
  public Boolean isContainer() {
    return container;
  }

  public void setContainer(Boolean container) {
    this.container = container;
  }

  public QuotaQuotaExtended enforced(Boolean enforced) {
    this.enforced = enforced;
    return this;
  }

   /**
   * True if the quota provides enforcement, otherwise a accounting quota.
   * @return enforced
  **/
  @ApiModelProperty(required = true, value = "True if the quota provides enforcement, otherwise a accounting quota.")
  public Boolean isEnforced() {
    return enforced;
  }

  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }

  public QuotaQuotaExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The system ID given to the quota.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The system ID given to the quota.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuotaQuotaExtended includeSnapshots(Boolean includeSnapshots) {
    this.includeSnapshots = includeSnapshots;
    return this;
  }

   /**
   * If true, quota governs snapshot data as well as head data.
   * @return includeSnapshots
  **/
  @ApiModelProperty(required = true, value = "If true, quota governs snapshot data as well as head data.")
  public Boolean isIncludeSnapshots() {
    return includeSnapshots;
  }

  public void setIncludeSnapshots(Boolean includeSnapshots) {
    this.includeSnapshots = includeSnapshots;
  }

  public QuotaQuotaExtended linked(Boolean linked) {
    this.linked = linked;
    return this;
  }

   /**
   * For user and group quotas, true if the quota is linked and controlled by a parent default-* quota. Linked quotas cannot be modified until they are unlinked.
   * @return linked
  **/
  @ApiModelProperty(value = "For user and group quotas, true if the quota is linked and controlled by a parent default-* quota. Linked quotas cannot be modified until they are unlinked.")
  public Boolean isLinked() {
    return linked;
  }

  public void setLinked(Boolean linked) {
    this.linked = linked;
  }

  public QuotaQuotaExtended notifications(NotificationsEnum notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Summary of notifications: &#39;custom&#39; indicates one or more notification rules available from the notifications sub-resource; &#39;default&#39; indicates system default rules are used; &#39;disabled&#39; indicates that no notifications will be used for this quota.
   * @return notifications
  **/
  @ApiModelProperty(required = true, value = "Summary of notifications: 'custom' indicates one or more notification rules available from the notifications sub-resource; 'default' indicates system default rules are used; 'disabled' indicates that no notifications will be used for this quota.")
  public NotificationsEnum getNotifications() {
    return notifications;
  }

  public void setNotifications(NotificationsEnum notifications) {
    this.notifications = notifications;
  }

  public QuotaQuotaExtended path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The /ifs path governed.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The /ifs path governed.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public QuotaQuotaExtended persona(AuthAccessAccessItemFileGroup persona) {
    this.persona = persona;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return persona
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getPersona() {
    return persona;
  }

  public void setPersona(AuthAccessAccessItemFileGroup persona) {
    this.persona = persona;
  }

  public QuotaQuotaExtended ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

   /**
   * True if the accounting is accurate on the quota.  If false, this quota is waiting on completion of a QuotaScan job.
   * @return ready
  **/
  @ApiModelProperty(required = true, value = "True if the accounting is accurate on the quota.  If false, this quota is waiting on completion of a QuotaScan job.")
  public Boolean isReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public QuotaQuotaExtended thresholds(QuotaQuotaThresholdsExtended thresholds) {
    this.thresholds = thresholds;
    return this;
  }

   /**
   * 
   * @return thresholds
  **/
  @ApiModelProperty(required = true, value = "")
  public QuotaQuotaThresholdsExtended getThresholds() {
    return thresholds;
  }

  public void setThresholds(QuotaQuotaThresholdsExtended thresholds) {
    this.thresholds = thresholds;
  }

  public QuotaQuotaExtended thresholdsIncludeOverhead(Boolean thresholdsIncludeOverhead) {
    this.thresholdsIncludeOverhead = thresholdsIncludeOverhead;
    return this;
  }

   /**
   * If true, thresholds apply to data plus filesystem overhead required to store the data (i.e. &#39;physical&#39; usage).
   * @return thresholdsIncludeOverhead
  **/
  @ApiModelProperty(required = true, value = "If true, thresholds apply to data plus filesystem overhead required to store the data (i.e. 'physical' usage).")
  public Boolean isThresholdsIncludeOverhead() {
    return thresholdsIncludeOverhead;
  }

  public void setThresholdsIncludeOverhead(Boolean thresholdsIncludeOverhead) {
    this.thresholdsIncludeOverhead = thresholdsIncludeOverhead;
  }

  public QuotaQuotaExtended type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of quota.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of quota.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public QuotaQuotaExtended usage(QuotaQuotaUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * 
   * @return usage
  **/
  @ApiModelProperty(required = true, value = "")
  public QuotaQuotaUsage getUsage() {
    return usage;
  }

  public void setUsage(QuotaQuotaUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaQuotaExtended quotaQuotaExtended = (QuotaQuotaExtended) o;
    return Objects.equals(this.container, quotaQuotaExtended.container) &&
        Objects.equals(this.enforced, quotaQuotaExtended.enforced) &&
        Objects.equals(this.id, quotaQuotaExtended.id) &&
        Objects.equals(this.includeSnapshots, quotaQuotaExtended.includeSnapshots) &&
        Objects.equals(this.linked, quotaQuotaExtended.linked) &&
        Objects.equals(this.notifications, quotaQuotaExtended.notifications) &&
        Objects.equals(this.path, quotaQuotaExtended.path) &&
        Objects.equals(this.persona, quotaQuotaExtended.persona) &&
        Objects.equals(this.ready, quotaQuotaExtended.ready) &&
        Objects.equals(this.thresholds, quotaQuotaExtended.thresholds) &&
        Objects.equals(this.thresholdsIncludeOverhead, quotaQuotaExtended.thresholdsIncludeOverhead) &&
        Objects.equals(this.type, quotaQuotaExtended.type) &&
        Objects.equals(this.usage, quotaQuotaExtended.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, enforced, id, includeSnapshots, linked, notifications, path, persona, ready, thresholds, thresholdsIncludeOverhead, type, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaQuotaExtended {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includeSnapshots: ").append(toIndentedString(includeSnapshots)).append("\n");
    sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    thresholdsIncludeOverhead: ").append(toIndentedString(thresholdsIncludeOverhead)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

