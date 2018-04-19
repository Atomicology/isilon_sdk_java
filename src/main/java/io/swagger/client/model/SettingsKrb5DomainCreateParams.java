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
import io.swagger.client.model.SettingsKrb5Domain;
import java.io.IOException;

/**
 * SettingsKrb5DomainCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SettingsKrb5DomainCreateParams {
  @SerializedName("realm")
  private String realm = null;

  @SerializedName("domain")
  private String domain = null;

  public SettingsKrb5DomainCreateParams realm(String realm) {
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

  public SettingsKrb5DomainCreateParams domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Specifies the name of the domain.
   * @return domain
  **/
  @ApiModelProperty(required = true, value = "Specifies the name of the domain.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsKrb5DomainCreateParams settingsKrb5DomainCreateParams = (SettingsKrb5DomainCreateParams) o;
    return Objects.equals(this.realm, settingsKrb5DomainCreateParams.realm) &&
        Objects.equals(this.domain, settingsKrb5DomainCreateParams.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realm, domain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsKrb5DomainCreateParams {\n");
    
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

