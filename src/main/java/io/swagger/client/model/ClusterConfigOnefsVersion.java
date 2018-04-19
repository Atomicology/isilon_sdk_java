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
 * ClusterConfigOnefsVersion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ClusterConfigOnefsVersion {
  @SerializedName("build")
  private String build = null;

  @SerializedName("copyright")
  private String copyright = null;

  @SerializedName("reldate")
  private Integer reldate = null;

  @SerializedName("release")
  private String release = null;

  @SerializedName("revision")
  private String revision = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("version")
  private String version = null;

  public ClusterConfigOnefsVersion build(String build) {
    this.build = build;
    return this;
  }

   /**
   * OneFS build string.
   * @return build
  **/
  @ApiModelProperty(required = true, value = "OneFS build string.")
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }

  public ClusterConfigOnefsVersion copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

   /**
   * Cluster copyright information.
   * @return copyright
  **/
  @ApiModelProperty(required = true, value = "Cluster copyright information.")
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public ClusterConfigOnefsVersion reldate(Integer reldate) {
    this.reldate = reldate;
    return this;
  }

   /**
   * Timestamp of release date.
   * @return reldate
  **/
  @ApiModelProperty(required = true, value = "Timestamp of release date.")
  public Integer getReldate() {
    return reldate;
  }

  public void setReldate(Integer reldate) {
    this.reldate = reldate;
  }

  public ClusterConfigOnefsVersion release(String release) {
    this.release = release;
    return this;
  }

   /**
   * Kernel release number.
   * @return release
  **/
  @ApiModelProperty(required = true, value = "Kernel release number.")
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }

  public ClusterConfigOnefsVersion revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * OneFS build number.
   * @return revision
  **/
  @ApiModelProperty(required = true, value = "OneFS build number.")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public ClusterConfigOnefsVersion type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Kernel release type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Kernel release type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ClusterConfigOnefsVersion version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Kernel full version information.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Kernel full version information.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterConfigOnefsVersion clusterConfigOnefsVersion = (ClusterConfigOnefsVersion) o;
    return Objects.equals(this.build, clusterConfigOnefsVersion.build) &&
        Objects.equals(this.copyright, clusterConfigOnefsVersion.copyright) &&
        Objects.equals(this.reldate, clusterConfigOnefsVersion.reldate) &&
        Objects.equals(this.release, clusterConfigOnefsVersion.release) &&
        Objects.equals(this.revision, clusterConfigOnefsVersion.revision) &&
        Objects.equals(this.type, clusterConfigOnefsVersion.type) &&
        Objects.equals(this.version, clusterConfigOnefsVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build, copyright, reldate, release, revision, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterConfigOnefsVersion {\n");
    
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    reldate: ").append(toIndentedString(reldate)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

