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
import io.swagger.client.model.ProvidersKrb5IdParamsKeytabEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies properties for the Kerberos authentication provider.
 */
@ApiModel(description = "Specifies properties for the Kerberos authentication provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ProvidersKrb5Item {
  @SerializedName("groupnet")
  private String groupnet = null;

  @SerializedName("keytab_entries")
  private List<ProvidersKrb5IdParamsKeytabEntry> keytabEntries = null;

  @SerializedName("keytab_file")
  private String keytabFile = null;

  @SerializedName("manual_keying")
  private Boolean manualKeying = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("realm")
  private String realm = null;

  @SerializedName("user")
  private String user = null;

  public ProvidersKrb5Item groupnet(String groupnet) {
    this.groupnet = groupnet;
    return this;
  }

   /**
   * Groupnet identifier.
   * @return groupnet
  **/
  @ApiModelProperty(value = "Groupnet identifier.")
  public String getGroupnet() {
    return groupnet;
  }

  public void setGroupnet(String groupnet) {
    this.groupnet = groupnet;
  }

  public ProvidersKrb5Item keytabEntries(List<ProvidersKrb5IdParamsKeytabEntry> keytabEntries) {
    this.keytabEntries = keytabEntries;
    return this;
  }

  public ProvidersKrb5Item addKeytabEntriesItem(ProvidersKrb5IdParamsKeytabEntry keytabEntriesItem) {
    if (this.keytabEntries == null) {
      this.keytabEntries = new ArrayList<ProvidersKrb5IdParamsKeytabEntry>();
    }
    this.keytabEntries.add(keytabEntriesItem);
    return this;
  }

   /**
   * Specifies the key information for the Kerberos SPN.
   * @return keytabEntries
  **/
  @ApiModelProperty(value = "Specifies the key information for the Kerberos SPN.")
  public List<ProvidersKrb5IdParamsKeytabEntry> getKeytabEntries() {
    return keytabEntries;
  }

  public void setKeytabEntries(List<ProvidersKrb5IdParamsKeytabEntry> keytabEntries) {
    this.keytabEntries = keytabEntries;
  }

  public ProvidersKrb5Item keytabFile(String keytabFile) {
    this.keytabFile = keytabFile;
    return this;
  }

   /**
   * Specifies the path to a keytab file to import.
   * @return keytabFile
  **/
  @ApiModelProperty(value = "Specifies the path to a keytab file to import.")
  public String getKeytabFile() {
    return keytabFile;
  }

  public void setKeytabFile(String keytabFile) {
    this.keytabFile = keytabFile;
  }

  public ProvidersKrb5Item manualKeying(Boolean manualKeying) {
    this.manualKeying = manualKeying;
    return this;
  }

   /**
   * If true, keys are managed manually. If false, keys are managed through kadmin.
   * @return manualKeying
  **/
  @ApiModelProperty(value = "If true, keys are managed manually. If false, keys are managed through kadmin.")
  public Boolean isManualKeying() {
    return manualKeying;
  }

  public void setManualKeying(Boolean manualKeying) {
    this.manualKeying = manualKeying;
  }

  public ProvidersKrb5Item name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the Kerberos provider name.
   * @return name
  **/
  @ApiModelProperty(value = "Specifies the Kerberos provider name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProvidersKrb5Item password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Specifies the Kerberos provider password.
   * @return password
  **/
  @ApiModelProperty(value = "Specifies the Kerberos provider password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ProvidersKrb5Item realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Specifies the name of realm.
   * @return realm
  **/
  @ApiModelProperty(required = true, value = "Specifies the name of realm.")
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public ProvidersKrb5Item user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Specifies the name of the user that performs kadmin tasks.
   * @return user
  **/
  @ApiModelProperty(value = "Specifies the name of the user that performs kadmin tasks.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
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
    ProvidersKrb5Item providersKrb5Item = (ProvidersKrb5Item) o;
    return Objects.equals(this.groupnet, providersKrb5Item.groupnet) &&
        Objects.equals(this.keytabEntries, providersKrb5Item.keytabEntries) &&
        Objects.equals(this.keytabFile, providersKrb5Item.keytabFile) &&
        Objects.equals(this.manualKeying, providersKrb5Item.manualKeying) &&
        Objects.equals(this.name, providersKrb5Item.name) &&
        Objects.equals(this.password, providersKrb5Item.password) &&
        Objects.equals(this.realm, providersKrb5Item.realm) &&
        Objects.equals(this.user, providersKrb5Item.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupnet, keytabEntries, keytabFile, manualKeying, name, password, realm, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersKrb5Item {\n");
    
    sb.append("    groupnet: ").append(toIndentedString(groupnet)).append("\n");
    sb.append("    keytabEntries: ").append(toIndentedString(keytabEntries)).append("\n");
    sb.append("    keytabFile: ").append(toIndentedString(keytabFile)).append("\n");
    sb.append("    manualKeying: ").append(toIndentedString(manualKeying)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
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
