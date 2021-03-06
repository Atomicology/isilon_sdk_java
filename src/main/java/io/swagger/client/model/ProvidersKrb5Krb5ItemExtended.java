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
import io.swagger.client.model.ProvidersKrb5Krb5Item;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProvidersKrb5Krb5ItemExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ProvidersKrb5Krb5ItemExtended {
  @SerializedName("groupnet")
  private String groupnet = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("keytab_entries")
  private List<ProvidersKrb5IdParamsKeytabEntry> keytabEntries = null;

  @SerializedName("keytab_file")
  private String keytabFile = null;

  @SerializedName("manual_keying")
  private Boolean manualKeying = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("realm")
  private String realm = null;

  @SerializedName("recommended_spns")
  private List<String> recommendedSpns = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("password")
  private String password = null;

  public ProvidersKrb5Krb5ItemExtended groupnet(String groupnet) {
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

  public ProvidersKrb5Krb5ItemExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the Kerberos provider ID.
   * @return id
  **/
  @ApiModelProperty(value = "Specifies the Kerberos provider ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProvidersKrb5Krb5ItemExtended keytabEntries(List<ProvidersKrb5IdParamsKeytabEntry> keytabEntries) {
    this.keytabEntries = keytabEntries;
    return this;
  }

  public ProvidersKrb5Krb5ItemExtended addKeytabEntriesItem(ProvidersKrb5IdParamsKeytabEntry keytabEntriesItem) {
    if (this.keytabEntries == null) {
      this.keytabEntries = new ArrayList<ProvidersKrb5IdParamsKeytabEntry>();
    }
    this.keytabEntries.add(keytabEntriesItem);
    return this;
  }

   /**
   * Specifies the key information for the Kerberos SPNs.
   * @return keytabEntries
  **/
  @ApiModelProperty(value = "Specifies the key information for the Kerberos SPNs.")
  public List<ProvidersKrb5IdParamsKeytabEntry> getKeytabEntries() {
    return keytabEntries;
  }

  public void setKeytabEntries(List<ProvidersKrb5IdParamsKeytabEntry> keytabEntries) {
    this.keytabEntries = keytabEntries;
  }

  public ProvidersKrb5Krb5ItemExtended keytabFile(String keytabFile) {
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

  public ProvidersKrb5Krb5ItemExtended manualKeying(Boolean manualKeying) {
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

  public ProvidersKrb5Krb5ItemExtended name(String name) {
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

  public ProvidersKrb5Krb5ItemExtended realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Specifies the name of realm.
   * @return realm
  **/
  @ApiModelProperty(value = "Specifies the name of realm.")
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public ProvidersKrb5Krb5ItemExtended recommendedSpns(List<String> recommendedSpns) {
    this.recommendedSpns = recommendedSpns;
    return this;
  }

  public ProvidersKrb5Krb5ItemExtended addRecommendedSpnsItem(String recommendedSpnsItem) {
    if (this.recommendedSpns == null) {
      this.recommendedSpns = new ArrayList<String>();
    }
    this.recommendedSpns.add(recommendedSpnsItem);
    return this;
  }

   /**
   * Specifies the recommended SPNs.
   * @return recommendedSpns
  **/
  @ApiModelProperty(value = "Specifies the recommended SPNs.")
  public List<String> getRecommendedSpns() {
    return recommendedSpns;
  }

  public void setRecommendedSpns(List<String> recommendedSpns) {
    this.recommendedSpns = recommendedSpns;
  }

  public ProvidersKrb5Krb5ItemExtended status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of the provider.
   * @return status
  **/
  @ApiModelProperty(value = "Specifies the status of the provider.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProvidersKrb5Krb5ItemExtended system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * If true, indicates that this provider instance was created by OneFS and cannot be removed
   * @return system
  **/
  @ApiModelProperty(value = "If true, indicates that this provider instance was created by OneFS and cannot be removed")
  public Boolean isSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public ProvidersKrb5Krb5ItemExtended user(String user) {
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

  public ProvidersKrb5Krb5ItemExtended password(String password) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersKrb5Krb5ItemExtended providersKrb5Krb5ItemExtended = (ProvidersKrb5Krb5ItemExtended) o;
    return Objects.equals(this.groupnet, providersKrb5Krb5ItemExtended.groupnet) &&
        Objects.equals(this.id, providersKrb5Krb5ItemExtended.id) &&
        Objects.equals(this.keytabEntries, providersKrb5Krb5ItemExtended.keytabEntries) &&
        Objects.equals(this.keytabFile, providersKrb5Krb5ItemExtended.keytabFile) &&
        Objects.equals(this.manualKeying, providersKrb5Krb5ItemExtended.manualKeying) &&
        Objects.equals(this.name, providersKrb5Krb5ItemExtended.name) &&
        Objects.equals(this.realm, providersKrb5Krb5ItemExtended.realm) &&
        Objects.equals(this.recommendedSpns, providersKrb5Krb5ItemExtended.recommendedSpns) &&
        Objects.equals(this.status, providersKrb5Krb5ItemExtended.status) &&
        Objects.equals(this.system, providersKrb5Krb5ItemExtended.system) &&
        Objects.equals(this.user, providersKrb5Krb5ItemExtended.user) &&
        Objects.equals(this.password, providersKrb5Krb5ItemExtended.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupnet, id, keytabEntries, keytabFile, manualKeying, name, realm, recommendedSpns, status, system, user, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersKrb5Krb5ItemExtended {\n");
    
    sb.append("    groupnet: ").append(toIndentedString(groupnet)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keytabEntries: ").append(toIndentedString(keytabEntries)).append("\n");
    sb.append("    keytabFile: ").append(toIndentedString(keytabFile)).append("\n");
    sb.append("    manualKeying: ").append(toIndentedString(manualKeying)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    recommendedSpns: ").append(toIndentedString(recommendedSpns)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

