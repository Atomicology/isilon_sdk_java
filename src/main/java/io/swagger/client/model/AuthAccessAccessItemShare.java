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
import io.swagger.client.model.AuthAccessAccessItemShareEffectiveUser;
import io.swagger.client.model.AuthAccessAccessItemShareSharePermissions;
import java.io.IOException;

/**
 * AuthAccessAccessItemShare
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AuthAccessAccessItemShare {
  @SerializedName("effective_user")
  private AuthAccessAccessItemShareEffectiveUser effectiveUser = null;

  @SerializedName("share_permissions")
  private AuthAccessAccessItemShareSharePermissions sharePermissions = null;

  public AuthAccessAccessItemShare effectiveUser(AuthAccessAccessItemShareEffectiveUser effectiveUser) {
    this.effectiveUser = effectiveUser;
    return this;
  }

   /**
   * Specifies the persona for the user.
   * @return effectiveUser
  **/
  @ApiModelProperty(value = "Specifies the persona for the user.")
  public AuthAccessAccessItemShareEffectiveUser getEffectiveUser() {
    return effectiveUser;
  }

  public void setEffectiveUser(AuthAccessAccessItemShareEffectiveUser effectiveUser) {
    this.effectiveUser = effectiveUser;
  }

  public AuthAccessAccessItemShare sharePermissions(AuthAccessAccessItemShareSharePermissions sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

   /**
   * Specifies the permissions that the user has on the SHARE.
   * @return sharePermissions
  **/
  @ApiModelProperty(value = "Specifies the permissions that the user has on the SHARE.")
  public AuthAccessAccessItemShareSharePermissions getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(AuthAccessAccessItemShareSharePermissions sharePermissions) {
    this.sharePermissions = sharePermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthAccessAccessItemShare authAccessAccessItemShare = (AuthAccessAccessItemShare) o;
    return Objects.equals(this.effectiveUser, authAccessAccessItemShare.effectiveUser) &&
        Objects.equals(this.sharePermissions, authAccessAccessItemShare.sharePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveUser, sharePermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthAccessAccessItemShare {\n");
    
    sb.append("    effectiveUser: ").append(toIndentedString(effectiveUser)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
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

