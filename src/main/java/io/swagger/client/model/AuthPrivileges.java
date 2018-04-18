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
import io.swagger.client.model.AuthPrivilege;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthPrivileges
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuthPrivileges {
  @SerializedName("privileges")
  private List<AuthPrivilege> privileges = null;

  @SerializedName("resume")
  private String resume = null;

  public AuthPrivileges privileges(List<AuthPrivilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  public AuthPrivileges addPrivilegesItem(AuthPrivilege privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<AuthPrivilege>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Get privileges
   * @return privileges
  **/
  @ApiModelProperty(value = "")
  public List<AuthPrivilege> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<AuthPrivilege> privileges) {
    this.privileges = privileges;
  }

  public AuthPrivileges resume(String resume) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthPrivileges authPrivileges = (AuthPrivileges) o;
    return Objects.equals(this.privileges, authPrivileges.privileges) &&
        Objects.equals(this.resume, authPrivileges.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privileges, resume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthPrivileges {\n");
    
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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

