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
import io.swagger.client.model.ClusterPatchPatchesPatchFile;
import io.swagger.client.model.ClusterPatchPatchesPatchService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterPatchPatchesPatch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ClusterPatchPatchesPatch {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("conflicts")
  private List<String> conflicts = null;

  @SerializedName("dependencies")
  private List<String> dependencies = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("files")
  private List<ClusterPatchPatchesPatchFile> files = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nodes")
  private List<Integer> nodes = null;

  @SerializedName("reboot")
  private String reboot = null;

  @SerializedName("services")
  private List<ClusterPatchPatchesPatchService> services = null;

  @SerializedName("status")
  private String status = null;

  public ClusterPatchPatchesPatch comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * A long comment about the patch.
   * @return comment
  **/
  @ApiModelProperty(value = "A long comment about the patch.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ClusterPatchPatchesPatch conflicts(List<String> conflicts) {
    this.conflicts = conflicts;
    return this;
  }

  public ClusterPatchPatchesPatch addConflictsItem(String conflictsItem) {
    if (this.conflicts == null) {
      this.conflicts = new ArrayList<String>();
    }
    this.conflicts.add(conflictsItem);
    return this;
  }

   /**
   * Other patches that this patch conflicts with.
   * @return conflicts
  **/
  @ApiModelProperty(value = "Other patches that this patch conflicts with.")
  public List<String> getConflicts() {
    return conflicts;
  }

  public void setConflicts(List<String> conflicts) {
    this.conflicts = conflicts;
  }

  public ClusterPatchPatchesPatch dependencies(List<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public ClusterPatchPatchesPatch addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<String>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Other patches that this patch depends on.
   * @return dependencies
  **/
  @ApiModelProperty(value = "Other patches that this patch depends on.")
  public List<String> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }

  public ClusterPatchPatchesPatch description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the patch.
   * @return description
  **/
  @ApiModelProperty(value = "A short description of the patch.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClusterPatchPatchesPatch files(List<ClusterPatchPatchesPatchFile> files) {
    this.files = files;
    return this;
  }

  public ClusterPatchPatchesPatch addFilesItem(ClusterPatchPatchesPatchFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<ClusterPatchPatchesPatchFile>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * The files contained in this patch.
   * @return files
  **/
  @ApiModelProperty(value = "The files contained in this patch.")
  public List<ClusterPatchPatchesPatchFile> getFiles() {
    return files;
  }

  public void setFiles(List<ClusterPatchPatchesPatchFile> files) {
    this.files = files;
  }

  public ClusterPatchPatchesPatch id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the patch.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the patch.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClusterPatchPatchesPatch name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the patch.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the patch.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterPatchPatchesPatch nodes(List<Integer> nodes) {
    this.nodes = nodes;
    return this;
  }

  public ClusterPatchPatchesPatch addNodesItem(Integer nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<Integer>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * The nodes that this patch is installed on.
   * @return nodes
  **/
  @ApiModelProperty(value = "The nodes that this patch is installed on.")
  public List<Integer> getNodes() {
    return nodes;
  }

  public void setNodes(List<Integer> nodes) {
    this.nodes = nodes;
  }

  public ClusterPatchPatchesPatch reboot(String reboot) {
    this.reboot = reboot;
    return this;
  }

   /**
   * Describes the reboot requirements
   * @return reboot
  **/
  @ApiModelProperty(value = "Describes the reboot requirements")
  public String getReboot() {
    return reboot;
  }

  public void setReboot(String reboot) {
    this.reboot = reboot;
  }

  public ClusterPatchPatchesPatch services(List<ClusterPatchPatchesPatchService> services) {
    this.services = services;
    return this;
  }

  public ClusterPatchPatchesPatch addServicesItem(ClusterPatchPatchesPatchService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<ClusterPatchPatchesPatchService>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * The services affected during the patch deployment
   * @return services
  **/
  @ApiModelProperty(value = "The services affected during the patch deployment")
  public List<ClusterPatchPatchesPatchService> getServices() {
    return services;
  }

  public void setServices(List<ClusterPatchPatchesPatchService> services) {
    this.services = services;
  }

  public ClusterPatchPatchesPatch status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The intallation status of this patch on the cluster.
   * @return status
  **/
  @ApiModelProperty(value = "The intallation status of this patch on the cluster.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterPatchPatchesPatch clusterPatchPatchesPatch = (ClusterPatchPatchesPatch) o;
    return Objects.equals(this.comment, clusterPatchPatchesPatch.comment) &&
        Objects.equals(this.conflicts, clusterPatchPatchesPatch.conflicts) &&
        Objects.equals(this.dependencies, clusterPatchPatchesPatch.dependencies) &&
        Objects.equals(this.description, clusterPatchPatchesPatch.description) &&
        Objects.equals(this.files, clusterPatchPatchesPatch.files) &&
        Objects.equals(this.id, clusterPatchPatchesPatch.id) &&
        Objects.equals(this.name, clusterPatchPatchesPatch.name) &&
        Objects.equals(this.nodes, clusterPatchPatchesPatch.nodes) &&
        Objects.equals(this.reboot, clusterPatchPatchesPatch.reboot) &&
        Objects.equals(this.services, clusterPatchPatchesPatch.services) &&
        Objects.equals(this.status, clusterPatchPatchesPatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, conflicts, dependencies, description, files, id, name, nodes, reboot, services, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterPatchPatchesPatch {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    conflicts: ").append(toIndentedString(conflicts)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
