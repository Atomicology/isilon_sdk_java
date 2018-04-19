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
import io.swagger.client.model.StoragepoolStoragepool;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoragepoolStoragepools
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class StoragepoolStoragepools {
  @SerializedName("storagepools")
  private List<StoragepoolStoragepool> storagepools = null;

  @SerializedName("total")
  private Integer total = null;

  public StoragepoolStoragepools storagepools(List<StoragepoolStoragepool> storagepools) {
    this.storagepools = storagepools;
    return this;
  }

  public StoragepoolStoragepools addStoragepoolsItem(StoragepoolStoragepool storagepoolsItem) {
    if (this.storagepools == null) {
      this.storagepools = new ArrayList<StoragepoolStoragepool>();
    }
    this.storagepools.add(storagepoolsItem);
    return this;
  }

   /**
   * Get storagepools
   * @return storagepools
  **/
  @ApiModelProperty(value = "")
  public List<StoragepoolStoragepool> getStoragepools() {
    return storagepools;
  }

  public void setStoragepools(List<StoragepoolStoragepool> storagepools) {
    this.storagepools = storagepools;
  }

  public StoragepoolStoragepools total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolStoragepools storagepoolStoragepools = (StoragepoolStoragepools) o;
    return Objects.equals(this.storagepools, storagepoolStoragepools.storagepools) &&
        Objects.equals(this.total, storagepoolStoragepools.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storagepools, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolStoragepools {\n");
    
    sb.append("    storagepools: ").append(toIndentedString(storagepools)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

