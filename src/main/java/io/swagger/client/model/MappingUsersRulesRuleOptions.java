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
import io.swagger.client.model.MappingUsersRulesRuleUser2;
import java.io.IOException;

/**
 * MappingUsersRulesRuleOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class MappingUsersRulesRuleOptions {
  @SerializedName("break")
  private Boolean _break = null;

  @SerializedName("default_user")
  private MappingUsersRulesRuleUser2 defaultUser = null;

  @SerializedName("group")
  private Boolean group = null;

  @SerializedName("groups")
  private Boolean groups = null;

  @SerializedName("user")
  private Boolean user = null;

  public MappingUsersRulesRuleOptions _break(Boolean _break) {
    this._break = _break;
    return this;
  }

   /**
   * If true, and the rule was applied successfully, stop processing further.
   * @return _break
  **/
  @ApiModelProperty(value = "If true, and the rule was applied successfully, stop processing further.")
  public Boolean isBreak() {
    return _break;
  }

  public void setBreak(Boolean _break) {
    this._break = _break;
  }

  public MappingUsersRulesRuleOptions defaultUser(MappingUsersRulesRuleUser2 defaultUser) {
    this.defaultUser = defaultUser;
    return this;
  }

   /**
   * 
   * @return defaultUser
  **/
  @ApiModelProperty(value = "")
  public MappingUsersRulesRuleUser2 getDefaultUser() {
    return defaultUser;
  }

  public void setDefaultUser(MappingUsersRulesRuleUser2 defaultUser) {
    this.defaultUser = defaultUser;
  }

  public MappingUsersRulesRuleOptions group(Boolean group) {
    this.group = group;
    return this;
  }

   /**
   * If true, the primary GID and primary group SID should be copied to the existing credential.
   * @return group
  **/
  @ApiModelProperty(value = "If true, the primary GID and primary group SID should be copied to the existing credential.")
  public Boolean isGroup() {
    return group;
  }

  public void setGroup(Boolean group) {
    this.group = group;
  }

  public MappingUsersRulesRuleOptions groups(Boolean groups) {
    this.groups = groups;
    return this;
  }

   /**
   * If true, all additional identifiers should be copied to the existing credential.
   * @return groups
  **/
  @ApiModelProperty(value = "If true, all additional identifiers should be copied to the existing credential.")
  public Boolean isGroups() {
    return groups;
  }

  public void setGroups(Boolean groups) {
    this.groups = groups;
  }

  public MappingUsersRulesRuleOptions user(Boolean user) {
    this.user = user;
    return this;
  }

   /**
   * If true, the primary UID and primary user SID should be copied to the existing credential.
   * @return user
  **/
  @ApiModelProperty(value = "If true, the primary UID and primary user SID should be copied to the existing credential.")
  public Boolean isUser() {
    return user;
  }

  public void setUser(Boolean user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingUsersRulesRuleOptions mappingUsersRulesRuleOptions = (MappingUsersRulesRuleOptions) o;
    return Objects.equals(this._break, mappingUsersRulesRuleOptions._break) &&
        Objects.equals(this.defaultUser, mappingUsersRulesRuleOptions.defaultUser) &&
        Objects.equals(this.group, mappingUsersRulesRuleOptions.group) &&
        Objects.equals(this.groups, mappingUsersRulesRuleOptions.groups) &&
        Objects.equals(this.user, mappingUsersRulesRuleOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_break, defaultUser, group, groups, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingUsersRulesRuleOptions {\n");
    
    sb.append("    _break: ").append(toIndentedString(_break)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
