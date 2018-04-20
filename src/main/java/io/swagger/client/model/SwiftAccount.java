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
import java.util.ArrayList;
import java.util.List;

/**
 * This is an account for the Swift protocol.
 */
@ApiModel(description = "This is an account for the Swift protocol.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SwiftAccount {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("swiftgroup")
  private String swiftgroup = null;

  @SerializedName("swiftuser")
  private String swiftuser = null;

  @SerializedName("users")
  private List<String> users = null;

  @SerializedName("zone")
  private String zone = null;

  public SwiftAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique id of swift account
   * @return id
  **/
  @ApiModelProperty(value = "Unique id of swift account")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SwiftAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Swift account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Swift account")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwiftAccount swiftgroup(String swiftgroup) {
    this.swiftgroup = swiftgroup;
    return this;
  }

   /**
   * Group with filesystem ownership of this account
   * @return swiftgroup
  **/
  @ApiModelProperty(value = "Group with filesystem ownership of this account")
  public String getSwiftgroup() {
    return swiftgroup;
  }

  public void setSwiftgroup(String swiftgroup) {
    this.swiftgroup = swiftgroup;
  }

  public SwiftAccount swiftuser(String swiftuser) {
    this.swiftuser = swiftuser;
    return this;
  }

   /**
   * User with filesystem ownership of this account
   * @return swiftuser
  **/
  @ApiModelProperty(value = "User with filesystem ownership of this account")
  public String getSwiftuser() {
    return swiftuser;
  }

  public void setSwiftuser(String swiftuser) {
    this.swiftuser = swiftuser;
  }

  public SwiftAccount users(List<String> users) {
    this.users = users;
    return this;
  }

  public SwiftAccount addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Users who are allowed to access Swift account
   * @return users
  **/
  @ApiModelProperty(value = "Users who are allowed to access Swift account")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public SwiftAccount zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Name of access zone for account
   * @return zone
  **/
  @ApiModelProperty(value = "Name of access zone for account")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwiftAccount swiftAccount = (SwiftAccount) o;
    return Objects.equals(this.id, swiftAccount.id) &&
        Objects.equals(this.name, swiftAccount.name) &&
        Objects.equals(this.swiftgroup, swiftAccount.swiftgroup) &&
        Objects.equals(this.swiftuser, swiftAccount.swiftuser) &&
        Objects.equals(this.users, swiftAccount.users) &&
        Objects.equals(this.zone, swiftAccount.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, swiftgroup, swiftuser, users, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwiftAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    swiftgroup: ").append(toIndentedString(swiftgroup)).append("\n");
    sb.append("    swiftuser: ").append(toIndentedString(swiftuser)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

