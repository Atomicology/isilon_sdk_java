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
import io.swagger.client.model.StoragepoolNodepoolExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoragepoolNodepools
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class StoragepoolNodepools {
  @SerializedName("nodepools")
  private List<StoragepoolNodepoolExtended> nodepools = null;

  public StoragepoolNodepools nodepools(List<StoragepoolNodepoolExtended> nodepools) {
    this.nodepools = nodepools;
    return this;
  }

  public StoragepoolNodepools addNodepoolsItem(StoragepoolNodepoolExtended nodepoolsItem) {
    if (this.nodepools == null) {
      this.nodepools = new ArrayList<StoragepoolNodepoolExtended>();
    }
    this.nodepools.add(nodepoolsItem);
    return this;
  }

   /**
   * Get nodepools
   * @return nodepools
  **/
  @ApiModelProperty(value = "")
  public List<StoragepoolNodepoolExtended> getNodepools() {
    return nodepools;
  }

  public void setNodepools(List<StoragepoolNodepoolExtended> nodepools) {
    this.nodepools = nodepools;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolNodepools storagepoolNodepools = (StoragepoolNodepools) o;
    return Objects.equals(this.nodepools, storagepoolNodepools.nodepools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodepools);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolNodepools {\n");
    
    sb.append("    nodepools: ").append(toIndentedString(nodepools)).append("\n");
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
