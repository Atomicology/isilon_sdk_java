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
 * Node smartfail state.
 */
@ApiModel(description = "Node smartfail state.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeStateSmartfailExtended {
  @SerializedName("dead")
  private Boolean dead = null;

  @SerializedName("down")
  private Boolean down = null;

  @SerializedName("in_cluster")
  private Boolean inCluster = null;

  @SerializedName("readonly")
  private Boolean readonly = null;

  @SerializedName("shutdown_readonly")
  private Boolean shutdownReadonly = null;

  @SerializedName("smartfailed")
  private Boolean smartfailed = null;

  public NodeStateSmartfailExtended dead(Boolean dead) {
    this.dead = dead;
    return this;
  }

   /**
   * This node is dead (dead_devs).
   * @return dead
  **/
  @ApiModelProperty(value = "This node is dead (dead_devs).")
  public Boolean isDead() {
    return dead;
  }

  public void setDead(Boolean dead) {
    this.dead = dead;
  }

  public NodeStateSmartfailExtended down(Boolean down) {
    this.down = down;
    return this;
  }

   /**
   * This node is down (down_devs).
   * @return down
  **/
  @ApiModelProperty(value = "This node is down (down_devs).")
  public Boolean isDown() {
    return down;
  }

  public void setDown(Boolean down) {
    this.down = down;
  }

  public NodeStateSmartfailExtended inCluster(Boolean inCluster) {
    this.inCluster = inCluster;
    return this;
  }

   /**
   * This node is in the cluster (all_devs).
   * @return inCluster
  **/
  @ApiModelProperty(value = "This node is in the cluster (all_devs).")
  public Boolean isInCluster() {
    return inCluster;
  }

  public void setInCluster(Boolean inCluster) {
    this.inCluster = inCluster;
  }

  public NodeStateSmartfailExtended readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

   /**
   * This node is readonly (ro_devs).
   * @return readonly
  **/
  @ApiModelProperty(value = "This node is readonly (ro_devs).")
  public Boolean isReadonly() {
    return readonly;
  }

  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }

  public NodeStateSmartfailExtended shutdownReadonly(Boolean shutdownReadonly) {
    this.shutdownReadonly = shutdownReadonly;
    return this;
  }

   /**
   * This node is shutdown readonly (down_devs).
   * @return shutdownReadonly
  **/
  @ApiModelProperty(value = "This node is shutdown readonly (down_devs).")
  public Boolean isShutdownReadonly() {
    return shutdownReadonly;
  }

  public void setShutdownReadonly(Boolean shutdownReadonly) {
    this.shutdownReadonly = shutdownReadonly;
  }

  public NodeStateSmartfailExtended smartfailed(Boolean smartfailed) {
    this.smartfailed = smartfailed;
    return this;
  }

   /**
   * This node is smartfailed (soft_devs).
   * @return smartfailed
  **/
  @ApiModelProperty(value = "This node is smartfailed (soft_devs).")
  public Boolean isSmartfailed() {
    return smartfailed;
  }

  public void setSmartfailed(Boolean smartfailed) {
    this.smartfailed = smartfailed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStateSmartfailExtended nodeStateSmartfailExtended = (NodeStateSmartfailExtended) o;
    return Objects.equals(this.dead, nodeStateSmartfailExtended.dead) &&
        Objects.equals(this.down, nodeStateSmartfailExtended.down) &&
        Objects.equals(this.inCluster, nodeStateSmartfailExtended.inCluster) &&
        Objects.equals(this.readonly, nodeStateSmartfailExtended.readonly) &&
        Objects.equals(this.shutdownReadonly, nodeStateSmartfailExtended.shutdownReadonly) &&
        Objects.equals(this.smartfailed, nodeStateSmartfailExtended.smartfailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dead, down, inCluster, readonly, shutdownReadonly, smartfailed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStateSmartfailExtended {\n");
    
    sb.append("    dead: ").append(toIndentedString(dead)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    inCluster: ").append(toIndentedString(inCluster)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    shutdownReadonly: ").append(toIndentedString(shutdownReadonly)).append("\n");
    sb.append("    smartfailed: ").append(toIndentedString(smartfailed)).append("\n");
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

