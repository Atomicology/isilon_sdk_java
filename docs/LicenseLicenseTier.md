
# LicenseLicenseTier

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementsExceededAlerts** | [**List&lt;LicenseLicenseTierEntitlementsExceededAlert&gt;**](LicenseLicenseTierEntitlementsExceededAlert.md) | List of alerts about exceeded entitlements: The following alerts appear when usage of a resource such as a node, an encryption node, or storage capacity exceeds the quantity licensed for that resource. |  [optional]
**licensedDriveCapacity** | **Integer** | Licensed terabyte (TB, 10^12 bytes) drive capacity allocated as storage associated with tier. Included if tier is not NONINF and license is not a base only license. |  [optional]
**licensedNodeCount** | **Integer** | Licensed number of nodes in this tier. |  [optional]
**licensedNodesWithSedsCount** | **Integer** | Licensed number of nodes of this tier that contain self-encrypting drives. Included only if license is ONEFS and tier is not NONINF. |  [optional]
**tier** | **String** | OneFS hardware tier. Tier is a number, NONINF, or NO_TIER. NONINF indicates a non infinity tier. NO_TIER indicates a license that is not tier based. |  [optional]
**usedDriveCapacity** | **Integer** | Actual terabyte (TB, 10^12 bytes) drive capacity allocated as storage space associated with tier. Included if tier is not NONINF and license is not a base only license. |  [optional]
**usedNodeCount** | **Integer** | Actual number of nodes in this tier. |  [optional]
**usedNodesWithSedsCount** | **Integer** | Actual number of nodes of this tier that contain self-encrypting drives. Included only if license is ONEFS and if tier is not NONINF. |  [optional]



