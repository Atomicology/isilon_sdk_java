
# LicenseLicenseCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**evaluation** | **List&lt;String&gt;** | A list of evaluation licenses to enable on the cluster. |  [optional]
**licenseFileContent** | **String** | License file string content. The license file is obtained from EMC&#39;s SLC web portal. Do not use with the license_file_path option. |  [optional]
**licenseFilePath** | **String** | Path to new license file, must be under /ifs. The license file is obtained from EMC&#39;s SLC web portal. Do not include the path when only enabling evaluation licenses. Do not use with the license_file_content option. |  [optional]



