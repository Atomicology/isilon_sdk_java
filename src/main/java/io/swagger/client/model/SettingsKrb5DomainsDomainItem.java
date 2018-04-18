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

/**
 * SettingsKrb5DomainsDomainItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SettingsKrb5DomainsDomainItem {
  @SerializedName("domain")
  private String domain = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("realm")
  private String realm = null;

  public SettingsKrb5DomainsDomainItem domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Specifies the name of the domain.
   * @return domain
  **/
  @ApiModelProperty(value = "Specifies the name of the domain.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public SettingsKrb5DomainsDomainItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the domain
   * @return id
  **/
  @ApiModelProperty(value = "ID of the domain")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SettingsKrb5DomainsDomainItem realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Specifies the name of the realm.
   * @return realm
  **/
  @ApiModelProperty(value = "Specifies the name of the realm.")
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
    SettingsKrb5DomainsDomainItem settingsKrb5DomainsDomainItem = (SettingsKrb5DomainsDomainItem) o;
    return Objects.equals(this.domain, settingsKrb5DomainsDomainItem.domain) &&
        Objects.equals(this.id, settingsKrb5DomainsDomainItem.id) &&
        Objects.equals(this.realm, settingsKrb5DomainsDomainItem.realm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, id, realm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsKrb5DomainsDomainItem {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
