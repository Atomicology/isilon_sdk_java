
# NodeDriveconfigNodeStall

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clearTime** | **Integer** | The amount of time in seconds with no stalls before ignoring previous stalls. |  [optional]
**diskscrubStripes** | **Integer** | Number of stripes to read during a diskscrub. |  [optional]
**maxErrorFrequency** | **Integer** | The number of errors during stalled drive disk exercises to cause the drive to be softfailed. |  [optional]
**maxSlowAccess** | **Integer** | The number of slow accesses during stalled drive disk exercises to cause the drive to be softfailed. |  [optional]
**maxSlowFrequency** | **Integer** | The number of slow frequency triggers during stalled drive disk exercises to cause the drive to be softfailed. |  [optional]
**maxTotalStallTime** | **Integer** | The maximum amount of time, in seconds, to remain stalled before softfailing the drive. |  [optional]
**scanMaxEccDelay** | **Integer** | Maximum delay in seconds after an ECC correction during a scan. |  [optional]
**scanSize** | **Integer** | Total bytes of error-free reads to complete a scan. |  [optional]
**sleep** | **Integer** | Delay in seconds between evaluations. |  [optional]



