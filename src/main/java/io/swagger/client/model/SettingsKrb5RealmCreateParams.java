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
import io.swagger.client.model.SettingsKrb5Realm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SettingsKrb5RealmCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SettingsKrb5RealmCreateParams {
  @SerializedName("admin_server")
  private String adminServer = null;

  @SerializedName("default_domain")
  private String defaultDomain = null;

  @SerializedName("is_default_realm")
  private Boolean isDefaultRealm = null;

  @SerializedName("kdc")
  private List<String> kdc = null;

  @SerializedName("realm")
  private String realm = null;

  public SettingsKrb5RealmCreateParams adminServer(String adminServer) {
    this.adminServer = adminServer;
    return this;
  }

   /**
   * Specifies the administrative server hostname.
   * @return adminServer
  **/
  @ApiModelProperty(value = "Specifies the administrative server hostname.")
  public String getAdminServer() {
    return adminServer;
  }

  public void setAdminServer(String adminServer) {
    this.adminServer = adminServer;
  }

  public SettingsKrb5RealmCreateParams defaultDomain(String defaultDomain) {
    this.defaultDomain = defaultDomain;
    return this;
  }

   /**
   * Specifies the default domain mapped to the realm.
   * @return defaultDomain
  **/
  @ApiModelProperty(value = "Specifies the default domain mapped to the realm.")
  public String getDefaultDomain() {
    return defaultDomain;
  }

  public void setDefaultDomain(String defaultDomain) {
    this.defaultDomain = defaultDomain;
  }

  public SettingsKrb5RealmCreateParams isDefaultRealm(Boolean isDefaultRealm) {
    this.isDefaultRealm = isDefaultRealm;
    return this;
  }

   /**
   * If true, indicates that the realm is the default.
   * @return isDefaultRealm
  **/
  @ApiModelProperty(value = "If true, indicates that the realm is the default.")
  public Boolean isIsDefaultRealm() {
    return isDefaultRealm;
  }

  public void setIsDefaultRealm(Boolean isDefaultRealm) {
    this.isDefaultRealm = isDefaultRealm;
  }

  public SettingsKrb5RealmCreateParams kdc(List<String> kdc) {
    this.kdc = kdc;
    return this;
  }

  public SettingsKrb5RealmCreateParams addKdcItem(String kdcItem) {
    if (this.kdc == null) {
      this.kdc = new ArrayList<String>();
    }
    this.kdc.add(kdcItem);
    return this;
  }

   /**
   * Specifies the list of KDC hostnames.
   * @return kdc
  **/
  @ApiModelProperty(value = "Specifies the list of KDC hostnames.")
  public List<String> getKdc() {
    return kdc;
  }

  public void setKdc(List<String> kdc) {
    this.kdc = kdc;
  }

  public SettingsKrb5RealmCreateParams realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Specifies the name of the realm.
   * @return realm
  **/
  @ApiModelProperty(required = true, value = "Specifies the name of the realm.")
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsKrb5RealmCreateParams settingsKrb5RealmCreateParams = (SettingsKrb5RealmCreateParams) o;
    return Objects.equals(this.adminServer, settingsKrb5RealmCreateParams.adminServer) &&
        Objects.equals(this.defaultDomain, settingsKrb5RealmCreateParams.defaultDomain) &&
        Objects.equals(this.isDefaultRealm, settingsKrb5RealmCreateParams.isDefaultRealm) &&
        Objects.equals(this.kdc, settingsKrb5RealmCreateParams.kdc) &&
        Objects.equals(this.realm, settingsKrb5RealmCreateParams.realm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminServer, defaultDomain, isDefaultRealm, kdc, realm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsKrb5RealmCreateParams {\n");
    
    sb.append("    adminServer: ").append(toIndentedString(adminServer)).append("\n");
    sb.append("    defaultDomain: ").append(toIndentedString(defaultDomain)).append("\n");
    sb.append("    isDefaultRealm: ").append(toIndentedString(isDefaultRealm)).append("\n");
    sb.append("    kdc: ").append(toIndentedString(kdc)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
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
