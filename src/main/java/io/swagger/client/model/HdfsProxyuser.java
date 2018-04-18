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
import java.util.ArrayList;
import java.util.List;

/**
 * HdfsProxyuser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class HdfsProxyuser {
  @SerializedName("id")
  private String id = null;

  @SerializedName("members")
  private List<AuthAccessAccessItemFileGroup> members = new ArrayList<AuthAccessAccessItemFileGroup>();

  @SerializedName("name")
  private String name = null;

  public HdfsProxyuser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the role.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the role.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HdfsProxyuser members(List<AuthAccessAccessItemFileGroup> members) {
    this.members = members;
    return this;
  }

  public HdfsProxyuser addMembersItem(AuthAccessAccessItemFileGroup membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * Users or groups impersonated by proxyuser.
   * @return members
  **/
  @ApiModelProperty(required = true, value = "Users or groups impersonated by proxyuser.")
  public List<AuthAccessAccessItemFileGroup> getMembers() {
    return members;
  }

  public void setMembers(List<AuthAccessAccessItemFileGroup> members) {
    this.members = members;
  }

  public HdfsProxyuser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the proxyuser.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the proxyuser.")
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
    HdfsProxyuser hdfsProxyuser = (HdfsProxyuser) o;
    return Objects.equals(this.id, hdfsProxyuser.id) &&
        Objects.equals(this.members, hdfsProxyuser.members) &&
        Objects.equals(this.name, hdfsProxyuser.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, members, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdfsProxyuser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
