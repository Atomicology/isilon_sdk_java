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
 * NfsSettingsZoneSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NfsSettingsZoneSettings {
  @SerializedName("nfsv4_allow_numeric_ids")
  private Boolean nfsv4AllowNumericIds = null;

  @SerializedName("nfsv4_domain")
  private String nfsv4Domain = null;

  @SerializedName("nfsv4_no_domain")
  private Boolean nfsv4NoDomain = null;

  @SerializedName("nfsv4_no_domain_uids")
  private Boolean nfsv4NoDomainUids = null;

  @SerializedName("nfsv4_no_names")
  private Boolean nfsv4NoNames = null;

  @SerializedName("nfsv4_replace_domain")
  private Boolean nfsv4ReplaceDomain = null;

  @SerializedName("zone")
  private String zone = null;

  public NfsSettingsZoneSettings nfsv4AllowNumericIds(Boolean nfsv4AllowNumericIds) {
    this.nfsv4AllowNumericIds = nfsv4AllowNumericIds;
    return this;
  }

   /**
   * If true, sends owners and groups as UIDs and GIDs when look up fails or if the &#39;nfsv4_no_name&#39; property is set to 1.
   * @return nfsv4AllowNumericIds
  **/
  @ApiModelProperty(value = "If true, sends owners and groups as UIDs and GIDs when look up fails or if the 'nfsv4_no_name' property is set to 1.")
  public Boolean isNfsv4AllowNumericIds() {
    return nfsv4AllowNumericIds;
  }

  public void setNfsv4AllowNumericIds(Boolean nfsv4AllowNumericIds) {
    this.nfsv4AllowNumericIds = nfsv4AllowNumericIds;
  }

  public NfsSettingsZoneSettings nfsv4Domain(String nfsv4Domain) {
    this.nfsv4Domain = nfsv4Domain;
    return this;
  }

   /**
   * Specifies the domain or realm through which users and groups are associated.
   * @return nfsv4Domain
  **/
  @ApiModelProperty(value = "Specifies the domain or realm through which users and groups are associated.")
  public String getNfsv4Domain() {
    return nfsv4Domain;
  }

  public void setNfsv4Domain(String nfsv4Domain) {
    this.nfsv4Domain = nfsv4Domain;
  }

  public NfsSettingsZoneSettings nfsv4NoDomain(Boolean nfsv4NoDomain) {
    this.nfsv4NoDomain = nfsv4NoDomain;
    return this;
  }

   /**
   * If true, sends owners and groups without a domain name.
   * @return nfsv4NoDomain
  **/
  @ApiModelProperty(value = "If true, sends owners and groups without a domain name.")
  public Boolean isNfsv4NoDomain() {
    return nfsv4NoDomain;
  }

  public void setNfsv4NoDomain(Boolean nfsv4NoDomain) {
    this.nfsv4NoDomain = nfsv4NoDomain;
  }

  public NfsSettingsZoneSettings nfsv4NoDomainUids(Boolean nfsv4NoDomainUids) {
    this.nfsv4NoDomainUids = nfsv4NoDomainUids;
    return this;
  }

   /**
   * If true, sends UIDs and GIDs without a domain name.
   * @return nfsv4NoDomainUids
  **/
  @ApiModelProperty(value = "If true, sends UIDs and GIDs without a domain name.")
  public Boolean isNfsv4NoDomainUids() {
    return nfsv4NoDomainUids;
  }

  public void setNfsv4NoDomainUids(Boolean nfsv4NoDomainUids) {
    this.nfsv4NoDomainUids = nfsv4NoDomainUids;
  }

  public NfsSettingsZoneSettings nfsv4NoNames(Boolean nfsv4NoNames) {
    this.nfsv4NoNames = nfsv4NoNames;
    return this;
  }

   /**
   * If true, sends owners and groups as UIDs and GIDs.
   * @return nfsv4NoNames
  **/
  @ApiModelProperty(value = "If true, sends owners and groups as UIDs and GIDs.")
  public Boolean isNfsv4NoNames() {
    return nfsv4NoNames;
  }

  public void setNfsv4NoNames(Boolean nfsv4NoNames) {
    this.nfsv4NoNames = nfsv4NoNames;
  }

  public NfsSettingsZoneSettings nfsv4ReplaceDomain(Boolean nfsv4ReplaceDomain) {
    this.nfsv4ReplaceDomain = nfsv4ReplaceDomain;
    return this;
  }

   /**
   * If true, replaces the owner or group domain with an NFS domain name.
   * @return nfsv4ReplaceDomain
  **/
  @ApiModelProperty(value = "If true, replaces the owner or group domain with an NFS domain name.")
  public Boolean isNfsv4ReplaceDomain() {
    return nfsv4ReplaceDomain;
  }

  public void setNfsv4ReplaceDomain(Boolean nfsv4ReplaceDomain) {
    this.nfsv4ReplaceDomain = nfsv4ReplaceDomain;
  }

  public NfsSettingsZoneSettings zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Specifies the access zones in which these settings apply.
   * @return zone
  **/
  @ApiModelProperty(value = "Specifies the access zones in which these settings apply.")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfsSettingsZoneSettings nfsSettingsZoneSettings = (NfsSettingsZoneSettings) o;
    return Objects.equals(this.nfsv4AllowNumericIds, nfsSettingsZoneSettings.nfsv4AllowNumericIds) &&
        Objects.equals(this.nfsv4Domain, nfsSettingsZoneSettings.nfsv4Domain) &&
        Objects.equals(this.nfsv4NoDomain, nfsSettingsZoneSettings.nfsv4NoDomain) &&
        Objects.equals(this.nfsv4NoDomainUids, nfsSettingsZoneSettings.nfsv4NoDomainUids) &&
        Objects.equals(this.nfsv4NoNames, nfsSettingsZoneSettings.nfsv4NoNames) &&
        Objects.equals(this.nfsv4ReplaceDomain, nfsSettingsZoneSettings.nfsv4ReplaceDomain) &&
        Objects.equals(this.zone, nfsSettingsZoneSettings.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfsv4AllowNumericIds, nfsv4Domain, nfsv4NoDomain, nfsv4NoDomainUids, nfsv4NoNames, nfsv4ReplaceDomain, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfsSettingsZoneSettings {\n");
    
    sb.append("    nfsv4AllowNumericIds: ").append(toIndentedString(nfsv4AllowNumericIds)).append("\n");
    sb.append("    nfsv4Domain: ").append(toIndentedString(nfsv4Domain)).append("\n");
    sb.append("    nfsv4NoDomain: ").append(toIndentedString(nfsv4NoDomain)).append("\n");
    sb.append("    nfsv4NoDomainUids: ").append(toIndentedString(nfsv4NoDomainUids)).append("\n");
    sb.append("    nfsv4NoNames: ").append(toIndentedString(nfsv4NoNames)).append("\n");
    sb.append("    nfsv4ReplaceDomain: ").append(toIndentedString(nfsv4ReplaceDomain)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

