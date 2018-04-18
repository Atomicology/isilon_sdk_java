
# NfsExportExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allDirs** | **Boolean** | True if all directories under the specified paths are mountable. |  [optional]
**blockSize** | **Integer** | Specifies the block size returned by the NFS statfs procedure. |  [optional]
**canSetTime** | **Boolean** | True if the client can set file times through the NFS set attribute request. This parameter does not affect server behavior, but is included to accommoate legacy client requirements. |  [optional]
**caseInsensitive** | **Boolean** | True if the case is ignored for file names. This parameter does not affect server behavior, but is included to accommodate legacy client requirements. |  [optional]
**casePreserving** | **Boolean** | True if the case is preserved for file names. This parameter does not affect server behavior, but is included to accommodate legacy client requirements. |  [optional]
**chownRestricted** | **Boolean** | True if the superuser can change file ownership. This parameter does not affect server behavior, but is included to accommodate legacy client requirements. |  [optional]
**clients** | **List&lt;String&gt;** | Specifies the clients with root access to the export. |  [optional]
**commitAsynchronous** | **Boolean** | True if NFS  commit  requests execute asynchronously. |  [optional]
**description** | **String** | Specifies the user-defined string that is used to identify the export. |  [optional]
**directoryTransferSize** | **Integer** | Specifies the preferred size for directory read operations. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**encoding** | **String** | Specifies the default character set encoding of the clients connecting to the export, unless otherwise specified. |  [optional]
**linkMax** | **Integer** | Specifies the reported maximum number of links to a file. This parameter does not affect server behavior, but is included to accommodate legacy client requirements. |  [optional]
**mapAll** | [**NfsSettingsExportSettingsMapAll**](NfsSettingsExportSettingsMapAll.md) | User and group mapping. |  [optional]
**mapFailure** | [**NfsSettingsExportSettingsMapAll**](NfsSettingsExportSettingsMapAll.md) | User and group mapping. |  [optional]
**mapFull** | **Boolean** | True if user mappings query the OneFS user database. When set to false, user mappings only query local authentication. |  [optional]
**mapLookupUid** | **Boolean** | True if incoming user IDs (UIDs) are mapped to users in the OneFS user database. When set to false, incoming UIDs are applied directly to file operations. |  [optional]
**mapNonRoot** | [**NfsSettingsExportSettingsMapAll**](NfsSettingsExportSettingsMapAll.md) | User and group mapping. |  [optional]
**mapRetry** | **Boolean** | Determines whether searches for users specified in &#39;map_all&#39;, &#39;map_root&#39; or &#39;map_nonroot&#39; are retried if the search fails. |  [optional]
**mapRoot** | [**NfsSettingsExportSettingsMapAll**](NfsSettingsExportSettingsMapAll.md) | User and group mapping. |  [optional]
**maxFileSize** | **Integer** | Specifies the maximum file size for any file accessed from the export. This parameter does not affect server behavior, but is included to accommodate legacy client requirements. |  [optional]
**nameMaxSize** | **Integer** | Specifies the reported maximum length of a file name. This parameter does not affect server behavior, but is included to accommodate legacy client requirements. |  [optional]
**noTruncate** | **Boolean** | True if long file names result in an error. This parameter does not affect server behavior, but is included to accommodate legacy client requirements. |  [optional]
**paths** | **List&lt;String&gt;** | Specifies the paths under /ifs that are exported. |  [optional]
**readOnly** | **Boolean** | True if the export is set to read-only. |  [optional]
**readOnlyClients** | **List&lt;String&gt;** | Specifies the clients with read-only access to the export. |  [optional]
**readTransferMaxSize** | **Integer** | Specifies the maximum buffer size that clients should use on NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**readTransferMultiple** | **Integer** | Specifies the preferred multiple size for NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**readTransferSize** | **Integer** | Specifies the preferred size for NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**readWriteClients** | **List&lt;String&gt;** | Specifies the clients with both read and write access to the export, even when the export is set to read-only. |  [optional]
**readdirplus** | **Boolean** | True if &#39;readdirplus&#39; requests are enabled. Enabling this property might improve network performance and is only available for NFSv3. |  [optional]
**readdirplusPrefetch** | **Integer** | Sets the number of directory entries that are prefetched when a &#39;readdirplus&#39; request is processed. (Deprecated.) |  [optional]
**return32bitFileIds** | **Boolean** | Limits the size of file identifiers returned by NFSv3+ to 32-bit values (may require remount). |  [optional]
**rootClients** | **List&lt;String&gt;** | Clients that have root access to the export. |  [optional]
**securityFlavors** | [**List&lt;SecurityFlavorsEnum&gt;**](#List&lt;SecurityFlavorsEnum&gt;) | Specifies the authentication types that are supported for this export. |  [optional]
**setattrAsynchronous** | **Boolean** | True if set attribute operations execute asynchronously. |  [optional]
**snapshot** | **String** | Specifies the snapshot for all mounts. |  [optional]
**symlinks** | **Boolean** | True if symlinks are supported. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**timeDelta** | [**BigDecimal**](BigDecimal.md) | Specifies the resolution of all time values that are returned to the clients |  [optional]
**writeDatasyncAction** | **String** | Specifies the synchronization type. |  [optional]
**writeDatasyncReply** | **String** | Specifies the synchronization type. |  [optional]
**writeFilesyncAction** | **String** | Specifies the synchronization type. |  [optional]
**writeFilesyncReply** | **String** | Specifies the synchronization type. |  [optional]
**writeTransferMaxSize** | **Integer** | Specifies the maximum buffer size that clients should use on NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**writeTransferMultiple** | **Integer** | Specifies the preferred multiple size for NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**writeTransferSize** | **Integer** | Specifies the preferred multiple size for NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced. |  [optional]
**writeUnstableAction** | **String** | Specifies the synchronization type. |  [optional]
**writeUnstableReply** | **String** | Specifies the synchronization type. |  [optional]
**zone** | **String** | Specifies the zone in which the export is valid. |  [optional]
**conflictingPaths** | **List&lt;String&gt;** | Reports the paths that conflict with another export. |  [optional]
**id** | **Integer** | Specifies the system-assigned ID for the export. This ID is returned when an export is created through the POST method. |  [optional]
**unresolvedClients** | **List&lt;String&gt;** | Reports clients that cannot be resolved. |  [optional]


<a name="List<SecurityFlavorsEnum>"></a>
## Enum: List&lt;SecurityFlavorsEnum&gt;
Name | Value
---- | -----
UNIX | &quot;unix&quot;
KRB5 | &quot;krb5&quot;
KRB5I | &quot;krb5i&quot;
KRB5P | &quot;krb5p&quot;



