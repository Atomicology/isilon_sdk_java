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
import io.swagger.client.model.StoragepoolTierUsage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoragepoolStoragepool
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class StoragepoolStoragepool {
  @SerializedName("can_disable_l3")
  private Boolean canDisableL3 = null;

  @SerializedName("can_enable_l3")
  private Boolean canEnableL3 = null;

  @SerializedName("children")
  private List<String> children = null;

  /**
   * Gets or Sets healthFlags
   */
  @JsonAdapter(HealthFlagsEnum.Adapter.class)
  public enum HealthFlagsEnum {
    UNDERPROVISIONED("underprovisioned"),
    
    MISSING_DRIVES("missing_drives"),
    
    DEVICES_DOWN("devices_down"),
    
    DEVICES_SMARTFAILED("devices_smartfailed"),
    
    WAITING_REPAIR("waiting_repair");

    private String value;

    HealthFlagsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HealthFlagsEnum fromValue(String text) {
      for (HealthFlagsEnum b : HealthFlagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HealthFlagsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HealthFlagsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HealthFlagsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HealthFlagsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("health_flags")
  private List<HealthFlagsEnum> healthFlags = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("l3")
  private Boolean l3 = null;

  /**
   * &#39;storage&#39; if the &#39;l3&#39; option is disabled. If the l3 option is enabled, &#39;migrating&#39; if any SSDs in this node pool have not yet been migrated to L3. If all SSDs have been migrated, &#39;l3&#39;.
   */
  @JsonAdapter(L3StatusEnum.Adapter.class)
  public enum L3StatusEnum {
    L3("l3"),
    
    STORAGE("storage"),
    
    MIGRATING("migrating");

    private String value;

    L3StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static L3StatusEnum fromValue(String text) {
      for (L3StatusEnum b : L3StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<L3StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final L3StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public L3StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return L3StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("l3_status")
  private L3StatusEnum l3Status = null;

  @SerializedName("lnns")
  private List<Integer> lnns = new ArrayList<Integer>();

  @SerializedName("manual")
  private Boolean manual = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("protection_policy")
  private String protectionPolicy = null;

  /**
   * The pool type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TIER("tier"),
    
    NODEPOOL("nodepool");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("usage")
  private StoragepoolTierUsage usage = null;

  public StoragepoolStoragepool canDisableL3(Boolean canDisableL3) {
    this.canDisableL3 = canDisableL3;
    return this;
  }

   /**
   * Indicates if disabling L3 is possible.
   * @return canDisableL3
  **/
  @ApiModelProperty(value = "Indicates if disabling L3 is possible.")
  public Boolean isCanDisableL3() {
    return canDisableL3;
  }

  public void setCanDisableL3(Boolean canDisableL3) {
    this.canDisableL3 = canDisableL3;
  }

  public StoragepoolStoragepool canEnableL3(Boolean canEnableL3) {
    this.canEnableL3 = canEnableL3;
    return this;
  }

   /**
   * Indicates if enabling L3 is possible. L3 cannot be enabled if there are unprovisioned drives.
   * @return canEnableL3
  **/
  @ApiModelProperty(value = "Indicates if enabling L3 is possible. L3 cannot be enabled if there are unprovisioned drives.")
  public Boolean isCanEnableL3() {
    return canEnableL3;
  }

  public void setCanEnableL3(Boolean canEnableL3) {
    this.canEnableL3 = canEnableL3;
  }

  public StoragepoolStoragepool children(List<String> children) {
    this.children = children;
    return this;
  }

  public StoragepoolStoragepool addChildrenItem(String childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<String>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * The names or IDs of the pool&#39;s children.
   * @return children
  **/
  @ApiModelProperty(value = "The names or IDs of the pool's children.")
  public List<String> getChildren() {
    return children;
  }

  public void setChildren(List<String> children) {
    this.children = children;
  }

  public StoragepoolStoragepool healthFlags(List<HealthFlagsEnum> healthFlags) {
    this.healthFlags = healthFlags;
    return this;
  }

  public StoragepoolStoragepool addHealthFlagsItem(HealthFlagsEnum healthFlagsItem) {
    if (this.healthFlags == null) {
      this.healthFlags = new ArrayList<HealthFlagsEnum>();
    }
    this.healthFlags.add(healthFlagsItem);
    return this;
  }

   /**
   * An array of containing any health issues with this pool.  If the pool is healthy, the list is empty.  Only appears on &#39;nodepool&#39; type storagepools.
   * @return healthFlags
  **/
  @ApiModelProperty(value = "An array of containing any health issues with this pool.  If the pool is healthy, the list is empty.  Only appears on 'nodepool' type storagepools.")
  public List<HealthFlagsEnum> getHealthFlags() {
    return healthFlags;
  }

  public void setHealthFlags(List<HealthFlagsEnum> healthFlags) {
    this.healthFlags = healthFlags;
  }

  public StoragepoolStoragepool id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The system ID given to the pool.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The system ID given to the pool.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StoragepoolStoragepool l3(Boolean l3) {
    this.l3 = l3;
    return this;
  }

   /**
   * Use SSDs in this node pool for L3 cache.
   * @return l3
  **/
  @ApiModelProperty(value = "Use SSDs in this node pool for L3 cache.")
  public Boolean isL3() {
    return l3;
  }

  public void setL3(Boolean l3) {
    this.l3 = l3;
  }

  public StoragepoolStoragepool l3Status(L3StatusEnum l3Status) {
    this.l3Status = l3Status;
    return this;
  }

   /**
   * &#39;storage&#39; if the &#39;l3&#39; option is disabled. If the l3 option is enabled, &#39;migrating&#39; if any SSDs in this node pool have not yet been migrated to L3. If all SSDs have been migrated, &#39;l3&#39;.
   * @return l3Status
  **/
  @ApiModelProperty(value = "'storage' if the 'l3' option is disabled. If the l3 option is enabled, 'migrating' if any SSDs in this node pool have not yet been migrated to L3. If all SSDs have been migrated, 'l3'.")
  public L3StatusEnum getL3Status() {
    return l3Status;
  }

  public void setL3Status(L3StatusEnum l3Status) {
    this.l3Status = l3Status;
  }

  public StoragepoolStoragepool lnns(List<Integer> lnns) {
    this.lnns = lnns;
    return this;
  }

  public StoragepoolStoragepool addLnnsItem(Integer lnnsItem) {
    this.lnns.add(lnnsItem);
    return this;
  }

   /**
   * The nodes that are part of this pool.
   * @return lnns
  **/
  @ApiModelProperty(required = true, value = "The nodes that are part of this pool.")
  public List<Integer> getLnns() {
    return lnns;
  }

  public void setLnns(List<Integer> lnns) {
    this.lnns = lnns;
  }

  public StoragepoolStoragepool manual(Boolean manual) {
    this.manual = manual;
    return this;
  }

   /**
   * Whether or not the node pool is manually managed.
   * @return manual
  **/
  @ApiModelProperty(value = "Whether or not the node pool is manually managed.")
  public Boolean isManual() {
    return manual;
  }

  public void setManual(Boolean manual) {
    this.manual = manual;
  }

  public StoragepoolStoragepool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The pool name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The pool name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoragepoolStoragepool protectionPolicy(String protectionPolicy) {
    this.protectionPolicy = protectionPolicy;
    return this;
  }

   /**
   * The underlying protection policy.
   * @return protectionPolicy
  **/
  @ApiModelProperty(value = "The underlying protection policy.")
  public String getProtectionPolicy() {
    return protectionPolicy;
  }

  public void setProtectionPolicy(String protectionPolicy) {
    this.protectionPolicy = protectionPolicy;
  }

  public StoragepoolStoragepool type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The pool type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The pool type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StoragepoolStoragepool usage(StoragepoolTierUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Total pool usage.
   * @return usage
  **/
  @ApiModelProperty(required = true, value = "Total pool usage.")
  public StoragepoolTierUsage getUsage() {
    return usage;
  }

  public void setUsage(StoragepoolTierUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolStoragepool storagepoolStoragepool = (StoragepoolStoragepool) o;
    return Objects.equals(this.canDisableL3, storagepoolStoragepool.canDisableL3) &&
        Objects.equals(this.canEnableL3, storagepoolStoragepool.canEnableL3) &&
        Objects.equals(this.children, storagepoolStoragepool.children) &&
        Objects.equals(this.healthFlags, storagepoolStoragepool.healthFlags) &&
        Objects.equals(this.id, storagepoolStoragepool.id) &&
        Objects.equals(this.l3, storagepoolStoragepool.l3) &&
        Objects.equals(this.l3Status, storagepoolStoragepool.l3Status) &&
        Objects.equals(this.lnns, storagepoolStoragepool.lnns) &&
        Objects.equals(this.manual, storagepoolStoragepool.manual) &&
        Objects.equals(this.name, storagepoolStoragepool.name) &&
        Objects.equals(this.protectionPolicy, storagepoolStoragepool.protectionPolicy) &&
        Objects.equals(this.type, storagepoolStoragepool.type) &&
        Objects.equals(this.usage, storagepoolStoragepool.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDisableL3, canEnableL3, children, healthFlags, id, l3, l3Status, lnns, manual, name, protectionPolicy, type, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolStoragepool {\n");
    
    sb.append("    canDisableL3: ").append(toIndentedString(canDisableL3)).append("\n");
    sb.append("    canEnableL3: ").append(toIndentedString(canEnableL3)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    healthFlags: ").append(toIndentedString(healthFlags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
    sb.append("    l3Status: ").append(toIndentedString(l3Status)).append("\n");
    sb.append("    lnns: ").append(toIndentedString(lnns)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protectionPolicy: ").append(toIndentedString(protectionPolicy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

