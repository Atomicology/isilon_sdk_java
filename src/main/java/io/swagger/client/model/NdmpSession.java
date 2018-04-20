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
 * NdmpSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NdmpSession {
  @SerializedName("id")
  private String id = null;

  @SerializedName("probe_info")
  private String probeInfo = null;

  @SerializedName("session")
  private String session = null;

  public NdmpSession id(String id) {
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

  public NdmpSession probeInfo(String probeInfo) {
    this.probeInfo = probeInfo;
    return this;
  }

   /**
   * Text information from probing the session
   * @return probeInfo
  **/
  @ApiModelProperty(value = "Text information from probing the session")
  public String getProbeInfo() {
    return probeInfo;
  }

  public void setProbeInfo(String probeInfo) {
    this.probeInfo = probeInfo;
  }

  public NdmpSession session(String session) {
    this.session = session;
    return this;
  }

   /**
   * session ID
   * @return session
  **/
  @ApiModelProperty(value = "session ID")
  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSession ndmpSession = (NdmpSession) o;
    return Objects.equals(this.id, ndmpSession.id) &&
        Objects.equals(this.probeInfo, ndmpSession.probeInfo) &&
        Objects.equals(this.session, ndmpSession.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, probeInfo, session);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    probeInfo: ").append(toIndentedString(probeInfo)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

