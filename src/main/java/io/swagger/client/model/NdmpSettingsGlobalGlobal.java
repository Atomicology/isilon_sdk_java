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

/**
 * NdmpSettingsGlobalGlobal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NdmpSettingsGlobalGlobal {
  @SerializedName("bre_max_num_contexts")
  private Integer breMaxNumContexts = null;

  /**
   * A unique identifier for the dma vendor.
   */
  @JsonAdapter(DmaEnum.Adapter.class)
  public enum DmaEnum {
    GENERIC("generic"),
    
    ATEMPO("atempo"),
    
    BAKBONE("bakbone"),
    
    COMMVAULT("commvault"),
    
    EMC("emc"),
    
    SYMANTEC("symantec"),
    
    TIVOLI("tivoli"),
    
    SYMANTEC_NETBACKUP("symantec-netbackup"),
    
    SYMANTEC_BACKUPEXEC("symantec-backupexec");

    private String value;

    DmaEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DmaEnum fromValue(String text) {
      for (DmaEnum b : DmaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DmaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DmaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DmaEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DmaEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dma")
  private DmaEnum dma = null;

  @SerializedName("msb_context_retention_duration")
  private Integer msbContextRetentionDuration = null;

  @SerializedName("msr_context_retention_duration")
  private Integer msrContextRetentionDuration = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("service")
  private Boolean service = null;

  public NdmpSettingsGlobalGlobal breMaxNumContexts(Integer breMaxNumContexts) {
    this.breMaxNumContexts = breMaxNumContexts;
    return this;
  }

   /**
   * Maximum number of BRE contexts.
   * @return breMaxNumContexts
  **/
  @ApiModelProperty(value = "Maximum number of BRE contexts.")
  public Integer getBreMaxNumContexts() {
    return breMaxNumContexts;
  }

  public void setBreMaxNumContexts(Integer breMaxNumContexts) {
    this.breMaxNumContexts = breMaxNumContexts;
  }

  public NdmpSettingsGlobalGlobal dma(DmaEnum dma) {
    this.dma = dma;
    return this;
  }

   /**
   * A unique identifier for the dma vendor.
   * @return dma
  **/
  @ApiModelProperty(value = "A unique identifier for the dma vendor.")
  public DmaEnum getDma() {
    return dma;
  }

  public void setDma(DmaEnum dma) {
    this.dma = dma;
  }

  public NdmpSettingsGlobalGlobal msbContextRetentionDuration(Integer msbContextRetentionDuration) {
    this.msbContextRetentionDuration = msbContextRetentionDuration;
    return this;
  }

   /**
   * Multi-Stream Backup context retention duration.
   * @return msbContextRetentionDuration
  **/
  @ApiModelProperty(value = "Multi-Stream Backup context retention duration.")
  public Integer getMsbContextRetentionDuration() {
    return msbContextRetentionDuration;
  }

  public void setMsbContextRetentionDuration(Integer msbContextRetentionDuration) {
    this.msbContextRetentionDuration = msbContextRetentionDuration;
  }

  public NdmpSettingsGlobalGlobal msrContextRetentionDuration(Integer msrContextRetentionDuration) {
    this.msrContextRetentionDuration = msrContextRetentionDuration;
    return this;
  }

   /**
   * Multi-Stream Restore context retention duration.
   * @return msrContextRetentionDuration
  **/
  @ApiModelProperty(value = "Multi-Stream Restore context retention duration.")
  public Integer getMsrContextRetentionDuration() {
    return msrContextRetentionDuration;
  }

  public void setMsrContextRetentionDuration(Integer msrContextRetentionDuration) {
    this.msrContextRetentionDuration = msrContextRetentionDuration;
  }

  public NdmpSettingsGlobalGlobal port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port to listen on.
   * @return port
  **/
  @ApiModelProperty(value = "The port to listen on.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public NdmpSettingsGlobalGlobal service(Boolean service) {
    this.service = service;
    return this;
  }

   /**
   * Property to enable/diable the NDMP service.
   * @return service
  **/
  @ApiModelProperty(value = "Property to enable/diable the NDMP service.")
  public Boolean isService() {
    return service;
  }

  public void setService(Boolean service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSettingsGlobalGlobal ndmpSettingsGlobalGlobal = (NdmpSettingsGlobalGlobal) o;
    return Objects.equals(this.breMaxNumContexts, ndmpSettingsGlobalGlobal.breMaxNumContexts) &&
        Objects.equals(this.dma, ndmpSettingsGlobalGlobal.dma) &&
        Objects.equals(this.msbContextRetentionDuration, ndmpSettingsGlobalGlobal.msbContextRetentionDuration) &&
        Objects.equals(this.msrContextRetentionDuration, ndmpSettingsGlobalGlobal.msrContextRetentionDuration) &&
        Objects.equals(this.port, ndmpSettingsGlobalGlobal.port) &&
        Objects.equals(this.service, ndmpSettingsGlobalGlobal.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breMaxNumContexts, dma, msbContextRetentionDuration, msrContextRetentionDuration, port, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSettingsGlobalGlobal {\n");
    
    sb.append("    breMaxNumContexts: ").append(toIndentedString(breMaxNumContexts)).append("\n");
    sb.append("    dma: ").append(toIndentedString(dma)).append("\n");
    sb.append("    msbContextRetentionDuration: ").append(toIndentedString(msbContextRetentionDuration)).append("\n");
    sb.append("    msrContextRetentionDuration: ").append(toIndentedString(msrContextRetentionDuration)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

