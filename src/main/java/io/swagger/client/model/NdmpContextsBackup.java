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
import io.swagger.client.model.NdmpContextsBackupSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * View a NDMP Context
 */
@ApiModel(description = "View a NDMP Context")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NdmpContextsBackup {
  @SerializedName("context_expiration_time")
  private Integer contextExpirationTime = null;

  @SerializedName("context_id")
  private String contextId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("sessions")
  private List<NdmpContextsBackupSession> sessions = null;

  @SerializedName("snapid")
  private Integer snapid = null;

  @SerializedName("start_time")
  private Integer startTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("total_sessions")
  private Integer totalSessions = null;

  @SerializedName("type")
  private String type = null;

  public NdmpContextsBackup contextExpirationTime(Integer contextExpirationTime) {
    this.contextExpirationTime = contextExpirationTime;
    return this;
  }

   /**
   * Context expiration time
   * @return contextExpirationTime
  **/
  @ApiModelProperty(value = "Context expiration time")
  public Integer getContextExpirationTime() {
    return contextExpirationTime;
  }

  public void setContextExpirationTime(Integer contextExpirationTime) {
    this.contextExpirationTime = contextExpirationTime;
  }

  public NdmpContextsBackup contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * Context ID
   * @return contextId
  **/
  @ApiModelProperty(value = "Context ID")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public NdmpContextsBackup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique display id.
   * @return id
  **/
  @ApiModelProperty(value = "Unique display id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NdmpContextsBackup path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The directory of the backup. This is not applicable to restore contexts.
   * @return path
  **/
  @ApiModelProperty(value = "The directory of the backup. This is not applicable to restore contexts.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public NdmpContextsBackup sessions(List<NdmpContextsBackupSession> sessions) {
    this.sessions = sessions;
    return this;
  }

  public NdmpContextsBackup addSessionsItem(NdmpContextsBackupSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<NdmpContextsBackupSession>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @ApiModelProperty(value = "")
  public List<NdmpContextsBackupSession> getSessions() {
    return sessions;
  }

  public void setSessions(List<NdmpContextsBackupSession> sessions) {
    this.sessions = sessions;
  }

  public NdmpContextsBackup snapid(Integer snapid) {
    this.snapid = snapid;
    return this;
  }

   /**
   * Snapshot ID reserved for the context. This is not applicable to restore contexts.
   * @return snapid
  **/
  @ApiModelProperty(value = "Snapshot ID reserved for the context. This is not applicable to restore contexts.")
  public Integer getSnapid() {
    return snapid;
  }

  public void setSnapid(Integer snapid) {
    this.snapid = snapid;
  }

  public NdmpContextsBackup startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Context creation time
   * @return startTime
  **/
  @ApiModelProperty(value = "Context creation time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public NdmpContextsBackup status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Whether the context is active.
   * @return status
  **/
  @ApiModelProperty(value = "Whether the context is active.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NdmpContextsBackup totalSessions(Integer totalSessions) {
    this.totalSessions = totalSessions;
    return this;
  }

   /**
   * The number of sessions in the context
   * @return totalSessions
  **/
  @ApiModelProperty(value = "The number of sessions in the context")
  public Integer getTotalSessions() {
    return totalSessions;
  }

  public void setTotalSessions(Integer totalSessions) {
    this.totalSessions = totalSessions;
  }

  public NdmpContextsBackup type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of context; It can be bre, backup, and restore
   * @return type
  **/
  @ApiModelProperty(value = "Type of context; It can be bre, backup, and restore")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpContextsBackup ndmpContextsBackup = (NdmpContextsBackup) o;
    return Objects.equals(this.contextExpirationTime, ndmpContextsBackup.contextExpirationTime) &&
        Objects.equals(this.contextId, ndmpContextsBackup.contextId) &&
        Objects.equals(this.id, ndmpContextsBackup.id) &&
        Objects.equals(this.path, ndmpContextsBackup.path) &&
        Objects.equals(this.sessions, ndmpContextsBackup.sessions) &&
        Objects.equals(this.snapid, ndmpContextsBackup.snapid) &&
        Objects.equals(this.startTime, ndmpContextsBackup.startTime) &&
        Objects.equals(this.status, ndmpContextsBackup.status) &&
        Objects.equals(this.totalSessions, ndmpContextsBackup.totalSessions) &&
        Objects.equals(this.type, ndmpContextsBackup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextExpirationTime, contextId, id, path, sessions, snapid, startTime, status, totalSessions, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpContextsBackup {\n");
    
    sb.append("    contextExpirationTime: ").append(toIndentedString(contextExpirationTime)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    snapid: ").append(toIndentedString(snapid)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalSessions: ").append(toIndentedString(totalSessions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

