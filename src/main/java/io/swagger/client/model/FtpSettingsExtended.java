/*
 * Isilon SDK
 * Isilon SDK - Language bindings for the OneFS API
 *
 * OpenAPI spec version: 5
 * Contact: sdk@isilon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FTP settings.
 */
@ApiModel(description = "FTP settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class FtpSettingsExtended {
  @SerializedName("accept_timeout")
  private Integer acceptTimeout = null;

  @SerializedName("allow_anon_access")
  private Boolean allowAnonAccess = null;

  @SerializedName("allow_anon_upload")
  private Boolean allowAnonUpload = null;

  @SerializedName("allow_dirlists")
  private Boolean allowDirlists = null;

  @SerializedName("allow_downloads")
  private Boolean allowDownloads = null;

  @SerializedName("allow_local_access")
  private Boolean allowLocalAccess = null;

  @SerializedName("allow_writes")
  private Boolean allowWrites = null;

  @SerializedName("always_chdir_homedir")
  private Boolean alwaysChdirHomedir = null;

  @SerializedName("anon_chown_username")
  private String anonChownUsername = null;

  @SerializedName("anon_password_list")
  private List<String> anonPasswordList = null;

  @SerializedName("anon_root_path")
  private String anonRootPath = null;

  @SerializedName("anon_umask")
  private Integer anonUmask = null;

  @SerializedName("ascii_mode")
  private String asciiMode = null;

  @SerializedName("chroot_exception_list")
  private List<String> chrootExceptionList = null;

  @SerializedName("chroot_local_mode")
  private String chrootLocalMode = null;

  @SerializedName("connect_timeout")
  private Integer connectTimeout = null;

  @SerializedName("data_timeout")
  private Integer dataTimeout = null;

  @SerializedName("denied_user_list")
  private List<String> deniedUserList = null;

  @SerializedName("dirlist_localtime")
  private Boolean dirlistLocaltime = null;

  @SerializedName("dirlist_names")
  private String dirlistNames = null;

  @SerializedName("file_create_perm")
  private Integer fileCreatePerm = null;

  @SerializedName("limit_anon_passwords")
  private Boolean limitAnonPasswords = null;

  @SerializedName("local_root_path")
  private String localRootPath = null;

  @SerializedName("local_umask")
  private Integer localUmask = null;

  @SerializedName("server_to_server")
  private Boolean serverToServer = null;

  @SerializedName("service")
  private Boolean service = null;

  @SerializedName("session_support")
  private Boolean sessionSupport = null;

  @SerializedName("session_timeout")
  private Integer sessionTimeout = null;

  @SerializedName("user_config_dir")
  private String userConfigDir = null;

  public FtpSettingsExtended acceptTimeout(Integer acceptTimeout) {
    this.acceptTimeout = acceptTimeout;
    return this;
  }

   /**
   * The timeout, in seconds, for a remote client to establish a PASV style data connection.
   * minimum: 30
   * maximum: 600
   * @return acceptTimeout
  **/
  @ApiModelProperty(value = "The timeout, in seconds, for a remote client to establish a PASV style data connection.")
  public Integer getAcceptTimeout() {
    return acceptTimeout;
  }

  public void setAcceptTimeout(Integer acceptTimeout) {
    this.acceptTimeout = acceptTimeout;
  }

  public FtpSettingsExtended allowAnonAccess(Boolean allowAnonAccess) {
    this.allowAnonAccess = allowAnonAccess;
    return this;
  }

   /**
   * Controls whether anonymous logins are permitted or not.
   * @return allowAnonAccess
  **/
  @ApiModelProperty(value = "Controls whether anonymous logins are permitted or not.")
  public Boolean isAllowAnonAccess() {
    return allowAnonAccess;
  }

  public void setAllowAnonAccess(Boolean allowAnonAccess) {
    this.allowAnonAccess = allowAnonAccess;
  }

  public FtpSettingsExtended allowAnonUpload(Boolean allowAnonUpload) {
    this.allowAnonUpload = allowAnonUpload;
    return this;
  }

   /**
   * Controls whether anonymous users will be permitted to upload files.
   * @return allowAnonUpload
  **/
  @ApiModelProperty(value = "Controls whether anonymous users will be permitted to upload files.")
  public Boolean isAllowAnonUpload() {
    return allowAnonUpload;
  }

  public void setAllowAnonUpload(Boolean allowAnonUpload) {
    this.allowAnonUpload = allowAnonUpload;
  }

  public FtpSettingsExtended allowDirlists(Boolean allowDirlists) {
    this.allowDirlists = allowDirlists;
    return this;
  }

   /**
   * If set to false, all directory list commands will return a permission denied error.
   * @return allowDirlists
  **/
  @ApiModelProperty(value = "If set to false, all directory list commands will return a permission denied error.")
  public Boolean isAllowDirlists() {
    return allowDirlists;
  }

  public void setAllowDirlists(Boolean allowDirlists) {
    this.allowDirlists = allowDirlists;
  }

  public FtpSettingsExtended allowDownloads(Boolean allowDownloads) {
    this.allowDownloads = allowDownloads;
    return this;
  }

   /**
   * If set to false, all downloads requests will return a permission denied error.
   * @return allowDownloads
  **/
  @ApiModelProperty(value = "If set to false, all downloads requests will return a permission denied error.")
  public Boolean isAllowDownloads() {
    return allowDownloads;
  }

  public void setAllowDownloads(Boolean allowDownloads) {
    this.allowDownloads = allowDownloads;
  }

  public FtpSettingsExtended allowLocalAccess(Boolean allowLocalAccess) {
    this.allowLocalAccess = allowLocalAccess;
    return this;
  }

   /**
   * Controls whether local logins are permitted or not.
   * @return allowLocalAccess
  **/
  @ApiModelProperty(value = "Controls whether local logins are permitted or not.")
  public Boolean isAllowLocalAccess() {
    return allowLocalAccess;
  }

  public void setAllowLocalAccess(Boolean allowLocalAccess) {
    this.allowLocalAccess = allowLocalAccess;
  }

  public FtpSettingsExtended allowWrites(Boolean allowWrites) {
    this.allowWrites = allowWrites;
    return this;
  }

   /**
   * This controls whether any FTP commands which change the filesystem are allowed or not.
   * @return allowWrites
  **/
  @ApiModelProperty(value = "This controls whether any FTP commands which change the filesystem are allowed or not.")
  public Boolean isAllowWrites() {
    return allowWrites;
  }

  public void setAllowWrites(Boolean allowWrites) {
    this.allowWrites = allowWrites;
  }

  public FtpSettingsExtended alwaysChdirHomedir(Boolean alwaysChdirHomedir) {
    this.alwaysChdirHomedir = alwaysChdirHomedir;
    return this;
  }

   /**
   * This controls whether FTP will always initially change directories to the home directory of the user, regardless of whether it is chroot-ing.
   * @return alwaysChdirHomedir
  **/
  @ApiModelProperty(value = "This controls whether FTP will always initially change directories to the home directory of the user, regardless of whether it is chroot-ing.")
  public Boolean isAlwaysChdirHomedir() {
    return alwaysChdirHomedir;
  }

  public void setAlwaysChdirHomedir(Boolean alwaysChdirHomedir) {
    this.alwaysChdirHomedir = alwaysChdirHomedir;
  }

  public FtpSettingsExtended anonChownUsername(String anonChownUsername) {
    this.anonChownUsername = anonChownUsername;
    return this;
  }

   /**
   * This is the name of the user who is given ownership of anonymously uploaded files.
   * @return anonChownUsername
  **/
  @ApiModelProperty(value = "This is the name of the user who is given ownership of anonymously uploaded files.")
  public String getAnonChownUsername() {
    return anonChownUsername;
  }

  public void setAnonChownUsername(String anonChownUsername) {
    this.anonChownUsername = anonChownUsername;
  }

  public FtpSettingsExtended anonPasswordList(List<String> anonPasswordList) {
    this.anonPasswordList = anonPasswordList;
    return this;
  }

  public FtpSettingsExtended addAnonPasswordListItem(String anonPasswordListItem) {
    if (this.anonPasswordList == null) {
      this.anonPasswordList = new ArrayList<String>();
    }
    this.anonPasswordList.add(anonPasswordListItem);
    return this;
  }

   /**
   * A list of passwords for anonymous users.
   * @return anonPasswordList
  **/
  @ApiModelProperty(value = "A list of passwords for anonymous users.")
  public List<String> getAnonPasswordList() {
    return anonPasswordList;
  }

  public void setAnonPasswordList(List<String> anonPasswordList) {
    this.anonPasswordList = anonPasswordList;
  }

  public FtpSettingsExtended anonRootPath(String anonRootPath) {
    this.anonRootPath = anonRootPath;
    return this;
  }

   /**
   * This option represents a directory in /ifs which vsftpd will try to change into after an anonymous login.
   * @return anonRootPath
  **/
  @ApiModelProperty(value = "This option represents a directory in /ifs which vsftpd will try to change into after an anonymous login.")
  public String getAnonRootPath() {
    return anonRootPath;
  }

  public void setAnonRootPath(String anonRootPath) {
    this.anonRootPath = anonRootPath;
  }

  public FtpSettingsExtended anonUmask(Integer anonUmask) {
    this.anonUmask = anonUmask;
    return this;
  }

   /**
   * The value that the umask for file creation is set to for anonymous users.
   * minimum: 0
   * maximum: 511
   * @return anonUmask
  **/
  @ApiModelProperty(value = "The value that the umask for file creation is set to for anonymous users.")
  public Integer getAnonUmask() {
    return anonUmask;
  }

  public void setAnonUmask(Integer anonUmask) {
    this.anonUmask = anonUmask;
  }

  public FtpSettingsExtended asciiMode(String asciiMode) {
    this.asciiMode = asciiMode;
    return this;
  }

   /**
   * Controls whether ascii mode data transfers are honored for various types of requests.
   * @return asciiMode
  **/
  @ApiModelProperty(value = "Controls whether ascii mode data transfers are honored for various types of requests.")
  public String getAsciiMode() {
    return asciiMode;
  }

  public void setAsciiMode(String asciiMode) {
    this.asciiMode = asciiMode;
  }

  public FtpSettingsExtended chrootExceptionList(List<String> chrootExceptionList) {
    this.chrootExceptionList = chrootExceptionList;
    return this;
  }

  public FtpSettingsExtended addChrootExceptionListItem(String chrootExceptionListItem) {
    if (this.chrootExceptionList == null) {
      this.chrootExceptionList = new ArrayList<String>();
    }
    this.chrootExceptionList.add(chrootExceptionListItem);
    return this;
  }

   /**
   * A list of users that are not chrooted when logging in.
   * @return chrootExceptionList
  **/
  @ApiModelProperty(value = "A list of users that are not chrooted when logging in.")
  public List<String> getChrootExceptionList() {
    return chrootExceptionList;
  }

  public void setChrootExceptionList(List<String> chrootExceptionList) {
    this.chrootExceptionList = chrootExceptionList;
  }

  public FtpSettingsExtended chrootLocalMode(String chrootLocalMode) {
    this.chrootLocalMode = chrootLocalMode;
    return this;
  }

   /**
   * If set to &#39;all&#39;, all local users will be (by default) placed in a chroot() jail in their home directory after login. If set to &#39;all-with-exceptions&#39;, all local users except those listed in the chroot exception list (isi ftp chroot-exception-list) will be placed in a chroot() jail in their home directory after login. If set to &#39;none&#39;, no local users will be chrooted by default. If set to &#39;none-with-exceptions&#39;, only the local users listed in the chroot exception list (isi ftp chroot-exception-list) will be place in a chroot() jail in their home directory after login.
   * @return chrootLocalMode
  **/
  @ApiModelProperty(value = "If set to 'all', all local users will be (by default) placed in a chroot() jail in their home directory after login. If set to 'all-with-exceptions', all local users except those listed in the chroot exception list (isi ftp chroot-exception-list) will be placed in a chroot() jail in their home directory after login. If set to 'none', no local users will be chrooted by default. If set to 'none-with-exceptions', only the local users listed in the chroot exception list (isi ftp chroot-exception-list) will be place in a chroot() jail in their home directory after login.")
  public String getChrootLocalMode() {
    return chrootLocalMode;
  }

  public void setChrootLocalMode(String chrootLocalMode) {
    this.chrootLocalMode = chrootLocalMode;
  }

  public FtpSettingsExtended connectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

   /**
   * The timeout, in seconds, for a remote client to respond to our PORT style data connection.
   * minimum: 30
   * maximum: 600
   * @return connectTimeout
  **/
  @ApiModelProperty(value = "The timeout, in seconds, for a remote client to respond to our PORT style data connection.")
  public Integer getConnectTimeout() {
    return connectTimeout;
  }

  public void setConnectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public FtpSettingsExtended dataTimeout(Integer dataTimeout) {
    this.dataTimeout = dataTimeout;
    return this;
  }

   /**
   * The timeout, in seconds, which is roughly the maximum time we permit data transfers to stall for with no progress. If the timeout triggers, the remote client is kicked off.
   * minimum: 30
   * maximum: 600
   * @return dataTimeout
  **/
  @ApiModelProperty(value = "The timeout, in seconds, which is roughly the maximum time we permit data transfers to stall for with no progress. If the timeout triggers, the remote client is kicked off.")
  public Integer getDataTimeout() {
    return dataTimeout;
  }

  public void setDataTimeout(Integer dataTimeout) {
    this.dataTimeout = dataTimeout;
  }

  public FtpSettingsExtended deniedUserList(List<String> deniedUserList) {
    this.deniedUserList = deniedUserList;
    return this;
  }

  public FtpSettingsExtended addDeniedUserListItem(String deniedUserListItem) {
    if (this.deniedUserList == null) {
      this.deniedUserList = new ArrayList<String>();
    }
    this.deniedUserList.add(deniedUserListItem);
    return this;
  }

   /**
   * A list of uses that will be denied access.
   * @return deniedUserList
  **/
  @ApiModelProperty(value = "A list of uses that will be denied access.")
  public List<String> getDeniedUserList() {
    return deniedUserList;
  }

  public void setDeniedUserList(List<String> deniedUserList) {
    this.deniedUserList = deniedUserList;
  }

  public FtpSettingsExtended dirlistLocaltime(Boolean dirlistLocaltime) {
    this.dirlistLocaltime = dirlistLocaltime;
    return this;
  }

   /**
   * If enabled, display directory listings with the time in your local time zone. The default is to display GMT. The times returned by the MDTM FTP command are also affected by this option.
   * @return dirlistLocaltime
  **/
  @ApiModelProperty(value = "If enabled, display directory listings with the time in your local time zone. The default is to display GMT. The times returned by the MDTM FTP command are also affected by this option.")
  public Boolean isDirlistLocaltime() {
    return dirlistLocaltime;
  }

  public void setDirlistLocaltime(Boolean dirlistLocaltime) {
    this.dirlistLocaltime = dirlistLocaltime;
  }

  public FtpSettingsExtended dirlistNames(String dirlistNames) {
    this.dirlistNames = dirlistNames;
    return this;
  }

   /**
   * When set to &#39;hide&#39;,  all user and group information in directory listings will be displayed as &#39;ftp&#39;. When set to &#39;textual&#39;, textual names are shown in the user and group fields of directory listings. When set to &#39;numeric&#39;, numeric IDs are show in the user and group fields of directory listings.
   * @return dirlistNames
  **/
  @ApiModelProperty(value = "When set to 'hide',  all user and group information in directory listings will be displayed as 'ftp'. When set to 'textual', textual names are shown in the user and group fields of directory listings. When set to 'numeric', numeric IDs are show in the user and group fields of directory listings.")
  public String getDirlistNames() {
    return dirlistNames;
  }

  public void setDirlistNames(String dirlistNames) {
    this.dirlistNames = dirlistNames;
  }

  public FtpSettingsExtended fileCreatePerm(Integer fileCreatePerm) {
    this.fileCreatePerm = fileCreatePerm;
    return this;
  }

   /**
   * The permissions with which uploaded files are created. Umasks are applied on top of this value.
   * minimum: 0
   * maximum: 511
   * @return fileCreatePerm
  **/
  @ApiModelProperty(value = "The permissions with which uploaded files are created. Umasks are applied on top of this value.")
  public Integer getFileCreatePerm() {
    return fileCreatePerm;
  }

  public void setFileCreatePerm(Integer fileCreatePerm) {
    this.fileCreatePerm = fileCreatePerm;
  }

  public FtpSettingsExtended limitAnonPasswords(Boolean limitAnonPasswords) {
    this.limitAnonPasswords = limitAnonPasswords;
    return this;
  }

   /**
   * This field determines whether the anon_password_list is used.
   * @return limitAnonPasswords
  **/
  @ApiModelProperty(value = "This field determines whether the anon_password_list is used.")
  public Boolean isLimitAnonPasswords() {
    return limitAnonPasswords;
  }

  public void setLimitAnonPasswords(Boolean limitAnonPasswords) {
    this.limitAnonPasswords = limitAnonPasswords;
  }

  public FtpSettingsExtended localRootPath(String localRootPath) {
    this.localRootPath = localRootPath;
    return this;
  }

   /**
   * This option represents a directory in /ifs which vsftpd will try to change into after a local login.
   * @return localRootPath
  **/
  @ApiModelProperty(value = "This option represents a directory in /ifs which vsftpd will try to change into after a local login.")
  public String getLocalRootPath() {
    return localRootPath;
  }

  public void setLocalRootPath(String localRootPath) {
    this.localRootPath = localRootPath;
  }

  public FtpSettingsExtended localUmask(Integer localUmask) {
    this.localUmask = localUmask;
    return this;
  }

   /**
   * The value that the umask for file creation is set to for local users.
   * minimum: 0
   * maximum: 511
   * @return localUmask
  **/
  @ApiModelProperty(value = "The value that the umask for file creation is set to for local users.")
  public Integer getLocalUmask() {
    return localUmask;
  }

  public void setLocalUmask(Integer localUmask) {
    this.localUmask = localUmask;
  }

  public FtpSettingsExtended serverToServer(Boolean serverToServer) {
    this.serverToServer = serverToServer;
    return this;
  }

   /**
   * If enabled, allow server-to-server (FXP) transfers.
   * @return serverToServer
  **/
  @ApiModelProperty(value = "If enabled, allow server-to-server (FXP) transfers.")
  public Boolean isServerToServer() {
    return serverToServer;
  }

  public void setServerToServer(Boolean serverToServer) {
    this.serverToServer = serverToServer;
  }

  public FtpSettingsExtended service(Boolean service) {
    this.service = service;
    return this;
  }

   /**
   * This field controls whether the FTP daemon is running.
   * @return service
  **/
  @ApiModelProperty(value = "This field controls whether the FTP daemon is running.")
  public Boolean isService() {
    return service;
  }

  public void setService(Boolean service) {
    this.service = service;
  }

  public FtpSettingsExtended sessionSupport(Boolean sessionSupport) {
    this.sessionSupport = sessionSupport;
    return this;
  }

   /**
   * If enabled, maintain login sessions for each user through Pluggable Authentication Modules (PAM). Disabling this option prevents the ability to do automatic home directory creation if that functionality were otherwise available.
   * @return sessionSupport
  **/
  @ApiModelProperty(value = "If enabled, maintain login sessions for each user through Pluggable Authentication Modules (PAM). Disabling this option prevents the ability to do automatic home directory creation if that functionality were otherwise available.")
  public Boolean isSessionSupport() {
    return sessionSupport;
  }

  public void setSessionSupport(Boolean sessionSupport) {
    this.sessionSupport = sessionSupport;
  }

  public FtpSettingsExtended sessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
    return this;
  }

   /**
   * The timeout, in seconds, which is roughly the maximum time we permit data transfers to stall for with no progress. If the timeout triggers, the remote client is kicked off.
   * minimum: 30
   * maximum: 600
   * @return sessionTimeout
  **/
  @ApiModelProperty(value = "The timeout, in seconds, which is roughly the maximum time we permit data transfers to stall for with no progress. If the timeout triggers, the remote client is kicked off.")
  public Integer getSessionTimeout() {
    return sessionTimeout;
  }

  public void setSessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  public FtpSettingsExtended userConfigDir(String userConfigDir) {
    this.userConfigDir = userConfigDir;
    return this;
  }

   /**
   * Specifies the directory where per-user config overrides can be found.
   * @return userConfigDir
  **/
  @ApiModelProperty(value = "Specifies the directory where per-user config overrides can be found.")
  public String getUserConfigDir() {
    return userConfigDir;
  }

  public void setUserConfigDir(String userConfigDir) {
    this.userConfigDir = userConfigDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FtpSettingsExtended ftpSettingsExtended = (FtpSettingsExtended) o;
    return Objects.equals(this.acceptTimeout, ftpSettingsExtended.acceptTimeout) &&
        Objects.equals(this.allowAnonAccess, ftpSettingsExtended.allowAnonAccess) &&
        Objects.equals(this.allowAnonUpload, ftpSettingsExtended.allowAnonUpload) &&
        Objects.equals(this.allowDirlists, ftpSettingsExtended.allowDirlists) &&
        Objects.equals(this.allowDownloads, ftpSettingsExtended.allowDownloads) &&
        Objects.equals(this.allowLocalAccess, ftpSettingsExtended.allowLocalAccess) &&
        Objects.equals(this.allowWrites, ftpSettingsExtended.allowWrites) &&
        Objects.equals(this.alwaysChdirHomedir, ftpSettingsExtended.alwaysChdirHomedir) &&
        Objects.equals(this.anonChownUsername, ftpSettingsExtended.anonChownUsername) &&
        Objects.equals(this.anonPasswordList, ftpSettingsExtended.anonPasswordList) &&
        Objects.equals(this.anonRootPath, ftpSettingsExtended.anonRootPath) &&
        Objects.equals(this.anonUmask, ftpSettingsExtended.anonUmask) &&
        Objects.equals(this.asciiMode, ftpSettingsExtended.asciiMode) &&
        Objects.equals(this.chrootExceptionList, ftpSettingsExtended.chrootExceptionList) &&
        Objects.equals(this.chrootLocalMode, ftpSettingsExtended.chrootLocalMode) &&
        Objects.equals(this.connectTimeout, ftpSettingsExtended.connectTimeout) &&
        Objects.equals(this.dataTimeout, ftpSettingsExtended.dataTimeout) &&
        Objects.equals(this.deniedUserList, ftpSettingsExtended.deniedUserList) &&
        Objects.equals(this.dirlistLocaltime, ftpSettingsExtended.dirlistLocaltime) &&
        Objects.equals(this.dirlistNames, ftpSettingsExtended.dirlistNames) &&
        Objects.equals(this.fileCreatePerm, ftpSettingsExtended.fileCreatePerm) &&
        Objects.equals(this.limitAnonPasswords, ftpSettingsExtended.limitAnonPasswords) &&
        Objects.equals(this.localRootPath, ftpSettingsExtended.localRootPath) &&
        Objects.equals(this.localUmask, ftpSettingsExtended.localUmask) &&
        Objects.equals(this.serverToServer, ftpSettingsExtended.serverToServer) &&
        Objects.equals(this.service, ftpSettingsExtended.service) &&
        Objects.equals(this.sessionSupport, ftpSettingsExtended.sessionSupport) &&
        Objects.equals(this.sessionTimeout, ftpSettingsExtended.sessionTimeout) &&
        Objects.equals(this.userConfigDir, ftpSettingsExtended.userConfigDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptTimeout, allowAnonAccess, allowAnonUpload, allowDirlists, allowDownloads, allowLocalAccess, allowWrites, alwaysChdirHomedir, anonChownUsername, anonPasswordList, anonRootPath, anonUmask, asciiMode, chrootExceptionList, chrootLocalMode, connectTimeout, dataTimeout, deniedUserList, dirlistLocaltime, dirlistNames, fileCreatePerm, limitAnonPasswords, localRootPath, localUmask, serverToServer, service, sessionSupport, sessionTimeout, userConfigDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtpSettingsExtended {\n");
    
    sb.append("    acceptTimeout: ").append(toIndentedString(acceptTimeout)).append("\n");
    sb.append("    allowAnonAccess: ").append(toIndentedString(allowAnonAccess)).append("\n");
    sb.append("    allowAnonUpload: ").append(toIndentedString(allowAnonUpload)).append("\n");
    sb.append("    allowDirlists: ").append(toIndentedString(allowDirlists)).append("\n");
    sb.append("    allowDownloads: ").append(toIndentedString(allowDownloads)).append("\n");
    sb.append("    allowLocalAccess: ").append(toIndentedString(allowLocalAccess)).append("\n");
    sb.append("    allowWrites: ").append(toIndentedString(allowWrites)).append("\n");
    sb.append("    alwaysChdirHomedir: ").append(toIndentedString(alwaysChdirHomedir)).append("\n");
    sb.append("    anonChownUsername: ").append(toIndentedString(anonChownUsername)).append("\n");
    sb.append("    anonPasswordList: ").append(toIndentedString(anonPasswordList)).append("\n");
    sb.append("    anonRootPath: ").append(toIndentedString(anonRootPath)).append("\n");
    sb.append("    anonUmask: ").append(toIndentedString(anonUmask)).append("\n");
    sb.append("    asciiMode: ").append(toIndentedString(asciiMode)).append("\n");
    sb.append("    chrootExceptionList: ").append(toIndentedString(chrootExceptionList)).append("\n");
    sb.append("    chrootLocalMode: ").append(toIndentedString(chrootLocalMode)).append("\n");
    sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
    sb.append("    dataTimeout: ").append(toIndentedString(dataTimeout)).append("\n");
    sb.append("    deniedUserList: ").append(toIndentedString(deniedUserList)).append("\n");
    sb.append("    dirlistLocaltime: ").append(toIndentedString(dirlistLocaltime)).append("\n");
    sb.append("    dirlistNames: ").append(toIndentedString(dirlistNames)).append("\n");
    sb.append("    fileCreatePerm: ").append(toIndentedString(fileCreatePerm)).append("\n");
    sb.append("    limitAnonPasswords: ").append(toIndentedString(limitAnonPasswords)).append("\n");
    sb.append("    localRootPath: ").append(toIndentedString(localRootPath)).append("\n");
    sb.append("    localUmask: ").append(toIndentedString(localUmask)).append("\n");
    sb.append("    serverToServer: ").append(toIndentedString(serverToServer)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sessionSupport: ").append(toIndentedString(sessionSupport)).append("\n");
    sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
    sb.append("    userConfigDir: ").append(toIndentedString(userConfigDir)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

