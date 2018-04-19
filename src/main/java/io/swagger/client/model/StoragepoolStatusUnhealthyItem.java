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
import io.swagger.client.model.StoragepoolStatusUnhealthyItemAffectedItem;
import io.swagger.client.model.StoragepoolStatusUnhealthyItemDiskpool;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoragepoolStatusUnhealthyItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class StoragepoolStatusUnhealthyItem {
  @SerializedName("affected")
  private List<StoragepoolStatusUnhealthyItemAffectedItem> affected = new ArrayList<StoragepoolStatusUnhealthyItemAffectedItem>();

  @SerializedName("diskpool")
  private StoragepoolStatusUnhealthyItemDiskpool diskpool = null;

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

  public StoragepoolStatusUnhealthyItem affected(List<StoragepoolStatusUnhealthyItemAffectedItem> affected) {
    this.affected = affected;
    return this;
  }

  public StoragepoolStatusUnhealthyItem addAffectedItem(StoragepoolStatusUnhealthyItemAffectedItem affectedItem) {
    this.affected.add(affectedItem);
    return this;
  }

   /**
   * The affected nodes and/or drives.
   * @return affected
  **/
  @ApiModelProperty(required = true, value = "The affected nodes and/or drives.")
  public List<StoragepoolStatusUnhealthyItemAffectedItem> getAffected() {
    return affected;
  }

  public void setAffected(List<StoragepoolStatusUnhealthyItemAffectedItem> affected) {
    this.affected = affected;
  }

  public StoragepoolStatusUnhealthyItem diskpool(StoragepoolStatusUnhealthyItemDiskpool diskpool) {
    this.diskpool = diskpool;
    return this;
  }

   /**
   * 
   * @return diskpool
  **/
  @ApiModelProperty(value = "")
  public StoragepoolStatusUnhealthyItemDiskpool getDiskpool() {
    return diskpool;
  }

  public void setDiskpool(StoragepoolStatusUnhealthyItemDiskpool diskpool) {
    this.diskpool = diskpool;
  }

  public StoragepoolStatusUnhealthyItem healthFlags(List<HealthFlagsEnum> healthFlags) {
    this.healthFlags = healthFlags;
    return this;
  }

  public StoragepoolStatusUnhealthyItem addHealthFlagsItem(HealthFlagsEnum healthFlagsItem) {
    if (this.healthFlags == null) {
      this.healthFlags = new ArrayList<HealthFlagsEnum>();
    }
    this.healthFlags.add(healthFlagsItem);
    return this;
  }

   /**
   * An array of containing any health issues with this pool.  If the pool is healthy, the list is empty.
   * @return healthFlags
  **/
  @ApiModelProperty(value = "An array of containing any health issues with this pool.  If the pool is healthy, the list is empty.")
  public List<HealthFlagsEnum> getHealthFlags() {
    return healthFlags;
  }

  public void setHealthFlags(List<HealthFlagsEnum> healthFlags) {
    this.healthFlags = healthFlags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolStatusUnhealthyItem storagepoolStatusUnhealthyItem = (StoragepoolStatusUnhealthyItem) o;
    return Objects.equals(this.affected, storagepoolStatusUnhealthyItem.affected) &&
        Objects.equals(this.diskpool, storagepoolStatusUnhealthyItem.diskpool) &&
        Objects.equals(this.healthFlags, storagepoolStatusUnhealthyItem.healthFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affected, diskpool, healthFlags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolStatusUnhealthyItem {\n");
    
    sb.append("    affected: ").append(toIndentedString(affected)).append("\n");
    sb.append("    diskpool: ").append(toIndentedString(diskpool)).append("\n");
    sb.append("    healthFlags: ").append(toIndentedString(healthFlags)).append("\n");
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

