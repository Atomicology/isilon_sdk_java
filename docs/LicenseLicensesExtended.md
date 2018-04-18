
# LicenseLicensesExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licenses** | [**List&lt;LicenseLicense&gt;**](LicenseLicense.md) |  |  [optional]
**activationIncompleteAlert** | **Boolean** | True when we are generating an activation incomplete alert. An activation incomplete alert is generated if we do not have a signed license file 90 days after OneFS is upgraded. | 
**baseOnlyLicenses** | **List&lt;String&gt;** |  | 
**evaluatable** | **List&lt;String&gt;** |  | 
**swid** | **String** | Software license identifier. SWID will be absent if not yet obtained from a license file. |  [optional]
**validSignature** | **Boolean** | True if license file contains a valid signature. | 



