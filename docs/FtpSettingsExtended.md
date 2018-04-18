
# FtpSettingsExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptTimeout** | **Integer** | The timeout, in seconds, for a remote client to establish a PASV style data connection. |  [optional]
**allowAnonAccess** | **Boolean** | Controls whether anonymous logins are permitted or not. |  [optional]
**allowAnonUpload** | **Boolean** | Controls whether anonymous users will be permitted to upload files. |  [optional]
**allowDirlists** | **Boolean** | If set to false, all directory list commands will return a permission denied error. |  [optional]
**allowDownloads** | **Boolean** | If set to false, all downloads requests will return a permission denied error. |  [optional]
**allowLocalAccess** | **Boolean** | Controls whether local logins are permitted or not. |  [optional]
**allowWrites** | **Boolean** | This controls whether any FTP commands which change the filesystem are allowed or not. |  [optional]
**alwaysChdirHomedir** | **Boolean** | This controls whether FTP will always initially change directories to the home directory of the user, regardless of whether it is chroot-ing. |  [optional]
**anonChownUsername** | **String** | This is the name of the user who is given ownership of anonymously uploaded files. |  [optional]
**anonPasswordList** | **List&lt;String&gt;** | A list of passwords for anonymous users. |  [optional]
**anonRootPath** | **String** | This option represents a directory in /ifs which vsftpd will try to change into after an anonymous login. |  [optional]
**anonUmask** | **Integer** | The value that the umask for file creation is set to for anonymous users. |  [optional]
**asciiMode** | **String** | Controls whether ascii mode data transfers are honored for various types of requests. |  [optional]
**chrootExceptionList** | **List&lt;String&gt;** | A list of users that are not chrooted when logging in. |  [optional]
**chrootLocalMode** | **String** | If set to &#39;all&#39;, all local users will be (by default) placed in a chroot() jail in their home directory after login. If set to &#39;all-with-exceptions&#39;, all local users except those listed in the chroot exception list (isi ftp chroot-exception-list) will be placed in a chroot() jail in their home directory after login. If set to &#39;none&#39;, no local users will be chrooted by default. If set to &#39;none-with-exceptions&#39;, only the local users listed in the chroot exception list (isi ftp chroot-exception-list) will be place in a chroot() jail in their home directory after login. |  [optional]
**connectTimeout** | **Integer** | The timeout, in seconds, for a remote client to respond to our PORT style data connection. |  [optional]
**dataTimeout** | **Integer** | The timeout, in seconds, which is roughly the maximum time we permit data transfers to stall for with no progress. If the timeout triggers, the remote client is kicked off. |  [optional]
**deniedUserList** | **List&lt;String&gt;** | A list of uses that will be denied access. |  [optional]
**dirlistLocaltime** | **Boolean** | If enabled, display directory listings with the time in your local time zone. The default is to display GMT. The times returned by the MDTM FTP command are also affected by this option. |  [optional]
**dirlistNames** | **String** | When set to &#39;hide&#39;,  all user and group information in directory listings will be displayed as &#39;ftp&#39;. When set to &#39;textual&#39;, textual names are shown in the user and group fields of directory listings. When set to &#39;numeric&#39;, numeric IDs are show in the user and group fields of directory listings. |  [optional]
**fileCreatePerm** | **Integer** | The permissions with which uploaded files are created. Umasks are applied on top of this value. |  [optional]
**limitAnonPasswords** | **Boolean** | This field determines whether the anon_password_list is used. |  [optional]
**localRootPath** | **String** | This option represents a directory in /ifs which vsftpd will try to change into after a local login. |  [optional]
**localUmask** | **Integer** | The value that the umask for file creation is set to for local users. |  [optional]
**serverToServer** | **Boolean** | If enabled, allow server-to-server (FXP) transfers. |  [optional]
**service** | **Boolean** | This field controls whether the FTP daemon is running. |  [optional]
**sessionSupport** | **Boolean** | If enabled, maintain login sessions for each user through Pluggable Authentication Modules (PAM). Disabling this option prevents the ability to do automatic home directory creation if that functionality were otherwise available. |  [optional]
**sessionTimeout** | **Integer** | The timeout, in seconds, which is roughly the maximum time we permit data transfers to stall for with no progress. If the timeout triggers, the remote client is kicked off. |  [optional]
**userConfigDir** | **String** | Specifies the directory where per-user config overrides can be found. |  [optional]



