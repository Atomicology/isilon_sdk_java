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
import java.math.BigDecimal;

/**
 * CloudSettingsSettingsSleepTimeoutCloudGarbageCollection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class CloudSettingsSettingsSleepTimeoutCloudGarbageCollection {
  @SerializedName("recovery_with_tasks")
  private BigDecimal recoveryWithTasks = null;

  @SerializedName("recovery_without_tasks")
  private BigDecimal recoveryWithoutTasks = null;

  @SerializedName("with_tasks")
  private BigDecimal withTasks = null;

  @SerializedName("without_tasks")
  private BigDecimal withoutTasks = null;

  public CloudSettingsSettingsSleepTimeoutCloudGarbageCollection recoveryWithTasks(BigDecimal recoveryWithTasks) {
    this.recoveryWithTasks = recoveryWithTasks;
    return this;
  }

   /**
   * Sleep timeout for a recovery thread with pending tasks
   * @return recoveryWithTasks
  **/
  @ApiModelProperty(value = "Sleep timeout for a recovery thread with pending tasks")
  public BigDecimal getRecoveryWithTasks() {
    return recoveryWithTasks;
  }

  public void setRecoveryWithTasks(BigDecimal recoveryWithTasks) {
    this.recoveryWithTasks = recoveryWithTasks;
  }

  public CloudSettingsSettingsSleepTimeoutCloudGarbageCollection recoveryWithoutTasks(BigDecimal recoveryWithoutTasks) {
    this.recoveryWithoutTasks = recoveryWithoutTasks;
    return this;
  }

   /**
   * Sleep timeout for a recovery thread without pending tasks
   * @return recoveryWithoutTasks
  **/
  @ApiModelProperty(value = "Sleep timeout for a recovery thread without pending tasks")
  public BigDecimal getRecoveryWithoutTasks() {
    return recoveryWithoutTasks;
  }

  public void setRecoveryWithoutTasks(BigDecimal recoveryWithoutTasks) {
    this.recoveryWithoutTasks = recoveryWithoutTasks;
  }

  public CloudSettingsSettingsSleepTimeoutCloudGarbageCollection withTasks(BigDecimal withTasks) {
    this.withTasks = withTasks;
    return this;
  }

   /**
   * Sleep timeout for a non-recovery thread with pending tasks
   * @return withTasks
  **/
  @ApiModelProperty(value = "Sleep timeout for a non-recovery thread with pending tasks")
  public BigDecimal getWithTasks() {
    return withTasks;
  }

  public void setWithTasks(BigDecimal withTasks) {
    this.withTasks = withTasks;
  }

  public CloudSettingsSettingsSleepTimeoutCloudGarbageCollection withoutTasks(BigDecimal withoutTasks) {
    this.withoutTasks = withoutTasks;
    return this;
  }

   /**
   * Sleep timeout for a non-recovery thread without pending tasks
   * @return withoutTasks
  **/
  @ApiModelProperty(value = "Sleep timeout for a non-recovery thread without pending tasks")
  public BigDecimal getWithoutTasks() {
    return withoutTasks;
  }

  public void setWithoutTasks(BigDecimal withoutTasks) {
    this.withoutTasks = withoutTasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudSettingsSettingsSleepTimeoutCloudGarbageCollection cloudSettingsSettingsSleepTimeoutCloudGarbageCollection = (CloudSettingsSettingsSleepTimeoutCloudGarbageCollection) o;
    return Objects.equals(this.recoveryWithTasks, cloudSettingsSettingsSleepTimeoutCloudGarbageCollection.recoveryWithTasks) &&
        Objects.equals(this.recoveryWithoutTasks, cloudSettingsSettingsSleepTimeoutCloudGarbageCollection.recoveryWithoutTasks) &&
        Objects.equals(this.withTasks, cloudSettingsSettingsSleepTimeoutCloudGarbageCollection.withTasks) &&
        Objects.equals(this.withoutTasks, cloudSettingsSettingsSleepTimeoutCloudGarbageCollection.withoutTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recoveryWithTasks, recoveryWithoutTasks, withTasks, withoutTasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudSettingsSettingsSleepTimeoutCloudGarbageCollection {\n");
    
    sb.append("    recoveryWithTasks: ").append(toIndentedString(recoveryWithTasks)).append("\n");
    sb.append("    recoveryWithoutTasks: ").append(toIndentedString(recoveryWithoutTasks)).append("\n");
    sb.append("    withTasks: ").append(toIndentedString(withTasks)).append("\n");
    sb.append("    withoutTasks: ").append(toIndentedString(withoutTasks)).append("\n");
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
