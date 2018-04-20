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
import io.swagger.client.model.FsaResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FsaResultExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class FsaResultExtended {
  @SerializedName("pinned")
  private Boolean pinned = null;

  @SerializedName("begin_time")
  private Integer beginTime = null;

  @SerializedName("content_path")
  private String contentPath = null;

  @SerializedName("delete_link")
  private String deleteLink = null;

  @SerializedName("end_time")
  private Integer endTime = null;

  /**
   * State of the result set.
   */
  @JsonAdapter(FsaStateEnum.Adapter.class)
  public enum FsaStateEnum {
    UNKNOWN("unknown"),
    
    WORK("work"),
    
    REDUCE("reduce"),
    
    PUBLISH("publish");

    private String value;

    FsaStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FsaStateEnum fromValue(String text) {
      for (FsaStateEnum b : FsaStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FsaStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FsaStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FsaStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FsaStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("fsa_state")
  private FsaStateEnum fsaState = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("job_state")
  private List<String> jobState = new ArrayList<String>();

  @SerializedName("properties_link")
  private String propertiesLink = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("version")
  private Integer version = null;

  public FsaResultExtended pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

   /**
   * True if the result is pinned to prevent automatic removal.
   * @return pinned
  **/
  @ApiModelProperty(required = true, value = "True if the result is pinned to prevent automatic removal.")
  public Boolean isPinned() {
    return pinned;
  }

  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }

  public FsaResultExtended beginTime(Integer beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Unix Epoch time of start of results collection job.
   * @return beginTime
  **/
  @ApiModelProperty(required = true, value = "Unix Epoch time of start of results collection job.")
  public Integer getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(Integer beginTime) {
    this.beginTime = beginTime;
  }

  public FsaResultExtended contentPath(String contentPath) {
    this.contentPath = contentPath;
    return this;
  }

   /**
   * Path to results database.
   * @return contentPath
  **/
  @ApiModelProperty(value = "Path to results database.")
  public String getContentPath() {
    return contentPath;
  }

  public void setContentPath(String contentPath) {
    this.contentPath = contentPath;
  }

  public FsaResultExtended deleteLink(String deleteLink) {
    this.deleteLink = deleteLink;
    return this;
  }

   /**
   * Resource to call with DELETE to remove results..
   * @return deleteLink
  **/
  @ApiModelProperty(value = "Resource to call with DELETE to remove results..")
  public String getDeleteLink() {
    return deleteLink;
  }

  public void setDeleteLink(String deleteLink) {
    this.deleteLink = deleteLink;
  }

  public FsaResultExtended endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Unix Epoch time of end of results collection job.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "Unix Epoch time of end of results collection job.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public FsaResultExtended fsaState(FsaStateEnum fsaState) {
    this.fsaState = fsaState;
    return this;
  }

   /**
   * State of the result set.
   * @return fsaState
  **/
  @ApiModelProperty(required = true, value = "State of the result set.")
  public FsaStateEnum getFsaState() {
    return fsaState;
  }

  public void setFsaState(FsaStateEnum fsaState) {
    this.fsaState = fsaState;
  }

  public FsaResultExtended id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The system generated result set ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The system generated result set ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public FsaResultExtended jobState(List<String> jobState) {
    this.jobState = jobState;
    return this;
  }

  public FsaResultExtended addJobStateItem(String jobStateItem) {
    this.jobState.add(jobStateItem);
    return this;
  }

   /**
   * State information about the FSA Job.
   * @return jobState
  **/
  @ApiModelProperty(required = true, value = "State information about the FSA Job.")
  public List<String> getJobState() {
    return jobState;
  }

  public void setJobState(List<String> jobState) {
    this.jobState = jobState;
  }

  public FsaResultExtended propertiesLink(String propertiesLink) {
    this.propertiesLink = propertiesLink;
    return this;
  }

   /**
   * Resource to call to get result properties.
   * @return propertiesLink
  **/
  @ApiModelProperty(required = true, value = "Resource to call to get result properties.")
  public String getPropertiesLink() {
    return propertiesLink;
  }

  public void setPropertiesLink(String propertiesLink) {
    this.propertiesLink = propertiesLink;
  }

  public FsaResultExtended size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size of the result set database in bytes.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Size of the result set database in bytes.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public FsaResultExtended version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * FSA version used to create result set.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "FSA version used to create result set.")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
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
    FsaResultExtended fsaResultExtended = (FsaResultExtended) o;
    return Objects.equals(this.pinned, fsaResultExtended.pinned) &&
        Objects.equals(this.beginTime, fsaResultExtended.beginTime) &&
        Objects.equals(this.contentPath, fsaResultExtended.contentPath) &&
        Objects.equals(this.deleteLink, fsaResultExtended.deleteLink) &&
        Objects.equals(this.endTime, fsaResultExtended.endTime) &&
        Objects.equals(this.fsaState, fsaResultExtended.fsaState) &&
        Objects.equals(this.id, fsaResultExtended.id) &&
        Objects.equals(this.jobState, fsaResultExtended.jobState) &&
        Objects.equals(this.propertiesLink, fsaResultExtended.propertiesLink) &&
        Objects.equals(this.size, fsaResultExtended.size) &&
        Objects.equals(this.version, fsaResultExtended.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinned, beginTime, contentPath, deleteLink, endTime, fsaState, id, jobState, propertiesLink, size, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FsaResultExtended {\n");
    
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    contentPath: ").append(toIndentedString(contentPath)).append("\n");
    sb.append("    deleteLink: ").append(toIndentedString(deleteLink)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    fsaState: ").append(toIndentedString(fsaState)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
    sb.append("    propertiesLink: ").append(toIndentedString(propertiesLink)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

