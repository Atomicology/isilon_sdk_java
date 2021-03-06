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
import io.swagger.client.model.NdmpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * View probe info of a NDMP session
 */
@ApiModel(description = "View probe info of a NDMP session")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NdmpSessions {
  @SerializedName("sessions")
  private List<NdmpSession> sessions = null;

  public NdmpSessions sessions(List<NdmpSession> sessions) {
    this.sessions = sessions;
    return this;
  }

  public NdmpSessions addSessionsItem(NdmpSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<NdmpSession>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @ApiModelProperty(value = "")
  public List<NdmpSession> getSessions() {
    return sessions;
  }

  public void setSessions(List<NdmpSession> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSessions ndmpSessions = (NdmpSessions) o;
    return Objects.equals(this.sessions, ndmpSessions.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSessions {\n");
    
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

