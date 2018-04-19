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
import io.swagger.client.model.SyncPolicySourceNetwork;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Global SyncIQ settings.
 */
@ApiModel(description = "Global SyncIQ settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SyncSettingsExtended {
  @SerializedName("burst_memory_constraint")
  private Integer burstMemoryConstraint = null;

  @SerializedName("burst_socket_buffer_size")
  private Integer burstSocketBufferSize = null;

  @SerializedName("force_interface")
  private Boolean forceInterface = null;

  @SerializedName("report_email")
  private List<String> reportEmail = null;

  @SerializedName("report_max_age")
  private Integer reportMaxAge = null;

  @SerializedName("report_max_count")
  private Integer reportMaxCount = null;

  @SerializedName("restrict_target_network")
  private Boolean restrictTargetNetwork = null;

  @SerializedName("rpo_alerts")
  private Boolean rpoAlerts = null;

  /**
   * Specifies if the SyncIQ service currently on, paused, or off.  If paused, all sync jobs will be paused.  If turned off, all jobs will be canceled.
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    ON("on"),
    
    OFF("off"),
    
    PAUSED("paused");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("service")
  private ServiceEnum service = null;

  @SerializedName("source_network")
  private SyncPolicySourceNetwork sourceNetwork = null;

  @SerializedName("tw_chkpt_interval")
  private Integer twChkptInterval = null;

  public SyncSettingsExtended burstMemoryConstraint(Integer burstMemoryConstraint) {
    this.burstMemoryConstraint = burstMemoryConstraint;
    return this;
  }

   /**
   * The per-worker burst socket memory constraint, in bytes.
   * @return burstMemoryConstraint
  **/
  @ApiModelProperty(value = "The per-worker burst socket memory constraint, in bytes.")
  public Integer getBurstMemoryConstraint() {
    return burstMemoryConstraint;
  }

  public void setBurstMemoryConstraint(Integer burstMemoryConstraint) {
    this.burstMemoryConstraint = burstMemoryConstraint;
  }

  public SyncSettingsExtended burstSocketBufferSize(Integer burstSocketBufferSize) {
    this.burstSocketBufferSize = burstSocketBufferSize;
    return this;
  }

   /**
   * The per-worker burst socket buffer coalesced data, in bytes.
   * @return burstSocketBufferSize
  **/
  @ApiModelProperty(value = "The per-worker burst socket buffer coalesced data, in bytes.")
  public Integer getBurstSocketBufferSize() {
    return burstSocketBufferSize;
  }

  public void setBurstSocketBufferSize(Integer burstSocketBufferSize) {
    this.burstSocketBufferSize = burstSocketBufferSize;
  }

  public SyncSettingsExtended forceInterface(Boolean forceInterface) {
    this.forceInterface = forceInterface;
    return this;
  }

   /**
   * NOTE: This field should not be changed without the help of Isilon support.  Default for the \&quot;force_interface\&quot; property that will be applied to each new sync policy unless otherwise specified at the time of policy creation.  Determines whether data is sent only through the subnet and pool specified in the \&quot;source_network\&quot; field. This option can be useful if there are multiple interfaces for the given source subnet.
   * @return forceInterface
  **/
  @ApiModelProperty(value = "NOTE: This field should not be changed without the help of Isilon support.  Default for the \"force_interface\" property that will be applied to each new sync policy unless otherwise specified at the time of policy creation.  Determines whether data is sent only through the subnet and pool specified in the \"source_network\" field. This option can be useful if there are multiple interfaces for the given source subnet.")
  public Boolean isForceInterface() {
    return forceInterface;
  }

  public void setForceInterface(Boolean forceInterface) {
    this.forceInterface = forceInterface;
  }

  public SyncSettingsExtended reportEmail(List<String> reportEmail) {
    this.reportEmail = reportEmail;
    return this;
  }

  public SyncSettingsExtended addReportEmailItem(String reportEmailItem) {
    if (this.reportEmail == null) {
      this.reportEmail = new ArrayList<String>();
    }
    this.reportEmail.add(reportEmailItem);
    return this;
  }

   /**
   * Email sync reports to these addresses.
   * @return reportEmail
  **/
  @ApiModelProperty(value = "Email sync reports to these addresses.")
  public List<String> getReportEmail() {
    return reportEmail;
  }

  public void setReportEmail(List<String> reportEmail) {
    this.reportEmail = reportEmail;
  }

  public SyncSettingsExtended reportMaxAge(Integer reportMaxAge) {
    this.reportMaxAge = reportMaxAge;
    return this;
  }

   /**
   * The default length of time (in seconds) a policy report will be stored.
   * @return reportMaxAge
  **/
  @ApiModelProperty(value = "The default length of time (in seconds) a policy report will be stored.")
  public Integer getReportMaxAge() {
    return reportMaxAge;
  }

  public void setReportMaxAge(Integer reportMaxAge) {
    this.reportMaxAge = reportMaxAge;
  }

  public SyncSettingsExtended reportMaxCount(Integer reportMaxCount) {
    this.reportMaxCount = reportMaxCount;
    return this;
  }

   /**
   * The default maximum number of reports to retain for a policy.
   * minimum: 1
   * maximum: 2000
   * @return reportMaxCount
  **/
  @ApiModelProperty(value = "The default maximum number of reports to retain for a policy.")
  public Integer getReportMaxCount() {
    return reportMaxCount;
  }

  public void setReportMaxCount(Integer reportMaxCount) {
    this.reportMaxCount = reportMaxCount;
  }

  public SyncSettingsExtended restrictTargetNetwork(Boolean restrictTargetNetwork) {
    this.restrictTargetNetwork = restrictTargetNetwork;
    return this;
  }

   /**
   * Default for the \&quot;restrict_target_network\&quot; property that will be applied to each new sync policy unless otherwise specified at the time of policy creation.  If you specify true, and you specify a SmartConnect zone in the \&quot;target_host\&quot; field, replication policies will connect only to nodes in the specified SmartConnect zone.  If you specify false, replication policies are not restricted to specific nodes on the target cluster.
   * @return restrictTargetNetwork
  **/
  @ApiModelProperty(value = "Default for the \"restrict_target_network\" property that will be applied to each new sync policy unless otherwise specified at the time of policy creation.  If you specify true, and you specify a SmartConnect zone in the \"target_host\" field, replication policies will connect only to nodes in the specified SmartConnect zone.  If you specify false, replication policies are not restricted to specific nodes on the target cluster.")
  public Boolean isRestrictTargetNetwork() {
    return restrictTargetNetwork;
  }

  public void setRestrictTargetNetwork(Boolean restrictTargetNetwork) {
    this.restrictTargetNetwork = restrictTargetNetwork;
  }

  public SyncSettingsExtended rpoAlerts(Boolean rpoAlerts) {
    this.rpoAlerts = rpoAlerts;
    return this;
  }

   /**
   * If disabled, no RPO alerts will be generated.
   * @return rpoAlerts
  **/
  @ApiModelProperty(value = "If disabled, no RPO alerts will be generated.")
  public Boolean isRpoAlerts() {
    return rpoAlerts;
  }

  public void setRpoAlerts(Boolean rpoAlerts) {
    this.rpoAlerts = rpoAlerts;
  }

  public SyncSettingsExtended service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * Specifies if the SyncIQ service currently on, paused, or off.  If paused, all sync jobs will be paused.  If turned off, all jobs will be canceled.
   * @return service
  **/
  @ApiModelProperty(value = "Specifies if the SyncIQ service currently on, paused, or off.  If paused, all sync jobs will be paused.  If turned off, all jobs will be canceled.")
  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }

  public SyncSettingsExtended sourceNetwork(SyncPolicySourceNetwork sourceNetwork) {
    this.sourceNetwork = sourceNetwork;
    return this;
  }

   /**
   * Restricts replication policies on the local cluster to running on the specified subnet and pool.
   * @return sourceNetwork
  **/
  @ApiModelProperty(value = "Restricts replication policies on the local cluster to running on the specified subnet and pool.")
  public SyncPolicySourceNetwork getSourceNetwork() {
    return sourceNetwork;
  }

  public void setSourceNetwork(SyncPolicySourceNetwork sourceNetwork) {
    this.sourceNetwork = sourceNetwork;
  }

  public SyncSettingsExtended twChkptInterval(Integer twChkptInterval) {
    this.twChkptInterval = twChkptInterval;
    return this;
  }

   /**
   * The interval (in seconds) in which treewalk syncs are forced to checkpoint.
   * minimum: 0
   * @return twChkptInterval
  **/
  @ApiModelProperty(value = "The interval (in seconds) in which treewalk syncs are forced to checkpoint.")
  public Integer getTwChkptInterval() {
    return twChkptInterval;
  }

  public void setTwChkptInterval(Integer twChkptInterval) {
    this.twChkptInterval = twChkptInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncSettingsExtended syncSettingsExtended = (SyncSettingsExtended) o;
    return Objects.equals(this.burstMemoryConstraint, syncSettingsExtended.burstMemoryConstraint) &&
        Objects.equals(this.burstSocketBufferSize, syncSettingsExtended.burstSocketBufferSize) &&
        Objects.equals(this.forceInterface, syncSettingsExtended.forceInterface) &&
        Objects.equals(this.reportEmail, syncSettingsExtended.reportEmail) &&
        Objects.equals(this.reportMaxAge, syncSettingsExtended.reportMaxAge) &&
        Objects.equals(this.reportMaxCount, syncSettingsExtended.reportMaxCount) &&
        Objects.equals(this.restrictTargetNetwork, syncSettingsExtended.restrictTargetNetwork) &&
        Objects.equals(this.rpoAlerts, syncSettingsExtended.rpoAlerts) &&
        Objects.equals(this.service, syncSettingsExtended.service) &&
        Objects.equals(this.sourceNetwork, syncSettingsExtended.sourceNetwork) &&
        Objects.equals(this.twChkptInterval, syncSettingsExtended.twChkptInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burstMemoryConstraint, burstSocketBufferSize, forceInterface, reportEmail, reportMaxAge, reportMaxCount, restrictTargetNetwork, rpoAlerts, service, sourceNetwork, twChkptInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncSettingsExtended {\n");
    
    sb.append("    burstMemoryConstraint: ").append(toIndentedString(burstMemoryConstraint)).append("\n");
    sb.append("    burstSocketBufferSize: ").append(toIndentedString(burstSocketBufferSize)).append("\n");
    sb.append("    forceInterface: ").append(toIndentedString(forceInterface)).append("\n");
    sb.append("    reportEmail: ").append(toIndentedString(reportEmail)).append("\n");
    sb.append("    reportMaxAge: ").append(toIndentedString(reportMaxAge)).append("\n");
    sb.append("    reportMaxCount: ").append(toIndentedString(reportMaxCount)).append("\n");
    sb.append("    restrictTargetNetwork: ").append(toIndentedString(restrictTargetNetwork)).append("\n");
    sb.append("    rpoAlerts: ").append(toIndentedString(rpoAlerts)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sourceNetwork: ").append(toIndentedString(sourceNetwork)).append("\n");
    sb.append("    twChkptInterval: ").append(toIndentedString(twChkptInterval)).append("\n");
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

