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
import io.swagger.client.model.AuthAccessAccessItemFile;
import io.swagger.client.model.AuthAccessAccessItemShare;
import io.swagger.client.model.AuthAccessAccessItemShareEffectiveUser;
import java.io.IOException;

/**
 * AuthAccessAccessItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuthAccessAccessItem {
  @SerializedName("file")
  private AuthAccessAccessItemFile file = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("share")
  private AuthAccessAccessItemShare share = null;

  @SerializedName("user")
  private AuthAccessAccessItemShareEffectiveUser user = null;

  public AuthAccessAccessItem file(AuthAccessAccessItemFile file) {
    this.file = file;
    return this;
  }

   /**
   * Specifies properties for access rights.
   * @return file
  **/
  @ApiModelProperty(value = "Specifies properties for access rights.")
  public AuthAccessAccessItemFile getFile() {
    return file;
  }

  public void setFile(AuthAccessAccessItemFile file) {
    this.file = file;
  }

  public AuthAccessAccessItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the ID of the user.
   * @return id
  **/
  @ApiModelProperty(value = "Specifies the ID of the user.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuthAccessAccessItem share(AuthAccessAccessItemShare share) {
    this.share = share;
    return this;
  }

   /**
   * Specifies the permissions that the user has on the share.
   * @return share
  **/
  @ApiModelProperty(value = "Specifies the permissions that the user has on the share.")
  public AuthAccessAccessItemShare getShare() {
    return share;
  }

  public void setShare(AuthAccessAccessItemShare share) {
    this.share = share;
  }

  public AuthAccessAccessItem user(AuthAccessAccessItemShareEffectiveUser user) {
    this.user = user;
    return this;
  }

   /**
   * Specifies the persona for the user.
   * @return user
  **/
  @ApiModelProperty(value = "Specifies the persona for the user.")
  public AuthAccessAccessItemShareEffectiveUser getUser() {
    return user;
  }

  public void setUser(AuthAccessAccessItemShareEffectiveUser user) {
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
    AuthAccessAccessItem authAccessAccessItem = (AuthAccessAccessItem) o;
    return Objects.equals(this.file, authAccessAccessItem.file) &&
        Objects.equals(this.id, authAccessAccessItem.id) &&
        Objects.equals(this.share, authAccessAccessItem.share) &&
        Objects.equals(this.user, authAccessAccessItem.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, id, share, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthAccessAccessItem {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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

