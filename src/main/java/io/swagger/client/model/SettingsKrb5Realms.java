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
import io.swagger.client.model.SettingsKrb5RealmsRealmItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SettingsKrb5Realms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SettingsKrb5Realms {
  @SerializedName("realm")
  private List<SettingsKrb5RealmsRealmItem> realm = null;

  public SettingsKrb5Realms realm(List<SettingsKrb5RealmsRealmItem> realm) {
    this.realm = realm;
    return this;
  }

  public SettingsKrb5Realms addRealmItem(SettingsKrb5RealmsRealmItem realmItem) {
    if (this.realm == null) {
      this.realm = new ArrayList<SettingsKrb5RealmsRealmItem>();
    }
    this.realm.add(realmItem);
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  @ApiModelProperty(value = "")
  public List<SettingsKrb5RealmsRealmItem> getRealm() {
    return realm;
  }

  public void setRealm(List<SettingsKrb5RealmsRealmItem> realm) {
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
    SettingsKrb5Realms settingsKrb5Realms = (SettingsKrb5Realms) o;
    return Objects.equals(this.realm, settingsKrb5Realms.realm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsKrb5Realms {\n");
    
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
