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
import io.swagger.client.model.NfsSettingsExportSettingsMapAll;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * NfsSettingsExportSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NfsSettingsExportSettings {
  @SerializedName("all_dirs")
  private Boolean allDirs = null;

  @SerializedName("block_size")
  private Integer blockSize = null;

  @SerializedName("can_set_time")
  private Boolean canSetTime = null;

  @SerializedName("case_insensitive")
  private Boolean caseInsensitive = null;

  @SerializedName("case_preserving")
  private Boolean casePreserving = null;

  @SerializedName("chown_restricted")
  private Boolean chownRestricted = null;

  @SerializedName("commit_asynchronous")
  private Boolean commitAsynchronous = null;

  @SerializedName("directory_transfer_size")
  private Integer directoryTransferSize = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("link_max")
  private Integer linkMax = null;

  @SerializedName("map_all")
  private NfsSettingsExportSettingsMapAll mapAll = null;

  @SerializedName("map_failure")
  private NfsSettingsExportSettingsMapAll mapFailure = null;

  @SerializedName("map_full")
  private Boolean mapFull = null;

  @SerializedName("map_lookup_uid")
  private Boolean mapLookupUid = null;

  @SerializedName("map_non_root")
  private NfsSettingsExportSettingsMapAll mapNonRoot = null;

  @SerializedName("map_retry")
  private Boolean mapRetry = null;

  @SerializedName("map_root")
  private NfsSettingsExportSettingsMapAll mapRoot = null;

  @SerializedName("max_file_size")
  private Integer maxFileSize = null;

  @SerializedName("name_max_size")
  private Integer nameMaxSize = null;

  @SerializedName("no_truncate")
  private Boolean noTruncate = null;

  @SerializedName("read_only")
  private Boolean readOnly = null;

  @SerializedName("read_transfer_max_size")
  private Integer readTransferMaxSize = null;

  @SerializedName("read_transfer_multiple")
  private Integer readTransferMultiple = null;

  @SerializedName("read_transfer_size")
  private Integer readTransferSize = null;

  @SerializedName("readdirplus")
  private Boolean readdirplus = null;

  @SerializedName("readdirplus_prefetch")
  private Integer readdirplusPrefetch = null;

  @SerializedName("return_32bit_file_ids")
  private Boolean return32bitFileIds = null;

  /**
   * Specifies the authentication types that are supported for this export.
   */
  @JsonAdapter(SecurityFlavorsEnum.Adapter.class)
  public enum SecurityFlavorsEnum {
    UNIX("unix"),
    
    KRB5("krb5"),
    
    KRB5I("krb5i"),
    
    KRB5P("krb5p");

    private String value;

    SecurityFlavorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecurityFlavorsEnum fromValue(String text) {
      for (SecurityFlavorsEnum b : SecurityFlavorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SecurityFlavorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecurityFlavorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecurityFlavorsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SecurityFlavorsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("security_flavors")
  private List<SecurityFlavorsEnum> securityFlavors = null;

  @SerializedName("setattr_asynchronous")
  private Boolean setattrAsynchronous = null;

  @SerializedName("snapshot")
  private String snapshot = null;

  @SerializedName("symlinks")
  private Boolean symlinks = null;

  @SerializedName("time_delta")
  private BigDecimal timeDelta = null;

  @SerializedName("write_datasync_action")
  private String writeDatasyncAction = null;

  @SerializedName("write_datasync_reply")
  private String writeDatasyncReply = null;

  @SerializedName("write_filesync_action")
  private String writeFilesyncAction = null;

  @SerializedName("write_filesync_reply")
  private String writeFilesyncReply = null;

  @SerializedName("write_transfer_max_size")
  private Integer writeTransferMaxSize = null;

  @SerializedName("write_transfer_multiple")
  private Integer writeTransferMultiple = null;

  @SerializedName("write_transfer_size")
  private Integer writeTransferSize = null;

  @SerializedName("write_unstable_action")
  private String writeUnstableAction = null;

  @SerializedName("write_unstable_reply")
  private String writeUnstableReply = null;

  @SerializedName("zone")
  private String zone = null;

  public NfsSettingsExportSettings allDirs(Boolean allDirs) {
    this.allDirs = allDirs;
    return this;
  }

   /**
   * True if all directories under the specified paths are mountable.
   * @return allDirs
  **/
  @ApiModelProperty(value = "True if all directories under the specified paths are mountable.")
  public Boolean isAllDirs() {
    return allDirs;
  }

  public void setAllDirs(Boolean allDirs) {
    this.allDirs = allDirs;
  }

  public NfsSettingsExportSettings blockSize(Integer blockSize) {
    this.blockSize = blockSize;
    return this;
  }

   /**
   * Specifies the block size returned by the NFS statfs procedure.
   * @return blockSize
  **/
  @ApiModelProperty(value = "Specifies the block size returned by the NFS statfs procedure.")
  public Integer getBlockSize() {
    return blockSize;
  }

  public void setBlockSize(Integer blockSize) {
    this.blockSize = blockSize;
  }

  public NfsSettingsExportSettings canSetTime(Boolean canSetTime) {
    this.canSetTime = canSetTime;
    return this;
  }

   /**
   * True if the client can set file times through the NFS set attribute request. This parameter does not affect server behavior, but is included to accommoate legacy client requirements.
   * @return canSetTime
  **/
  @ApiModelProperty(value = "True if the client can set file times through the NFS set attribute request. This parameter does not affect server behavior, but is included to accommoate legacy client requirements.")
  public Boolean isCanSetTime() {
    return canSetTime;
  }

  public void setCanSetTime(Boolean canSetTime) {
    this.canSetTime = canSetTime;
  }

  public NfsSettingsExportSettings caseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
    return this;
  }

   /**
   * True if the case is ignored for file names. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.
   * @return caseInsensitive
  **/
  @ApiModelProperty(value = "True if the case is ignored for file names. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.")
  public Boolean isCaseInsensitive() {
    return caseInsensitive;
  }

  public void setCaseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
  }

  public NfsSettingsExportSettings casePreserving(Boolean casePreserving) {
    this.casePreserving = casePreserving;
    return this;
  }

   /**
   * True if the case is preserved for file names. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.
   * @return casePreserving
  **/
  @ApiModelProperty(value = "True if the case is preserved for file names. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.")
  public Boolean isCasePreserving() {
    return casePreserving;
  }

  public void setCasePreserving(Boolean casePreserving) {
    this.casePreserving = casePreserving;
  }

  public NfsSettingsExportSettings chownRestricted(Boolean chownRestricted) {
    this.chownRestricted = chownRestricted;
    return this;
  }

   /**
   * True if the superuser can change file ownership. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.
   * @return chownRestricted
  **/
  @ApiModelProperty(value = "True if the superuser can change file ownership. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.")
  public Boolean isChownRestricted() {
    return chownRestricted;
  }

  public void setChownRestricted(Boolean chownRestricted) {
    this.chownRestricted = chownRestricted;
  }

  public NfsSettingsExportSettings commitAsynchronous(Boolean commitAsynchronous) {
    this.commitAsynchronous = commitAsynchronous;
    return this;
  }

   /**
   * True if NFS  commit  requests execute asynchronously.
   * @return commitAsynchronous
  **/
  @ApiModelProperty(value = "True if NFS  commit  requests execute asynchronously.")
  public Boolean isCommitAsynchronous() {
    return commitAsynchronous;
  }

  public void setCommitAsynchronous(Boolean commitAsynchronous) {
    this.commitAsynchronous = commitAsynchronous;
  }

  public NfsSettingsExportSettings directoryTransferSize(Integer directoryTransferSize) {
    this.directoryTransferSize = directoryTransferSize;
    return this;
  }

   /**
   * Specifies the preferred size for directory read operations. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return directoryTransferSize
  **/
  @ApiModelProperty(value = "Specifies the preferred size for directory read operations. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Integer getDirectoryTransferSize() {
    return directoryTransferSize;
  }

  public void setDirectoryTransferSize(Integer directoryTransferSize) {
    this.directoryTransferSize = directoryTransferSize;
  }

  public NfsSettingsExportSettings encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Specifies the default character set encoding of the clients connecting to the export, unless otherwise specified.
   * @return encoding
  **/
  @ApiModelProperty(value = "Specifies the default character set encoding of the clients connecting to the export, unless otherwise specified.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public NfsSettingsExportSettings linkMax(Integer linkMax) {
    this.linkMax = linkMax;
    return this;
  }

   /**
   * Specifies the reported maximum number of links to a file. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.
   * @return linkMax
  **/
  @ApiModelProperty(value = "Specifies the reported maximum number of links to a file. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.")
  public Integer getLinkMax() {
    return linkMax;
  }

  public void setLinkMax(Integer linkMax) {
    this.linkMax = linkMax;
  }

  public NfsSettingsExportSettings mapAll(NfsSettingsExportSettingsMapAll mapAll) {
    this.mapAll = mapAll;
    return this;
  }

   /**
   * User and group mapping.
   * @return mapAll
  **/
  @ApiModelProperty(value = "User and group mapping.")
  public NfsSettingsExportSettingsMapAll getMapAll() {
    return mapAll;
  }

  public void setMapAll(NfsSettingsExportSettingsMapAll mapAll) {
    this.mapAll = mapAll;
  }

  public NfsSettingsExportSettings mapFailure(NfsSettingsExportSettingsMapAll mapFailure) {
    this.mapFailure = mapFailure;
    return this;
  }

   /**
   * User and group mapping.
   * @return mapFailure
  **/
  @ApiModelProperty(value = "User and group mapping.")
  public NfsSettingsExportSettingsMapAll getMapFailure() {
    return mapFailure;
  }

  public void setMapFailure(NfsSettingsExportSettingsMapAll mapFailure) {
    this.mapFailure = mapFailure;
  }

  public NfsSettingsExportSettings mapFull(Boolean mapFull) {
    this.mapFull = mapFull;
    return this;
  }

   /**
   * True if user mappings query the OneFS user database. When set to false, user mappings only query local authentication.
   * @return mapFull
  **/
  @ApiModelProperty(value = "True if user mappings query the OneFS user database. When set to false, user mappings only query local authentication.")
  public Boolean isMapFull() {
    return mapFull;
  }

  public void setMapFull(Boolean mapFull) {
    this.mapFull = mapFull;
  }

  public NfsSettingsExportSettings mapLookupUid(Boolean mapLookupUid) {
    this.mapLookupUid = mapLookupUid;
    return this;
  }

   /**
   * True if incoming user IDs (UIDs) are mapped to users in the OneFS user database. When set to false, incoming UIDs are applied directly to file operations.
   * @return mapLookupUid
  **/
  @ApiModelProperty(value = "True if incoming user IDs (UIDs) are mapped to users in the OneFS user database. When set to false, incoming UIDs are applied directly to file operations.")
  public Boolean isMapLookupUid() {
    return mapLookupUid;
  }

  public void setMapLookupUid(Boolean mapLookupUid) {
    this.mapLookupUid = mapLookupUid;
  }

  public NfsSettingsExportSettings mapNonRoot(NfsSettingsExportSettingsMapAll mapNonRoot) {
    this.mapNonRoot = mapNonRoot;
    return this;
  }

   /**
   * User and group mapping.
   * @return mapNonRoot
  **/
  @ApiModelProperty(value = "User and group mapping.")
  public NfsSettingsExportSettingsMapAll getMapNonRoot() {
    return mapNonRoot;
  }

  public void setMapNonRoot(NfsSettingsExportSettingsMapAll mapNonRoot) {
    this.mapNonRoot = mapNonRoot;
  }

  public NfsSettingsExportSettings mapRetry(Boolean mapRetry) {
    this.mapRetry = mapRetry;
    return this;
  }

   /**
   * Determines whether searches for users specified in &#39;map_all&#39;, &#39;map_root&#39; or &#39;map_nonroot&#39; are retried if the search fails.
   * @return mapRetry
  **/
  @ApiModelProperty(value = "Determines whether searches for users specified in 'map_all', 'map_root' or 'map_nonroot' are retried if the search fails.")
  public Boolean isMapRetry() {
    return mapRetry;
  }

  public void setMapRetry(Boolean mapRetry) {
    this.mapRetry = mapRetry;
  }

  public NfsSettingsExportSettings mapRoot(NfsSettingsExportSettingsMapAll mapRoot) {
    this.mapRoot = mapRoot;
    return this;
  }

   /**
   * User and group mapping.
   * @return mapRoot
  **/
  @ApiModelProperty(value = "User and group mapping.")
  public NfsSettingsExportSettingsMapAll getMapRoot() {
    return mapRoot;
  }

  public void setMapRoot(NfsSettingsExportSettingsMapAll mapRoot) {
    this.mapRoot = mapRoot;
  }

  public NfsSettingsExportSettings maxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

   /**
   * Specifies the maximum file size for any file accessed from the export. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.
   * @return maxFileSize
  **/
  @ApiModelProperty(value = "Specifies the maximum file size for any file accessed from the export. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.")
  public Integer getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  public NfsSettingsExportSettings nameMaxSize(Integer nameMaxSize) {
    this.nameMaxSize = nameMaxSize;
    return this;
  }

   /**
   * Specifies the reported maximum length of a file name. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.
   * @return nameMaxSize
  **/
  @ApiModelProperty(value = "Specifies the reported maximum length of a file name. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.")
  public Integer getNameMaxSize() {
    return nameMaxSize;
  }

  public void setNameMaxSize(Integer nameMaxSize) {
    this.nameMaxSize = nameMaxSize;
  }

  public NfsSettingsExportSettings noTruncate(Boolean noTruncate) {
    this.noTruncate = noTruncate;
    return this;
  }

   /**
   * True if long file names result in an error. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.
   * @return noTruncate
  **/
  @ApiModelProperty(value = "True if long file names result in an error. This parameter does not affect server behavior, but is included to accommodate legacy client requirements.")
  public Boolean isNoTruncate() {
    return noTruncate;
  }

  public void setNoTruncate(Boolean noTruncate) {
    this.noTruncate = noTruncate;
  }

  public NfsSettingsExportSettings readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * True if the export is set to read-only.
   * @return readOnly
  **/
  @ApiModelProperty(value = "True if the export is set to read-only.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public NfsSettingsExportSettings readTransferMaxSize(Integer readTransferMaxSize) {
    this.readTransferMaxSize = readTransferMaxSize;
    return this;
  }

   /**
   * Specifies the maximum buffer size that clients should use on NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return readTransferMaxSize
  **/
  @ApiModelProperty(value = "Specifies the maximum buffer size that clients should use on NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Integer getReadTransferMaxSize() {
    return readTransferMaxSize;
  }

  public void setReadTransferMaxSize(Integer readTransferMaxSize) {
    this.readTransferMaxSize = readTransferMaxSize;
  }

  public NfsSettingsExportSettings readTransferMultiple(Integer readTransferMultiple) {
    this.readTransferMultiple = readTransferMultiple;
    return this;
  }

   /**
   * Specifies the preferred multiple size for NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return readTransferMultiple
  **/
  @ApiModelProperty(value = "Specifies the preferred multiple size for NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Integer getReadTransferMultiple() {
    return readTransferMultiple;
  }

  public void setReadTransferMultiple(Integer readTransferMultiple) {
    this.readTransferMultiple = readTransferMultiple;
  }

  public NfsSettingsExportSettings readTransferSize(Integer readTransferSize) {
    this.readTransferSize = readTransferSize;
    return this;
  }

   /**
   * Specifies the preferred size for NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return readTransferSize
  **/
  @ApiModelProperty(value = "Specifies the preferred size for NFS read requests. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Integer getReadTransferSize() {
    return readTransferSize;
  }

  public void setReadTransferSize(Integer readTransferSize) {
    this.readTransferSize = readTransferSize;
  }

  public NfsSettingsExportSettings readdirplus(Boolean readdirplus) {
    this.readdirplus = readdirplus;
    return this;
  }

   /**
   * True if &#39;readdirplus&#39; requests are enabled. Enabling this property might improve network performance and is only available for NFSv3.
   * @return readdirplus
  **/
  @ApiModelProperty(value = "True if 'readdirplus' requests are enabled. Enabling this property might improve network performance and is only available for NFSv3.")
  public Boolean isReaddirplus() {
    return readdirplus;
  }

  public void setReaddirplus(Boolean readdirplus) {
    this.readdirplus = readdirplus;
  }

  public NfsSettingsExportSettings readdirplusPrefetch(Integer readdirplusPrefetch) {
    this.readdirplusPrefetch = readdirplusPrefetch;
    return this;
  }

   /**
   * Sets the number of directory entries that are prefetched when a &#39;readdirplus&#39; request is processed. (Deprecated.)
   * @return readdirplusPrefetch
  **/
  @ApiModelProperty(value = "Sets the number of directory entries that are prefetched when a 'readdirplus' request is processed. (Deprecated.)")
  public Integer getReaddirplusPrefetch() {
    return readdirplusPrefetch;
  }

  public void setReaddirplusPrefetch(Integer readdirplusPrefetch) {
    this.readdirplusPrefetch = readdirplusPrefetch;
  }

  public NfsSettingsExportSettings return32bitFileIds(Boolean return32bitFileIds) {
    this.return32bitFileIds = return32bitFileIds;
    return this;
  }

   /**
   * Limits the size of file identifiers returned by NFSv3+ to 32-bit values (may require remount).
   * @return return32bitFileIds
  **/
  @ApiModelProperty(value = "Limits the size of file identifiers returned by NFSv3+ to 32-bit values (may require remount).")
  public Boolean isReturn32bitFileIds() {
    return return32bitFileIds;
  }

  public void setReturn32bitFileIds(Boolean return32bitFileIds) {
    this.return32bitFileIds = return32bitFileIds;
  }

  public NfsSettingsExportSettings securityFlavors(List<SecurityFlavorsEnum> securityFlavors) {
    this.securityFlavors = securityFlavors;
    return this;
  }

  public NfsSettingsExportSettings addSecurityFlavorsItem(SecurityFlavorsEnum securityFlavorsItem) {
    if (this.securityFlavors == null) {
      this.securityFlavors = new ArrayList<SecurityFlavorsEnum>();
    }
    this.securityFlavors.add(securityFlavorsItem);
    return this;
  }

   /**
   * Specifies the authentication types that are supported for this export.
   * @return securityFlavors
  **/
  @ApiModelProperty(value = "Specifies the authentication types that are supported for this export.")
  public List<SecurityFlavorsEnum> getSecurityFlavors() {
    return securityFlavors;
  }

  public void setSecurityFlavors(List<SecurityFlavorsEnum> securityFlavors) {
    this.securityFlavors = securityFlavors;
  }

  public NfsSettingsExportSettings setattrAsynchronous(Boolean setattrAsynchronous) {
    this.setattrAsynchronous = setattrAsynchronous;
    return this;
  }

   /**
   * True if set attribute operations execute asynchronously.
   * @return setattrAsynchronous
  **/
  @ApiModelProperty(value = "True if set attribute operations execute asynchronously.")
  public Boolean isSetattrAsynchronous() {
    return setattrAsynchronous;
  }

  public void setSetattrAsynchronous(Boolean setattrAsynchronous) {
    this.setattrAsynchronous = setattrAsynchronous;
  }

  public NfsSettingsExportSettings snapshot(String snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Specifies the snapshot for all mounts.
   * @return snapshot
  **/
  @ApiModelProperty(value = "Specifies the snapshot for all mounts.")
  public String getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }

  public NfsSettingsExportSettings symlinks(Boolean symlinks) {
    this.symlinks = symlinks;
    return this;
  }

   /**
   * True if symlinks are supported. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return symlinks
  **/
  @ApiModelProperty(value = "True if symlinks are supported. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Boolean isSymlinks() {
    return symlinks;
  }

  public void setSymlinks(Boolean symlinks) {
    this.symlinks = symlinks;
  }

  public NfsSettingsExportSettings timeDelta(BigDecimal timeDelta) {
    this.timeDelta = timeDelta;
    return this;
  }

   /**
   * Specifies the resolution of all time values that are returned to the clients
   * @return timeDelta
  **/
  @ApiModelProperty(value = "Specifies the resolution of all time values that are returned to the clients")
  public BigDecimal getTimeDelta() {
    return timeDelta;
  }

  public void setTimeDelta(BigDecimal timeDelta) {
    this.timeDelta = timeDelta;
  }

  public NfsSettingsExportSettings writeDatasyncAction(String writeDatasyncAction) {
    this.writeDatasyncAction = writeDatasyncAction;
    return this;
  }

   /**
   * Specifies the synchronization type.
   * @return writeDatasyncAction
  **/
  @ApiModelProperty(value = "Specifies the synchronization type.")
  public String getWriteDatasyncAction() {
    return writeDatasyncAction;
  }

  public void setWriteDatasyncAction(String writeDatasyncAction) {
    this.writeDatasyncAction = writeDatasyncAction;
  }

  public NfsSettingsExportSettings writeDatasyncReply(String writeDatasyncReply) {
    this.writeDatasyncReply = writeDatasyncReply;
    return this;
  }

   /**
   * Specifies the synchronization type.
   * @return writeDatasyncReply
  **/
  @ApiModelProperty(value = "Specifies the synchronization type.")
  public String getWriteDatasyncReply() {
    return writeDatasyncReply;
  }

  public void setWriteDatasyncReply(String writeDatasyncReply) {
    this.writeDatasyncReply = writeDatasyncReply;
  }

  public NfsSettingsExportSettings writeFilesyncAction(String writeFilesyncAction) {
    this.writeFilesyncAction = writeFilesyncAction;
    return this;
  }

   /**
   * Specifies the synchronization type.
   * @return writeFilesyncAction
  **/
  @ApiModelProperty(value = "Specifies the synchronization type.")
  public String getWriteFilesyncAction() {
    return writeFilesyncAction;
  }

  public void setWriteFilesyncAction(String writeFilesyncAction) {
    this.writeFilesyncAction = writeFilesyncAction;
  }

  public NfsSettingsExportSettings writeFilesyncReply(String writeFilesyncReply) {
    this.writeFilesyncReply = writeFilesyncReply;
    return this;
  }

   /**
   * Specifies the synchronization type.
   * @return writeFilesyncReply
  **/
  @ApiModelProperty(value = "Specifies the synchronization type.")
  public String getWriteFilesyncReply() {
    return writeFilesyncReply;
  }

  public void setWriteFilesyncReply(String writeFilesyncReply) {
    this.writeFilesyncReply = writeFilesyncReply;
  }

  public NfsSettingsExportSettings writeTransferMaxSize(Integer writeTransferMaxSize) {
    this.writeTransferMaxSize = writeTransferMaxSize;
    return this;
  }

   /**
   * Specifies the maximum buffer size that clients should use on NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return writeTransferMaxSize
  **/
  @ApiModelProperty(value = "Specifies the maximum buffer size that clients should use on NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Integer getWriteTransferMaxSize() {
    return writeTransferMaxSize;
  }

  public void setWriteTransferMaxSize(Integer writeTransferMaxSize) {
    this.writeTransferMaxSize = writeTransferMaxSize;
  }

  public NfsSettingsExportSettings writeTransferMultiple(Integer writeTransferMultiple) {
    this.writeTransferMultiple = writeTransferMultiple;
    return this;
  }

   /**
   * Specifies the preferred multiple size for NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return writeTransferMultiple
  **/
  @ApiModelProperty(value = "Specifies the preferred multiple size for NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Integer getWriteTransferMultiple() {
    return writeTransferMultiple;
  }

  public void setWriteTransferMultiple(Integer writeTransferMultiple) {
    this.writeTransferMultiple = writeTransferMultiple;
  }

  public NfsSettingsExportSettings writeTransferSize(Integer writeTransferSize) {
    this.writeTransferSize = writeTransferSize;
    return this;
  }

   /**
   * Specifies the preferred multiple size for NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced.
   * @return writeTransferSize
  **/
  @ApiModelProperty(value = "Specifies the preferred multiple size for NFS write requests. This value is used to advise the client of optimal settings for the server, but is not enforced.")
  public Integer getWriteTransferSize() {
    return writeTransferSize;
  }

  public void setWriteTransferSize(Integer writeTransferSize) {
    this.writeTransferSize = writeTransferSize;
  }

  public NfsSettingsExportSettings writeUnstableAction(String writeUnstableAction) {
    this.writeUnstableAction = writeUnstableAction;
    return this;
  }

   /**
   * Specifies the synchronization type.
   * @return writeUnstableAction
  **/
  @ApiModelProperty(value = "Specifies the synchronization type.")
  public String getWriteUnstableAction() {
    return writeUnstableAction;
  }

  public void setWriteUnstableAction(String writeUnstableAction) {
    this.writeUnstableAction = writeUnstableAction;
  }

  public NfsSettingsExportSettings writeUnstableReply(String writeUnstableReply) {
    this.writeUnstableReply = writeUnstableReply;
    return this;
  }

   /**
   * Specifies the synchronization type.
   * @return writeUnstableReply
  **/
  @ApiModelProperty(value = "Specifies the synchronization type.")
  public String getWriteUnstableReply() {
    return writeUnstableReply;
  }

  public void setWriteUnstableReply(String writeUnstableReply) {
    this.writeUnstableReply = writeUnstableReply;
  }

  public NfsSettingsExportSettings zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Specifies the zone in which the export is valid.
   * @return zone
  **/
  @ApiModelProperty(value = "Specifies the zone in which the export is valid.")
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
    NfsSettingsExportSettings nfsSettingsExportSettings = (NfsSettingsExportSettings) o;
    return Objects.equals(this.allDirs, nfsSettingsExportSettings.allDirs) &&
        Objects.equals(this.blockSize, nfsSettingsExportSettings.blockSize) &&
        Objects.equals(this.canSetTime, nfsSettingsExportSettings.canSetTime) &&
        Objects.equals(this.caseInsensitive, nfsSettingsExportSettings.caseInsensitive) &&
        Objects.equals(this.casePreserving, nfsSettingsExportSettings.casePreserving) &&
        Objects.equals(this.chownRestricted, nfsSettingsExportSettings.chownRestricted) &&
        Objects.equals(this.commitAsynchronous, nfsSettingsExportSettings.commitAsynchronous) &&
        Objects.equals(this.directoryTransferSize, nfsSettingsExportSettings.directoryTransferSize) &&
        Objects.equals(this.encoding, nfsSettingsExportSettings.encoding) &&
        Objects.equals(this.linkMax, nfsSettingsExportSettings.linkMax) &&
        Objects.equals(this.mapAll, nfsSettingsExportSettings.mapAll) &&
        Objects.equals(this.mapFailure, nfsSettingsExportSettings.mapFailure) &&
        Objects.equals(this.mapFull, nfsSettingsExportSettings.mapFull) &&
        Objects.equals(this.mapLookupUid, nfsSettingsExportSettings.mapLookupUid) &&
        Objects.equals(this.mapNonRoot, nfsSettingsExportSettings.mapNonRoot) &&
        Objects.equals(this.mapRetry, nfsSettingsExportSettings.mapRetry) &&
        Objects.equals(this.mapRoot, nfsSettingsExportSettings.mapRoot) &&
        Objects.equals(this.maxFileSize, nfsSettingsExportSettings.maxFileSize) &&
        Objects.equals(this.nameMaxSize, nfsSettingsExportSettings.nameMaxSize) &&
        Objects.equals(this.noTruncate, nfsSettingsExportSettings.noTruncate) &&
        Objects.equals(this.readOnly, nfsSettingsExportSettings.readOnly) &&
        Objects.equals(this.readTransferMaxSize, nfsSettingsExportSettings.readTransferMaxSize) &&
        Objects.equals(this.readTransferMultiple, nfsSettingsExportSettings.readTransferMultiple) &&
        Objects.equals(this.readTransferSize, nfsSettingsExportSettings.readTransferSize) &&
        Objects.equals(this.readdirplus, nfsSettingsExportSettings.readdirplus) &&
        Objects.equals(this.readdirplusPrefetch, nfsSettingsExportSettings.readdirplusPrefetch) &&
        Objects.equals(this.return32bitFileIds, nfsSettingsExportSettings.return32bitFileIds) &&
        Objects.equals(this.securityFlavors, nfsSettingsExportSettings.securityFlavors) &&
        Objects.equals(this.setattrAsynchronous, nfsSettingsExportSettings.setattrAsynchronous) &&
        Objects.equals(this.snapshot, nfsSettingsExportSettings.snapshot) &&
        Objects.equals(this.symlinks, nfsSettingsExportSettings.symlinks) &&
        Objects.equals(this.timeDelta, nfsSettingsExportSettings.timeDelta) &&
        Objects.equals(this.writeDatasyncAction, nfsSettingsExportSettings.writeDatasyncAction) &&
        Objects.equals(this.writeDatasyncReply, nfsSettingsExportSettings.writeDatasyncReply) &&
        Objects.equals(this.writeFilesyncAction, nfsSettingsExportSettings.writeFilesyncAction) &&
        Objects.equals(this.writeFilesyncReply, nfsSettingsExportSettings.writeFilesyncReply) &&
        Objects.equals(this.writeTransferMaxSize, nfsSettingsExportSettings.writeTransferMaxSize) &&
        Objects.equals(this.writeTransferMultiple, nfsSettingsExportSettings.writeTransferMultiple) &&
        Objects.equals(this.writeTransferSize, nfsSettingsExportSettings.writeTransferSize) &&
        Objects.equals(this.writeUnstableAction, nfsSettingsExportSettings.writeUnstableAction) &&
        Objects.equals(this.writeUnstableReply, nfsSettingsExportSettings.writeUnstableReply) &&
        Objects.equals(this.zone, nfsSettingsExportSettings.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDirs, blockSize, canSetTime, caseInsensitive, casePreserving, chownRestricted, commitAsynchronous, directoryTransferSize, encoding, linkMax, mapAll, mapFailure, mapFull, mapLookupUid, mapNonRoot, mapRetry, mapRoot, maxFileSize, nameMaxSize, noTruncate, readOnly, readTransferMaxSize, readTransferMultiple, readTransferSize, readdirplus, readdirplusPrefetch, return32bitFileIds, securityFlavors, setattrAsynchronous, snapshot, symlinks, timeDelta, writeDatasyncAction, writeDatasyncReply, writeFilesyncAction, writeFilesyncReply, writeTransferMaxSize, writeTransferMultiple, writeTransferSize, writeUnstableAction, writeUnstableReply, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfsSettingsExportSettings {\n");
    
    sb.append("    allDirs: ").append(toIndentedString(allDirs)).append("\n");
    sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
    sb.append("    canSetTime: ").append(toIndentedString(canSetTime)).append("\n");
    sb.append("    caseInsensitive: ").append(toIndentedString(caseInsensitive)).append("\n");
    sb.append("    casePreserving: ").append(toIndentedString(casePreserving)).append("\n");
    sb.append("    chownRestricted: ").append(toIndentedString(chownRestricted)).append("\n");
    sb.append("    commitAsynchronous: ").append(toIndentedString(commitAsynchronous)).append("\n");
    sb.append("    directoryTransferSize: ").append(toIndentedString(directoryTransferSize)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    linkMax: ").append(toIndentedString(linkMax)).append("\n");
    sb.append("    mapAll: ").append(toIndentedString(mapAll)).append("\n");
    sb.append("    mapFailure: ").append(toIndentedString(mapFailure)).append("\n");
    sb.append("    mapFull: ").append(toIndentedString(mapFull)).append("\n");
    sb.append("    mapLookupUid: ").append(toIndentedString(mapLookupUid)).append("\n");
    sb.append("    mapNonRoot: ").append(toIndentedString(mapNonRoot)).append("\n");
    sb.append("    mapRetry: ").append(toIndentedString(mapRetry)).append("\n");
    sb.append("    mapRoot: ").append(toIndentedString(mapRoot)).append("\n");
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    nameMaxSize: ").append(toIndentedString(nameMaxSize)).append("\n");
    sb.append("    noTruncate: ").append(toIndentedString(noTruncate)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    readTransferMaxSize: ").append(toIndentedString(readTransferMaxSize)).append("\n");
    sb.append("    readTransferMultiple: ").append(toIndentedString(readTransferMultiple)).append("\n");
    sb.append("    readTransferSize: ").append(toIndentedString(readTransferSize)).append("\n");
    sb.append("    readdirplus: ").append(toIndentedString(readdirplus)).append("\n");
    sb.append("    readdirplusPrefetch: ").append(toIndentedString(readdirplusPrefetch)).append("\n");
    sb.append("    return32bitFileIds: ").append(toIndentedString(return32bitFileIds)).append("\n");
    sb.append("    securityFlavors: ").append(toIndentedString(securityFlavors)).append("\n");
    sb.append("    setattrAsynchronous: ").append(toIndentedString(setattrAsynchronous)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    symlinks: ").append(toIndentedString(symlinks)).append("\n");
    sb.append("    timeDelta: ").append(toIndentedString(timeDelta)).append("\n");
    sb.append("    writeDatasyncAction: ").append(toIndentedString(writeDatasyncAction)).append("\n");
    sb.append("    writeDatasyncReply: ").append(toIndentedString(writeDatasyncReply)).append("\n");
    sb.append("    writeFilesyncAction: ").append(toIndentedString(writeFilesyncAction)).append("\n");
    sb.append("    writeFilesyncReply: ").append(toIndentedString(writeFilesyncReply)).append("\n");
    sb.append("    writeTransferMaxSize: ").append(toIndentedString(writeTransferMaxSize)).append("\n");
    sb.append("    writeTransferMultiple: ").append(toIndentedString(writeTransferMultiple)).append("\n");
    sb.append("    writeTransferSize: ").append(toIndentedString(writeTransferSize)).append("\n");
    sb.append("    writeUnstableAction: ").append(toIndentedString(writeUnstableAction)).append("\n");
    sb.append("    writeUnstableReply: ").append(toIndentedString(writeUnstableReply)).append("\n");
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

