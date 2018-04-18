
# CloudSettingsSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudPolicyDefaults** | [**CloudSettingsSettingsCloudPolicyDefaults**](CloudSettingsSettingsCloudPolicyDefaults.md) | The default filepool policy values for cloudpools. |  [optional]
**retryCoefficientArchive** | **String** | Coefficients in the quadratic function for determining the rest period between successive archive attempts. |  [optional]
**retryCoefficientCacheInvalidation** | **String** | Coefficients in the quadratic function for determining the rest period between successive cache invalidation attempts. |  [optional]
**retryCoefficientCloudGarbageCollection** | **String** | Coefficients in the quadratic function for determining the rest period between successive cloud garbage collection attempts. |  [optional]
**retryCoefficientLocalGarbageCollection** | **String** | Coefficients in the quadratic function for determining the rest period between successive local garbage collection attempts. |  [optional]
**retryCoefficientReadAhead** | **String** | Coefficients in the quadratic function for determining the rest period between successive read ahead attempts. |  [optional]
**retryCoefficientRecall** | **String** | Coefficients in the quadratic function for determining the rest period between successive recall attempts. |  [optional]
**retryCoefficientWriteback** | **String** | Coefficients in the quadratic function for determining the rest period between successive writeback attempts. |  [optional]
**sleepTimeoutArchive** | [**CloudSettingsSettingsSleepTimeoutCloudGarbageCollection**](CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md) | Amount of time to wait between successive file archive operations. |  [optional]
**sleepTimeoutCacheInvalidation** | [**CloudSettingsSettingsSleepTimeoutCloudGarbageCollection**](CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md) | Amount of time to wait between successive file cache_invalidation operations. |  [optional]
**sleepTimeoutCloudGarbageCollection** | [**CloudSettingsSettingsSleepTimeoutCloudGarbageCollection**](CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md) | Amount of time to wait between successive file cloud garbage collection operations. |  [optional]
**sleepTimeoutLocalGarbageCollection** | [**CloudSettingsSettingsSleepTimeoutCloudGarbageCollection**](CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md) | Amount of time to wait between successive file local garbage collection operations. |  [optional]
**sleepTimeoutReadAhead** | [**CloudSettingsSettingsSleepTimeoutCloudGarbageCollection**](CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md) | Amount of time to wait between successive file read ahead operations. |  [optional]
**sleepTimeoutRecall** | [**CloudSettingsSettingsSleepTimeoutCloudGarbageCollection**](CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md) | Amount of time to wait between successive file recall operations. |  [optional]
**sleepTimeoutWriteback** | [**CloudSettingsSettingsSleepTimeoutCloudGarbageCollection**](CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md) | Amount of time to wait between successive file writeback operations. |  [optional]



