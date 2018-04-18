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
import io.swagger.client.model.ClusterPatchPatches;
import io.swagger.client.model.ClusterPatchPatchesPatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterPatchPatchesExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ClusterPatchPatchesExtended {
  @SerializedName("patches")
  private List<ClusterPatchPatchesPatch> patches = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public ClusterPatchPatchesExtended patches(List<ClusterPatchPatchesPatch> patches) {
    this.patches = patches;
    return this;
  }

  public ClusterPatchPatchesExtended addPatchesItem(ClusterPatchPatchesPatch patchesItem) {
    if (this.patches == null) {
      this.patches = new ArrayList<ClusterPatchPatchesPatch>();
    }
    this.patches.add(patchesItem);
    return this;
  }

   /**
   * Get patches
   * @return patches
  **/
  @ApiModelProperty(value = "")
  public List<ClusterPatchPatchesPatch> getPatches() {
    return patches;
  }

  public void setPatches(List<ClusterPatchPatchesPatch> patches) {
    this.patches = patches;
  }

  public ClusterPatchPatchesExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
   * @return resume
  **/
  @ApiModelProperty(value = "Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public ClusterPatchPatchesExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
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
    ClusterPatchPatchesExtended clusterPatchPatchesExtended = (ClusterPatchPatchesExtended) o;
    return Objects.equals(this.patches, clusterPatchPatchesExtended.patches) &&
        Objects.equals(this.resume, clusterPatchPatchesExtended.resume) &&
        Objects.equals(this.total, clusterPatchPatchesExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patches, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterPatchPatchesExtended {\n");
    
    sb.append("    patches: ").append(toIndentedString(patches)).append("\n");
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
