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
 * Specifies the configuration properties for a user.
 */
@ApiModel(description = "Specifies the configuration properties for a user.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AuthUser {
  @SerializedName("email")
  private String email = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("expiry")
  private Integer expiry = null;

  @SerializedName("gecos")
  private String gecos = null;

  @SerializedName("home_directory")
  private String homeDirectory = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("password_expires")
  private Boolean passwordExpires = null;

  @SerializedName("primary_group")
  private AuthAccessAccessItemFileGroup primaryGroup = null;

  @SerializedName("prompt_password_change")
  private Boolean promptPasswordChange = null;

  @SerializedName("shell")
  private String shell = null;

  @SerializedName("sid")
  private String sid = null;

  @SerializedName("uid")
  private Integer uid = null;

  @SerializedName("unlock")
  private Boolean unlock = null;

  public AuthUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Specifies an email address for the user.
   * @return email
  **/
  @ApiModelProperty(value = "Specifies an email address for the user.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuthUser enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If true, the authenticated user is enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "If true, the authenticated user is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AuthUser expiry(Integer expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Specifies the Unix Epoch time when the auth user will expire.
   * minimum: 0
   * maximum: 4294967295
   * @return expiry
  **/
  @ApiModelProperty(value = "Specifies the Unix Epoch time when the auth user will expire.")
  public Integer getExpiry() {
    return expiry;
  }

  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }

  public AuthUser gecos(String gecos) {
    this.gecos = gecos;
    return this;
  }

   /**
   * Specifies the GECOS value, which is usually the full name.
   * @return gecos
  **/
  @ApiModelProperty(value = "Specifies the GECOS value, which is usually the full name.")
  public String getGecos() {
    return gecos;
  }

  public void setGecos(String gecos) {
    this.gecos = gecos;
  }

  public AuthUser homeDirectory(String homeDirectory) {
    this.homeDirectory = homeDirectory;
    return this;
  }

   /**
   * Specifies a home directory for the user.
   * @return homeDirectory
  **/
  @ApiModelProperty(value = "Specifies a home directory for the user.")
  public String getHomeDirectory() {
    return homeDirectory;
  }

  public void setHomeDirectory(String homeDirectory) {
    this.homeDirectory = homeDirectory;
  }

  public AuthUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Changes the password for the user.
   * @return password
  **/
  @ApiModelProperty(value = "Changes the password for the user.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AuthUser passwordExpires(Boolean passwordExpires) {
    this.passwordExpires = passwordExpires;
    return this;
  }

   /**
   * If true, the password should expire.
   * @return passwordExpires
  **/
  @ApiModelProperty(value = "If true, the password should expire.")
  public Boolean isPasswordExpires() {
    return passwordExpires;
  }

  public void setPasswordExpires(Boolean passwordExpires) {
    this.passwordExpires = passwordExpires;
  }

  public AuthUser primaryGroup(AuthAccessAccessItemFileGroup primaryGroup) {
    this.primaryGroup = primaryGroup;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return primaryGroup
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getPrimaryGroup() {
    return primaryGroup;
  }

  public void setPrimaryGroup(AuthAccessAccessItemFileGroup primaryGroup) {
    this.primaryGroup = primaryGroup;
  }

  public AuthUser promptPasswordChange(Boolean promptPasswordChange) {
    this.promptPasswordChange = promptPasswordChange;
    return this;
  }

   /**
   * If true, prompts the user to change their password at the next login.
   * @return promptPasswordChange
  **/
  @ApiModelProperty(value = "If true, prompts the user to change their password at the next login.")
  public Boolean isPromptPasswordChange() {
    return promptPasswordChange;
  }

  public void setPromptPasswordChange(Boolean promptPasswordChange) {
    this.promptPasswordChange = promptPasswordChange;
  }

  public AuthUser shell(String shell) {
    this.shell = shell;
    return this;
  }

   /**
   * Specifies the shell for the user.
   * @return shell
  **/
  @ApiModelProperty(value = "Specifies the shell for the user.")
  public String getShell() {
    return shell;
  }

  public void setShell(String shell) {
    this.shell = shell;
  }

  public AuthUser sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * Specifies a security identifier.
   * @return sid
  **/
  @ApiModelProperty(value = "Specifies a security identifier.")
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public AuthUser uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Specifies a numeric user identifier.
   * minimum: 0
   * maximum: 4294967295
   * @return uid
  **/
  @ApiModelProperty(value = "Specifies a numeric user identifier.")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public AuthUser unlock(Boolean unlock) {
    this.unlock = unlock;
    return this;
  }

   /**
   * If true, the user account should be unlocked.
   * @return unlock
  **/
  @ApiModelProperty(value = "If true, the user account should be unlocked.")
  public Boolean isUnlock() {
    return unlock;
  }

  public void setUnlock(Boolean unlock) {
    this.unlock = unlock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthUser authUser = (AuthUser) o;
    return Objects.equals(this.email, authUser.email) &&
        Objects.equals(this.enabled, authUser.enabled) &&
        Objects.equals(this.expiry, authUser.expiry) &&
        Objects.equals(this.gecos, authUser.gecos) &&
        Objects.equals(this.homeDirectory, authUser.homeDirectory) &&
        Objects.equals(this.password, authUser.password) &&
        Objects.equals(this.passwordExpires, authUser.passwordExpires) &&
        Objects.equals(this.primaryGroup, authUser.primaryGroup) &&
        Objects.equals(this.promptPasswordChange, authUser.promptPasswordChange) &&
        Objects.equals(this.shell, authUser.shell) &&
        Objects.equals(this.sid, authUser.sid) &&
        Objects.equals(this.uid, authUser.uid) &&
        Objects.equals(this.unlock, authUser.unlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, enabled, expiry, gecos, homeDirectory, password, passwordExpires, primaryGroup, promptPasswordChange, shell, sid, uid, unlock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUser {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    gecos: ").append(toIndentedString(gecos)).append("\n");
    sb.append("    homeDirectory: ").append(toIndentedString(homeDirectory)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordExpires: ").append(toIndentedString(passwordExpires)).append("\n");
    sb.append("    primaryGroup: ").append(toIndentedString(primaryGroup)).append("\n");
    sb.append("    promptPasswordChange: ").append(toIndentedString(promptPasswordChange)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    unlock: ").append(toIndentedString(unlock)).append("\n");
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

