
# CloudSettingsSettingsCloudPolicyDefaults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archiveSnapshotFiles** | **Boolean** | Specifies if files with snapshots should be archived. |  [optional]
**cache** | [**CloudSettingsSettingsCloudPolicyDefaultsCache**](CloudSettingsSettingsCloudPolicyDefaultsCache.md) | Specifies default cloudpool cache settings for new filepool policies. |  [optional]
**compression** | **Boolean** | Specifies if files should be compressed. |  [optional]
**dataRetention** | **Integer** | Specifies the minimum amount of time archived data will be retained in the cloud after deletion. |  [optional]
**encryption** | **Boolean** | Specifies if files should be encrypted. |  [optional]
**fullBackupRetention** | **Integer** | (Used with NDMP backups only.  Not applicable to SyncIQ.)  The minimum amount of time cloud files will be retained after the creation of a full NDMP backup. |  [optional]
**incrementalBackupRetention** | **Integer** | (Used with SyncIQ and NDMP backups.)  The minimum amount of time cloud files will be retained after the creation of a SyncIQ backup or an incremental NDMP backup. |  [optional]
**writebackFrequency** | **Integer** | The minimum amount of time to wait before updating cloud data with local changes. |  [optional]



