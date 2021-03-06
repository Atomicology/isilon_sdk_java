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
import io.swagger.client.model.NdmpContextsBackupContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Get NDMP Context List
 */
@ApiModel(description = "Get NDMP Context List")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NdmpContextsBackupExtended {
  @SerializedName("contexts")
  private List<NdmpContextsBackupContext> contexts = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public NdmpContextsBackupExtended contexts(List<NdmpContextsBackupContext> contexts) {
    this.contexts = contexts;
    return this;
  }

  public NdmpContextsBackupExtended addContextsItem(NdmpContextsBackupContext contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<NdmpContextsBackupContext>();
    }
    this.contexts.add(contextsItem);
    return this;
  }

   /**
   * Get contexts
   * @return contexts
  **/
  @ApiModelProperty(value = "")
  public List<NdmpContextsBackupContext> getContexts() {
    return contexts;
  }

  public void setContexts(List<NdmpContextsBackupContext> contexts) {
    this.contexts = contexts;
  }

  public NdmpContextsBackupExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Resume string returned by previous query.
   * @return resume
  **/
  @ApiModelProperty(value = "Resume string returned by previous query.")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public NdmpContextsBackupExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The number of ndmp contexts.
   * @return total
  **/
  @ApiModelProperty(value = "The number of ndmp contexts.")
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
    NdmpContextsBackupExtended ndmpContextsBackupExtended = (NdmpContextsBackupExtended) o;
    return Objects.equals(this.contexts, ndmpContextsBackupExtended.contexts) &&
        Objects.equals(this.resume, ndmpContextsBackupExtended.resume) &&
        Objects.equals(this.total, ndmpContextsBackupExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contexts, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpContextsBackupExtended {\n");
    
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
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

