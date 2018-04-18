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
import io.swagger.client.model.JobJobAvscanParams;
import io.swagger.client.model.JobJobChangelistcreateParams;
import io.swagger.client.model.JobJobDomainmarkParams;
import io.swagger.client.model.JobJobPrepairParams;
import io.swagger.client.model.JobJobSmartpoolstreeParams;
import io.swagger.client.model.JobJobSnaprevertParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobJobCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class JobJobCreateParams {
  @SerializedName("allow_dup")
  private Boolean allowDup = null;

  @SerializedName("avscan_params")
  private JobJobAvscanParams avscanParams = null;

  @SerializedName("changelistcreate_params")
  private JobJobChangelistcreateParams changelistcreateParams = null;

  @SerializedName("domainmark_params")
  private JobJobDomainmarkParams domainmarkParams = null;

  @SerializedName("paths")
  private List<String> paths = new ArrayList<String>();

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("prepair_params")
  private JobJobPrepairParams prepairParams = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("smartpoolstree_params")
  private JobJobSmartpoolstreeParams smartpoolstreeParams = null;

  @SerializedName("snaprevert_params")
  private JobJobSnaprevertParams snaprevertParams = null;

  @SerializedName("type")
  private String type = null;

  public JobJobCreateParams allowDup(Boolean allowDup) {
    this.allowDup = allowDup;
    return this;
  }

   /**
   * Whether or not to queue the job if one of the same type is already running or queued.
   * @return allowDup
  **/
  @ApiModelProperty(value = "Whether or not to queue the job if one of the same type is already running or queued.")
  public Boolean isAllowDup() {
    return allowDup;
  }

  public void setAllowDup(Boolean allowDup) {
    this.allowDup = allowDup;
  }

  public JobJobCreateParams avscanParams(JobJobAvscanParams avscanParams) {
    this.avscanParams = avscanParams;
    return this;
  }

   /**
   * 
   * @return avscanParams
  **/
  @ApiModelProperty(value = "")
  public JobJobAvscanParams getAvscanParams() {
    return avscanParams;
  }

  public void setAvscanParams(JobJobAvscanParams avscanParams) {
    this.avscanParams = avscanParams;
  }

  public JobJobCreateParams changelistcreateParams(JobJobChangelistcreateParams changelistcreateParams) {
    this.changelistcreateParams = changelistcreateParams;
    return this;
  }

   /**
   * 
   * @return changelistcreateParams
  **/
  @ApiModelProperty(value = "")
  public JobJobChangelistcreateParams getChangelistcreateParams() {
    return changelistcreateParams;
  }

  public void setChangelistcreateParams(JobJobChangelistcreateParams changelistcreateParams) {
    this.changelistcreateParams = changelistcreateParams;
  }

  public JobJobCreateParams domainmarkParams(JobJobDomainmarkParams domainmarkParams) {
    this.domainmarkParams = domainmarkParams;
    return this;
  }

   /**
   * 
   * @return domainmarkParams
  **/
  @ApiModelProperty(value = "")
  public JobJobDomainmarkParams getDomainmarkParams() {
    return domainmarkParams;
  }

  public void setDomainmarkParams(JobJobDomainmarkParams domainmarkParams) {
    this.domainmarkParams = domainmarkParams;
  }

  public JobJobCreateParams paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public JobJobCreateParams addPathsItem(String pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * For jobs which take paths, the IFS paths to pass to the job.
   * @return paths
  **/
  @ApiModelProperty(required = true, value = "For jobs which take paths, the IFS paths to pass to the job.")
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }

  public JobJobCreateParams policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Impact policy of this job instance.
   * @return policy
  **/
  @ApiModelProperty(value = "Impact policy of this job instance.")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public JobJobCreateParams prepairParams(JobJobPrepairParams prepairParams) {
    this.prepairParams = prepairParams;
    return this;
  }

   /**
   * 
   * @return prepairParams
  **/
  @ApiModelProperty(value = "")
  public JobJobPrepairParams getPrepairParams() {
    return prepairParams;
  }

  public void setPrepairParams(JobJobPrepairParams prepairParams) {
    this.prepairParams = prepairParams;
  }

  public JobJobCreateParams priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority of this job instance; lower numbers preempt higher numbers.
   * minimum: 1
   * maximum: 10
   * @return priority
  **/
  @ApiModelProperty(value = "Priority of this job instance; lower numbers preempt higher numbers.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public JobJobCreateParams smartpoolstreeParams(JobJobSmartpoolstreeParams smartpoolstreeParams) {
    this.smartpoolstreeParams = smartpoolstreeParams;
    return this;
  }

   /**
   * 
   * @return smartpoolstreeParams
  **/
  @ApiModelProperty(value = "")
  public JobJobSmartpoolstreeParams getSmartpoolstreeParams() {
    return smartpoolstreeParams;
  }

  public void setSmartpoolstreeParams(JobJobSmartpoolstreeParams smartpoolstreeParams) {
    this.smartpoolstreeParams = smartpoolstreeParams;
  }

  public JobJobCreateParams snaprevertParams(JobJobSnaprevertParams snaprevertParams) {
    this.snaprevertParams = snaprevertParams;
    return this;
  }

   /**
   * 
   * @return snaprevertParams
  **/
  @ApiModelProperty(value = "")
  public JobJobSnaprevertParams getSnaprevertParams() {
    return snaprevertParams;
  }

  public void setSnaprevertParams(JobJobSnaprevertParams snaprevertParams) {
    this.snaprevertParams = snaprevertParams;
  }

  public JobJobCreateParams type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Job type to queue.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Job type to queue.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobJobCreateParams jobJobCreateParams = (JobJobCreateParams) o;
    return Objects.equals(this.allowDup, jobJobCreateParams.allowDup) &&
        Objects.equals(this.avscanParams, jobJobCreateParams.avscanParams) &&
        Objects.equals(this.changelistcreateParams, jobJobCreateParams.changelistcreateParams) &&
        Objects.equals(this.domainmarkParams, jobJobCreateParams.domainmarkParams) &&
        Objects.equals(this.paths, jobJobCreateParams.paths) &&
        Objects.equals(this.policy, jobJobCreateParams.policy) &&
        Objects.equals(this.prepairParams, jobJobCreateParams.prepairParams) &&
        Objects.equals(this.priority, jobJobCreateParams.priority) &&
        Objects.equals(this.smartpoolstreeParams, jobJobCreateParams.smartpoolstreeParams) &&
        Objects.equals(this.snaprevertParams, jobJobCreateParams.snaprevertParams) &&
        Objects.equals(this.type, jobJobCreateParams.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDup, avscanParams, changelistcreateParams, domainmarkParams, paths, policy, prepairParams, priority, smartpoolstreeParams, snaprevertParams, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobJobCreateParams {\n");
    
    sb.append("    allowDup: ").append(toIndentedString(allowDup)).append("\n");
    sb.append("    avscanParams: ").append(toIndentedString(avscanParams)).append("\n");
    sb.append("    changelistcreateParams: ").append(toIndentedString(changelistcreateParams)).append("\n");
    sb.append("    domainmarkParams: ").append(toIndentedString(domainmarkParams)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    prepairParams: ").append(toIndentedString(prepairParams)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    smartpoolstreeParams: ").append(toIndentedString(smartpoolstreeParams)).append("\n");
    sb.append("    snaprevertParams: ").append(toIndentedString(snaprevertParams)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
