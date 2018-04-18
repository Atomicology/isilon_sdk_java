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
import java.math.BigDecimal;

/**
 * SnapshotSettingsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SnapshotSettingsSettings {
  @SerializedName("autocreate")
  private Boolean autocreate = null;

  @SerializedName("autodelete")
  private Boolean autodelete = null;

  @SerializedName("global_visible_accessible")
  private Boolean globalVisibleAccessible = null;

  @SerializedName("local_root_accessible")
  private Boolean localRootAccessible = null;

  @SerializedName("local_root_visible")
  private Boolean localRootVisible = null;

  @SerializedName("local_subdir_accessible")
  private Boolean localSubdirAccessible = null;

  @SerializedName("nfs_root_accessible")
  private Boolean nfsRootAccessible = null;

  @SerializedName("nfs_root_visible")
  private Boolean nfsRootVisible = null;

  @SerializedName("nfs_subdir_accessible")
  private Boolean nfsSubdirAccessible = null;

  @SerializedName("reserve")
  private BigDecimal reserve = null;

  @SerializedName("service")
  private Boolean service = null;

  @SerializedName("smb_root_accessible")
  private Boolean smbRootAccessible = null;

  @SerializedName("smb_root_visible")
  private Boolean smbRootVisible = null;

  @SerializedName("smb_subdir_accessible")
  private Boolean smbSubdirAccessible = null;

  public SnapshotSettingsSettings autocreate(Boolean autocreate) {
    this.autocreate = autocreate;
    return this;
  }

   /**
   * True if the scheduled snapshot creation services is on.
   * @return autocreate
  **/
  @ApiModelProperty(required = true, value = "True if the scheduled snapshot creation services is on.")
  public Boolean isAutocreate() {
    return autocreate;
  }

  public void setAutocreate(Boolean autocreate) {
    this.autocreate = autocreate;
  }

  public SnapshotSettingsSettings autodelete(Boolean autodelete) {
    this.autodelete = autodelete;
    return this;
  }

   /**
   * True if the scheduled snapshot deletion services is on.
   * @return autodelete
  **/
  @ApiModelProperty(required = true, value = "True if the scheduled snapshot deletion services is on.")
  public Boolean isAutodelete() {
    return autodelete;
  }

  public void setAutodelete(Boolean autodelete) {
    this.autodelete = autodelete;
  }

  public SnapshotSettingsSettings globalVisibleAccessible(Boolean globalVisibleAccessible) {
    this.globalVisibleAccessible = globalVisibleAccessible;
    return this;
  }

   /**
   * Global switch for other accessible and visible settings.
   * @return globalVisibleAccessible
  **/
  @ApiModelProperty(required = true, value = "Global switch for other accessible and visible settings.")
  public Boolean isGlobalVisibleAccessible() {
    return globalVisibleAccessible;
  }

  public void setGlobalVisibleAccessible(Boolean globalVisibleAccessible) {
    this.globalVisibleAccessible = globalVisibleAccessible;
  }

  public SnapshotSettingsSettings localRootAccessible(Boolean localRootAccessible) {
    this.localRootAccessible = localRootAccessible;
    return this;
  }

   /**
   * True if root .snapshot directory is accessible locally.
   * @return localRootAccessible
  **/
  @ApiModelProperty(required = true, value = "True if root .snapshot directory is accessible locally.")
  public Boolean isLocalRootAccessible() {
    return localRootAccessible;
  }

  public void setLocalRootAccessible(Boolean localRootAccessible) {
    this.localRootAccessible = localRootAccessible;
  }

  public SnapshotSettingsSettings localRootVisible(Boolean localRootVisible) {
    this.localRootVisible = localRootVisible;
    return this;
  }

   /**
   * True if root .snapshot directory is visible locally.
   * @return localRootVisible
  **/
  @ApiModelProperty(required = true, value = "True if root .snapshot directory is visible locally.")
  public Boolean isLocalRootVisible() {
    return localRootVisible;
  }

  public void setLocalRootVisible(Boolean localRootVisible) {
    this.localRootVisible = localRootVisible;
  }

  public SnapshotSettingsSettings localSubdirAccessible(Boolean localSubdirAccessible) {
    this.localSubdirAccessible = localSubdirAccessible;
    return this;
  }

   /**
   * True if sub-directory .snapshot directory is accessible locally.
   * @return localSubdirAccessible
  **/
  @ApiModelProperty(required = true, value = "True if sub-directory .snapshot directory is accessible locally.")
  public Boolean isLocalSubdirAccessible() {
    return localSubdirAccessible;
  }

  public void setLocalSubdirAccessible(Boolean localSubdirAccessible) {
    this.localSubdirAccessible = localSubdirAccessible;
  }

  public SnapshotSettingsSettings nfsRootAccessible(Boolean nfsRootAccessible) {
    this.nfsRootAccessible = nfsRootAccessible;
    return this;
  }

   /**
   * True if root .snapshot directory is accessible over NFS.
   * @return nfsRootAccessible
  **/
  @ApiModelProperty(required = true, value = "True if root .snapshot directory is accessible over NFS.")
  public Boolean isNfsRootAccessible() {
    return nfsRootAccessible;
  }

  public void setNfsRootAccessible(Boolean nfsRootAccessible) {
    this.nfsRootAccessible = nfsRootAccessible;
  }

  public SnapshotSettingsSettings nfsRootVisible(Boolean nfsRootVisible) {
    this.nfsRootVisible = nfsRootVisible;
    return this;
  }

   /**
   * True if root .snapshot directory is visible over NFS.
   * @return nfsRootVisible
  **/
  @ApiModelProperty(required = true, value = "True if root .snapshot directory is visible over NFS.")
  public Boolean isNfsRootVisible() {
    return nfsRootVisible;
  }

  public void setNfsRootVisible(Boolean nfsRootVisible) {
    this.nfsRootVisible = nfsRootVisible;
  }

  public SnapshotSettingsSettings nfsSubdirAccessible(Boolean nfsSubdirAccessible) {
    this.nfsSubdirAccessible = nfsSubdirAccessible;
    return this;
  }

   /**
   * True if sub-directory .snapshot directory is accessible over NFS.
   * @return nfsSubdirAccessible
  **/
  @ApiModelProperty(required = true, value = "True if sub-directory .snapshot directory is accessible over NFS.")
  public Boolean isNfsSubdirAccessible() {
    return nfsSubdirAccessible;
  }

  public void setNfsSubdirAccessible(Boolean nfsSubdirAccessible) {
    this.nfsSubdirAccessible = nfsSubdirAccessible;
  }

  public SnapshotSettingsSettings reserve(BigDecimal reserve) {
    this.reserve = reserve;
    return this;
  }

   /**
   * Percentage of space to reserve for snapshots.
   * @return reserve
  **/
  @ApiModelProperty(required = true, value = "Percentage of space to reserve for snapshots.")
  public BigDecimal getReserve() {
    return reserve;
  }

  public void setReserve(BigDecimal reserve) {
    this.reserve = reserve;
  }

  public SnapshotSettingsSettings service(Boolean service) {
    this.service = service;
    return this;
  }

   /**
   * True if the system allows snapshot creation.
   * @return service
  **/
  @ApiModelProperty(required = true, value = "True if the system allows snapshot creation.")
  public Boolean isService() {
    return service;
  }

  public void setService(Boolean service) {
    this.service = service;
  }

  public SnapshotSettingsSettings smbRootAccessible(Boolean smbRootAccessible) {
    this.smbRootAccessible = smbRootAccessible;
    return this;
  }

   /**
   * True if root .snapshot directory is accessible over SMB.
   * @return smbRootAccessible
  **/
  @ApiModelProperty(required = true, value = "True if root .snapshot directory is accessible over SMB.")
  public Boolean isSmbRootAccessible() {
    return smbRootAccessible;
  }

  public void setSmbRootAccessible(Boolean smbRootAccessible) {
    this.smbRootAccessible = smbRootAccessible;
  }

  public SnapshotSettingsSettings smbRootVisible(Boolean smbRootVisible) {
    this.smbRootVisible = smbRootVisible;
    return this;
  }

   /**
   * True if root .snapshot directory is visible over SMB.
   * @return smbRootVisible
  **/
  @ApiModelProperty(required = true, value = "True if root .snapshot directory is visible over SMB.")
  public Boolean isSmbRootVisible() {
    return smbRootVisible;
  }

  public void setSmbRootVisible(Boolean smbRootVisible) {
    this.smbRootVisible = smbRootVisible;
  }

  public SnapshotSettingsSettings smbSubdirAccessible(Boolean smbSubdirAccessible) {
    this.smbSubdirAccessible = smbSubdirAccessible;
    return this;
  }

   /**
   * True if sub-directory .snapshot directory is accessible over SMB.
   * @return smbSubdirAccessible
  **/
  @ApiModelProperty(required = true, value = "True if sub-directory .snapshot directory is accessible over SMB.")
  public Boolean isSmbSubdirAccessible() {
    return smbSubdirAccessible;
  }

  public void setSmbSubdirAccessible(Boolean smbSubdirAccessible) {
    this.smbSubdirAccessible = smbSubdirAccessible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotSettingsSettings snapshotSettingsSettings = (SnapshotSettingsSettings) o;
    return Objects.equals(this.autocreate, snapshotSettingsSettings.autocreate) &&
        Objects.equals(this.autodelete, snapshotSettingsSettings.autodelete) &&
        Objects.equals(this.globalVisibleAccessible, snapshotSettingsSettings.globalVisibleAccessible) &&
        Objects.equals(this.localRootAccessible, snapshotSettingsSettings.localRootAccessible) &&
        Objects.equals(this.localRootVisible, snapshotSettingsSettings.localRootVisible) &&
        Objects.equals(this.localSubdirAccessible, snapshotSettingsSettings.localSubdirAccessible) &&
        Objects.equals(this.nfsRootAccessible, snapshotSettingsSettings.nfsRootAccessible) &&
        Objects.equals(this.nfsRootVisible, snapshotSettingsSettings.nfsRootVisible) &&
        Objects.equals(this.nfsSubdirAccessible, snapshotSettingsSettings.nfsSubdirAccessible) &&
        Objects.equals(this.reserve, snapshotSettingsSettings.reserve) &&
        Objects.equals(this.service, snapshotSettingsSettings.service) &&
        Objects.equals(this.smbRootAccessible, snapshotSettingsSettings.smbRootAccessible) &&
        Objects.equals(this.smbRootVisible, snapshotSettingsSettings.smbRootVisible) &&
        Objects.equals(this.smbSubdirAccessible, snapshotSettingsSettings.smbSubdirAccessible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autocreate, autodelete, globalVisibleAccessible, localRootAccessible, localRootVisible, localSubdirAccessible, nfsRootAccessible, nfsRootVisible, nfsSubdirAccessible, reserve, service, smbRootAccessible, smbRootVisible, smbSubdirAccessible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotSettingsSettings {\n");
    
    sb.append("    autocreate: ").append(toIndentedString(autocreate)).append("\n");
    sb.append("    autodelete: ").append(toIndentedString(autodelete)).append("\n");
    sb.append("    globalVisibleAccessible: ").append(toIndentedString(globalVisibleAccessible)).append("\n");
    sb.append("    localRootAccessible: ").append(toIndentedString(localRootAccessible)).append("\n");
    sb.append("    localRootVisible: ").append(toIndentedString(localRootVisible)).append("\n");
    sb.append("    localSubdirAccessible: ").append(toIndentedString(localSubdirAccessible)).append("\n");
    sb.append("    nfsRootAccessible: ").append(toIndentedString(nfsRootAccessible)).append("\n");
    sb.append("    nfsRootVisible: ").append(toIndentedString(nfsRootVisible)).append("\n");
    sb.append("    nfsSubdirAccessible: ").append(toIndentedString(nfsSubdirAccessible)).append("\n");
    sb.append("    reserve: ").append(toIndentedString(reserve)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    smbRootAccessible: ").append(toIndentedString(smbRootAccessible)).append("\n");
    sb.append("    smbRootVisible: ").append(toIndentedString(smbRootVisible)).append("\n");
    sb.append("    smbSubdirAccessible: ").append(toIndentedString(smbSubdirAccessible)).append("\n");
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
