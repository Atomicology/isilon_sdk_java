
# AuthAccessAccessItemFileFilePermissions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dacl** | **String** | Returns a status message if the Null ACL is set. |  [optional]
**deleteChild** | **String** | Returns a status message if the parent directoryhas the delete_child property set for the user.If the delete_child property is set for a user,that user is able to delete the file.the delete_child for the user. |  [optional]
**expected** | **String** | Specifies the Access Control Entry (ACE) for the user. |  [optional]
**mode** | **String** | Specifies the mode bits on the file. |  [optional]
**ownership** | **String** | Returns a status message if the user owns the file. |  [optional]
**relevantAces** | [**List&lt;AuthAccessAccessItemShareSharePermissionsShareRelevantAce&gt;**](AuthAccessAccessItemShareSharePermissionsShareRelevantAce.md) | Specifies a list of the relevant Access Control Entrieswith respect to the user in the share. |  [optional]
**relevantMode** | **String** | Specifies the mode bits that are related to the user. |  [optional]
**sticky** | **String** | Returns a status message if the user owns the file. |  [optional]



