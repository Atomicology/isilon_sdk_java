
# ClusterPatchPatchesPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | A long comment about the patch. |  [optional]
**conflicts** | **List&lt;String&gt;** | Other patches that this patch conflicts with. |  [optional]
**dependencies** | **List&lt;String&gt;** | Other patches that this patch depends on. |  [optional]
**description** | **String** | A short description of the patch. |  [optional]
**files** | [**List&lt;ClusterPatchPatchesPatchFile&gt;**](ClusterPatchPatchesPatchFile.md) | The files contained in this patch. |  [optional]
**id** | **String** | A unique identifier for the patch. |  [optional]
**name** | **String** | The name of the patch. |  [optional]
**nodes** | **List&lt;Integer&gt;** | The nodes that this patch is installed on. |  [optional]
**reboot** | **String** | Describes the reboot requirements |  [optional]
**services** | [**List&lt;ClusterPatchPatchesPatchService&gt;**](ClusterPatchPatchesPatchService.md) | The services affected during the patch deployment |  [optional]
**status** | **String** | The intallation status of this patch on the cluster. |  [optional]



