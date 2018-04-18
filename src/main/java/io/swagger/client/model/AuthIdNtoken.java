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
import io.swagger.client.model.AuthIdNtokenPrivilegeItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthIdNtoken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuthIdNtoken {
  @SerializedName("additional_id")
  private List<AuthAccessAccessItemFileGroup> additionalId = null;

  @SerializedName("gid")
  private AuthAccessAccessItemFileGroup gid = null;

  @SerializedName("group_sid")
  private AuthAccessAccessItemFileGroup groupSid = null;

  @SerializedName("ifs_restricted")
  private Boolean ifsRestricted = null;

  @SerializedName("local_address")
  private String localAddress = null;

  @SerializedName("on_disk_group_id")
  private AuthAccessAccessItemFileGroup onDiskGroupId = null;

  @SerializedName("on_disk_user_id")
  private AuthAccessAccessItemFileGroup onDiskUserId = null;

  @SerializedName("privilege")
  private List<AuthIdNtokenPrivilegeItem> privilege = null;

  @SerializedName("protocol")
  private Integer protocol = null;

  @SerializedName("remote_address")
  private String remoteAddress = null;

  @SerializedName("uid")
  private AuthAccessAccessItemFileGroup uid = null;

  @SerializedName("user_sid")
  private AuthAccessAccessItemFileGroup userSid = null;

  @SerializedName("zid")
  private Integer zid = null;

  @SerializedName("zone_id")
  private String zoneId = null;

  public AuthIdNtoken additionalId(List<AuthAccessAccessItemFileGroup> additionalId) {
    this.additionalId = additionalId;
    return this;
  }

  public AuthIdNtoken addAdditionalIdItem(AuthAccessAccessItemFileGroup additionalIdItem) {
    if (this.additionalId == null) {
      this.additionalId = new ArrayList<AuthAccessAccessItemFileGroup>();
    }
    this.additionalId.add(additionalIdItem);
    return this;
  }

   /**
   * Specifies additional UIDs, GIDs, and SIDs.
   * @return additionalId
  **/
  @ApiModelProperty(value = "Specifies additional UIDs, GIDs, and SIDs.")
  public List<AuthAccessAccessItemFileGroup> getAdditionalId() {
    return additionalId;
  }

  public void setAdditionalId(List<AuthAccessAccessItemFileGroup> additionalId) {
    this.additionalId = additionalId;
  }

  public AuthIdNtoken gid(AuthAccessAccessItemFileGroup gid) {
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

  public AuthIdNtoken groupSid(AuthAccessAccessItemFileGroup groupSid) {
    this.groupSid = groupSid;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return groupSid
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getGroupSid() {
    return groupSid;
  }

  public void setGroupSid(AuthAccessAccessItemFileGroup groupSid) {
    this.groupSid = groupSid;
  }

  public AuthIdNtoken ifsRestricted(Boolean ifsRestricted) {
    this.ifsRestricted = ifsRestricted;
    return this;
  }

   /**
   * Indicates if this user has restricted access to the /ifs file system.
   * @return ifsRestricted
  **/
  @ApiModelProperty(value = "Indicates if this user has restricted access to the /ifs file system.")
  public Boolean isIfsRestricted() {
    return ifsRestricted;
  }

  public void setIfsRestricted(Boolean ifsRestricted) {
    this.ifsRestricted = ifsRestricted;
  }

  public AuthIdNtoken localAddress(String localAddress) {
    this.localAddress = localAddress;
    return this;
  }

   /**
   * Get localAddress
   * @return localAddress
  **/
  @ApiModelProperty(value = "")
  public String getLocalAddress() {
    return localAddress;
  }

  public void setLocalAddress(String localAddress) {
    this.localAddress = localAddress;
  }

  public AuthIdNtoken onDiskGroupId(AuthAccessAccessItemFileGroup onDiskGroupId) {
    this.onDiskGroupId = onDiskGroupId;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return onDiskGroupId
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getOnDiskGroupId() {
    return onDiskGroupId;
  }

  public void setOnDiskGroupId(AuthAccessAccessItemFileGroup onDiskGroupId) {
    this.onDiskGroupId = onDiskGroupId;
  }

  public AuthIdNtoken onDiskUserId(AuthAccessAccessItemFileGroup onDiskUserId) {
    this.onDiskUserId = onDiskUserId;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return onDiskUserId
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getOnDiskUserId() {
    return onDiskUserId;
  }

  public void setOnDiskUserId(AuthAccessAccessItemFileGroup onDiskUserId) {
    this.onDiskUserId = onDiskUserId;
  }

  public AuthIdNtoken privilege(List<AuthIdNtokenPrivilegeItem> privilege) {
    this.privilege = privilege;
    return this;
  }

  public AuthIdNtoken addPrivilegeItem(AuthIdNtokenPrivilegeItem privilegeItem) {
    if (this.privilege == null) {
      this.privilege = new ArrayList<AuthIdNtokenPrivilegeItem>();
    }
    this.privilege.add(privilegeItem);
    return this;
  }

   /**
   * Specifies the privileges granted to the currently authenticated user.
   * @return privilege
  **/
  @ApiModelProperty(value = "Specifies the privileges granted to the currently authenticated user.")
  public List<AuthIdNtokenPrivilegeItem> getPrivilege() {
    return privilege;
  }

  public void setPrivilege(List<AuthIdNtokenPrivilegeItem> privilege) {
    this.privilege = privilege;
  }

  public AuthIdNtoken protocol(Integer protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * minimum: 0
   * maximum: 128
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public Integer getProtocol() {
    return protocol;
  }

  public void setProtocol(Integer protocol) {
    this.protocol = protocol;
  }

  public AuthIdNtoken remoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @ApiModelProperty(value = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public AuthIdNtoken uid(AuthAccessAccessItemFileGroup uid) {
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

  public AuthIdNtoken userSid(AuthAccessAccessItemFileGroup userSid) {
    this.userSid = userSid;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return userSid
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getUserSid() {
    return userSid;
  }

  public void setUserSid(AuthAccessAccessItemFileGroup userSid) {
    this.userSid = userSid;
  }

  public AuthIdNtoken zid(Integer zid) {
    this.zid = zid;
    return this;
  }

   /**
   * Get zid
   * minimum: 0
   * maximum: 4294967295
   * @return zid
  **/
  @ApiModelProperty(value = "")
  public Integer getZid() {
    return zid;
  }

  public void setZid(Integer zid) {
    this.zid = zid;
  }

  public AuthIdNtoken zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @ApiModelProperty(value = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthIdNtoken authIdNtoken = (AuthIdNtoken) o;
    return Objects.equals(this.additionalId, authIdNtoken.additionalId) &&
        Objects.equals(this.gid, authIdNtoken.gid) &&
        Objects.equals(this.groupSid, authIdNtoken.groupSid) &&
        Objects.equals(this.ifsRestricted, authIdNtoken.ifsRestricted) &&
        Objects.equals(this.localAddress, authIdNtoken.localAddress) &&
        Objects.equals(this.onDiskGroupId, authIdNtoken.onDiskGroupId) &&
        Objects.equals(this.onDiskUserId, authIdNtoken.onDiskUserId) &&
        Objects.equals(this.privilege, authIdNtoken.privilege) &&
        Objects.equals(this.protocol, authIdNtoken.protocol) &&
        Objects.equals(this.remoteAddress, authIdNtoken.remoteAddress) &&
        Objects.equals(this.uid, authIdNtoken.uid) &&
        Objects.equals(this.userSid, authIdNtoken.userSid) &&
        Objects.equals(this.zid, authIdNtoken.zid) &&
        Objects.equals(this.zoneId, authIdNtoken.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalId, gid, groupSid, ifsRestricted, localAddress, onDiskGroupId, onDiskUserId, privilege, protocol, remoteAddress, uid, userSid, zid, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthIdNtoken {\n");
    
    sb.append("    additionalId: ").append(toIndentedString(additionalId)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    groupSid: ").append(toIndentedString(groupSid)).append("\n");
    sb.append("    ifsRestricted: ").append(toIndentedString(ifsRestricted)).append("\n");
    sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
    sb.append("    onDiskGroupId: ").append(toIndentedString(onDiskGroupId)).append("\n");
    sb.append("    onDiskUserId: ").append(toIndentedString(onDiskUserId)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    userSid: ").append(toIndentedString(userSid)).append("\n");
    sb.append("    zid: ").append(toIndentedString(zid)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
