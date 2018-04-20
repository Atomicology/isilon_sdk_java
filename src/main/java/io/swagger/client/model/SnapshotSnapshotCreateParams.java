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
import io.swagger.client.model.SnapshotSnapshot;
import java.io.IOException;

/**
 * SnapshotSnapshotCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SnapshotSnapshotCreateParams {
  @SerializedName("alias")
  private String alias = null;

  @SerializedName("expires")
  private Integer expires = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  public SnapshotSnapshotCreateParams alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias name to create for this snapshot. If null, remove any alias.
   * @return alias
  **/
  @ApiModelProperty(value = "Alias name to create for this snapshot. If null, remove any alias.")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public SnapshotSnapshotCreateParams expires(Integer expires) {
    this.expires = expires;
    return this;
  }

   /**
   * The Unix Epoch time the snapshot will expire and be eligible for automatic deletion.
   * maximum: 4294967295
   * @return expires
  **/
  @ApiModelProperty(value = "The Unix Epoch time the snapshot will expire and be eligible for automatic deletion.")
  public Integer getExpires() {
    return expires;
  }

  public void setExpires(Integer expires) {
    this.expires = expires;
  }

  public SnapshotSnapshotCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user or system supplied snapshot name. This will be null for snapshots pending delete.
   * @return name
  **/
  @ApiModelProperty(value = "The user or system supplied snapshot name. This will be null for snapshots pending delete.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SnapshotSnapshotCreateParams path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The /ifs path snapshotted.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The /ifs path snapshotted.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotSnapshotCreateParams snapshotSnapshotCreateParams = (SnapshotSnapshotCreateParams) o;
    return Objects.equals(this.alias, snapshotSnapshotCreateParams.alias) &&
        Objects.equals(this.expires, snapshotSnapshotCreateParams.expires) &&
        Objects.equals(this.name, snapshotSnapshotCreateParams.name) &&
        Objects.equals(this.path, snapshotSnapshotCreateParams.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, expires, name, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotSnapshotCreateParams {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

