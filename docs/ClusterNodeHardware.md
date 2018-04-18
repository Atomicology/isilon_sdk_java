
# ClusterNodeHardware

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chassis** | **String** | Name of this node&#39;s chassis. |  [optional]
**chassisCode** | **String** | Chassis code of this node (1U, 2U, etc.). |  [optional]
**chassisCount** | **String** | Number of chassis making up this node. |  [optional]
**chassisDepth** | **String** | Chassis depth for this node if applicable (Normal, Deep, Unknown). If not supported: Unknown. If Logic to determine chassis depth fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist. |  [optional]
**propertyClass** | **String** | Class of this node (storage, accelerator, etc.). |  [optional]
**codeName** | **String** | Code name of this node if applicable (Minnetonka, MiniHuron, Huron, Union, Tahoe, Superior, Unknown). If not supported: Unknown. If Logic to determine code name fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist. |  [optional]
**computeType** | **String** | Type of compute node if applicable (Low, Medium, High, Turbo, Ultra, Unknown). If not supported: Unknown. If Logic to determine compute type fails: Unknown. If PSI_Get fails: Unknown. PSI_Get can fail if PSI not initialized, or key does not exist. |  [optional]
**configurationId** | **String** | Node configuration ID. |  [optional]
**cpu** | **String** | Manufacturer and model of this node&#39;s CPU. |  [optional]
**diskController** | **String** | Manufacturer and model of this node&#39;s disk controller. |  [optional]
**diskExpander** | **String** | Manufacturer and model of this node&#39;s disk expander. |  [optional]
**familyCode** | **String** | Family code of this node (X, S, NL, etc.). |  [optional]
**flashDrive** | **String** | Manufacturer, model, and device id of this node&#39;s flash drive. |  [optional]
**generationCode** | **String** | Generation code of this node. |  [optional]
**hwgen** | **String** | Isilon hardware generation name. |  [optional]
**imbVersion** | **String** | Version of this node&#39;s Isilon Management Board. |  [optional]
**infiniband** | **String** | Infiniband card type. |  [optional]
**lcdVersion** | **String** | Version of the LCD panel. |  [optional]
**model** | **String** | Isilon node model identifier string (S200, X410, Infinity-H500, etc.). |  [optional]
**modelCode** | **String** | Isilon node model code string (S200, X410, H500, etc.). |  [optional]
**motherboard** | **String** | Manufacturer and model of this node&#39;s motherboard. |  [optional]
**netInterfaces** | **String** | Description of all this node&#39;s network interfaces. |  [optional]
**nodeSlotId** | **Integer** | Position of node within chassis (e.g., 1-4 for Infinity chassis). -1 for error or not supported. |  [optional]
**nvram** | **String** | Manufacturer and model of this node&#39;s NVRAM board. |  [optional]
**peerSerialNumber** | **String** | Serial number of this node&#39;s peer/buddy node.(Infinity Only) |  [optional]
**performanceCode** | **String** | Performance code of this node, if applicable (2, 4, 5, etc.). |  [optional]
**powersupplies** | **List&lt;String&gt;** | Description strings for each power supply on this node. |  [optional]
**processor** | **String** | Number of processors and cores on this node. |  [optional]
**product** | **String** | Isilon product name. |  [optional]
**ram** | **Integer** | Size of RAM in bytes. |  [optional]
**serialNumber** | **String** | Serial number of this node. |  [optional]
**series** | **String** | Series of this node (X, I, NL, etc.). |  [optional]
**sledDriveCount** | **Integer** | Size of drive sleds in node, if applicable. Expected values: 3, 4, 6. 0 if unable to determine sled size. -1 for error or not supported. If PSI_Get fails: -1. PSI_Get can fail if PSI not initialized, or key does not exist. |  [optional]
**storageClass** | **String** | Storage class of this node (storage or diskless). |  [optional]
**tier** | **Integer** | Platform tier level of this node if applicable (1-4 are defined, 0 for unknown or not supported, -1 for error). If not supported: 0. If Logic to determine tier fails: 0 for unknown. If PSI_Get fails: -1 for error. PSI_Get can fail if PSI not initialized, or key does not exist. |  [optional]
**topLevelAssemblySerialNumber** | **String** | Serial number of the top level assembly of this node.(Infinity Only) | 



