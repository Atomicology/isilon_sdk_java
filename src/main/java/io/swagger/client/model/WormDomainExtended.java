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
import io.swagger.client.model.WormDomain;
import java.io.IOException;

/**
 * WormDomainExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class WormDomainExtended {
  @SerializedName("autocommit_offset")
  private Integer autocommitOffset = null;

  @SerializedName("default_retention")
  private String defaultRetention = null;

  @SerializedName("max_retention")
  private String maxRetention = null;

  @SerializedName("min_retention")
  private String minRetention = null;

  @SerializedName("override_date")
  private Integer overrideDate = null;

  /**
   * When this value is set to &#39;on&#39;, files in this domain can be deleted through the privileged delete feature. If this value is set to &#39;disabled&#39;, privileged file deletes are permanently disabled and cannot be turned on again.
   */
  @JsonAdapter(PrivilegedDeleteEnum.Adapter.class)
  public enum PrivilegedDeleteEnum {
    ON("on"),
    
    OFF("off"),
    
    DISABLED("disabled");

    private String value;

    PrivilegedDeleteEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivilegedDeleteEnum fromValue(String text) {
      for (PrivilegedDeleteEnum b : PrivilegedDeleteEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrivilegedDeleteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivilegedDeleteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivilegedDeleteEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PrivilegedDeleteEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("privileged_delete")
  private PrivilegedDeleteEnum privilegedDelete = null;

  /**
   * Specifies whether the domain is an enterprise domain or a compliance domain. Compliance domains can not be created on enterprise clusters. Enterprise and compliance domains can be created on compliance clusters.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ENTERPRISE("enterprise"),
    
    COMPLIANCE("compliance"),
    
    COMPLIANCE_LEGACY_("compliance (legacy)");

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

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("incomplete")
  private Boolean incomplete = null;

  @SerializedName("lin")
  private Integer lin = null;

  @SerializedName("max_modifies")
  private Integer maxModifies = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("total_modifies")
  private Integer totalModifies = null;

  public WormDomainExtended autocommitOffset(Integer autocommitOffset) {
    this.autocommitOffset = autocommitOffset;
    return this;
  }

   /**
   * Specifies the autocommit time period for the domain in seconds.  After a file is in the domain without being modified for the specified time period, the file is automatically committed. If this parameter is set to null, there is no autocommit time, and files must be committed manually.
   * minimum: 0
   * @return autocommitOffset
  **/
  @ApiModelProperty(value = "Specifies the autocommit time period for the domain in seconds.  After a file is in the domain without being modified for the specified time period, the file is automatically committed. If this parameter is set to null, there is no autocommit time, and files must be committed manually.")
  public Integer getAutocommitOffset() {
    return autocommitOffset;
  }

  public void setAutocommitOffset(Integer autocommitOffset) {
    this.autocommitOffset = autocommitOffset;
  }

  public WormDomainExtended defaultRetention(String defaultRetention) {
    this.defaultRetention = defaultRetention;
    return this;
  }

   /**
   * Get defaultRetention
   * @return defaultRetention
  **/
  @ApiModelProperty(value = "")
  public String getDefaultRetention() {
    return defaultRetention;
  }

  public void setDefaultRetention(String defaultRetention) {
    this.defaultRetention = defaultRetention;
  }

  public WormDomainExtended maxRetention(String maxRetention) {
    this.maxRetention = maxRetention;
    return this;
  }

   /**
   * Get maxRetention
   * @return maxRetention
  **/
  @ApiModelProperty(value = "")
  public String getMaxRetention() {
    return maxRetention;
  }

  public void setMaxRetention(String maxRetention) {
    this.maxRetention = maxRetention;
  }

  public WormDomainExtended minRetention(String minRetention) {
    this.minRetention = minRetention;
    return this;
  }

   /**
   * Get minRetention
   * @return minRetention
  **/
  @ApiModelProperty(value = "")
  public String getMinRetention() {
    return minRetention;
  }

  public void setMinRetention(String minRetention) {
    this.minRetention = minRetention;
  }

  public WormDomainExtended overrideDate(Integer overrideDate) {
    this.overrideDate = overrideDate;
    return this;
  }

   /**
   * Specifies the override retention date for the domain. If this date is later than the retention date for any committed file, the file will remain protected until the override retention date.
   * minimum: 0
   * @return overrideDate
  **/
  @ApiModelProperty(value = "Specifies the override retention date for the domain. If this date is later than the retention date for any committed file, the file will remain protected until the override retention date.")
  public Integer getOverrideDate() {
    return overrideDate;
  }

  public void setOverrideDate(Integer overrideDate) {
    this.overrideDate = overrideDate;
  }

  public WormDomainExtended privilegedDelete(PrivilegedDeleteEnum privilegedDelete) {
    this.privilegedDelete = privilegedDelete;
    return this;
  }

   /**
   * When this value is set to &#39;on&#39;, files in this domain can be deleted through the privileged delete feature. If this value is set to &#39;disabled&#39;, privileged file deletes are permanently disabled and cannot be turned on again.
   * @return privilegedDelete
  **/
  @ApiModelProperty(required = true, value = "When this value is set to 'on', files in this domain can be deleted through the privileged delete feature. If this value is set to 'disabled', privileged file deletes are permanently disabled and cannot be turned on again.")
  public PrivilegedDeleteEnum getPrivilegedDelete() {
    return privilegedDelete;
  }

  public void setPrivilegedDelete(PrivilegedDeleteEnum privilegedDelete) {
    this.privilegedDelete = privilegedDelete;
  }

  public WormDomainExtended type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies whether the domain is an enterprise domain or a compliance domain. Compliance domains can not be created on enterprise clusters. Enterprise and compliance domains can be created on compliance clusters.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the domain is an enterprise domain or a compliance domain. Compliance domains can not be created on enterprise clusters. Enterprise and compliance domains can be created on compliance clusters.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public WormDomainExtended id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the system-assigned ID for the protection domain.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Specifies the system-assigned ID for the protection domain.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WormDomainExtended incomplete(Boolean incomplete) {
    this.incomplete = incomplete;
    return this;
  }

   /**
   * True if OneFS is still in the process of creating this domain and is unable to prevent files from being modified or deleted. If false, indicates that the domain is fully created and is able to prevent files from being modified or deleted.
   * @return incomplete
  **/
  @ApiModelProperty(required = true, value = "True if OneFS is still in the process of creating this domain and is unable to prevent files from being modified or deleted. If false, indicates that the domain is fully created and is able to prevent files from being modified or deleted.")
  public Boolean isIncomplete() {
    return incomplete;
  }

  public void setIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
  }

  public WormDomainExtended lin(Integer lin) {
    this.lin = lin;
    return this;
  }

   /**
   * Specifies the logical inode number (LIN) for the root of this domain.
   * @return lin
  **/
  @ApiModelProperty(required = true, value = "Specifies the logical inode number (LIN) for the root of this domain.")
  public Integer getLin() {
    return lin;
  }

  public void setLin(Integer lin) {
    this.lin = lin;
  }

  public WormDomainExtended maxModifies(Integer maxModifies) {
    this.maxModifies = maxModifies;
    return this;
  }

   /**
   * Specifies the maximum amount of time, in seconds, that a file in this domain will be protected. This setting will override the retention period of any file committed with a longer retention period. If this parameter is set to null, an infinite length retention period is set.
   * @return maxModifies
  **/
  @ApiModelProperty(required = true, value = "Specifies the maximum amount of time, in seconds, that a file in this domain will be protected. This setting will override the retention period of any file committed with a longer retention period. If this parameter is set to null, an infinite length retention period is set.")
  public Integer getMaxModifies() {
    return maxModifies;
  }

  public void setMaxModifies(Integer maxModifies) {
    this.maxModifies = maxModifies;
  }

  public WormDomainExtended path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Specifies the root path of this domain. Files in this directory and all sub-directories will be protected.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Specifies the root path of this domain. Files in this directory and all sub-directories will be protected.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public WormDomainExtended totalModifies(Integer totalModifies) {
    this.totalModifies = totalModifies;
    return this;
  }

   /**
   * Specifies the number of times this domain has been modified and the number of times the attributes for the domain have changed. A SmartLock domain can be modified a fixed number of times as defined by the &#39;max_modifies&#39; parameter.
   * @return totalModifies
  **/
  @ApiModelProperty(required = true, value = "Specifies the number of times this domain has been modified and the number of times the attributes for the domain have changed. A SmartLock domain can be modified a fixed number of times as defined by the 'max_modifies' parameter.")
  public Integer getTotalModifies() {
    return totalModifies;
  }

  public void setTotalModifies(Integer totalModifies) {
    this.totalModifies = totalModifies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WormDomainExtended wormDomainExtended = (WormDomainExtended) o;
    return Objects.equals(this.autocommitOffset, wormDomainExtended.autocommitOffset) &&
        Objects.equals(this.defaultRetention, wormDomainExtended.defaultRetention) &&
        Objects.equals(this.maxRetention, wormDomainExtended.maxRetention) &&
        Objects.equals(this.minRetention, wormDomainExtended.minRetention) &&
        Objects.equals(this.overrideDate, wormDomainExtended.overrideDate) &&
        Objects.equals(this.privilegedDelete, wormDomainExtended.privilegedDelete) &&
        Objects.equals(this.type, wormDomainExtended.type) &&
        Objects.equals(this.id, wormDomainExtended.id) &&
        Objects.equals(this.incomplete, wormDomainExtended.incomplete) &&
        Objects.equals(this.lin, wormDomainExtended.lin) &&
        Objects.equals(this.maxModifies, wormDomainExtended.maxModifies) &&
        Objects.equals(this.path, wormDomainExtended.path) &&
        Objects.equals(this.totalModifies, wormDomainExtended.totalModifies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autocommitOffset, defaultRetention, maxRetention, minRetention, overrideDate, privilegedDelete, type, id, incomplete, lin, maxModifies, path, totalModifies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WormDomainExtended {\n");
    
    sb.append("    autocommitOffset: ").append(toIndentedString(autocommitOffset)).append("\n");
    sb.append("    defaultRetention: ").append(toIndentedString(defaultRetention)).append("\n");
    sb.append("    maxRetention: ").append(toIndentedString(maxRetention)).append("\n");
    sb.append("    minRetention: ").append(toIndentedString(minRetention)).append("\n");
    sb.append("    overrideDate: ").append(toIndentedString(overrideDate)).append("\n");
    sb.append("    privilegedDelete: ").append(toIndentedString(privilegedDelete)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incomplete: ").append(toIndentedString(incomplete)).append("\n");
    sb.append("    lin: ").append(toIndentedString(lin)).append("\n");
    sb.append("    maxModifies: ").append(toIndentedString(maxModifies)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    totalModifies: ").append(toIndentedString(totalModifies)).append("\n");
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

