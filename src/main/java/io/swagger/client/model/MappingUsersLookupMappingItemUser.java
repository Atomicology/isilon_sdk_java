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
import io.swagger.client.model.AuthGroupObjectHistoryItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MappingUsersLookupMappingItemUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class MappingUsersLookupMappingItemUser {
  @SerializedName("dn")
  private String dn = null;

  @SerializedName("dns_domain")
  private String dnsDomain = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("expired")
  private Boolean expired = null;

  @SerializedName("expiry")
  private Integer expiry = null;

  @SerializedName("gecos")
  private String gecos = null;

  @SerializedName("generated_gid")
  private Boolean generatedGid = null;

  @SerializedName("generated_uid")
  private Boolean generatedUid = null;

  @SerializedName("generated_upn")
  private Boolean generatedUpn = null;

  @SerializedName("gid")
  private AuthAccessAccessItemFileGroup gid = null;

  @SerializedName("home_directory")
  private String homeDirectory = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("max_password_age")
  private Integer maxPasswordAge = null;

  @SerializedName("member_of")
  private List<AuthAccessAccessItemFileGroup> memberOf = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("object_history")
  private List<AuthGroupObjectHistoryItem> objectHistory = null;

  @SerializedName("on_disk_group_identity")
  private AuthAccessAccessItemFileGroup onDiskGroupIdentity = null;

  @SerializedName("on_disk_user_identity")
  private AuthAccessAccessItemFileGroup onDiskUserIdentity = null;

  @SerializedName("password_expired")
  private Boolean passwordExpired = null;

  @SerializedName("password_expires")
  private Boolean passwordExpires = null;

  @SerializedName("password_expiry")
  private Integer passwordExpiry = null;

  @SerializedName("password_last_set")
  private Integer passwordLastSet = null;

  @SerializedName("primary_group_sid")
  private AuthAccessAccessItemFileGroup primaryGroupSid = null;

  @SerializedName("prompt_password_change")
  private Boolean promptPasswordChange = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("sam_account_name")
  private String samAccountName = null;

  @SerializedName("shell")
  private String shell = null;

  @SerializedName("sid")
  private AuthAccessAccessItemFileGroup sid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uid")
  private AuthAccessAccessItemFileGroup uid = null;

  @SerializedName("upn")
  private String upn = null;

  @SerializedName("user_can_change_password")
  private Boolean userCanChangePassword = null;

  public MappingUsersLookupMappingItemUser dn(String dn) {
    this.dn = dn;
    return this;
  }

   /**
   * Get dn
   * @return dn
  **/
  @ApiModelProperty(value = "")
  public String getDn() {
    return dn;
  }

  public void setDn(String dn) {
    this.dn = dn;
  }

  public MappingUsersLookupMappingItemUser dnsDomain(String dnsDomain) {
    this.dnsDomain = dnsDomain;
    return this;
  }

   /**
   * Get dnsDomain
   * @return dnsDomain
  **/
  @ApiModelProperty(value = "")
  public String getDnsDomain() {
    return dnsDomain;
  }

  public void setDnsDomain(String dnsDomain) {
    this.dnsDomain = dnsDomain;
  }

  public MappingUsersLookupMappingItemUser domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public MappingUsersLookupMappingItemUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MappingUsersLookupMappingItemUser enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * True, if the authenticated user is enabled.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "True, if the authenticated user is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public MappingUsersLookupMappingItemUser expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * True, if the authenticated user has expired.
   * @return expired
  **/
  @ApiModelProperty(required = true, value = "True, if the authenticated user has expired.")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public MappingUsersLookupMappingItemUser expiry(Integer expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * minimum: 0
   * maximum: 4294967295
   * @return expiry
  **/
  @ApiModelProperty(value = "")
  public Integer getExpiry() {
    return expiry;
  }

  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }

  public MappingUsersLookupMappingItemUser gecos(String gecos) {
    this.gecos = gecos;
    return this;
  }

   /**
   * Get gecos
   * @return gecos
  **/
  @ApiModelProperty(value = "")
  public String getGecos() {
    return gecos;
  }

  public void setGecos(String gecos) {
    this.gecos = gecos;
  }

  public MappingUsersLookupMappingItemUser generatedGid(Boolean generatedGid) {
    this.generatedGid = generatedGid;
    return this;
  }

   /**
   * True, if the GID was generated.
   * @return generatedGid
  **/
  @ApiModelProperty(value = "True, if the GID was generated.")
  public Boolean isGeneratedGid() {
    return generatedGid;
  }

  public void setGeneratedGid(Boolean generatedGid) {
    this.generatedGid = generatedGid;
  }

  public MappingUsersLookupMappingItemUser generatedUid(Boolean generatedUid) {
    this.generatedUid = generatedUid;
    return this;
  }

   /**
   * True, if the UID was generated.
   * @return generatedUid
  **/
  @ApiModelProperty(value = "True, if the UID was generated.")
  public Boolean isGeneratedUid() {
    return generatedUid;
  }

  public void setGeneratedUid(Boolean generatedUid) {
    this.generatedUid = generatedUid;
  }

  public MappingUsersLookupMappingItemUser generatedUpn(Boolean generatedUpn) {
    this.generatedUpn = generatedUpn;
    return this;
  }

   /**
   * True, if the UPN was generated.
   * @return generatedUpn
  **/
  @ApiModelProperty(value = "True, if the UPN was generated.")
  public Boolean isGeneratedUpn() {
    return generatedUpn;
  }

  public void setGeneratedUpn(Boolean generatedUpn) {
    this.generatedUpn = generatedUpn;
  }

  public MappingUsersLookupMappingItemUser gid(AuthAccessAccessItemFileGroup gid) {
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

  public MappingUsersLookupMappingItemUser homeDirectory(String homeDirectory) {
    this.homeDirectory = homeDirectory;
    return this;
  }

   /**
   * Get homeDirectory
   * @return homeDirectory
  **/
  @ApiModelProperty(value = "")
  public String getHomeDirectory() {
    return homeDirectory;
  }

  public void setHomeDirectory(String homeDirectory) {
    this.homeDirectory = homeDirectory;
  }

  public MappingUsersLookupMappingItemUser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the user or group ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Specifies the user or group ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MappingUsersLookupMappingItemUser locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * If true, indicates that the account is locked.
   * @return locked
  **/
  @ApiModelProperty(required = true, value = "If true, indicates that the account is locked.")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public MappingUsersLookupMappingItemUser maxPasswordAge(Integer maxPasswordAge) {
    this.maxPasswordAge = maxPasswordAge;
    return this;
  }

   /**
   * Specifies the maximum time in seconds allowed before the password expires.
   * @return maxPasswordAge
  **/
  @ApiModelProperty(value = "Specifies the maximum time in seconds allowed before the password expires.")
  public Integer getMaxPasswordAge() {
    return maxPasswordAge;
  }

  public void setMaxPasswordAge(Integer maxPasswordAge) {
    this.maxPasswordAge = maxPasswordAge;
  }

  public MappingUsersLookupMappingItemUser memberOf(List<AuthAccessAccessItemFileGroup> memberOf) {
    this.memberOf = memberOf;
    return this;
  }

  public MappingUsersLookupMappingItemUser addMemberOfItem(AuthAccessAccessItemFileGroup memberOfItem) {
    if (this.memberOf == null) {
      this.memberOf = new ArrayList<AuthAccessAccessItemFileGroup>();
    }
    this.memberOf.add(memberOfItem);
    return this;
  }

   /**
   * Get memberOf
   * @return memberOf
  **/
  @ApiModelProperty(value = "")
  public List<AuthAccessAccessItemFileGroup> getMemberOf() {
    return memberOf;
  }

  public void setMemberOf(List<AuthAccessAccessItemFileGroup> memberOf) {
    this.memberOf = memberOf;
  }

  public MappingUsersLookupMappingItemUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies a user or group name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Specifies a user or group name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MappingUsersLookupMappingItemUser objectHistory(List<AuthGroupObjectHistoryItem> objectHistory) {
    this.objectHistory = objectHistory;
    return this;
  }

  public MappingUsersLookupMappingItemUser addObjectHistoryItem(AuthGroupObjectHistoryItem objectHistoryItem) {
    if (this.objectHistory == null) {
      this.objectHistory = new ArrayList<AuthGroupObjectHistoryItem>();
    }
    this.objectHistory.add(objectHistoryItem);
    return this;
  }

   /**
   * Get objectHistory
   * @return objectHistory
  **/
  @ApiModelProperty(value = "")
  public List<AuthGroupObjectHistoryItem> getObjectHistory() {
    return objectHistory;
  }

  public void setObjectHistory(List<AuthGroupObjectHistoryItem> objectHistory) {
    this.objectHistory = objectHistory;
  }

  public MappingUsersLookupMappingItemUser onDiskGroupIdentity(AuthAccessAccessItemFileGroup onDiskGroupIdentity) {
    this.onDiskGroupIdentity = onDiskGroupIdentity;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return onDiskGroupIdentity
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getOnDiskGroupIdentity() {
    return onDiskGroupIdentity;
  }

  public void setOnDiskGroupIdentity(AuthAccessAccessItemFileGroup onDiskGroupIdentity) {
    this.onDiskGroupIdentity = onDiskGroupIdentity;
  }

  public MappingUsersLookupMappingItemUser onDiskUserIdentity(AuthAccessAccessItemFileGroup onDiskUserIdentity) {
    this.onDiskUserIdentity = onDiskUserIdentity;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return onDiskUserIdentity
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getOnDiskUserIdentity() {
    return onDiskUserIdentity;
  }

  public void setOnDiskUserIdentity(AuthAccessAccessItemFileGroup onDiskUserIdentity) {
    this.onDiskUserIdentity = onDiskUserIdentity;
  }

  public MappingUsersLookupMappingItemUser passwordExpired(Boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
    return this;
  }

   /**
   * If true, the password has expired.
   * @return passwordExpired
  **/
  @ApiModelProperty(required = true, value = "If true, the password has expired.")
  public Boolean isPasswordExpired() {
    return passwordExpired;
  }

  public void setPasswordExpired(Boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
  }

  public MappingUsersLookupMappingItemUser passwordExpires(Boolean passwordExpires) {
    this.passwordExpires = passwordExpires;
    return this;
  }

   /**
   * If true, the password is allowed to expire.
   * @return passwordExpires
  **/
  @ApiModelProperty(required = true, value = "If true, the password is allowed to expire.")
  public Boolean isPasswordExpires() {
    return passwordExpires;
  }

  public void setPasswordExpires(Boolean passwordExpires) {
    this.passwordExpires = passwordExpires;
  }

  public MappingUsersLookupMappingItemUser passwordExpiry(Integer passwordExpiry) {
    this.passwordExpiry = passwordExpiry;
    return this;
  }

   /**
   * Get passwordExpiry
   * minimum: 0
   * maximum: 4294967295
   * @return passwordExpiry
  **/
  @ApiModelProperty(value = "")
  public Integer getPasswordExpiry() {
    return passwordExpiry;
  }

  public void setPasswordExpiry(Integer passwordExpiry) {
    this.passwordExpiry = passwordExpiry;
  }

  public MappingUsersLookupMappingItemUser passwordLastSet(Integer passwordLastSet) {
    this.passwordLastSet = passwordLastSet;
    return this;
  }

   /**
   * Get passwordLastSet
   * minimum: 0
   * maximum: 4294967295
   * @return passwordLastSet
  **/
  @ApiModelProperty(value = "")
  public Integer getPasswordLastSet() {
    return passwordLastSet;
  }

  public void setPasswordLastSet(Integer passwordLastSet) {
    this.passwordLastSet = passwordLastSet;
  }

  public MappingUsersLookupMappingItemUser primaryGroupSid(AuthAccessAccessItemFileGroup primaryGroupSid) {
    this.primaryGroupSid = primaryGroupSid;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return primaryGroupSid
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getPrimaryGroupSid() {
    return primaryGroupSid;
  }

  public void setPrimaryGroupSid(AuthAccessAccessItemFileGroup primaryGroupSid) {
    this.primaryGroupSid = primaryGroupSid;
  }

  public MappingUsersLookupMappingItemUser promptPasswordChange(Boolean promptPasswordChange) {
    this.promptPasswordChange = promptPasswordChange;
    return this;
  }

   /**
   * Prompts the user to change their password at the next login.
   * @return promptPasswordChange
  **/
  @ApiModelProperty(required = true, value = "Prompts the user to change their password at the next login.")
  public Boolean isPromptPasswordChange() {
    return promptPasswordChange;
  }

  public void setPromptPasswordChange(Boolean promptPasswordChange) {
    this.promptPasswordChange = promptPasswordChange;
  }

  public MappingUsersLookupMappingItemUser provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public MappingUsersLookupMappingItemUser samAccountName(String samAccountName) {
    this.samAccountName = samAccountName;
    return this;
  }

   /**
   * Get samAccountName
   * @return samAccountName
  **/
  @ApiModelProperty(value = "")
  public String getSamAccountName() {
    return samAccountName;
  }

  public void setSamAccountName(String samAccountName) {
    this.samAccountName = samAccountName;
  }

  public MappingUsersLookupMappingItemUser shell(String shell) {
    this.shell = shell;
    return this;
  }

   /**
   * Get shell
   * @return shell
  **/
  @ApiModelProperty(value = "")
  public String getShell() {
    return shell;
  }

  public void setShell(String shell) {
    this.shell = shell;
  }

  public MappingUsersLookupMappingItemUser sid(AuthAccessAccessItemFileGroup sid) {
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

  public MappingUsersLookupMappingItemUser type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies the object type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Specifies the object type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MappingUsersLookupMappingItemUser uid(AuthAccessAccessItemFileGroup uid) {
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

  public MappingUsersLookupMappingItemUser upn(String upn) {
    this.upn = upn;
    return this;
  }

   /**
   * Get upn
   * @return upn
  **/
  @ApiModelProperty(value = "")
  public String getUpn() {
    return upn;
  }

  public void setUpn(String upn) {
    this.upn = upn;
  }

  public MappingUsersLookupMappingItemUser userCanChangePassword(Boolean userCanChangePassword) {
    this.userCanChangePassword = userCanChangePassword;
    return this;
  }

   /**
   * Specifies whether the password for the user can be changed.
   * @return userCanChangePassword
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the password for the user can be changed.")
  public Boolean isUserCanChangePassword() {
    return userCanChangePassword;
  }

  public void setUserCanChangePassword(Boolean userCanChangePassword) {
    this.userCanChangePassword = userCanChangePassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingUsersLookupMappingItemUser mappingUsersLookupMappingItemUser = (MappingUsersLookupMappingItemUser) o;
    return Objects.equals(this.dn, mappingUsersLookupMappingItemUser.dn) &&
        Objects.equals(this.dnsDomain, mappingUsersLookupMappingItemUser.dnsDomain) &&
        Objects.equals(this.domain, mappingUsersLookupMappingItemUser.domain) &&
        Objects.equals(this.email, mappingUsersLookupMappingItemUser.email) &&
        Objects.equals(this.enabled, mappingUsersLookupMappingItemUser.enabled) &&
        Objects.equals(this.expired, mappingUsersLookupMappingItemUser.expired) &&
        Objects.equals(this.expiry, mappingUsersLookupMappingItemUser.expiry) &&
        Objects.equals(this.gecos, mappingUsersLookupMappingItemUser.gecos) &&
        Objects.equals(this.generatedGid, mappingUsersLookupMappingItemUser.generatedGid) &&
        Objects.equals(this.generatedUid, mappingUsersLookupMappingItemUser.generatedUid) &&
        Objects.equals(this.generatedUpn, mappingUsersLookupMappingItemUser.generatedUpn) &&
        Objects.equals(this.gid, mappingUsersLookupMappingItemUser.gid) &&
        Objects.equals(this.homeDirectory, mappingUsersLookupMappingItemUser.homeDirectory) &&
        Objects.equals(this.id, mappingUsersLookupMappingItemUser.id) &&
        Objects.equals(this.locked, mappingUsersLookupMappingItemUser.locked) &&
        Objects.equals(this.maxPasswordAge, mappingUsersLookupMappingItemUser.maxPasswordAge) &&
        Objects.equals(this.memberOf, mappingUsersLookupMappingItemUser.memberOf) &&
        Objects.equals(this.name, mappingUsersLookupMappingItemUser.name) &&
        Objects.equals(this.objectHistory, mappingUsersLookupMappingItemUser.objectHistory) &&
        Objects.equals(this.onDiskGroupIdentity, mappingUsersLookupMappingItemUser.onDiskGroupIdentity) &&
        Objects.equals(this.onDiskUserIdentity, mappingUsersLookupMappingItemUser.onDiskUserIdentity) &&
        Objects.equals(this.passwordExpired, mappingUsersLookupMappingItemUser.passwordExpired) &&
        Objects.equals(this.passwordExpires, mappingUsersLookupMappingItemUser.passwordExpires) &&
        Objects.equals(this.passwordExpiry, mappingUsersLookupMappingItemUser.passwordExpiry) &&
        Objects.equals(this.passwordLastSet, mappingUsersLookupMappingItemUser.passwordLastSet) &&
        Objects.equals(this.primaryGroupSid, mappingUsersLookupMappingItemUser.primaryGroupSid) &&
        Objects.equals(this.promptPasswordChange, mappingUsersLookupMappingItemUser.promptPasswordChange) &&
        Objects.equals(this.provider, mappingUsersLookupMappingItemUser.provider) &&
        Objects.equals(this.samAccountName, mappingUsersLookupMappingItemUser.samAccountName) &&
        Objects.equals(this.shell, mappingUsersLookupMappingItemUser.shell) &&
        Objects.equals(this.sid, mappingUsersLookupMappingItemUser.sid) &&
        Objects.equals(this.type, mappingUsersLookupMappingItemUser.type) &&
        Objects.equals(this.uid, mappingUsersLookupMappingItemUser.uid) &&
        Objects.equals(this.upn, mappingUsersLookupMappingItemUser.upn) &&
        Objects.equals(this.userCanChangePassword, mappingUsersLookupMappingItemUser.userCanChangePassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dn, dnsDomain, domain, email, enabled, expired, expiry, gecos, generatedGid, generatedUid, generatedUpn, gid, homeDirectory, id, locked, maxPasswordAge, memberOf, name, objectHistory, onDiskGroupIdentity, onDiskUserIdentity, passwordExpired, passwordExpires, passwordExpiry, passwordLastSet, primaryGroupSid, promptPasswordChange, provider, samAccountName, shell, sid, type, uid, upn, userCanChangePassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingUsersLookupMappingItemUser {\n");
    
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    dnsDomain: ").append(toIndentedString(dnsDomain)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    gecos: ").append(toIndentedString(gecos)).append("\n");
    sb.append("    generatedGid: ").append(toIndentedString(generatedGid)).append("\n");
    sb.append("    generatedUid: ").append(toIndentedString(generatedUid)).append("\n");
    sb.append("    generatedUpn: ").append(toIndentedString(generatedUpn)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    homeDirectory: ").append(toIndentedString(homeDirectory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    maxPasswordAge: ").append(toIndentedString(maxPasswordAge)).append("\n");
    sb.append("    memberOf: ").append(toIndentedString(memberOf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectHistory: ").append(toIndentedString(objectHistory)).append("\n");
    sb.append("    onDiskGroupIdentity: ").append(toIndentedString(onDiskGroupIdentity)).append("\n");
    sb.append("    onDiskUserIdentity: ").append(toIndentedString(onDiskUserIdentity)).append("\n");
    sb.append("    passwordExpired: ").append(toIndentedString(passwordExpired)).append("\n");
    sb.append("    passwordExpires: ").append(toIndentedString(passwordExpires)).append("\n");
    sb.append("    passwordExpiry: ").append(toIndentedString(passwordExpiry)).append("\n");
    sb.append("    passwordLastSet: ").append(toIndentedString(passwordLastSet)).append("\n");
    sb.append("    primaryGroupSid: ").append(toIndentedString(primaryGroupSid)).append("\n");
    sb.append("    promptPasswordChange: ").append(toIndentedString(promptPasswordChange)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    samAccountName: ").append(toIndentedString(samAccountName)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    upn: ").append(toIndentedString(upn)).append("\n");
    sb.append("    userCanChangePassword: ").append(toIndentedString(userCanChangePassword)).append("\n");
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

