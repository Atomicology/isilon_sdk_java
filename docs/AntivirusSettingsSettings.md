
# AntivirusSettingsSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failOpen** | **Boolean** | Allow access when scanning fails. |  [optional]
**globFilters** | **List&lt;String&gt;** | Glob patterns for leaf filenames. |  [optional]
**globFiltersEnabled** | **Boolean** | Enable glob filters. |  [optional]
**globFiltersInclude** | **Boolean** | If true, only scan files matching a glob filter. If false, only scan files that don&#39;t match a glob filter. |  [optional]
**pathPrefixes** | **List&lt;String&gt;** | Paths to include in realtime scans. |  [optional]
**quarantine** | **Boolean** | Try to quarantine files when threats are found. |  [optional]
**repair** | **Boolean** | Try to repair files when threats are found. |  [optional]
**reportExpiry** | **Integer** | Amount of time in seconds until old reporting data is purged. |  [optional]
**scanOnClose** | **Boolean** | Scan files when apps close them. |  [optional]
**scanOnOpen** | **Boolean** | Scan files on access. |  [optional]
**scanSizeMaximum** | **Integer** | Skip scanning files larger than this. |  [optional]
**service** | **Boolean** | Whether the antivirus service is enabled. |  [optional]
**truncate** | **Boolean** | Try to truncate files when threats are found. |  [optional]



