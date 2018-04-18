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
import io.swagger.client.model.StoragepoolSettingsSettingsSpilloverTarget;
import java.io.IOException;

/**
 * StoragepoolSettingsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class StoragepoolSettingsSettings {
  /**
   * Automatically manage IO optimization settings on files.
   */
  @JsonAdapter(AutomaticallyManageIoOptimizationEnum.Adapter.class)
  public enum AutomaticallyManageIoOptimizationEnum {
    ALL("all"),
    
    FILES_AT_DEFAULT("files_at_default"),
    
    NONE("none");

    private String value;

    AutomaticallyManageIoOptimizationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutomaticallyManageIoOptimizationEnum fromValue(String text) {
      for (AutomaticallyManageIoOptimizationEnum b : AutomaticallyManageIoOptimizationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AutomaticallyManageIoOptimizationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutomaticallyManageIoOptimizationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutomaticallyManageIoOptimizationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AutomaticallyManageIoOptimizationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("automatically_manage_io_optimization")
  private AutomaticallyManageIoOptimizationEnum automaticallyManageIoOptimization = null;

  /**
   * Automatically manage protection settings on files.
   */
  @JsonAdapter(AutomaticallyManageProtectionEnum.Adapter.class)
  public enum AutomaticallyManageProtectionEnum {
    ALL("all"),
    
    FILES_AT_DEFAULT("files_at_default"),
    
    NONE("none");

    private String value;

    AutomaticallyManageProtectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutomaticallyManageProtectionEnum fromValue(String text) {
      for (AutomaticallyManageProtectionEnum b : AutomaticallyManageProtectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AutomaticallyManageProtectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutomaticallyManageProtectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutomaticallyManageProtectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AutomaticallyManageProtectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("automatically_manage_protection")
  private AutomaticallyManageProtectionEnum automaticallyManageProtection = null;

  @SerializedName("global_namespace_acceleration_enabled")
  private Boolean globalNamespaceAccelerationEnabled = null;

  /**
   * Whether or not namespace operation optimizations are currently in effect.
   */
  @JsonAdapter(GlobalNamespaceAccelerationStateEnum.Adapter.class)
  public enum GlobalNamespaceAccelerationStateEnum {
    HONORED("honored"),
    
    INACTIVE("inactive");

    private String value;

    GlobalNamespaceAccelerationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GlobalNamespaceAccelerationStateEnum fromValue(String text) {
      for (GlobalNamespaceAccelerationStateEnum b : GlobalNamespaceAccelerationStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GlobalNamespaceAccelerationStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GlobalNamespaceAccelerationStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GlobalNamespaceAccelerationStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GlobalNamespaceAccelerationStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("global_namespace_acceleration_state")
  private GlobalNamespaceAccelerationStateEnum globalNamespaceAccelerationState = null;

  @SerializedName("protect_directories_one_level_higher")
  private Boolean protectDirectoriesOneLevelHigher = null;

  @SerializedName("spillover_enabled")
  private Boolean spilloverEnabled = null;

  @SerializedName("spillover_target")
  private StoragepoolSettingsSettingsSpilloverTarget spilloverTarget = null;

  @SerializedName("ssd_l3_cache_default_enabled")
  private Boolean ssdL3CacheDefaultEnabled = null;

  /**
   * Controls number of mirrors of QAB blocks to place on SSDs.
   */
  @JsonAdapter(SsdQabMirrorsEnum.Adapter.class)
  public enum SsdQabMirrorsEnum {
    ONE("one"),
    
    ALL("all"),
    
    DISABLED("disabled"),
    
    INVALID("invalid"),
    
    NONE("none");

    private String value;

    SsdQabMirrorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SsdQabMirrorsEnum fromValue(String text) {
      for (SsdQabMirrorsEnum b : SsdQabMirrorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SsdQabMirrorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SsdQabMirrorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SsdQabMirrorsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SsdQabMirrorsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ssd_qab_mirrors")
  private SsdQabMirrorsEnum ssdQabMirrors = null;

  /**
   * Controls number of mirrors of system B-tree blocks to place on SSDs.
   */
  @JsonAdapter(SsdSystemBtreeMirrorsEnum.Adapter.class)
  public enum SsdSystemBtreeMirrorsEnum {
    ONE("one"),
    
    ALL("all"),
    
    DISABLED("disabled"),
    
    INVALID("invalid"),
    
    NONE("none");

    private String value;

    SsdSystemBtreeMirrorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SsdSystemBtreeMirrorsEnum fromValue(String text) {
      for (SsdSystemBtreeMirrorsEnum b : SsdSystemBtreeMirrorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SsdSystemBtreeMirrorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SsdSystemBtreeMirrorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SsdSystemBtreeMirrorsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SsdSystemBtreeMirrorsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ssd_system_btree_mirrors")
  private SsdSystemBtreeMirrorsEnum ssdSystemBtreeMirrors = null;

  /**
   * Controls number of mirrors of system delta blocks to place on SSDs.
   */
  @JsonAdapter(SsdSystemDeltaMirrorsEnum.Adapter.class)
  public enum SsdSystemDeltaMirrorsEnum {
    ONE("one"),
    
    ALL("all"),
    
    DISABLED("disabled"),
    
    INVALID("invalid"),
    
    NONE("none");

    private String value;

    SsdSystemDeltaMirrorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SsdSystemDeltaMirrorsEnum fromValue(String text) {
      for (SsdSystemDeltaMirrorsEnum b : SsdSystemDeltaMirrorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SsdSystemDeltaMirrorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SsdSystemDeltaMirrorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SsdSystemDeltaMirrorsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SsdSystemDeltaMirrorsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ssd_system_delta_mirrors")
  private SsdSystemDeltaMirrorsEnum ssdSystemDeltaMirrors = null;

  @SerializedName("virtual_hot_spare_deny_writes")
  private Boolean virtualHotSpareDenyWrites = null;

  @SerializedName("virtual_hot_spare_hide_spare")
  private Boolean virtualHotSpareHideSpare = null;

  @SerializedName("virtual_hot_spare_limit_drives")
  private Integer virtualHotSpareLimitDrives = null;

  @SerializedName("virtual_hot_spare_limit_percent")
  private Integer virtualHotSpareLimitPercent = null;

  public StoragepoolSettingsSettings automaticallyManageIoOptimization(AutomaticallyManageIoOptimizationEnum automaticallyManageIoOptimization) {
    this.automaticallyManageIoOptimization = automaticallyManageIoOptimization;
    return this;
  }

   /**
   * Automatically manage IO optimization settings on files.
   * @return automaticallyManageIoOptimization
  **/
  @ApiModelProperty(required = true, value = "Automatically manage IO optimization settings on files.")
  public AutomaticallyManageIoOptimizationEnum getAutomaticallyManageIoOptimization() {
    return automaticallyManageIoOptimization;
  }

  public void setAutomaticallyManageIoOptimization(AutomaticallyManageIoOptimizationEnum automaticallyManageIoOptimization) {
    this.automaticallyManageIoOptimization = automaticallyManageIoOptimization;
  }

  public StoragepoolSettingsSettings automaticallyManageProtection(AutomaticallyManageProtectionEnum automaticallyManageProtection) {
    this.automaticallyManageProtection = automaticallyManageProtection;
    return this;
  }

   /**
   * Automatically manage protection settings on files.
   * @return automaticallyManageProtection
  **/
  @ApiModelProperty(required = true, value = "Automatically manage protection settings on files.")
  public AutomaticallyManageProtectionEnum getAutomaticallyManageProtection() {
    return automaticallyManageProtection;
  }

  public void setAutomaticallyManageProtection(AutomaticallyManageProtectionEnum automaticallyManageProtection) {
    this.automaticallyManageProtection = automaticallyManageProtection;
  }

  public StoragepoolSettingsSettings globalNamespaceAccelerationEnabled(Boolean globalNamespaceAccelerationEnabled) {
    this.globalNamespaceAccelerationEnabled = globalNamespaceAccelerationEnabled;
    return this;
  }

   /**
   * Optimize namespace operations by storing metadata on SSDs.
   * @return globalNamespaceAccelerationEnabled
  **/
  @ApiModelProperty(required = true, value = "Optimize namespace operations by storing metadata on SSDs.")
  public Boolean isGlobalNamespaceAccelerationEnabled() {
    return globalNamespaceAccelerationEnabled;
  }

  public void setGlobalNamespaceAccelerationEnabled(Boolean globalNamespaceAccelerationEnabled) {
    this.globalNamespaceAccelerationEnabled = globalNamespaceAccelerationEnabled;
  }

  public StoragepoolSettingsSettings globalNamespaceAccelerationState(GlobalNamespaceAccelerationStateEnum globalNamespaceAccelerationState) {
    this.globalNamespaceAccelerationState = globalNamespaceAccelerationState;
    return this;
  }

   /**
   * Whether or not namespace operation optimizations are currently in effect.
   * @return globalNamespaceAccelerationState
  **/
  @ApiModelProperty(required = true, value = "Whether or not namespace operation optimizations are currently in effect.")
  public GlobalNamespaceAccelerationStateEnum getGlobalNamespaceAccelerationState() {
    return globalNamespaceAccelerationState;
  }

  public void setGlobalNamespaceAccelerationState(GlobalNamespaceAccelerationStateEnum globalNamespaceAccelerationState) {
    this.globalNamespaceAccelerationState = globalNamespaceAccelerationState;
  }

  public StoragepoolSettingsSettings protectDirectoriesOneLevelHigher(Boolean protectDirectoriesOneLevelHigher) {
    this.protectDirectoriesOneLevelHigher = protectDirectoriesOneLevelHigher;
    return this;
  }

   /**
   * Automatically add additional protection level to all directories.
   * @return protectDirectoriesOneLevelHigher
  **/
  @ApiModelProperty(required = true, value = "Automatically add additional protection level to all directories.")
  public Boolean isProtectDirectoriesOneLevelHigher() {
    return protectDirectoriesOneLevelHigher;
  }

  public void setProtectDirectoriesOneLevelHigher(Boolean protectDirectoriesOneLevelHigher) {
    this.protectDirectoriesOneLevelHigher = protectDirectoriesOneLevelHigher;
  }

  public StoragepoolSettingsSettings spilloverEnabled(Boolean spilloverEnabled) {
    this.spilloverEnabled = spilloverEnabled;
    return this;
  }

   /**
   * Spill writes into other pools as needed.
   * @return spilloverEnabled
  **/
  @ApiModelProperty(required = true, value = "Spill writes into other pools as needed.")
  public Boolean isSpilloverEnabled() {
    return spilloverEnabled;
  }

  public void setSpilloverEnabled(Boolean spilloverEnabled) {
    this.spilloverEnabled = spilloverEnabled;
  }

  public StoragepoolSettingsSettings spilloverTarget(StoragepoolSettingsSettingsSpilloverTarget spilloverTarget) {
    this.spilloverTarget = spilloverTarget;
    return this;
  }

   /**
   * Target pool for spilled writes.
   * @return spilloverTarget
  **/
  @ApiModelProperty(required = true, value = "Target pool for spilled writes.")
  public StoragepoolSettingsSettingsSpilloverTarget getSpilloverTarget() {
    return spilloverTarget;
  }

  public void setSpilloverTarget(StoragepoolSettingsSettingsSpilloverTarget spilloverTarget) {
    this.spilloverTarget = spilloverTarget;
  }

  public StoragepoolSettingsSettings ssdL3CacheDefaultEnabled(Boolean ssdL3CacheDefaultEnabled) {
    this.ssdL3CacheDefaultEnabled = ssdL3CacheDefaultEnabled;
    return this;
  }

   /**
   * The L3 Cache default enabled state. This specifies whether L3 Cache should be enabled on new node pools.
   * @return ssdL3CacheDefaultEnabled
  **/
  @ApiModelProperty(required = true, value = "The L3 Cache default enabled state. This specifies whether L3 Cache should be enabled on new node pools.")
  public Boolean isSsdL3CacheDefaultEnabled() {
    return ssdL3CacheDefaultEnabled;
  }

  public void setSsdL3CacheDefaultEnabled(Boolean ssdL3CacheDefaultEnabled) {
    this.ssdL3CacheDefaultEnabled = ssdL3CacheDefaultEnabled;
  }

  public StoragepoolSettingsSettings ssdQabMirrors(SsdQabMirrorsEnum ssdQabMirrors) {
    this.ssdQabMirrors = ssdQabMirrors;
    return this;
  }

   /**
   * Controls number of mirrors of QAB blocks to place on SSDs.
   * @return ssdQabMirrors
  **/
  @ApiModelProperty(required = true, value = "Controls number of mirrors of QAB blocks to place on SSDs.")
  public SsdQabMirrorsEnum getSsdQabMirrors() {
    return ssdQabMirrors;
  }

  public void setSsdQabMirrors(SsdQabMirrorsEnum ssdQabMirrors) {
    this.ssdQabMirrors = ssdQabMirrors;
  }

  public StoragepoolSettingsSettings ssdSystemBtreeMirrors(SsdSystemBtreeMirrorsEnum ssdSystemBtreeMirrors) {
    this.ssdSystemBtreeMirrors = ssdSystemBtreeMirrors;
    return this;
  }

   /**
   * Controls number of mirrors of system B-tree blocks to place on SSDs.
   * @return ssdSystemBtreeMirrors
  **/
  @ApiModelProperty(required = true, value = "Controls number of mirrors of system B-tree blocks to place on SSDs.")
  public SsdSystemBtreeMirrorsEnum getSsdSystemBtreeMirrors() {
    return ssdSystemBtreeMirrors;
  }

  public void setSsdSystemBtreeMirrors(SsdSystemBtreeMirrorsEnum ssdSystemBtreeMirrors) {
    this.ssdSystemBtreeMirrors = ssdSystemBtreeMirrors;
  }

  public StoragepoolSettingsSettings ssdSystemDeltaMirrors(SsdSystemDeltaMirrorsEnum ssdSystemDeltaMirrors) {
    this.ssdSystemDeltaMirrors = ssdSystemDeltaMirrors;
    return this;
  }

   /**
   * Controls number of mirrors of system delta blocks to place on SSDs.
   * @return ssdSystemDeltaMirrors
  **/
  @ApiModelProperty(required = true, value = "Controls number of mirrors of system delta blocks to place on SSDs.")
  public SsdSystemDeltaMirrorsEnum getSsdSystemDeltaMirrors() {
    return ssdSystemDeltaMirrors;
  }

  public void setSsdSystemDeltaMirrors(SsdSystemDeltaMirrorsEnum ssdSystemDeltaMirrors) {
    this.ssdSystemDeltaMirrors = ssdSystemDeltaMirrors;
  }

  public StoragepoolSettingsSettings virtualHotSpareDenyWrites(Boolean virtualHotSpareDenyWrites) {
    this.virtualHotSpareDenyWrites = virtualHotSpareDenyWrites;
    return this;
  }

   /**
   * Deny writes into reserved virtual hot spare space.
   * @return virtualHotSpareDenyWrites
  **/
  @ApiModelProperty(required = true, value = "Deny writes into reserved virtual hot spare space.")
  public Boolean isVirtualHotSpareDenyWrites() {
    return virtualHotSpareDenyWrites;
  }

  public void setVirtualHotSpareDenyWrites(Boolean virtualHotSpareDenyWrites) {
    this.virtualHotSpareDenyWrites = virtualHotSpareDenyWrites;
  }

  public StoragepoolSettingsSettings virtualHotSpareHideSpare(Boolean virtualHotSpareHideSpare) {
    this.virtualHotSpareHideSpare = virtualHotSpareHideSpare;
    return this;
  }

   /**
   * Hide reserved virtual hot spare space from free space counts.
   * @return virtualHotSpareHideSpare
  **/
  @ApiModelProperty(required = true, value = "Hide reserved virtual hot spare space from free space counts.")
  public Boolean isVirtualHotSpareHideSpare() {
    return virtualHotSpareHideSpare;
  }

  public void setVirtualHotSpareHideSpare(Boolean virtualHotSpareHideSpare) {
    this.virtualHotSpareHideSpare = virtualHotSpareHideSpare;
  }

  public StoragepoolSettingsSettings virtualHotSpareLimitDrives(Integer virtualHotSpareLimitDrives) {
    this.virtualHotSpareLimitDrives = virtualHotSpareLimitDrives;
    return this;
  }

   /**
   * The number of drives to reserve for the virtual hot spare, from 0-4.
   * minimum: 0
   * maximum: 4
   * @return virtualHotSpareLimitDrives
  **/
  @ApiModelProperty(required = true, value = "The number of drives to reserve for the virtual hot spare, from 0-4.")
  public Integer getVirtualHotSpareLimitDrives() {
    return virtualHotSpareLimitDrives;
  }

  public void setVirtualHotSpareLimitDrives(Integer virtualHotSpareLimitDrives) {
    this.virtualHotSpareLimitDrives = virtualHotSpareLimitDrives;
  }

  public StoragepoolSettingsSettings virtualHotSpareLimitPercent(Integer virtualHotSpareLimitPercent) {
    this.virtualHotSpareLimitPercent = virtualHotSpareLimitPercent;
    return this;
  }

   /**
   * The percent space to reserve for the virtual hot spare, from 0-20.
   * minimum: 0
   * maximum: 20
   * @return virtualHotSpareLimitPercent
  **/
  @ApiModelProperty(required = true, value = "The percent space to reserve for the virtual hot spare, from 0-20.")
  public Integer getVirtualHotSpareLimitPercent() {
    return virtualHotSpareLimitPercent;
  }

  public void setVirtualHotSpareLimitPercent(Integer virtualHotSpareLimitPercent) {
    this.virtualHotSpareLimitPercent = virtualHotSpareLimitPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolSettingsSettings storagepoolSettingsSettings = (StoragepoolSettingsSettings) o;
    return Objects.equals(this.automaticallyManageIoOptimization, storagepoolSettingsSettings.automaticallyManageIoOptimization) &&
        Objects.equals(this.automaticallyManageProtection, storagepoolSettingsSettings.automaticallyManageProtection) &&
        Objects.equals(this.globalNamespaceAccelerationEnabled, storagepoolSettingsSettings.globalNamespaceAccelerationEnabled) &&
        Objects.equals(this.globalNamespaceAccelerationState, storagepoolSettingsSettings.globalNamespaceAccelerationState) &&
        Objects.equals(this.protectDirectoriesOneLevelHigher, storagepoolSettingsSettings.protectDirectoriesOneLevelHigher) &&
        Objects.equals(this.spilloverEnabled, storagepoolSettingsSettings.spilloverEnabled) &&
        Objects.equals(this.spilloverTarget, storagepoolSettingsSettings.spilloverTarget) &&
        Objects.equals(this.ssdL3CacheDefaultEnabled, storagepoolSettingsSettings.ssdL3CacheDefaultEnabled) &&
        Objects.equals(this.ssdQabMirrors, storagepoolSettingsSettings.ssdQabMirrors) &&
        Objects.equals(this.ssdSystemBtreeMirrors, storagepoolSettingsSettings.ssdSystemBtreeMirrors) &&
        Objects.equals(this.ssdSystemDeltaMirrors, storagepoolSettingsSettings.ssdSystemDeltaMirrors) &&
        Objects.equals(this.virtualHotSpareDenyWrites, storagepoolSettingsSettings.virtualHotSpareDenyWrites) &&
        Objects.equals(this.virtualHotSpareHideSpare, storagepoolSettingsSettings.virtualHotSpareHideSpare) &&
        Objects.equals(this.virtualHotSpareLimitDrives, storagepoolSettingsSettings.virtualHotSpareLimitDrives) &&
        Objects.equals(this.virtualHotSpareLimitPercent, storagepoolSettingsSettings.virtualHotSpareLimitPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticallyManageIoOptimization, automaticallyManageProtection, globalNamespaceAccelerationEnabled, globalNamespaceAccelerationState, protectDirectoriesOneLevelHigher, spilloverEnabled, spilloverTarget, ssdL3CacheDefaultEnabled, ssdQabMirrors, ssdSystemBtreeMirrors, ssdSystemDeltaMirrors, virtualHotSpareDenyWrites, virtualHotSpareHideSpare, virtualHotSpareLimitDrives, virtualHotSpareLimitPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolSettingsSettings {\n");
    
    sb.append("    automaticallyManageIoOptimization: ").append(toIndentedString(automaticallyManageIoOptimization)).append("\n");
    sb.append("    automaticallyManageProtection: ").append(toIndentedString(automaticallyManageProtection)).append("\n");
    sb.append("    globalNamespaceAccelerationEnabled: ").append(toIndentedString(globalNamespaceAccelerationEnabled)).append("\n");
    sb.append("    globalNamespaceAccelerationState: ").append(toIndentedString(globalNamespaceAccelerationState)).append("\n");
    sb.append("    protectDirectoriesOneLevelHigher: ").append(toIndentedString(protectDirectoriesOneLevelHigher)).append("\n");
    sb.append("    spilloverEnabled: ").append(toIndentedString(spilloverEnabled)).append("\n");
    sb.append("    spilloverTarget: ").append(toIndentedString(spilloverTarget)).append("\n");
    sb.append("    ssdL3CacheDefaultEnabled: ").append(toIndentedString(ssdL3CacheDefaultEnabled)).append("\n");
    sb.append("    ssdQabMirrors: ").append(toIndentedString(ssdQabMirrors)).append("\n");
    sb.append("    ssdSystemBtreeMirrors: ").append(toIndentedString(ssdSystemBtreeMirrors)).append("\n");
    sb.append("    ssdSystemDeltaMirrors: ").append(toIndentedString(ssdSystemDeltaMirrors)).append("\n");
    sb.append("    virtualHotSpareDenyWrites: ").append(toIndentedString(virtualHotSpareDenyWrites)).append("\n");
    sb.append("    virtualHotSpareHideSpare: ").append(toIndentedString(virtualHotSpareHideSpare)).append("\n");
    sb.append("    virtualHotSpareLimitDrives: ").append(toIndentedString(virtualHotSpareLimitDrives)).append("\n");
    sb.append("    virtualHotSpareLimitPercent: ").append(toIndentedString(virtualHotSpareLimitPercent)).append("\n");
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
