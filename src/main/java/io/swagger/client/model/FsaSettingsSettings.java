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
 * FsaSettingsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class FsaSettingsSettings {
  @SerializedName("default_template")
  private String defaultTemplate = null;

  @SerializedName("disk_usage_depth")
  private Integer diskUsageDepth = null;

  @SerializedName("max_age")
  private Integer maxAge = null;

  @SerializedName("max_count")
  private Integer maxCount = null;

  @SerializedName("squash_depth")
  private Integer squashDepth = null;

  @SerializedName("top_n_max")
  private Integer topNMax = null;

  @SerializedName("use_snapshot")
  private Boolean useSnapshot = null;

  public FsaSettingsSettings defaultTemplate(String defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
    return this;
  }

   /**
   * Name of question template to use for new FSA jobs.
   * @return defaultTemplate
  **/
  @ApiModelProperty(value = "Name of question template to use for new FSA jobs.")
  public String getDefaultTemplate() {
    return defaultTemplate;
  }

  public void setDefaultTemplate(String defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
  }

  public FsaSettingsSettings diskUsageDepth(Integer diskUsageDepth) {
    this.diskUsageDepth = diskUsageDepth;
    return this;
  }

   /**
   * Maximum directory depth used for disk_usage question if not specified in the question.
   * @return diskUsageDepth
  **/
  @ApiModelProperty(value = "Maximum directory depth used for disk_usage question if not specified in the question.")
  public Integer getDiskUsageDepth() {
    return diskUsageDepth;
  }

  public void setDiskUsageDepth(Integer diskUsageDepth) {
    this.diskUsageDepth = diskUsageDepth;
  }

  public FsaSettingsSettings maxAge(Integer maxAge) {
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Maximum age of non-pinned results in seconds.
   * @return maxAge
  **/
  @ApiModelProperty(value = "Maximum age of non-pinned results in seconds.")
  public Integer getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(Integer maxAge) {
    this.maxAge = maxAge;
  }

  public FsaSettingsSettings maxCount(Integer maxCount) {
    this.maxCount = maxCount;
    return this;
  }

   /**
   * Maximum number of non-pinned result sets to keep.
   * @return maxCount
  **/
  @ApiModelProperty(value = "Maximum number of non-pinned result sets to keep.")
  public Integer getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
  }

  public FsaSettingsSettings squashDepth(Integer squashDepth) {
    this.squashDepth = squashDepth;
    return this;
  }

   /**
   * Squash depth to use for squash binning questions if not specified in the question.
   * @return squashDepth
  **/
  @ApiModelProperty(value = "Squash depth to use for squash binning questions if not specified in the question.")
  public Integer getSquashDepth() {
    return squashDepth;
  }

  public void setSquashDepth(Integer squashDepth) {
    this.squashDepth = squashDepth;
  }

  public FsaSettingsSettings topNMax(Integer topNMax) {
    this.topNMax = topNMax;
    return this;
  }

   /**
   * Maximum number of items in a Top-N question result if not specified in the question.
   * @return topNMax
  **/
  @ApiModelProperty(value = "Maximum number of items in a Top-N question result if not specified in the question.")
  public Integer getTopNMax() {
    return topNMax;
  }

  public void setTopNMax(Integer topNMax) {
    this.topNMax = topNMax;
  }

  public FsaSettingsSettings useSnapshot(Boolean useSnapshot) {
    this.useSnapshot = useSnapshot;
    return this;
  }

   /**
   * If true, use a snapshot for consistency, otherwise analyze head.
   * @return useSnapshot
  **/
  @ApiModelProperty(value = "If true, use a snapshot for consistency, otherwise analyze head.")
  public Boolean isUseSnapshot() {
    return useSnapshot;
  }

  public void setUseSnapshot(Boolean useSnapshot) {
    this.useSnapshot = useSnapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FsaSettingsSettings fsaSettingsSettings = (FsaSettingsSettings) o;
    return Objects.equals(this.defaultTemplate, fsaSettingsSettings.defaultTemplate) &&
        Objects.equals(this.diskUsageDepth, fsaSettingsSettings.diskUsageDepth) &&
        Objects.equals(this.maxAge, fsaSettingsSettings.maxAge) &&
        Objects.equals(this.maxCount, fsaSettingsSettings.maxCount) &&
        Objects.equals(this.squashDepth, fsaSettingsSettings.squashDepth) &&
        Objects.equals(this.topNMax, fsaSettingsSettings.topNMax) &&
        Objects.equals(this.useSnapshot, fsaSettingsSettings.useSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTemplate, diskUsageDepth, maxAge, maxCount, squashDepth, topNMax, useSnapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FsaSettingsSettings {\n");
    
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
    sb.append("    diskUsageDepth: ").append(toIndentedString(diskUsageDepth)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    squashDepth: ").append(toIndentedString(squashDepth)).append("\n");
    sb.append("    topNMax: ").append(toIndentedString(topNMax)).append("\n");
    sb.append("    useSnapshot: ").append(toIndentedString(useSnapshot)).append("\n");
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

