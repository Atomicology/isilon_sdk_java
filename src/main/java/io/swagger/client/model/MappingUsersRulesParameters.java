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
import io.swagger.client.model.MappingUsersRulesRuleOptionsDefaultUser;
import java.io.IOException;

/**
 * MappingUsersRulesParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class MappingUsersRulesParameters {
  @SerializedName("default_unix_user")
  private MappingUsersRulesRuleOptionsDefaultUser defaultUnixUser = null;

  public MappingUsersRulesParameters defaultUnixUser(MappingUsersRulesRuleOptionsDefaultUser defaultUnixUser) {
    this.defaultUnixUser = defaultUnixUser;
    return this;
  }

   /**
   * 
   * @return defaultUnixUser
  **/
  @ApiModelProperty(value = "")
  public MappingUsersRulesRuleOptionsDefaultUser getDefaultUnixUser() {
    return defaultUnixUser;
  }

  public void setDefaultUnixUser(MappingUsersRulesRuleOptionsDefaultUser defaultUnixUser) {
    this.defaultUnixUser = defaultUnixUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingUsersRulesParameters mappingUsersRulesParameters = (MappingUsersRulesParameters) o;
    return Objects.equals(this.defaultUnixUser, mappingUsersRulesParameters.defaultUnixUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUnixUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingUsersRulesParameters {\n");
    
    sb.append("    defaultUnixUser: ").append(toIndentedString(defaultUnixUser)).append("\n");
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

