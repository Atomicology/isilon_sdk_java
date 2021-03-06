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
import java.math.BigDecimal;

/**
 * JobStatisticsJobNodeWorker
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobStatisticsJobNodeWorker {
  @SerializedName("stw")
  private BigDecimal stw = null;

  @SerializedName("task")
  private String task = null;

  @SerializedName("task_result")
  private String taskResult = null;

  @SerializedName("worker")
  private Integer worker = null;

  public JobStatisticsJobNodeWorker stw(BigDecimal stw) {
    this.stw = stw;
    return this;
  }

   /**
   * The sleep-to-work ratio of this worker; how much time it spends sleeping compared to working.
   * @return stw
  **/
  @ApiModelProperty(value = "The sleep-to-work ratio of this worker; how much time it spends sleeping compared to working.")
  public BigDecimal getStw() {
    return stw;
  }

  public void setStw(BigDecimal stw) {
    this.stw = stw;
  }

  public JobStatisticsJobNodeWorker task(String task) {
    this.task = task;
    return this;
  }

   /**
   * A representation of the task the worker is currently processing; not intended to be read by humans.
   * @return task
  **/
  @ApiModelProperty(value = "A representation of the task the worker is currently processing; not intended to be read by humans.")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public JobStatisticsJobNodeWorker taskResult(String taskResult) {
    this.taskResult = taskResult;
    return this;
  }

   /**
   * A representation of the most recent task result produced by the worker; not intended to be read by humans.
   * @return taskResult
  **/
  @ApiModelProperty(value = "A representation of the most recent task result produced by the worker; not intended to be read by humans.")
  public String getTaskResult() {
    return taskResult;
  }

  public void setTaskResult(String taskResult) {
    this.taskResult = taskResult;
  }

  public JobStatisticsJobNodeWorker worker(Integer worker) {
    this.worker = worker;
    return this;
  }

   /**
   * The worker ID.
   * @return worker
  **/
  @ApiModelProperty(required = true, value = "The worker ID.")
  public Integer getWorker() {
    return worker;
  }

  public void setWorker(Integer worker) {
    this.worker = worker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatisticsJobNodeWorker jobStatisticsJobNodeWorker = (JobStatisticsJobNodeWorker) o;
    return Objects.equals(this.stw, jobStatisticsJobNodeWorker.stw) &&
        Objects.equals(this.task, jobStatisticsJobNodeWorker.task) &&
        Objects.equals(this.taskResult, jobStatisticsJobNodeWorker.taskResult) &&
        Objects.equals(this.worker, jobStatisticsJobNodeWorker.worker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stw, task, taskResult, worker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatisticsJobNodeWorker {\n");
    
    sb.append("    stw: ").append(toIndentedString(stw)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    taskResult: ").append(toIndentedString(taskResult)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
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

