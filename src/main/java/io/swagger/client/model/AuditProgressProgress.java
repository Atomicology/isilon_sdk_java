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
 * AuditProgressProgress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AuditProgressProgress {
  @SerializedName("protocol_audit_cee_time")
  private Integer protocolAuditCeeTime = null;

  @SerializedName("protocol_audit_log_time")
  private Integer protocolAuditLogTime = null;

  @SerializedName("protocol_audit_syslog_time")
  private Integer protocolAuditSyslogTime = null;

  public AuditProgressProgress protocolAuditCeeTime(Integer protocolAuditCeeTime) {
    this.protocolAuditCeeTime = protocolAuditCeeTime;
    return this;
  }

   /**
   * Specifies the last protocol audit event time consumed by the CEE forwarder.
   * minimum: 0
   * maximum: 4294967295
   * @return protocolAuditCeeTime
  **/
  @ApiModelProperty(value = "Specifies the last protocol audit event time consumed by the CEE forwarder.")
  public Integer getProtocolAuditCeeTime() {
    return protocolAuditCeeTime;
  }

  public void setProtocolAuditCeeTime(Integer protocolAuditCeeTime) {
    this.protocolAuditCeeTime = protocolAuditCeeTime;
  }

  public AuditProgressProgress protocolAuditLogTime(Integer protocolAuditLogTime) {
    this.protocolAuditLogTime = protocolAuditLogTime;
    return this;
  }

   /**
   * Specifies the last logged audit protocol event time.
   * minimum: 0
   * maximum: 4294967295
   * @return protocolAuditLogTime
  **/
  @ApiModelProperty(value = "Specifies the last logged audit protocol event time.")
  public Integer getProtocolAuditLogTime() {
    return protocolAuditLogTime;
  }

  public void setProtocolAuditLogTime(Integer protocolAuditLogTime) {
    this.protocolAuditLogTime = protocolAuditLogTime;
  }

  public AuditProgressProgress protocolAuditSyslogTime(Integer protocolAuditSyslogTime) {
    this.protocolAuditSyslogTime = protocolAuditSyslogTime;
    return this;
  }

   /**
   * Specifies the last protocol audit event time consumed by the Syslog forwarder.
   * minimum: 0
   * maximum: 4294967295
   * @return protocolAuditSyslogTime
  **/
  @ApiModelProperty(value = "Specifies the last protocol audit event time consumed by the Syslog forwarder.")
  public Integer getProtocolAuditSyslogTime() {
    return protocolAuditSyslogTime;
  }

  public void setProtocolAuditSyslogTime(Integer protocolAuditSyslogTime) {
    this.protocolAuditSyslogTime = protocolAuditSyslogTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditProgressProgress auditProgressProgress = (AuditProgressProgress) o;
    return Objects.equals(this.protocolAuditCeeTime, auditProgressProgress.protocolAuditCeeTime) &&
        Objects.equals(this.protocolAuditLogTime, auditProgressProgress.protocolAuditLogTime) &&
        Objects.equals(this.protocolAuditSyslogTime, auditProgressProgress.protocolAuditSyslogTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocolAuditCeeTime, protocolAuditLogTime, protocolAuditSyslogTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditProgressProgress {\n");
    
    sb.append("    protocolAuditCeeTime: ").append(toIndentedString(protocolAuditCeeTime)).append("\n");
    sb.append("    protocolAuditLogTime: ").append(toIndentedString(protocolAuditLogTime)).append("\n");
    sb.append("    protocolAuditSyslogTime: ").append(toIndentedString(protocolAuditSyslogTime)).append("\n");
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

