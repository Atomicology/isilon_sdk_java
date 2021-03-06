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
import java.io.IOException;

/**
 * AuthGroupObjectHistoryItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AuthGroupObjectHistoryItem {
  @SerializedName("gid")
  private AuthAccessAccessItemFileGroup gid = null;

  @SerializedName("sid")
  private AuthAccessAccessItemFileGroup sid = null;

  @SerializedName("uid")
  private AuthAccessAccessItemFileGroup uid = null;

  public AuthGroupObjectHistoryItem gid(AuthAccessAccessItemFileGroup gid) {
    this.gid = gid;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return gid
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getGid() {
    return gid;
  }

  public void setGid(AuthAccessAccessItemFileGroup gid) {
    this.gid = gid;
  }

  public AuthGroupObjectHistoryItem sid(AuthAccessAccessItemFileGroup sid) {
    this.sid = sid;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return sid
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getSid() {
    return sid;
  }

  public void setSid(AuthAccessAccessItemFileGroup sid) {
    this.sid = sid;
  }

  public AuthGroupObjectHistoryItem uid(AuthAccessAccessItemFileGroup uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return uid
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getUid() {
    return uid;
  }

  public void setUid(AuthAccessAccessItemFileGroup uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthGroupObjectHistoryItem authGroupObjectHistoryItem = (AuthGroupObjectHistoryItem) o;
    return Objects.equals(this.gid, authGroupObjectHistoryItem.gid) &&
        Objects.equals(this.sid, authGroupObjectHistoryItem.sid) &&
        Objects.equals(this.uid, authGroupObjectHistoryItem.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, sid, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGroupObjectHistoryItem {\n");
    
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

