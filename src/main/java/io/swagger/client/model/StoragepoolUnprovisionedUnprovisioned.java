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
import io.swagger.client.model.StoragepoolStatusUnprovisionedItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoragepoolUnprovisionedUnprovisioned
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class StoragepoolUnprovisionedUnprovisioned {
  @SerializedName("drives")
  private List<StoragepoolStatusUnprovisionedItem> drives = new ArrayList<StoragepoolStatusUnprovisionedItem>();

  @SerializedName("lnns")
  private List<Integer> lnns = new ArrayList<Integer>();

  public StoragepoolUnprovisionedUnprovisioned drives(List<StoragepoolStatusUnprovisionedItem> drives) {
    this.drives = drives;
    return this;
  }

  public StoragepoolUnprovisionedUnprovisioned addDrivesItem(StoragepoolStatusUnprovisionedItem drivesItem) {
    this.drives.add(drivesItem);
    return this;
  }

   /**
   * A list of unprovisioned drives that do not belong to an unprovisioned node.
   * @return drives
  **/
  @ApiModelProperty(required = true, value = "A list of unprovisioned drives that do not belong to an unprovisioned node.")
  public List<StoragepoolStatusUnprovisionedItem> getDrives() {
    return drives;
  }

  public void setDrives(List<StoragepoolStatusUnprovisionedItem> drives) {
    this.drives = drives;
  }

  public StoragepoolUnprovisionedUnprovisioned lnns(List<Integer> lnns) {
    this.lnns = lnns;
    return this;
  }

  public StoragepoolUnprovisionedUnprovisioned addLnnsItem(Integer lnnsItem) {
    this.lnns.add(lnnsItem);
    return this;
  }

   /**
   * A list of lnns whose drives are all unprovisioned
   * @return lnns
  **/
  @ApiModelProperty(required = true, value = "A list of lnns whose drives are all unprovisioned")
  public List<Integer> getLnns() {
    return lnns;
  }

  public void setLnns(List<Integer> lnns) {
    this.lnns = lnns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolUnprovisionedUnprovisioned storagepoolUnprovisionedUnprovisioned = (StoragepoolUnprovisionedUnprovisioned) o;
    return Objects.equals(this.drives, storagepoolUnprovisionedUnprovisioned.drives) &&
        Objects.equals(this.lnns, storagepoolUnprovisionedUnprovisioned.lnns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drives, lnns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolUnprovisionedUnprovisioned {\n");
    
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    lnns: ").append(toIndentedString(lnns)).append("\n");
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

