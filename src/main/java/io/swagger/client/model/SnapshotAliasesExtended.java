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
import io.swagger.client.model.SnapshotAliasExtended;
import io.swagger.client.model.SnapshotAliases;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SnapshotAliasesExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SnapshotAliasesExtended {
  @SerializedName("aliases")
  private List<SnapshotAliasExtended> aliases = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public SnapshotAliasesExtended aliases(List<SnapshotAliasExtended> aliases) {
    this.aliases = aliases;
    return this;
  }

  public SnapshotAliasesExtended addAliasesItem(SnapshotAliasExtended aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<SnapshotAliasExtended>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(value = "")
  public List<SnapshotAliasExtended> getAliases() {
    return aliases;
  }

  public void setAliases(List<SnapshotAliasExtended> aliases) {
    this.aliases = aliases;
  }

  public SnapshotAliasesExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Resume token value to use in subsequent calls for continuation.
   * @return resume
  **/
  @ApiModelProperty(value = "Resume token value to use in subsequent calls for continuation.")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public SnapshotAliasesExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
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
    SnapshotAliasesExtended snapshotAliasesExtended = (SnapshotAliasesExtended) o;
    return Objects.equals(this.aliases, snapshotAliasesExtended.aliases) &&
        Objects.equals(this.resume, snapshotAliasesExtended.resume) &&
        Objects.equals(this.total, snapshotAliasesExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotAliasesExtended {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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

