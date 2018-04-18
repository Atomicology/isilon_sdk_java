
# SmbSettingsGlobalSettingsAuditGlobalSaclItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flags** | [**FlagsEnum**](#FlagsEnum) | Determines if audit is performed on success or failure. | 
**permission** | [**List&lt;PermissionEnum&gt;**](#List&lt;PermissionEnum&gt;) | Specifies the array of filesystem rights that are governed. | 


<a name="FlagsEnum"></a>
## Enum: FlagsEnum
Name | Value
---- | -----
SUCCESSFUL | &quot;successful&quot;
FAILED | &quot;failed&quot;


<a name="List<PermissionEnum>"></a>
## Enum: List&lt;PermissionEnum&gt;
Name | Value
---- | -----
GENERIC_ALL | &quot;generic_all&quot;
GENERIC_READ | &quot;generic_read&quot;
GENERIC_WRITE | &quot;generic_write&quot;
GENERIC_EXEC | &quot;generic_exec&quot;
STD_DELETE | &quot;std_delete&quot;
STD_READ_DAC | &quot;std_read_dac&quot;
STD_WRITE_DAC | &quot;std_write_dac&quot;
STD_WRITE_OWNER | &quot;std_write_owner&quot;
STD_SYNCHRONIZE | &quot;std_synchronize&quot;
STD_REQUIRED | &quot;std_required&quot;
LIST | &quot;list&quot;
ADD_FILE | &quot;add_file&quot;
ADD_SUBDIR | &quot;add_subdir&quot;
DELETE_CHILD | &quot;delete_child&quot;
TRAVERSE | &quot;traverse&quot;
DIR_READ_ATTR | &quot;dir_read_attr&quot;
DIR_WRITE_ATTR | &quot;dir_write_attr&quot;
DIR_READ_EXT_ATTR | &quot;dir_read_ext_attr&quot;
DIR_WRITE_EXT_ATTR | &quot;dir_write_ext_attr&quot;
DIR_GEN_READ | &quot;dir_gen_read&quot;
DIR_GEN_WRITE | &quot;dir_gen_write&quot;
DIR_GEN_EXECUTE | &quot;dir_gen_execute&quot;
DIR_GEN_ALL | &quot;dir_gen_all&quot;
FILE_READ | &quot;file_read&quot;
FILE_WRITE | &quot;file_write&quot;
APPEND | &quot;append&quot;
EXECUTE | &quot;execute&quot;
FILE_READ_ATTR | &quot;file_read_attr&quot;
FILE_WRITE_ATTR | &quot;file_write_attr&quot;
FILE_READ_EXT_ATTR | &quot;file_read_ext_attr&quot;
FILE_WRITE_EXT_ATTR | &quot;file_write_ext_attr&quot;
FILE_GEN_READ | &quot;file_gen_read&quot;
FILE_GEN_WRITE | &quot;file_gen_write&quot;
FILE_GEN_EXECUTE | &quot;file_gen_execute&quot;
FILE_GEN_ALL | &quot;file_gen_all&quot;
MODIFY | &quot;modify&quot;
OBJECT_INHERIT | &quot;object_inherit&quot;
CONTAINER_INHERIT | &quot;container_inherit&quot;
NO_PROP_INHERIT | &quot;no_prop_inherit&quot;
INHERIT_ONLY | &quot;inherit_only&quot;
INHERITED_ACE | &quot;inherited_ace&quot;



