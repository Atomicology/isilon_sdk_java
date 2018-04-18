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
import io.swagger.client.model.AuditTopic;
import java.io.IOException;

/**
 * AuditTopicExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuditTopicExtended {
  @SerializedName("id")
  private String id = null;

  @SerializedName("max_cached_messages")
  private Integer maxCachedMessages = null;

  @SerializedName("name")
  private String name = null;

  public AuditTopicExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the system-provided ID for the audit topic.
   * @return id
  **/
  @ApiModelProperty(value = "Specifies the system-provided ID for the audit topic.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditTopicExtended maxCachedMessages(Integer maxCachedMessages) {
    this.maxCachedMessages = maxCachedMessages;
    return this;
  }

   /**
   * Specifies the maximum number of messages that can be sent and received at the same time. Messages that are sent and received at the same time can be lost if a system crash occurs. You can prevent message loss by setting this property to 0, which sets audit logs to synchronous.
   * minimum: 0
   * maximum: 16384
   * @return maxCachedMessages
  **/
  @ApiModelProperty(value = "Specifies the maximum number of messages that can be sent and received at the same time. Messages that are sent and received at the same time can be lost if a system crash occurs. You can prevent message loss by setting this property to 0, which sets audit logs to synchronous.")
  public Integer getMaxCachedMessages() {
    return maxCachedMessages;
  }

  public void setMaxCachedMessages(Integer maxCachedMessages) {
    this.maxCachedMessages = maxCachedMessages;
  }

  public AuditTopicExtended name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the audit topic.
   * @return name
  **/
  @ApiModelProperty(value = "Specifies the name of the audit topic.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTopicExtended auditTopicExtended = (AuditTopicExtended) o;
    return Objects.equals(this.id, auditTopicExtended.id) &&
        Objects.equals(this.maxCachedMessages, auditTopicExtended.maxCachedMessages) &&
        Objects.equals(this.name, auditTopicExtended.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxCachedMessages, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTopicExtended {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxCachedMessages: ").append(toIndentedString(maxCachedMessages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
