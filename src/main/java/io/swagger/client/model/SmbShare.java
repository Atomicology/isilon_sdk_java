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
import io.swagger.client.model.AuthAccessAccessItemFileGroup;
import io.swagger.client.model.SmbSharePermission;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmbShare
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SmbShare {
  @SerializedName("access_based_enumeration")
  private Boolean accessBasedEnumeration = null;

  @SerializedName("access_based_enumeration_root_only")
  private Boolean accessBasedEnumerationRootOnly = null;

  @SerializedName("allow_delete_readonly")
  private Boolean allowDeleteReadonly = null;

  @SerializedName("allow_execute_always")
  private Boolean allowExecuteAlways = null;

  @SerializedName("allow_variable_expansion")
  private Boolean allowVariableExpansion = null;

  @SerializedName("auto_create_directory")
  private Boolean autoCreateDirectory = null;

  @SerializedName("browsable")
  private Boolean browsable = null;

  @SerializedName("ca_timeout")
  private Integer caTimeout = null;

  @SerializedName("ca_write_integrity")
  private String caWriteIntegrity = null;

  @SerializedName("change_notify")
  private String changeNotify = null;

  @SerializedName("create_permissions")
  private String createPermissions = null;

  @SerializedName("csc_policy")
  private String cscPolicy = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("directory_create_mask")
  private Integer directoryCreateMask = null;

  @SerializedName("directory_create_mode")
  private Integer directoryCreateMode = null;

  @SerializedName("file_create_mask")
  private Integer fileCreateMask = null;

  @SerializedName("file_create_mode")
  private Integer fileCreateMode = null;

  @SerializedName("file_filter_extensions")
  private List<String> fileFilterExtensions = null;

  @SerializedName("file_filter_type")
  private String fileFilterType = null;

  @SerializedName("file_filtering_enabled")
  private Boolean fileFilteringEnabled = null;

  @SerializedName("hide_dot_files")
  private Boolean hideDotFiles = null;

  @SerializedName("host_acl")
  private List<String> hostAcl = null;

  @SerializedName("impersonate_guest")
  private String impersonateGuest = null;

  @SerializedName("impersonate_user")
  private String impersonateUser = null;

  @SerializedName("inheritable_path_acl")
  private Boolean inheritablePathAcl = null;

  @SerializedName("mangle_byte_start")
  private Integer mangleByteStart = null;

  @SerializedName("mangle_map")
  private List<String> mangleMap = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ntfs_acl_support")
  private Boolean ntfsAclSupport = null;

  @SerializedName("oplocks")
  private Boolean oplocks = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("permissions")
  private List<SmbSharePermission> permissions = null;

  @SerializedName("run_as_root")
  private List<AuthAccessAccessItemFileGroup> runAsRoot = null;

  @SerializedName("strict_ca_lockout")
  private Boolean strictCaLockout = null;

  @SerializedName("strict_flush")
  private Boolean strictFlush = null;

  @SerializedName("strict_locking")
  private Boolean strictLocking = null;

  @SerializedName("zone")
  private String zone = null;

  public SmbShare accessBasedEnumeration(Boolean accessBasedEnumeration) {
    this.accessBasedEnumeration = accessBasedEnumeration;
    return this;
  }

   /**
   * Only enumerate files and folders the requesting user has access to.
   * @return accessBasedEnumeration
  **/
  @ApiModelProperty(value = "Only enumerate files and folders the requesting user has access to.")
  public Boolean isAccessBasedEnumeration() {
    return accessBasedEnumeration;
  }

  public void setAccessBasedEnumeration(Boolean accessBasedEnumeration) {
    this.accessBasedEnumeration = accessBasedEnumeration;
  }

  public SmbShare accessBasedEnumerationRootOnly(Boolean accessBasedEnumerationRootOnly) {
    this.accessBasedEnumerationRootOnly = accessBasedEnumerationRootOnly;
    return this;
  }

   /**
   * Access-based enumeration on only the root directory of the share.
   * @return accessBasedEnumerationRootOnly
  **/
  @ApiModelProperty(value = "Access-based enumeration on only the root directory of the share.")
  public Boolean isAccessBasedEnumerationRootOnly() {
    return accessBasedEnumerationRootOnly;
  }

  public void setAccessBasedEnumerationRootOnly(Boolean accessBasedEnumerationRootOnly) {
    this.accessBasedEnumerationRootOnly = accessBasedEnumerationRootOnly;
  }

  public SmbShare allowDeleteReadonly(Boolean allowDeleteReadonly) {
    this.allowDeleteReadonly = allowDeleteReadonly;
    return this;
  }

   /**
   * Allow deletion of read-only files in the share.
   * @return allowDeleteReadonly
  **/
  @ApiModelProperty(value = "Allow deletion of read-only files in the share.")
  public Boolean isAllowDeleteReadonly() {
    return allowDeleteReadonly;
  }

  public void setAllowDeleteReadonly(Boolean allowDeleteReadonly) {
    this.allowDeleteReadonly = allowDeleteReadonly;
  }

  public SmbShare allowExecuteAlways(Boolean allowExecuteAlways) {
    this.allowExecuteAlways = allowExecuteAlways;
    return this;
  }

   /**
   * Allows users to execute files they have read rights for.
   * @return allowExecuteAlways
  **/
  @ApiModelProperty(value = "Allows users to execute files they have read rights for.")
  public Boolean isAllowExecuteAlways() {
    return allowExecuteAlways;
  }

  public void setAllowExecuteAlways(Boolean allowExecuteAlways) {
    this.allowExecuteAlways = allowExecuteAlways;
  }

  public SmbShare allowVariableExpansion(Boolean allowVariableExpansion) {
    this.allowVariableExpansion = allowVariableExpansion;
    return this;
  }

   /**
   * Allow automatic expansion of variables for home directories.
   * @return allowVariableExpansion
  **/
  @ApiModelProperty(value = "Allow automatic expansion of variables for home directories.")
  public Boolean isAllowVariableExpansion() {
    return allowVariableExpansion;
  }

  public void setAllowVariableExpansion(Boolean allowVariableExpansion) {
    this.allowVariableExpansion = allowVariableExpansion;
  }

  public SmbShare autoCreateDirectory(Boolean autoCreateDirectory) {
    this.autoCreateDirectory = autoCreateDirectory;
    return this;
  }

   /**
   * Automatically create home directories.
   * @return autoCreateDirectory
  **/
  @ApiModelProperty(value = "Automatically create home directories.")
  public Boolean isAutoCreateDirectory() {
    return autoCreateDirectory;
  }

  public void setAutoCreateDirectory(Boolean autoCreateDirectory) {
    this.autoCreateDirectory = autoCreateDirectory;
  }

  public SmbShare browsable(Boolean browsable) {
    this.browsable = browsable;
    return this;
  }

   /**
   * Share is visible in net view and the browse list.
   * @return browsable
  **/
  @ApiModelProperty(value = "Share is visible in net view and the browse list.")
  public Boolean isBrowsable() {
    return browsable;
  }

  public void setBrowsable(Boolean browsable) {
    this.browsable = browsable;
  }

  public SmbShare caTimeout(Integer caTimeout) {
    this.caTimeout = caTimeout;
    return this;
  }

   /**
   * Persistent open timeout for the share.
   * minimum: 2
   * @return caTimeout
  **/
  @ApiModelProperty(value = "Persistent open timeout for the share.")
  public Integer getCaTimeout() {
    return caTimeout;
  }

  public void setCaTimeout(Integer caTimeout) {
    this.caTimeout = caTimeout;
  }

  public SmbShare caWriteIntegrity(String caWriteIntegrity) {
    this.caWriteIntegrity = caWriteIntegrity;
    return this;
  }

   /**
   * Specify the level of write-integrity on continuously available shares.
   * @return caWriteIntegrity
  **/
  @ApiModelProperty(value = "Specify the level of write-integrity on continuously available shares.")
  public String getCaWriteIntegrity() {
    return caWriteIntegrity;
  }

  public void setCaWriteIntegrity(String caWriteIntegrity) {
    this.caWriteIntegrity = caWriteIntegrity;
  }

  public SmbShare changeNotify(String changeNotify) {
    this.changeNotify = changeNotify;
    return this;
  }

   /**
   * Level of change notification alerts on the share.
   * @return changeNotify
  **/
  @ApiModelProperty(value = "Level of change notification alerts on the share.")
  public String getChangeNotify() {
    return changeNotify;
  }

  public void setChangeNotify(String changeNotify) {
    this.changeNotify = changeNotify;
  }

  public SmbShare createPermissions(String createPermissions) {
    this.createPermissions = createPermissions;
    return this;
  }

   /**
   * Create permissions for new files and directories in share.
   * @return createPermissions
  **/
  @ApiModelProperty(value = "Create permissions for new files and directories in share.")
  public String getCreatePermissions() {
    return createPermissions;
  }

  public void setCreatePermissions(String createPermissions) {
    this.createPermissions = createPermissions;
  }

  public SmbShare cscPolicy(String cscPolicy) {
    this.cscPolicy = cscPolicy;
    return this;
  }

   /**
   * Client-side caching policy for the shares.
   * @return cscPolicy
  **/
  @ApiModelProperty(value = "Client-side caching policy for the shares.")
  public String getCscPolicy() {
    return cscPolicy;
  }

  public void setCscPolicy(String cscPolicy) {
    this.cscPolicy = cscPolicy;
  }

  public SmbShare description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for this SMB share.
   * @return description
  **/
  @ApiModelProperty(value = "Description for this SMB share.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SmbShare directoryCreateMask(Integer directoryCreateMask) {
    this.directoryCreateMask = directoryCreateMask;
    return this;
  }

   /**
   * Directory create mask bits.
   * @return directoryCreateMask
  **/
  @ApiModelProperty(value = "Directory create mask bits.")
  public Integer getDirectoryCreateMask() {
    return directoryCreateMask;
  }

  public void setDirectoryCreateMask(Integer directoryCreateMask) {
    this.directoryCreateMask = directoryCreateMask;
  }

  public SmbShare directoryCreateMode(Integer directoryCreateMode) {
    this.directoryCreateMode = directoryCreateMode;
    return this;
  }

   /**
   * Directory create mode bits.
   * @return directoryCreateMode
  **/
  @ApiModelProperty(value = "Directory create mode bits.")
  public Integer getDirectoryCreateMode() {
    return directoryCreateMode;
  }

  public void setDirectoryCreateMode(Integer directoryCreateMode) {
    this.directoryCreateMode = directoryCreateMode;
  }

  public SmbShare fileCreateMask(Integer fileCreateMask) {
    this.fileCreateMask = fileCreateMask;
    return this;
  }

   /**
   * File create mask bits.
   * @return fileCreateMask
  **/
  @ApiModelProperty(value = "File create mask bits.")
  public Integer getFileCreateMask() {
    return fileCreateMask;
  }

  public void setFileCreateMask(Integer fileCreateMask) {
    this.fileCreateMask = fileCreateMask;
  }

  public SmbShare fileCreateMode(Integer fileCreateMode) {
    this.fileCreateMode = fileCreateMode;
    return this;
  }

   /**
   * File create mode bits.
   * @return fileCreateMode
  **/
  @ApiModelProperty(value = "File create mode bits.")
  public Integer getFileCreateMode() {
    return fileCreateMode;
  }

  public void setFileCreateMode(Integer fileCreateMode) {
    this.fileCreateMode = fileCreateMode;
  }

  public SmbShare fileFilterExtensions(List<String> fileFilterExtensions) {
    this.fileFilterExtensions = fileFilterExtensions;
    return this;
  }

  public SmbShare addFileFilterExtensionsItem(String fileFilterExtensionsItem) {
    if (this.fileFilterExtensions == null) {
      this.fileFilterExtensions = new ArrayList<String>();
    }
    this.fileFilterExtensions.add(fileFilterExtensionsItem);
    return this;
  }

   /**
   * Specifies the list of file extensions.
   * @return fileFilterExtensions
  **/
  @ApiModelProperty(value = "Specifies the list of file extensions.")
  public List<String> getFileFilterExtensions() {
    return fileFilterExtensions;
  }

  public void setFileFilterExtensions(List<String> fileFilterExtensions) {
    this.fileFilterExtensions = fileFilterExtensions;
  }

  public SmbShare fileFilterType(String fileFilterType) {
    this.fileFilterType = fileFilterType;
    return this;
  }

   /**
   * Specifies if filter list is for deny or allow. Default is deny.
   * @return fileFilterType
  **/
  @ApiModelProperty(value = "Specifies if filter list is for deny or allow. Default is deny.")
  public String getFileFilterType() {
    return fileFilterType;
  }

  public void setFileFilterType(String fileFilterType) {
    this.fileFilterType = fileFilterType;
  }

  public SmbShare fileFilteringEnabled(Boolean fileFilteringEnabled) {
    this.fileFilteringEnabled = fileFilteringEnabled;
    return this;
  }

   /**
   * Enables file filtering on this zone.
   * @return fileFilteringEnabled
  **/
  @ApiModelProperty(value = "Enables file filtering on this zone.")
  public Boolean isFileFilteringEnabled() {
    return fileFilteringEnabled;
  }

  public void setFileFilteringEnabled(Boolean fileFilteringEnabled) {
    this.fileFilteringEnabled = fileFilteringEnabled;
  }

  public SmbShare hideDotFiles(Boolean hideDotFiles) {
    this.hideDotFiles = hideDotFiles;
    return this;
  }

   /**
   * Hide files and directories that begin with a period &#39;.&#39;.
   * @return hideDotFiles
  **/
  @ApiModelProperty(value = "Hide files and directories that begin with a period '.'.")
  public Boolean isHideDotFiles() {
    return hideDotFiles;
  }

  public void setHideDotFiles(Boolean hideDotFiles) {
    this.hideDotFiles = hideDotFiles;
  }

  public SmbShare hostAcl(List<String> hostAcl) {
    this.hostAcl = hostAcl;
    return this;
  }

  public SmbShare addHostAclItem(String hostAclItem) {
    if (this.hostAcl == null) {
      this.hostAcl = new ArrayList<String>();
    }
    this.hostAcl.add(hostAclItem);
    return this;
  }

   /**
   * An ACL expressing which hosts are allowed access. A deny clause must be the final entry.
   * @return hostAcl
  **/
  @ApiModelProperty(value = "An ACL expressing which hosts are allowed access. A deny clause must be the final entry.")
  public List<String> getHostAcl() {
    return hostAcl;
  }

  public void setHostAcl(List<String> hostAcl) {
    this.hostAcl = hostAcl;
  }

  public SmbShare impersonateGuest(String impersonateGuest) {
    this.impersonateGuest = impersonateGuest;
    return this;
  }

   /**
   * Specify the condition in which user access is done as the guest account.
   * @return impersonateGuest
  **/
  @ApiModelProperty(value = "Specify the condition in which user access is done as the guest account.")
  public String getImpersonateGuest() {
    return impersonateGuest;
  }

  public void setImpersonateGuest(String impersonateGuest) {
    this.impersonateGuest = impersonateGuest;
  }

  public SmbShare impersonateUser(String impersonateUser) {
    this.impersonateUser = impersonateUser;
    return this;
  }

   /**
   * User account to be used as guest account.
   * @return impersonateUser
  **/
  @ApiModelProperty(value = "User account to be used as guest account.")
  public String getImpersonateUser() {
    return impersonateUser;
  }

  public void setImpersonateUser(String impersonateUser) {
    this.impersonateUser = impersonateUser;
  }

  public SmbShare inheritablePathAcl(Boolean inheritablePathAcl) {
    this.inheritablePathAcl = inheritablePathAcl;
    return this;
  }

   /**
   * Set the inheritable ACL on the share path.
   * @return inheritablePathAcl
  **/
  @ApiModelProperty(value = "Set the inheritable ACL on the share path.")
  public Boolean isInheritablePathAcl() {
    return inheritablePathAcl;
  }

  public void setInheritablePathAcl(Boolean inheritablePathAcl) {
    this.inheritablePathAcl = inheritablePathAcl;
  }

  public SmbShare mangleByteStart(Integer mangleByteStart) {
    this.mangleByteStart = mangleByteStart;
    return this;
  }

   /**
   * Specifies the wchar_t starting point for automatic byte mangling.
   * @return mangleByteStart
  **/
  @ApiModelProperty(value = "Specifies the wchar_t starting point for automatic byte mangling.")
  public Integer getMangleByteStart() {
    return mangleByteStart;
  }

  public void setMangleByteStart(Integer mangleByteStart) {
    this.mangleByteStart = mangleByteStart;
  }

  public SmbShare mangleMap(List<String> mangleMap) {
    this.mangleMap = mangleMap;
    return this;
  }

  public SmbShare addMangleMapItem(String mangleMapItem) {
    if (this.mangleMap == null) {
      this.mangleMap = new ArrayList<String>();
    }
    this.mangleMap.add(mangleMapItem);
    return this;
  }

   /**
   * Character mangle map.
   * @return mangleMap
  **/
  @ApiModelProperty(value = "Character mangle map.")
  public List<String> getMangleMap() {
    return mangleMap;
  }

  public void setMangleMap(List<String> mangleMap) {
    this.mangleMap = mangleMap;
  }

  public SmbShare name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Share name.
   * @return name
  **/
  @ApiModelProperty(value = "Share name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SmbShare ntfsAclSupport(Boolean ntfsAclSupport) {
    this.ntfsAclSupport = ntfsAclSupport;
    return this;
  }

   /**
   * Support NTFS ACLs on files and directories.
   * @return ntfsAclSupport
  **/
  @ApiModelProperty(value = "Support NTFS ACLs on files and directories.")
  public Boolean isNtfsAclSupport() {
    return ntfsAclSupport;
  }

  public void setNtfsAclSupport(Boolean ntfsAclSupport) {
    this.ntfsAclSupport = ntfsAclSupport;
  }

  public SmbShare oplocks(Boolean oplocks) {
    this.oplocks = oplocks;
    return this;
  }

   /**
   * Support oplocks.
   * @return oplocks
  **/
  @ApiModelProperty(value = "Support oplocks.")
  public Boolean isOplocks() {
    return oplocks;
  }

  public void setOplocks(Boolean oplocks) {
    this.oplocks = oplocks;
  }

  public SmbShare path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of share within /ifs.
   * @return path
  **/
  @ApiModelProperty(value = "Path of share within /ifs.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public SmbShare permissions(List<SmbSharePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public SmbShare addPermissionsItem(SmbSharePermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<SmbSharePermission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Specifies an ordered list of permission modifications.
   * @return permissions
  **/
  @ApiModelProperty(value = "Specifies an ordered list of permission modifications.")
  public List<SmbSharePermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<SmbSharePermission> permissions) {
    this.permissions = permissions;
  }

  public SmbShare runAsRoot(List<AuthAccessAccessItemFileGroup> runAsRoot) {
    this.runAsRoot = runAsRoot;
    return this;
  }

  public SmbShare addRunAsRootItem(AuthAccessAccessItemFileGroup runAsRootItem) {
    if (this.runAsRoot == null) {
      this.runAsRoot = new ArrayList<AuthAccessAccessItemFileGroup>();
    }
    this.runAsRoot.add(runAsRootItem);
    return this;
  }

   /**
   * Allow account to run as root.
   * @return runAsRoot
  **/
  @ApiModelProperty(value = "Allow account to run as root.")
  public List<AuthAccessAccessItemFileGroup> getRunAsRoot() {
    return runAsRoot;
  }

  public void setRunAsRoot(List<AuthAccessAccessItemFileGroup> runAsRoot) {
    this.runAsRoot = runAsRoot;
  }

  public SmbShare strictCaLockout(Boolean strictCaLockout) {
    this.strictCaLockout = strictCaLockout;
    return this;
  }

   /**
   * Specifies if persistent opens would do strict lockout on the share.
   * @return strictCaLockout
  **/
  @ApiModelProperty(value = "Specifies if persistent opens would do strict lockout on the share.")
  public Boolean isStrictCaLockout() {
    return strictCaLockout;
  }

  public void setStrictCaLockout(Boolean strictCaLockout) {
    this.strictCaLockout = strictCaLockout;
  }

  public SmbShare strictFlush(Boolean strictFlush) {
    this.strictFlush = strictFlush;
    return this;
  }

   /**
   * Handle SMB flush operations.
   * @return strictFlush
  **/
  @ApiModelProperty(value = "Handle SMB flush operations.")
  public Boolean isStrictFlush() {
    return strictFlush;
  }

  public void setStrictFlush(Boolean strictFlush) {
    this.strictFlush = strictFlush;
  }

  public SmbShare strictLocking(Boolean strictLocking) {
    this.strictLocking = strictLocking;
    return this;
  }

   /**
   * Specifies whether byte range locks contend against SMB I/O.
   * @return strictLocking
  **/
  @ApiModelProperty(value = "Specifies whether byte range locks contend against SMB I/O.")
  public Boolean isStrictLocking() {
    return strictLocking;
  }

  public void setStrictLocking(Boolean strictLocking) {
    this.strictLocking = strictLocking;
  }

  public SmbShare zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Name of the access zone to which to move this SMB share
   * @return zone
  **/
  @ApiModelProperty(value = "Name of the access zone to which to move this SMB share")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmbShare smbShare = (SmbShare) o;
    return Objects.equals(this.accessBasedEnumeration, smbShare.accessBasedEnumeration) &&
        Objects.equals(this.accessBasedEnumerationRootOnly, smbShare.accessBasedEnumerationRootOnly) &&
        Objects.equals(this.allowDeleteReadonly, smbShare.allowDeleteReadonly) &&
        Objects.equals(this.allowExecuteAlways, smbShare.allowExecuteAlways) &&
        Objects.equals(this.allowVariableExpansion, smbShare.allowVariableExpansion) &&
        Objects.equals(this.autoCreateDirectory, smbShare.autoCreateDirectory) &&
        Objects.equals(this.browsable, smbShare.browsable) &&
        Objects.equals(this.caTimeout, smbShare.caTimeout) &&
        Objects.equals(this.caWriteIntegrity, smbShare.caWriteIntegrity) &&
        Objects.equals(this.changeNotify, smbShare.changeNotify) &&
        Objects.equals(this.createPermissions, smbShare.createPermissions) &&
        Objects.equals(this.cscPolicy, smbShare.cscPolicy) &&
        Objects.equals(this.description, smbShare.description) &&
        Objects.equals(this.directoryCreateMask, smbShare.directoryCreateMask) &&
        Objects.equals(this.directoryCreateMode, smbShare.directoryCreateMode) &&
        Objects.equals(this.fileCreateMask, smbShare.fileCreateMask) &&
        Objects.equals(this.fileCreateMode, smbShare.fileCreateMode) &&
        Objects.equals(this.fileFilterExtensions, smbShare.fileFilterExtensions) &&
        Objects.equals(this.fileFilterType, smbShare.fileFilterType) &&
        Objects.equals(this.fileFilteringEnabled, smbShare.fileFilteringEnabled) &&
        Objects.equals(this.hideDotFiles, smbShare.hideDotFiles) &&
        Objects.equals(this.hostAcl, smbShare.hostAcl) &&
        Objects.equals(this.impersonateGuest, smbShare.impersonateGuest) &&
        Objects.equals(this.impersonateUser, smbShare.impersonateUser) &&
        Objects.equals(this.inheritablePathAcl, smbShare.inheritablePathAcl) &&
        Objects.equals(this.mangleByteStart, smbShare.mangleByteStart) &&
        Objects.equals(this.mangleMap, smbShare.mangleMap) &&
        Objects.equals(this.name, smbShare.name) &&
        Objects.equals(this.ntfsAclSupport, smbShare.ntfsAclSupport) &&
        Objects.equals(this.oplocks, smbShare.oplocks) &&
        Objects.equals(this.path, smbShare.path) &&
        Objects.equals(this.permissions, smbShare.permissions) &&
        Objects.equals(this.runAsRoot, smbShare.runAsRoot) &&
        Objects.equals(this.strictCaLockout, smbShare.strictCaLockout) &&
        Objects.equals(this.strictFlush, smbShare.strictFlush) &&
        Objects.equals(this.strictLocking, smbShare.strictLocking) &&
        Objects.equals(this.zone, smbShare.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessBasedEnumeration, accessBasedEnumerationRootOnly, allowDeleteReadonly, allowExecuteAlways, allowVariableExpansion, autoCreateDirectory, browsable, caTimeout, caWriteIntegrity, changeNotify, createPermissions, cscPolicy, description, directoryCreateMask, directoryCreateMode, fileCreateMask, fileCreateMode, fileFilterExtensions, fileFilterType, fileFilteringEnabled, hideDotFiles, hostAcl, impersonateGuest, impersonateUser, inheritablePathAcl, mangleByteStart, mangleMap, name, ntfsAclSupport, oplocks, path, permissions, runAsRoot, strictCaLockout, strictFlush, strictLocking, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmbShare {\n");
    
    sb.append("    accessBasedEnumeration: ").append(toIndentedString(accessBasedEnumeration)).append("\n");
    sb.append("    accessBasedEnumerationRootOnly: ").append(toIndentedString(accessBasedEnumerationRootOnly)).append("\n");
    sb.append("    allowDeleteReadonly: ").append(toIndentedString(allowDeleteReadonly)).append("\n");
    sb.append("    allowExecuteAlways: ").append(toIndentedString(allowExecuteAlways)).append("\n");
    sb.append("    allowVariableExpansion: ").append(toIndentedString(allowVariableExpansion)).append("\n");
    sb.append("    autoCreateDirectory: ").append(toIndentedString(autoCreateDirectory)).append("\n");
    sb.append("    browsable: ").append(toIndentedString(browsable)).append("\n");
    sb.append("    caTimeout: ").append(toIndentedString(caTimeout)).append("\n");
    sb.append("    caWriteIntegrity: ").append(toIndentedString(caWriteIntegrity)).append("\n");
    sb.append("    changeNotify: ").append(toIndentedString(changeNotify)).append("\n");
    sb.append("    createPermissions: ").append(toIndentedString(createPermissions)).append("\n");
    sb.append("    cscPolicy: ").append(toIndentedString(cscPolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directoryCreateMask: ").append(toIndentedString(directoryCreateMask)).append("\n");
    sb.append("    directoryCreateMode: ").append(toIndentedString(directoryCreateMode)).append("\n");
    sb.append("    fileCreateMask: ").append(toIndentedString(fileCreateMask)).append("\n");
    sb.append("    fileCreateMode: ").append(toIndentedString(fileCreateMode)).append("\n");
    sb.append("    fileFilterExtensions: ").append(toIndentedString(fileFilterExtensions)).append("\n");
    sb.append("    fileFilterType: ").append(toIndentedString(fileFilterType)).append("\n");
    sb.append("    fileFilteringEnabled: ").append(toIndentedString(fileFilteringEnabled)).append("\n");
    sb.append("    hideDotFiles: ").append(toIndentedString(hideDotFiles)).append("\n");
    sb.append("    hostAcl: ").append(toIndentedString(hostAcl)).append("\n");
    sb.append("    impersonateGuest: ").append(toIndentedString(impersonateGuest)).append("\n");
    sb.append("    impersonateUser: ").append(toIndentedString(impersonateUser)).append("\n");
    sb.append("    inheritablePathAcl: ").append(toIndentedString(inheritablePathAcl)).append("\n");
    sb.append("    mangleByteStart: ").append(toIndentedString(mangleByteStart)).append("\n");
    sb.append("    mangleMap: ").append(toIndentedString(mangleMap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ntfsAclSupport: ").append(toIndentedString(ntfsAclSupport)).append("\n");
    sb.append("    oplocks: ").append(toIndentedString(oplocks)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    runAsRoot: ").append(toIndentedString(runAsRoot)).append("\n");
    sb.append("    strictCaLockout: ").append(toIndentedString(strictCaLockout)).append("\n");
    sb.append("    strictFlush: ").append(toIndentedString(strictFlush)).append("\n");
    sb.append("    strictLocking: ").append(toIndentedString(strictLocking)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

