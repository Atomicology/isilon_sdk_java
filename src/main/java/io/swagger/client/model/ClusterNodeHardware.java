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
 * ClusterNodeHardware
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ClusterNodeHardware {
  @SerializedName("chassis")
  private String chassis = null;

  @SerializedName("chassis_code")
  private String chassisCode = null;

  @SerializedName("chassis_count")
  private String chassisCount = null;

  @SerializedName("chassis_depth")
  private String chassisDepth = null;

  @SerializedName("class")
  private String propertyClass = null;

  @SerializedName("code_name")
  private String codeName = null;

  @SerializedName("compute_type")
  private String computeType = null;

  @SerializedName("configuration_id")
  private String configurationId = null;

  @SerializedName("cpu")
  private String cpu = null;

  @SerializedName("disk_controller")
  private String diskController = null;

  @SerializedName("disk_expander")
  private String diskExpander = null;

  @SerializedName("family_code")
  private String familyCode = null;

  @SerializedName("flash_drive")
  private String flashDrive = null;

  @SerializedName("generation_code")
  private String generationCode = null;

  @SerializedName("hwgen")
  private String hwgen = null;

  @SerializedName("imb_version")
  private String imbVersion = null;

  @SerializedName("infiniband")
  private String infiniband = null;

  @SerializedName("lcd_version")
  private String lcdVersion = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("model_code")
  private String modelCode = null;

  @SerializedName("motherboard")
  private String motherboard = null;

  @SerializedName("net_interfaces")
  private String netInterfaces = null;

  @SerializedName("node_slot_id")
  private Integer nodeSlotId = null;

  @SerializedName("nvram")
  private String nvram = null;

  @SerializedName("peer_serial_number")
  private String peerSerialNumber = null;

  @SerializedName("performance_code")
  private String performanceCode = null;

  @SerializedName("powersupplies")
  private List<String> powersupplies = null;

  @SerializedName("processor")
  private String processor = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("ram")
  private Integer ram = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

  @SerializedName("series")
  private String series = null;

  @SerializedName("sled_drive_count")
  private Integer sledDriveCount = null;

  @SerializedName("storage_class")
  private String storageClass = null;

  @SerializedName("tier")
  private Integer tier = null;

  @SerializedName("top_level_assembly_serial_number")
  private String topLevelAssemblySerialNumber = null;

  public ClusterNodeHardware chassis(String chassis) {
    this.chassis = chassis;
    return this;
  }

   /**
   * Name of this node&#39;s chassis.
   * @return chassis
  **/
  @ApiModelProperty(value = "Name of this node's chassis.")
  public String getChassis() {
    return chassis;
  }

  public void setChassis(String chassis) {
    this.chassis = chassis;
  }

  public ClusterNodeHardware chassisCode(String chassisCode) {
    this.chassisCode = chassisCode;
    return this;
  }

   /**
   * Chassis code of this node (1U, 2U, etc.).
   * @return chassisCode
  **/
  @ApiModelProperty(value = "Chassis code of this node (1U, 2U, etc.).")
  public String getChassisCode() {
    return chassisCode;
  }

  public void setChassisCode(String chassisCode) {
    this.chassisCode = chassisCode;
  }

  public ClusterNodeHardware chassisCount(String chassisCount) {
    this.chassisCount = chassisCount;
    return this;
  }

   /**
   * Number of chassis making up this node.
   * @return chassisCount
  **/
  @ApiModelProperty(value = "Number of chassis making up this node.")
  public String getChassisCount() {
    return chassisCount;
  }

  public void setChassisCount(String chassisCount) {
    this.chassisCount = chassisCount;
  }

  public ClusterNodeHardware chassisDepth(String chassisDepth) {
    this.chassisDepth = chassisDepth;
    return this;
  }

   /**
   * Chassis depth for this node if applicable (Normal, Deep, Unknown). If not supported: Unknown. If Logic to determine chassis depth fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist.
   * @return chassisDepth
  **/
  @ApiModelProperty(value = "Chassis depth for this node if applicable (Normal, Deep, Unknown). If not supported: Unknown. If Logic to determine chassis depth fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist.")
  public String getChassisDepth() {
    return chassisDepth;
  }

  public void setChassisDepth(String chassisDepth) {
    this.chassisDepth = chassisDepth;
  }

  public ClusterNodeHardware propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Class of this node (storage, accelerator, etc.).
   * @return propertyClass
  **/
  @ApiModelProperty(value = "Class of this node (storage, accelerator, etc.).")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public ClusterNodeHardware codeName(String codeName) {
    this.codeName = codeName;
    return this;
  }

   /**
   * Code name of this node if applicable (Minnetonka, MiniHuron, Huron, Union, Tahoe, Superior, Unknown). If not supported: Unknown. If Logic to determine code name fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist.
   * @return codeName
  **/
  @ApiModelProperty(value = "Code name of this node if applicable (Minnetonka, MiniHuron, Huron, Union, Tahoe, Superior, Unknown). If not supported: Unknown. If Logic to determine code name fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist.")
  public String getCodeName() {
    return codeName;
  }

  public void setCodeName(String codeName) {
    this.codeName = codeName;
  }

  public ClusterNodeHardware computeType(String computeType) {
    this.computeType = computeType;
    return this;
  }

   /**
   * Type of compute node if applicable (Low, Medium, High, Turbo, Ultra, Unknown). If not supported: Unknown. If Logic to determine compute type fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist.
   * @return computeType
  **/
  @ApiModelProperty(value = "Type of compute node if applicable (Low, Medium, High, Turbo, Ultra, Unknown). If not supported: Unknown. If Logic to determine compute type fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist.")
  public String getComputeType() {
    return computeType;
  }

  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }

  public ClusterNodeHardware configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Node configuration ID.
   * @return configurationId
  **/
  @ApiModelProperty(value = "Node configuration ID.")
  public String getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }

  public ClusterNodeHardware cpu(String cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Manufacturer and model of this node&#39;s CPU.
   * @return cpu
  **/
  @ApiModelProperty(value = "Manufacturer and model of this node's CPU.")
  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public ClusterNodeHardware diskController(String diskController) {
    this.diskController = diskController;
    return this;
  }

   /**
   * Manufacturer and model of this node&#39;s disk controller.
   * @return diskController
  **/
  @ApiModelProperty(value = "Manufacturer and model of this node's disk controller.")
  public String getDiskController() {
    return diskController;
  }

  public void setDiskController(String diskController) {
    this.diskController = diskController;
  }

  public ClusterNodeHardware diskExpander(String diskExpander) {
    this.diskExpander = diskExpander;
    return this;
  }

   /**
   * Manufacturer and model of this node&#39;s disk expander.
   * @return diskExpander
  **/
  @ApiModelProperty(value = "Manufacturer and model of this node's disk expander.")
  public String getDiskExpander() {
    return diskExpander;
  }

  public void setDiskExpander(String diskExpander) {
    this.diskExpander = diskExpander;
  }

  public ClusterNodeHardware familyCode(String familyCode) {
    this.familyCode = familyCode;
    return this;
  }

   /**
   * Family code of this node (X, S, NL, etc.).
   * @return familyCode
  **/
  @ApiModelProperty(value = "Family code of this node (X, S, NL, etc.).")
  public String getFamilyCode() {
    return familyCode;
  }

  public void setFamilyCode(String familyCode) {
    this.familyCode = familyCode;
  }

  public ClusterNodeHardware flashDrive(String flashDrive) {
    this.flashDrive = flashDrive;
    return this;
  }

   /**
   * Manufacturer, model, and device id of this node&#39;s flash drive.
   * @return flashDrive
  **/
  @ApiModelProperty(value = "Manufacturer, model, and device id of this node's flash drive.")
  public String getFlashDrive() {
    return flashDrive;
  }

  public void setFlashDrive(String flashDrive) {
    this.flashDrive = flashDrive;
  }

  public ClusterNodeHardware generationCode(String generationCode) {
    this.generationCode = generationCode;
    return this;
  }

   /**
   * Generation code of this node.
   * @return generationCode
  **/
  @ApiModelProperty(value = "Generation code of this node.")
  public String getGenerationCode() {
    return generationCode;
  }

  public void setGenerationCode(String generationCode) {
    this.generationCode = generationCode;
  }

  public ClusterNodeHardware hwgen(String hwgen) {
    this.hwgen = hwgen;
    return this;
  }

   /**
   * Isilon hardware generation name.
   * @return hwgen
  **/
  @ApiModelProperty(value = "Isilon hardware generation name.")
  public String getHwgen() {
    return hwgen;
  }

  public void setHwgen(String hwgen) {
    this.hwgen = hwgen;
  }

  public ClusterNodeHardware imbVersion(String imbVersion) {
    this.imbVersion = imbVersion;
    return this;
  }

   /**
   * Version of this node&#39;s Isilon Management Board.
   * @return imbVersion
  **/
  @ApiModelProperty(value = "Version of this node's Isilon Management Board.")
  public String getImbVersion() {
    return imbVersion;
  }

  public void setImbVersion(String imbVersion) {
    this.imbVersion = imbVersion;
  }

  public ClusterNodeHardware infiniband(String infiniband) {
    this.infiniband = infiniband;
    return this;
  }

   /**
   * Infiniband card type.
   * @return infiniband
  **/
  @ApiModelProperty(value = "Infiniband card type.")
  public String getInfiniband() {
    return infiniband;
  }

  public void setInfiniband(String infiniband) {
    this.infiniband = infiniband;
  }

  public ClusterNodeHardware lcdVersion(String lcdVersion) {
    this.lcdVersion = lcdVersion;
    return this;
  }

   /**
   * Version of the LCD panel.
   * @return lcdVersion
  **/
  @ApiModelProperty(value = "Version of the LCD panel.")
  public String getLcdVersion() {
    return lcdVersion;
  }

  public void setLcdVersion(String lcdVersion) {
    this.lcdVersion = lcdVersion;
  }

  public ClusterNodeHardware model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Isilon node model identifier string (S200, X410, Infinity-H500, etc.).
   * @return model
  **/
  @ApiModelProperty(value = "Isilon node model identifier string (S200, X410, Infinity-H500, etc.).")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ClusterNodeHardware modelCode(String modelCode) {
    this.modelCode = modelCode;
    return this;
  }

   /**
   * Isilon node model code string (S200, X410, H500, etc.).
   * @return modelCode
  **/
  @ApiModelProperty(value = "Isilon node model code string (S200, X410, H500, etc.).")
  public String getModelCode() {
    return modelCode;
  }

  public void setModelCode(String modelCode) {
    this.modelCode = modelCode;
  }

  public ClusterNodeHardware motherboard(String motherboard) {
    this.motherboard = motherboard;
    return this;
  }

   /**
   * Manufacturer and model of this node&#39;s motherboard.
   * @return motherboard
  **/
  @ApiModelProperty(value = "Manufacturer and model of this node's motherboard.")
  public String getMotherboard() {
    return motherboard;
  }

  public void setMotherboard(String motherboard) {
    this.motherboard = motherboard;
  }

  public ClusterNodeHardware netInterfaces(String netInterfaces) {
    this.netInterfaces = netInterfaces;
    return this;
  }

   /**
   * Description of all this node&#39;s network interfaces.
   * @return netInterfaces
  **/
  @ApiModelProperty(value = "Description of all this node's network interfaces.")
  public String getNetInterfaces() {
    return netInterfaces;
  }

  public void setNetInterfaces(String netInterfaces) {
    this.netInterfaces = netInterfaces;
  }

  public ClusterNodeHardware nodeSlotId(Integer nodeSlotId) {
    this.nodeSlotId = nodeSlotId;
    return this;
  }

   /**
   * Position of node within chassis (e.g., 1-4 for Infinity chassis). -1 for error or not supported.
   * @return nodeSlotId
  **/
  @ApiModelProperty(value = "Position of node within chassis (e.g., 1-4 for Infinity chassis). -1 for error or not supported.")
  public Integer getNodeSlotId() {
    return nodeSlotId;
  }

  public void setNodeSlotId(Integer nodeSlotId) {
    this.nodeSlotId = nodeSlotId;
  }

  public ClusterNodeHardware nvram(String nvram) {
    this.nvram = nvram;
    return this;
  }

   /**
   * Manufacturer and model of this node&#39;s NVRAM board.
   * @return nvram
  **/
  @ApiModelProperty(value = "Manufacturer and model of this node's NVRAM board.")
  public String getNvram() {
    return nvram;
  }

  public void setNvram(String nvram) {
    this.nvram = nvram;
  }

  public ClusterNodeHardware peerSerialNumber(String peerSerialNumber) {
    this.peerSerialNumber = peerSerialNumber;
    return this;
  }

   /**
   * Serial number of this node&#39;s peer/buddy node.(Infinity Only)
   * @return peerSerialNumber
  **/
  @ApiModelProperty(value = "Serial number of this node's peer/buddy node.(Infinity Only)")
  public String getPeerSerialNumber() {
    return peerSerialNumber;
  }

  public void setPeerSerialNumber(String peerSerialNumber) {
    this.peerSerialNumber = peerSerialNumber;
  }

  public ClusterNodeHardware performanceCode(String performanceCode) {
    this.performanceCode = performanceCode;
    return this;
  }

   /**
   * Performance code of this node, if applicable (2, 4, 5, etc.).
   * @return performanceCode
  **/
  @ApiModelProperty(value = "Performance code of this node, if applicable (2, 4, 5, etc.).")
  public String getPerformanceCode() {
    return performanceCode;
  }

  public void setPerformanceCode(String performanceCode) {
    this.performanceCode = performanceCode;
  }

  public ClusterNodeHardware powersupplies(List<String> powersupplies) {
    this.powersupplies = powersupplies;
    return this;
  }

  public ClusterNodeHardware addPowersuppliesItem(String powersuppliesItem) {
    if (this.powersupplies == null) {
      this.powersupplies = new ArrayList<String>();
    }
    this.powersupplies.add(powersuppliesItem);
    return this;
  }

   /**
   * Description strings for each power supply on this node.
   * @return powersupplies
  **/
  @ApiModelProperty(value = "Description strings for each power supply on this node.")
  public List<String> getPowersupplies() {
    return powersupplies;
  }

  public void setPowersupplies(List<String> powersupplies) {
    this.powersupplies = powersupplies;
  }

  public ClusterNodeHardware processor(String processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Number of processors and cores on this node.
   * @return processor
  **/
  @ApiModelProperty(value = "Number of processors and cores on this node.")
  public String getProcessor() {
    return processor;
  }

  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public ClusterNodeHardware product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Isilon product name.
   * @return product
  **/
  @ApiModelProperty(value = "Isilon product name.")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public ClusterNodeHardware ram(Integer ram) {
    this.ram = ram;
    return this;
  }

   /**
   * Size of RAM in bytes.
   * maximum: 9223372036854775807
   * @return ram
  **/
  @ApiModelProperty(value = "Size of RAM in bytes.")
  public Integer getRam() {
    return ram;
  }

  public void setRam(Integer ram) {
    this.ram = ram;
  }

  public ClusterNodeHardware serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial number of this node.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Serial number of this node.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public ClusterNodeHardware series(String series) {
    this.series = series;
    return this;
  }

   /**
   * Series of this node (X, I, NL, etc.).
   * @return series
  **/
  @ApiModelProperty(value = "Series of this node (X, I, NL, etc.).")
  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public ClusterNodeHardware sledDriveCount(Integer sledDriveCount) {
    this.sledDriveCount = sledDriveCount;
    return this;
  }

   /**
   * Size of drive sleds in node, if applicable. Expected values: 3, 4, 6. 0 if unable to determine sled size. -1 for error or not supported. If PSI_Get fails: -1. PSI_Get can fail if PSI not initialized, or key does not exist.
   * @return sledDriveCount
  **/
  @ApiModelProperty(value = "Size of drive sleds in node, if applicable. Expected values: 3, 4, 6. 0 if unable to determine sled size. -1 for error or not supported. If PSI_Get fails: -1. PSI_Get can fail if PSI not initialized, or key does not exist.")
  public Integer getSledDriveCount() {
    return sledDriveCount;
  }

  public void setSledDriveCount(Integer sledDriveCount) {
    this.sledDriveCount = sledDriveCount;
  }

  public ClusterNodeHardware storageClass(String storageClass) {
    this.storageClass = storageClass;
    return this;
  }

   /**
   * Storage class of this node (storage or diskless).
   * @return storageClass
  **/
  @ApiModelProperty(value = "Storage class of this node (storage or diskless).")
  public String getStorageClass() {
    return storageClass;
  }

  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }

  public ClusterNodeHardware tier(Integer tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Platform tier level of this node if applicable (1-4 are defined, 0 for unknown or not supported, -1 for error). If not supported: 0. If Logic to determine tier fails: 0 for unknown. If PSI_Get fails: -1 for error. PSI_Get can fail if PSI not initialized, or key does not exist.
   * @return tier
  **/
  @ApiModelProperty(value = "Platform tier level of this node if applicable (1-4 are defined, 0 for unknown or not supported, -1 for error). If not supported: 0. If Logic to determine tier fails: 0 for unknown. If PSI_Get fails: -1 for error. PSI_Get can fail if PSI not initialized, or key does not exist.")
  public Integer getTier() {
    return tier;
  }

  public void setTier(Integer tier) {
    this.tier = tier;
  }

  public ClusterNodeHardware topLevelAssemblySerialNumber(String topLevelAssemblySerialNumber) {
    this.topLevelAssemblySerialNumber = topLevelAssemblySerialNumber;
    return this;
  }

   /**
   * Serial number of the top level assembly of this node.(Infinity Only)
   * @return topLevelAssemblySerialNumber
  **/
  @ApiModelProperty(required = true, value = "Serial number of the top level assembly of this node.(Infinity Only)")
  public String getTopLevelAssemblySerialNumber() {
    return topLevelAssemblySerialNumber;
  }

  public void setTopLevelAssemblySerialNumber(String topLevelAssemblySerialNumber) {
    this.topLevelAssemblySerialNumber = topLevelAssemblySerialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNodeHardware clusterNodeHardware = (ClusterNodeHardware) o;
    return Objects.equals(this.chassis, clusterNodeHardware.chassis) &&
        Objects.equals(this.chassisCode, clusterNodeHardware.chassisCode) &&
        Objects.equals(this.chassisCount, clusterNodeHardware.chassisCount) &&
        Objects.equals(this.chassisDepth, clusterNodeHardware.chassisDepth) &&
        Objects.equals(this.propertyClass, clusterNodeHardware.propertyClass) &&
        Objects.equals(this.codeName, clusterNodeHardware.codeName) &&
        Objects.equals(this.computeType, clusterNodeHardware.computeType) &&
        Objects.equals(this.configurationId, clusterNodeHardware.configurationId) &&
        Objects.equals(this.cpu, clusterNodeHardware.cpu) &&
        Objects.equals(this.diskController, clusterNodeHardware.diskController) &&
        Objects.equals(this.diskExpander, clusterNodeHardware.diskExpander) &&
        Objects.equals(this.familyCode, clusterNodeHardware.familyCode) &&
        Objects.equals(this.flashDrive, clusterNodeHardware.flashDrive) &&
        Objects.equals(this.generationCode, clusterNodeHardware.generationCode) &&
        Objects.equals(this.hwgen, clusterNodeHardware.hwgen) &&
        Objects.equals(this.imbVersion, clusterNodeHardware.imbVersion) &&
        Objects.equals(this.infiniband, clusterNodeHardware.infiniband) &&
        Objects.equals(this.lcdVersion, clusterNodeHardware.lcdVersion) &&
        Objects.equals(this.model, clusterNodeHardware.model) &&
        Objects.equals(this.modelCode, clusterNodeHardware.modelCode) &&
        Objects.equals(this.motherboard, clusterNodeHardware.motherboard) &&
        Objects.equals(this.netInterfaces, clusterNodeHardware.netInterfaces) &&
        Objects.equals(this.nodeSlotId, clusterNodeHardware.nodeSlotId) &&
        Objects.equals(this.nvram, clusterNodeHardware.nvram) &&
        Objects.equals(this.peerSerialNumber, clusterNodeHardware.peerSerialNumber) &&
        Objects.equals(this.performanceCode, clusterNodeHardware.performanceCode) &&
        Objects.equals(this.powersupplies, clusterNodeHardware.powersupplies) &&
        Objects.equals(this.processor, clusterNodeHardware.processor) &&
        Objects.equals(this.product, clusterNodeHardware.product) &&
        Objects.equals(this.ram, clusterNodeHardware.ram) &&
        Objects.equals(this.serialNumber, clusterNodeHardware.serialNumber) &&
        Objects.equals(this.series, clusterNodeHardware.series) &&
        Objects.equals(this.sledDriveCount, clusterNodeHardware.sledDriveCount) &&
        Objects.equals(this.storageClass, clusterNodeHardware.storageClass) &&
        Objects.equals(this.tier, clusterNodeHardware.tier) &&
        Objects.equals(this.topLevelAssemblySerialNumber, clusterNodeHardware.topLevelAssemblySerialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chassis, chassisCode, chassisCount, chassisDepth, propertyClass, codeName, computeType, configurationId, cpu, diskController, diskExpander, familyCode, flashDrive, generationCode, hwgen, imbVersion, infiniband, lcdVersion, model, modelCode, motherboard, netInterfaces, nodeSlotId, nvram, peerSerialNumber, performanceCode, powersupplies, processor, product, ram, serialNumber, series, sledDriveCount, storageClass, tier, topLevelAssemblySerialNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNodeHardware {\n");
    
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    chassisCode: ").append(toIndentedString(chassisCode)).append("\n");
    sb.append("    chassisCount: ").append(toIndentedString(chassisCount)).append("\n");
    sb.append("    chassisDepth: ").append(toIndentedString(chassisDepth)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    codeName: ").append(toIndentedString(codeName)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    diskController: ").append(toIndentedString(diskController)).append("\n");
    sb.append("    diskExpander: ").append(toIndentedString(diskExpander)).append("\n");
    sb.append("    familyCode: ").append(toIndentedString(familyCode)).append("\n");
    sb.append("    flashDrive: ").append(toIndentedString(flashDrive)).append("\n");
    sb.append("    generationCode: ").append(toIndentedString(generationCode)).append("\n");
    sb.append("    hwgen: ").append(toIndentedString(hwgen)).append("\n");
    sb.append("    imbVersion: ").append(toIndentedString(imbVersion)).append("\n");
    sb.append("    infiniband: ").append(toIndentedString(infiniband)).append("\n");
    sb.append("    lcdVersion: ").append(toIndentedString(lcdVersion)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelCode: ").append(toIndentedString(modelCode)).append("\n");
    sb.append("    motherboard: ").append(toIndentedString(motherboard)).append("\n");
    sb.append("    netInterfaces: ").append(toIndentedString(netInterfaces)).append("\n");
    sb.append("    nodeSlotId: ").append(toIndentedString(nodeSlotId)).append("\n");
    sb.append("    nvram: ").append(toIndentedString(nvram)).append("\n");
    sb.append("    peerSerialNumber: ").append(toIndentedString(peerSerialNumber)).append("\n");
    sb.append("    performanceCode: ").append(toIndentedString(performanceCode)).append("\n");
    sb.append("    powersupplies: ").append(toIndentedString(powersupplies)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    sledDriveCount: ").append(toIndentedString(sledDriveCount)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    topLevelAssemblySerialNumber: ").append(toIndentedString(topLevelAssemblySerialNumber)).append("\n");
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

