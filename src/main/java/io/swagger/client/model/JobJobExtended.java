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
import java.util.ArrayList;
import java.util.List;

/**
 * JobJobExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobJobExtended {
  /**
   * State to which the job is transitioning; if control_state is identical to state, the job&#39;s state is stable.
   */
  @JsonAdapter(ControlStateEnum.Adapter.class)
  public enum ControlStateEnum {
    RUNNING("running"),
    
    PAUSED_USER("paused_user"),
    
    PAUSED_SYSTEM("paused_system"),
    
    PAUSED_POLICY("paused_policy"),
    
    PAUSED_PRIORITY("paused_priority"),
    
    CANCELLED_USER("cancelled_user"),
    
    CANCELLED_SYSTEM("cancelled_system"),
    
    FAILED("failed"),
    
    SUCCEEDED("succeeded"),
    
    UNKNOWN("unknown");

    private String value;

    ControlStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ControlStateEnum fromValue(String text) {
      for (ControlStateEnum b : ControlStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ControlStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ControlStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ControlStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ControlStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("control_state")
  private ControlStateEnum controlState = null;

  @SerializedName("create_time")
  private Integer createTime = null;

  @SerializedName("current_phase")
  private Integer currentPhase = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("end_time")
  private Integer endTime = null;

  @SerializedName("id")
  private Integer id = null;

  /**
   * The current impact of the job.
   */
  @JsonAdapter(ImpactEnum.Adapter.class)
  public enum ImpactEnum {
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High"),
    
    PAUSED("Paused");

    private String value;

    ImpactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImpactEnum fromValue(String text) {
      for (ImpactEnum b : ImpactEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImpactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImpactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImpactEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImpactEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("impact")
  private ImpactEnum impact = null;

  @SerializedName("participants")
  private List<Integer> participants = null;

  @SerializedName("paths")
  private List<String> paths = null;

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("progress")
  private String progress = null;

  @SerializedName("retries_remaining")
  private Integer retriesRemaining = null;

  @SerializedName("running_time")
  private Integer runningTime = null;

  @SerializedName("start_time")
  private Integer startTime = null;

  /**
   * Current state of the job.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("running"),
    
    PAUSED_USER("paused_user"),
    
    PAUSED_SYSTEM("paused_system"),
    
    PAUSED_POLICY("paused_policy"),
    
    PAUSED_PRIORITY("paused_priority"),
    
    CANCELLED_USER("cancelled_user"),
    
    CANCELLED_SYSTEM("cancelled_system"),
    
    FAILED("failed"),
    
    SUCCEEDED("succeeded"),
    
    UNKNOWN("unknown");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("total_phases")
  private Integer totalPhases = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("waiting_on")
  private Integer waitingOn = null;

  /**
   * The reason the job is waiting.
   */
  @JsonAdapter(WaitingReasonEnum.Adapter.class)
  public enum WaitingReasonEnum {
    PRIORITY("blocked_by_priority");

    private String value;

    WaitingReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WaitingReasonEnum fromValue(String text) {
      for (WaitingReasonEnum b : WaitingReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WaitingReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WaitingReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WaitingReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WaitingReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("waiting_reason")
  private WaitingReasonEnum waitingReason = null;

  public JobJobExtended controlState(ControlStateEnum controlState) {
    this.controlState = controlState;
    return this;
  }

   /**
   * State to which the job is transitioning; if control_state is identical to state, the job&#39;s state is stable.
   * @return controlState
  **/
  @ApiModelProperty(value = "State to which the job is transitioning; if control_state is identical to state, the job's state is stable.")
  public ControlStateEnum getControlState() {
    return controlState;
  }

  public void setControlState(ControlStateEnum controlState) {
    this.controlState = controlState;
  }

  public JobJobExtended createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The time the job was queued, in seconds since the epoch.
   * @return createTime
  **/
  @ApiModelProperty(required = true, value = "The time the job was queued, in seconds since the epoch.")
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public JobJobExtended currentPhase(Integer currentPhase) {
    this.currentPhase = currentPhase;
    return this;
  }

   /**
   * The current phase of the job.
   * @return currentPhase
  **/
  @ApiModelProperty(value = "The current phase of the job.")
  public Integer getCurrentPhase() {
    return currentPhase;
  }

  public void setCurrentPhase(Integer currentPhase) {
    this.currentPhase = currentPhase;
  }

  public JobJobExtended description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A text representation of the job.
   * @return description
  **/
  @ApiModelProperty(value = "A text representation of the job.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JobJobExtended endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The time the job ended, in seconds since the Epoch.
   * @return endTime
  **/
  @ApiModelProperty(value = "The time the job ended, in seconds since the Epoch.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public JobJobExtended id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the job.
   * minimum: 1
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the job.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public JobJobExtended impact(ImpactEnum impact) {
    this.impact = impact;
    return this;
  }

   /**
   * The current impact of the job.
   * @return impact
  **/
  @ApiModelProperty(required = true, value = "The current impact of the job.")
  public ImpactEnum getImpact() {
    return impact;
  }

  public void setImpact(ImpactEnum impact) {
    this.impact = impact;
  }

  public JobJobExtended participants(List<Integer> participants) {
    this.participants = participants;
    return this;
  }

  public JobJobExtended addParticipantsItem(Integer participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<Integer>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * The set of devids working on the job.
   * @return participants
  **/
  @ApiModelProperty(value = "The set of devids working on the job.")
  public List<Integer> getParticipants() {
    return participants;
  }

  public void setParticipants(List<Integer> participants) {
    this.participants = participants;
  }

  public JobJobExtended paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public JobJobExtended addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<String>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Paths for which the job was queued.
   * @return paths
  **/
  @ApiModelProperty(value = "Paths for which the job was queued.")
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }

  public JobJobExtended policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Current impact policy of the job.
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "Current impact policy of the job.")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public JobJobExtended priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Current priority of the job; lower numbers preempt higher numbers.
   * minimum: 1
   * maximum: 10
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "Current priority of the job; lower numbers preempt higher numbers.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public JobJobExtended progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * A text representation of the job&#39;s progress.
   * @return progress
  **/
  @ApiModelProperty(value = "A text representation of the job's progress.")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public JobJobExtended retriesRemaining(Integer retriesRemaining) {
    this.retriesRemaining = retriesRemaining;
    return this;
  }

   /**
   * The number of retries remaining if the job fails.
   * @return retriesRemaining
  **/
  @ApiModelProperty(required = true, value = "The number of retries remaining if the job fails.")
  public Integer getRetriesRemaining() {
    return retriesRemaining;
  }

  public void setRetriesRemaining(Integer retriesRemaining) {
    this.retriesRemaining = retriesRemaining;
  }

  public JobJobExtended runningTime(Integer runningTime) {
    this.runningTime = runningTime;
    return this;
  }

   /**
   * The number of seconds the job has executed.
   * @return runningTime
  **/
  @ApiModelProperty(value = "The number of seconds the job has executed.")
  public Integer getRunningTime() {
    return runningTime;
  }

  public void setRunningTime(Integer runningTime) {
    this.runningTime = runningTime;
  }

  public JobJobExtended startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The time the job started, in seconds since the Epoch.
   * @return startTime
  **/
  @ApiModelProperty(value = "The time the job started, in seconds since the Epoch.")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public JobJobExtended state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Current state of the job.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Current state of the job.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public JobJobExtended totalPhases(Integer totalPhases) {
    this.totalPhases = totalPhases;
    return this;
  }

   /**
   * The total number of phases of the job type.
   * @return totalPhases
  **/
  @ApiModelProperty(required = true, value = "The total number of phases of the job type.")
  public Integer getTotalPhases() {
    return totalPhases;
  }

  public void setTotalPhases(Integer totalPhases) {
    this.totalPhases = totalPhases;
  }

  public JobJobExtended type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The job type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The job type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JobJobExtended waitingOn(Integer waitingOn) {
    this.waitingOn = waitingOn;
    return this;
  }

   /**
   * The ID of a job for which this job is waiting.
   * @return waitingOn
  **/
  @ApiModelProperty(value = "The ID of a job for which this job is waiting.")
  public Integer getWaitingOn() {
    return waitingOn;
  }

  public void setWaitingOn(Integer waitingOn) {
    this.waitingOn = waitingOn;
  }

  public JobJobExtended waitingReason(WaitingReasonEnum waitingReason) {
    this.waitingReason = waitingReason;
    return this;
  }

   /**
   * The reason the job is waiting.
   * @return waitingReason
  **/
  @ApiModelProperty(value = "The reason the job is waiting.")
  public WaitingReasonEnum getWaitingReason() {
    return waitingReason;
  }

  public void setWaitingReason(WaitingReasonEnum waitingReason) {
    this.waitingReason = waitingReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobJobExtended jobJobExtended = (JobJobExtended) o;
    return Objects.equals(this.controlState, jobJobExtended.controlState) &&
        Objects.equals(this.createTime, jobJobExtended.createTime) &&
        Objects.equals(this.currentPhase, jobJobExtended.currentPhase) &&
        Objects.equals(this.description, jobJobExtended.description) &&
        Objects.equals(this.endTime, jobJobExtended.endTime) &&
        Objects.equals(this.id, jobJobExtended.id) &&
        Objects.equals(this.impact, jobJobExtended.impact) &&
        Objects.equals(this.participants, jobJobExtended.participants) &&
        Objects.equals(this.paths, jobJobExtended.paths) &&
        Objects.equals(this.policy, jobJobExtended.policy) &&
        Objects.equals(this.priority, jobJobExtended.priority) &&
        Objects.equals(this.progress, jobJobExtended.progress) &&
        Objects.equals(this.retriesRemaining, jobJobExtended.retriesRemaining) &&
        Objects.equals(this.runningTime, jobJobExtended.runningTime) &&
        Objects.equals(this.startTime, jobJobExtended.startTime) &&
        Objects.equals(this.state, jobJobExtended.state) &&
        Objects.equals(this.totalPhases, jobJobExtended.totalPhases) &&
        Objects.equals(this.type, jobJobExtended.type) &&
        Objects.equals(this.waitingOn, jobJobExtended.waitingOn) &&
        Objects.equals(this.waitingReason, jobJobExtended.waitingReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlState, createTime, currentPhase, description, endTime, id, impact, participants, paths, policy, priority, progress, retriesRemaining, runningTime, startTime, state, totalPhases, type, waitingOn, waitingReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobJobExtended {\n");
    
    sb.append("    controlState: ").append(toIndentedString(controlState)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    currentPhase: ").append(toIndentedString(currentPhase)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    retriesRemaining: ").append(toIndentedString(retriesRemaining)).append("\n");
    sb.append("    runningTime: ").append(toIndentedString(runningTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalPhases: ").append(toIndentedString(totalPhases)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    waitingOn: ").append(toIndentedString(waitingOn)).append("\n");
    sb.append("    waitingReason: ").append(toIndentedString(waitingReason)).append("\n");
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

