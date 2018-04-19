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
import io.swagger.client.model.NdmpSessionExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NdmpSessionsExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NdmpSessionsExtended {
  @SerializedName("resume")
  private String resume = null;

  @SerializedName("sessions")
  private List<NdmpSessionExtended> sessions = null;

  @SerializedName("total")
  private Integer total = null;

  public NdmpSessionsExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
   * @return resume
  **/
  @ApiModelProperty(value = "Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public NdmpSessionsExtended sessions(List<NdmpSessionExtended> sessions) {
    this.sessions = sessions;
    return this;
  }

  public NdmpSessionsExtended addSessionsItem(NdmpSessionExtended sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<NdmpSessionExtended>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @ApiModelProperty(value = "")
  public List<NdmpSessionExtended> getSessions() {
    return sessions;
  }

  public void setSessions(List<NdmpSessionExtended> sessions) {
    this.sessions = sessions;
  }

  public NdmpSessionsExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSessionsExtended ndmpSessionsExtended = (NdmpSessionsExtended) o;
    return Objects.equals(this.resume, ndmpSessionsExtended.resume) &&
        Objects.equals(this.sessions, ndmpSessionsExtended.sessions) &&
        Objects.equals(this.total, ndmpSessionsExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resume, sessions, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSessionsExtended {\n");
    
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

