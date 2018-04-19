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
import io.swagger.client.model.StoragepoolTier;
import io.swagger.client.model.StoragepoolTierUsage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoragepoolTierExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class StoragepoolTierExtended {
  @SerializedName("children")
  private List<String> children = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnns")
  private List<Integer> lnns = new ArrayList<Integer>();

  @SerializedName("usage")
  private StoragepoolTierUsage usage = null;

  public StoragepoolTierExtended children(List<String> children) {
    this.children = children;
    return this;
  }

  public StoragepoolTierExtended addChildrenItem(String childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<String>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * The names or IDs of the tier&#39;s children.
   * @return children
  **/
  @ApiModelProperty(value = "The names or IDs of the tier's children.")
  public List<String> getChildren() {
    return children;
  }

  public void setChildren(List<String> children) {
    this.children = children;
  }

  public StoragepoolTierExtended name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tier name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The tier name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoragepoolTierExtended id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The system ID given to the tier.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The system ID given to the tier.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StoragepoolTierExtended lnns(List<Integer> lnns) {
    this.lnns = lnns;
    return this;
  }

  public StoragepoolTierExtended addLnnsItem(Integer lnnsItem) {
    this.lnns.add(lnnsItem);
    return this;
  }

   /**
   * The nodes that are part of this tier.
   * @return lnns
  **/
  @ApiModelProperty(required = true, value = "The nodes that are part of this tier.")
  public List<Integer> getLnns() {
    return lnns;
  }

  public void setLnns(List<Integer> lnns) {
    this.lnns = lnns;
  }

  public StoragepoolTierExtended usage(StoragepoolTierUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Total pool usage.
   * @return usage
  **/
  @ApiModelProperty(required = true, value = "Total pool usage.")
  public StoragepoolTierUsage getUsage() {
    return usage;
  }

  public void setUsage(StoragepoolTierUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolTierExtended storagepoolTierExtended = (StoragepoolTierExtended) o;
    return Objects.equals(this.children, storagepoolTierExtended.children) &&
        Objects.equals(this.name, storagepoolTierExtended.name) &&
        Objects.equals(this.id, storagepoolTierExtended.id) &&
        Objects.equals(this.lnns, storagepoolTierExtended.lnns) &&
        Objects.equals(this.usage, storagepoolTierExtended.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, name, id, lnns, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolTierExtended {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnns: ").append(toIndentedString(lnns)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

