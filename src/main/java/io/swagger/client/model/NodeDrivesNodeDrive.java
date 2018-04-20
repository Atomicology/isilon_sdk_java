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
import io.swagger.client.model.NodeDrivesNodeDriveFirmware;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeDrivesNodeDrive
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeDrivesNodeDrive {
  @SerializedName("bay_group")
  private String bayGroup = null;

  @SerializedName("baynum")
  private Integer baynum = null;

  @SerializedName("blocks")
  private Integer blocks = null;

  @SerializedName("chassis")
  private Integer chassis = null;

  @SerializedName("devname")
  private String devname = null;

  @SerializedName("firmware")
  private NodeDrivesNodeDriveFirmware firmware = null;

  @SerializedName("handle")
  private Integer handle = null;

  @SerializedName("interface_type")
  private String interfaceType = null;

  @SerializedName("lnum")
  private Integer lnum = null;

  @SerializedName("locnstr")
  private String locnstr = null;

  @SerializedName("logical_block_length")
  private Integer logicalBlockLength = null;

  @SerializedName("media_type")
  private String mediaType = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("pending_actions")
  private List<String> pendingActions = null;

  @SerializedName("physical_block_length")
  private Integer physicalBlockLength = null;

  @SerializedName("present")
  private Boolean present = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("purpose_description")
  private String purposeDescription = null;

  @SerializedName("serial")
  private String serial = null;

  @SerializedName("ui_state")
  private String uiState = null;

  @SerializedName("wwn")
  private String wwn = null;

  @SerializedName("x_loc")
  private Integer xLoc = null;

  @SerializedName("y_loc")
  private Integer yLoc = null;

  public NodeDrivesNodeDrive bayGroup(String bayGroup) {
    this.bayGroup = bayGroup;
    return this;
  }

   /**
   * The name of the bay group this drive belongs to.
   * @return bayGroup
  **/
  @ApiModelProperty(value = "The name of the bay group this drive belongs to.")
  public String getBayGroup() {
    return bayGroup;
  }

  public void setBayGroup(String bayGroup) {
    this.bayGroup = bayGroup;
  }

  public NodeDrivesNodeDrive baynum(Integer baynum) {
    this.baynum = baynum;
    return this;
  }

   /**
   * Numerical representation of this drive&#39;s bay.
   * @return baynum
  **/
  @ApiModelProperty(value = "Numerical representation of this drive's bay.")
  public Integer getBaynum() {
    return baynum;
  }

  public void setBaynum(Integer baynum) {
    this.baynum = baynum;
  }

  public NodeDrivesNodeDrive blocks(Integer blocks) {
    this.blocks = blocks;
    return this;
  }

   /**
   * Number of blocks on this drive.
   * @return blocks
  **/
  @ApiModelProperty(value = "Number of blocks on this drive.")
  public Integer getBlocks() {
    return blocks;
  }

  public void setBlocks(Integer blocks) {
    this.blocks = blocks;
  }

  public NodeDrivesNodeDrive chassis(Integer chassis) {
    this.chassis = chassis;
    return this;
  }

   /**
   * The chassis number which contains this drive.
   * @return chassis
  **/
  @ApiModelProperty(value = "The chassis number which contains this drive.")
  public Integer getChassis() {
    return chassis;
  }

  public void setChassis(Integer chassis) {
    this.chassis = chassis;
  }

  public NodeDrivesNodeDrive devname(String devname) {
    this.devname = devname;
    return this;
  }

   /**
   * This drive&#39;s device name.
   * @return devname
  **/
  @ApiModelProperty(value = "This drive's device name.")
  public String getDevname() {
    return devname;
  }

  public void setDevname(String devname) {
    this.devname = devname;
  }

  public NodeDrivesNodeDrive firmware(NodeDrivesNodeDriveFirmware firmware) {
    this.firmware = firmware;
    return this;
  }

   /**
   * Drive firmware information.
   * @return firmware
  **/
  @ApiModelProperty(value = "Drive firmware information.")
  public NodeDrivesNodeDriveFirmware getFirmware() {
    return firmware;
  }

  public void setFirmware(NodeDrivesNodeDriveFirmware firmware) {
    this.firmware = firmware;
  }

  public NodeDrivesNodeDrive handle(Integer handle) {
    this.handle = handle;
    return this;
  }

   /**
   * Drive_d&#39;s handle representation for this drive
   * @return handle
  **/
  @ApiModelProperty(value = "Drive_d's handle representation for this drive")
  public Integer getHandle() {
    return handle;
  }

  public void setHandle(Integer handle) {
    this.handle = handle;
  }

  public NodeDrivesNodeDrive interfaceType(String interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }

   /**
   * String representtation of this drive&#39;s interface type.
   * @return interfaceType
  **/
  @ApiModelProperty(value = "String representtation of this drive's interface type.")
  public String getInterfaceType() {
    return interfaceType;
  }

  public void setInterfaceType(String interfaceType) {
    this.interfaceType = interfaceType;
  }

  public NodeDrivesNodeDrive lnum(Integer lnum) {
    this.lnum = lnum;
    return this;
  }

   /**
   * This drive&#39;s logical drive number in IFS.
   * @return lnum
  **/
  @ApiModelProperty(value = "This drive's logical drive number in IFS.")
  public Integer getLnum() {
    return lnum;
  }

  public void setLnum(Integer lnum) {
    this.lnum = lnum;
  }

  public NodeDrivesNodeDrive locnstr(String locnstr) {
    this.locnstr = locnstr;
    return this;
  }

   /**
   * String representation of this drive&#39;s physical location.
   * @return locnstr
  **/
  @ApiModelProperty(value = "String representation of this drive's physical location.")
  public String getLocnstr() {
    return locnstr;
  }

  public void setLocnstr(String locnstr) {
    this.locnstr = locnstr;
  }

  public NodeDrivesNodeDrive logicalBlockLength(Integer logicalBlockLength) {
    this.logicalBlockLength = logicalBlockLength;
    return this;
  }

   /**
   * Size of a logical block on this drive.
   * @return logicalBlockLength
  **/
  @ApiModelProperty(value = "Size of a logical block on this drive.")
  public Integer getLogicalBlockLength() {
    return logicalBlockLength;
  }

  public void setLogicalBlockLength(Integer logicalBlockLength) {
    this.logicalBlockLength = logicalBlockLength;
  }

  public NodeDrivesNodeDrive mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * String representation of this drive&#39;s media type.
   * @return mediaType
  **/
  @ApiModelProperty(value = "String representation of this drive's media type.")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public NodeDrivesNodeDrive model(String model) {
    this.model = model;
    return this;
  }

   /**
   * This drive&#39;s manufacturer and model.
   * @return model
  **/
  @ApiModelProperty(value = "This drive's manufacturer and model.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public NodeDrivesNodeDrive pendingActions(List<String> pendingActions) {
    this.pendingActions = pendingActions;
    return this;
  }

  public NodeDrivesNodeDrive addPendingActionsItem(String pendingActionsItem) {
    if (this.pendingActions == null) {
      this.pendingActions = new ArrayList<String>();
    }
    this.pendingActions.add(pendingActionsItem);
    return this;
  }

   /**
   * This drive&#39;s current outstanding actions. For example, \&quot;add\&quot; or \&quot;firmware_update\&quot;.
   * @return pendingActions
  **/
  @ApiModelProperty(value = "This drive's current outstanding actions. For example, \"add\" or \"firmware_update\".")
  public List<String> getPendingActions() {
    return pendingActions;
  }

  public void setPendingActions(List<String> pendingActions) {
    this.pendingActions = pendingActions;
  }

  public NodeDrivesNodeDrive physicalBlockLength(Integer physicalBlockLength) {
    this.physicalBlockLength = physicalBlockLength;
    return this;
  }

   /**
   * Size of a physical block on this drive.
   * @return physicalBlockLength
  **/
  @ApiModelProperty(value = "Size of a physical block on this drive.")
  public Integer getPhysicalBlockLength() {
    return physicalBlockLength;
  }

  public void setPhysicalBlockLength(Integer physicalBlockLength) {
    this.physicalBlockLength = physicalBlockLength;
  }

  public NodeDrivesNodeDrive present(Boolean present) {
    this.present = present;
    return this;
  }

   /**
   * Indicates whether this drive is physically present in the node.
   * @return present
  **/
  @ApiModelProperty(value = "Indicates whether this drive is physically present in the node.")
  public Boolean isPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }

  public NodeDrivesNodeDrive purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * This drive&#39;s purpose in the DRV state machine.
   * @return purpose
  **/
  @ApiModelProperty(value = "This drive's purpose in the DRV state machine.")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public NodeDrivesNodeDrive purposeDescription(String purposeDescription) {
    this.purposeDescription = purposeDescription;
    return this;
  }

   /**
   * Description of this drive&#39;s purpose.
   * @return purposeDescription
  **/
  @ApiModelProperty(value = "Description of this drive's purpose.")
  public String getPurposeDescription() {
    return purposeDescription;
  }

  public void setPurposeDescription(String purposeDescription) {
    this.purposeDescription = purposeDescription;
  }

  public NodeDrivesNodeDrive serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Serial number for this drive.
   * @return serial
  **/
  @ApiModelProperty(value = "Serial number for this drive.")
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public NodeDrivesNodeDrive uiState(String uiState) {
    this.uiState = uiState;
    return this;
  }

   /**
   * This drive&#39;s state as presented to the UI.
   * @return uiState
  **/
  @ApiModelProperty(value = "This drive's state as presented to the UI.")
  public String getUiState() {
    return uiState;
  }

  public void setUiState(String uiState) {
    this.uiState = uiState;
  }

  public NodeDrivesNodeDrive wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }

   /**
   * The drive&#39;s &#39;worldwide name&#39; from its NAA identifiers.
   * @return wwn
  **/
  @ApiModelProperty(value = "The drive's 'worldwide name' from its NAA identifiers.")
  public String getWwn() {
    return wwn;
  }

  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  public NodeDrivesNodeDrive xLoc(Integer xLoc) {
    this.xLoc = xLoc;
    return this;
  }

   /**
   * This drive&#39;s x-axis grid location.
   * @return xLoc
  **/
  @ApiModelProperty(value = "This drive's x-axis grid location.")
  public Integer getXLoc() {
    return xLoc;
  }

  public void setXLoc(Integer xLoc) {
    this.xLoc = xLoc;
  }

  public NodeDrivesNodeDrive yLoc(Integer yLoc) {
    this.yLoc = yLoc;
    return this;
  }

   /**
   * This drive&#39;s y-axis grid location.
   * @return yLoc
  **/
  @ApiModelProperty(value = "This drive's y-axis grid location.")
  public Integer getYLoc() {
    return yLoc;
  }

  public void setYLoc(Integer yLoc) {
    this.yLoc = yLoc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDrivesNodeDrive nodeDrivesNodeDrive = (NodeDrivesNodeDrive) o;
    return Objects.equals(this.bayGroup, nodeDrivesNodeDrive.bayGroup) &&
        Objects.equals(this.baynum, nodeDrivesNodeDrive.baynum) &&
        Objects.equals(this.blocks, nodeDrivesNodeDrive.blocks) &&
        Objects.equals(this.chassis, nodeDrivesNodeDrive.chassis) &&
        Objects.equals(this.devname, nodeDrivesNodeDrive.devname) &&
        Objects.equals(this.firmware, nodeDrivesNodeDrive.firmware) &&
        Objects.equals(this.handle, nodeDrivesNodeDrive.handle) &&
        Objects.equals(this.interfaceType, nodeDrivesNodeDrive.interfaceType) &&
        Objects.equals(this.lnum, nodeDrivesNodeDrive.lnum) &&
        Objects.equals(this.locnstr, nodeDrivesNodeDrive.locnstr) &&
        Objects.equals(this.logicalBlockLength, nodeDrivesNodeDrive.logicalBlockLength) &&
        Objects.equals(this.mediaType, nodeDrivesNodeDrive.mediaType) &&
        Objects.equals(this.model, nodeDrivesNodeDrive.model) &&
        Objects.equals(this.pendingActions, nodeDrivesNodeDrive.pendingActions) &&
        Objects.equals(this.physicalBlockLength, nodeDrivesNodeDrive.physicalBlockLength) &&
        Objects.equals(this.present, nodeDrivesNodeDrive.present) &&
        Objects.equals(this.purpose, nodeDrivesNodeDrive.purpose) &&
        Objects.equals(this.purposeDescription, nodeDrivesNodeDrive.purposeDescription) &&
        Objects.equals(this.serial, nodeDrivesNodeDrive.serial) &&
        Objects.equals(this.uiState, nodeDrivesNodeDrive.uiState) &&
        Objects.equals(this.wwn, nodeDrivesNodeDrive.wwn) &&
        Objects.equals(this.xLoc, nodeDrivesNodeDrive.xLoc) &&
        Objects.equals(this.yLoc, nodeDrivesNodeDrive.yLoc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bayGroup, baynum, blocks, chassis, devname, firmware, handle, interfaceType, lnum, locnstr, logicalBlockLength, mediaType, model, pendingActions, physicalBlockLength, present, purpose, purposeDescription, serial, uiState, wwn, xLoc, yLoc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDrivesNodeDrive {\n");
    
    sb.append("    bayGroup: ").append(toIndentedString(bayGroup)).append("\n");
    sb.append("    baynum: ").append(toIndentedString(baynum)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    devname: ").append(toIndentedString(devname)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    lnum: ").append(toIndentedString(lnum)).append("\n");
    sb.append("    locnstr: ").append(toIndentedString(locnstr)).append("\n");
    sb.append("    logicalBlockLength: ").append(toIndentedString(logicalBlockLength)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    pendingActions: ").append(toIndentedString(pendingActions)).append("\n");
    sb.append("    physicalBlockLength: ").append(toIndentedString(physicalBlockLength)).append("\n");
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    purposeDescription: ").append(toIndentedString(purposeDescription)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    uiState: ").append(toIndentedString(uiState)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    xLoc: ").append(toIndentedString(xLoc)).append("\n");
    sb.append("    yLoc: ").append(toIndentedString(yLoc)).append("\n");
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

