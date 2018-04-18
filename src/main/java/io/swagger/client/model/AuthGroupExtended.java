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
 * AuthGroupExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuthGroupExtended {
  @SerializedName("dn")
  private String dn = null;

  @SerializedName("dns_domain")
  private String dnsDomain = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("generated_gid")
  private Boolean generatedGid = null;

  @SerializedName("gid")
  private AuthAccessAccessItemFileGroup gid = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("member_of")
  private List<AuthAccessAccessItemFileGroup> memberOf = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("object_history")
  private List<AuthGroupObjectHistoryItem> objectHistory = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("sam_account_name")
  private String samAccountName = null;

  @SerializedName("sid")
  private AuthAccessAccessItemFileGroup sid = null;

  @SerializedName("type")
  private String type = null;

  public AuthGroupExtended dn(String dn) {
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

  public AuthGroupExtended dnsDomain(String dnsDomain) {
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

  public AuthGroupExtended domain(String domain) {
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

  public AuthGroupExtended generatedGid(Boolean generatedGid) {
    this.generatedGid = generatedGid;
    return this;
  }

   /**
   * If true, the GID was generated.
   * @return generatedGid
  **/
  @ApiModelProperty(value = "If true, the GID was generated.")
  public Boolean isGeneratedGid() {
    return generatedGid;
  }

  public void setGeneratedGid(Boolean generatedGid) {
    this.generatedGid = generatedGid;
  }

  public AuthGroupExtended gid(AuthAccessAccessItemFileGroup gid) {
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

  public AuthGroupExtended id(String id) {
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

  public AuthGroupExtended memberOf(List<AuthAccessAccessItemFileGroup> memberOf) {
    this.memberOf = memberOf;
    return this;
  }

  public AuthGroupExtended addMemberOfItem(AuthAccessAccessItemFileGroup memberOfItem) {
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

  public AuthGroupExtended name(String name) {
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

  public AuthGroupExtended objectHistory(List<AuthGroupObjectHistoryItem> objectHistory) {
    this.objectHistory = objectHistory;
    return this;
  }

  public AuthGroupExtended addObjectHistoryItem(AuthGroupObjectHistoryItem objectHistoryItem) {
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

  public AuthGroupExtended provider(String provider) {
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

  public AuthGroupExtended samAccountName(String samAccountName) {
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

  public AuthGroupExtended sid(AuthAccessAccessItemFileGroup sid) {
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

  public AuthGroupExtended type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthGroupExtended authGroupExtended = (AuthGroupExtended) o;
    return Objects.equals(this.dn, authGroupExtended.dn) &&
        Objects.equals(this.dnsDomain, authGroupExtended.dnsDomain) &&
        Objects.equals(this.domain, authGroupExtended.domain) &&
        Objects.equals(this.generatedGid, authGroupExtended.generatedGid) &&
        Objects.equals(this.gid, authGroupExtended.gid) &&
        Objects.equals(this.id, authGroupExtended.id) &&
        Objects.equals(this.memberOf, authGroupExtended.memberOf) &&
        Objects.equals(this.name, authGroupExtended.name) &&
        Objects.equals(this.objectHistory, authGroupExtended.objectHistory) &&
        Objects.equals(this.provider, authGroupExtended.provider) &&
        Objects.equals(this.samAccountName, authGroupExtended.samAccountName) &&
        Objects.equals(this.sid, authGroupExtended.sid) &&
        Objects.equals(this.type, authGroupExtended.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dn, dnsDomain, domain, generatedGid, gid, id, memberOf, name, objectHistory, provider, samAccountName, sid, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGroupExtended {\n");
    
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    dnsDomain: ").append(toIndentedString(dnsDomain)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    generatedGid: ").append(toIndentedString(generatedGid)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    memberOf: ").append(toIndentedString(memberOf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectHistory: ").append(toIndentedString(objectHistory)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    samAccountName: ").append(toIndentedString(samAccountName)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
