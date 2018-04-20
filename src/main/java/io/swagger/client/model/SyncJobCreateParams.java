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
 * SyncJobCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SyncJobCreateParams {
  /**
   * The action to be taken by this job.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    RESYNC_PREP("resync_prep"),
    
    ALLOW_WRITE("allow_write"),
    
    ALLOW_WRITE_REVERT("allow_write_revert"),
    
    TEST("test");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Only valid for allow_write, and allow_write_revert; specify the desired logging level, will be stored in the logs for isi_migrate, defaults to &#39;info&#39;.
   */
  @JsonAdapter(LogLevelEnum.Adapter.class)
  public enum LogLevelEnum {
    FATAL("fatal"),
    
    ERROR("error"),
    
    NOTICE("notice"),
    
    INFO("info"),
    
    COPY("copy"),
    
    DEBUG("debug"),
    
    TRACE("trace");

    private String value;

    LogLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LogLevelEnum fromValue(String text) {
      for (LogLevelEnum b : LogLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LogLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LogLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("log_level")
  private LogLevelEnum logLevel = null;

  @SerializedName("source_snapshot")
  private String sourceSnapshot = null;

  @SerializedName("workers_per_node")
  private Integer workersPerNode = null;

  public SyncJobCreateParams action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The action to be taken by this job.
   * @return action
  **/
  @ApiModelProperty(value = "The action to be taken by this job.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public SyncJobCreateParams id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID or Name of the policy
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID or Name of the policy")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SyncJobCreateParams logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Only valid for allow_write, and allow_write_revert; specify the desired logging level, will be stored in the logs for isi_migrate, defaults to &#39;info&#39;.
   * @return logLevel
  **/
  @ApiModelProperty(value = "Only valid for allow_write, and allow_write_revert; specify the desired logging level, will be stored in the logs for isi_migrate, defaults to 'info'.")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  public SyncJobCreateParams sourceSnapshot(String sourceSnapshot) {
    this.sourceSnapshot = sourceSnapshot;
    return this;
  }

   /**
   * An optional snapshot to copy/sync from.
   * @return sourceSnapshot
  **/
  @ApiModelProperty(value = "An optional snapshot to copy/sync from.")
  public String getSourceSnapshot() {
    return sourceSnapshot;
  }

  public void setSourceSnapshot(String sourceSnapshot) {
    this.sourceSnapshot = sourceSnapshot;
  }

  public SyncJobCreateParams workersPerNode(Integer workersPerNode) {
    this.workersPerNode = workersPerNode;
    return this;
  }

   /**
   * Only valid for allow_write, and allow_write_revert; specify the desired workers per node, defaults to 3.
   * @return workersPerNode
  **/
  @ApiModelProperty(value = "Only valid for allow_write, and allow_write_revert; specify the desired workers per node, defaults to 3.")
  public Integer getWorkersPerNode() {
    return workersPerNode;
  }

  public void setWorkersPerNode(Integer workersPerNode) {
    this.workersPerNode = workersPerNode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncJobCreateParams syncJobCreateParams = (SyncJobCreateParams) o;
    return Objects.equals(this.action, syncJobCreateParams.action) &&
        Objects.equals(this.id, syncJobCreateParams.id) &&
        Objects.equals(this.logLevel, syncJobCreateParams.logLevel) &&
        Objects.equals(this.sourceSnapshot, syncJobCreateParams.sourceSnapshot) &&
        Objects.equals(this.workersPerNode, syncJobCreateParams.workersPerNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, id, logLevel, sourceSnapshot, workersPerNode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncJobCreateParams {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    sourceSnapshot: ").append(toIndentedString(sourceSnapshot)).append("\n");
    sb.append("    workersPerNode: ").append(toIndentedString(workersPerNode)).append("\n");
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

