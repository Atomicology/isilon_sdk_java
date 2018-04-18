
# LicenseGenerateHardwareItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driveCapacity** | **Integer** | Licensed terabyte (TB, 10^12 bytes) drive capacity allocated as storage associated with tier. Included if tier is not NONINF and license is not a base only license. |  [optional]
**nodeCount** | **Integer** | Licensed number of nodes in this tier. |  [optional]
**nodesWithSedsCount** | **Integer** | Licensed number of nodes of this tier that contain self-encrypting drives. Included only if license is ONEFS and tier is not NONINF. |  [optional]
**tier** | **String** | OneFS hardware tier. Tier is a number, NONINF, or NO_TIER. NONINF indicates a non infinity tier. NO_TIER indicates a license that is not tier based. |  [optional]



