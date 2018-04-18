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
 * ProvidersKrb5IdParamsKeytabEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ProvidersKrb5IdParamsKeytabEntry {
  @SerializedName("encryption")
  private List<String> encryption = null;

  @SerializedName("kvno")
  private Integer kvno = null;

  @SerializedName("spn")
  private String spn = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  public ProvidersKrb5IdParamsKeytabEntry encryption(List<String> encryption) {
    this.encryption = encryption;
    return this;
  }

  public ProvidersKrb5IdParamsKeytabEntry addEncryptionItem(String encryptionItem) {
    if (this.encryption == null) {
      this.encryption = new ArrayList<String>();
    }
    this.encryption.add(encryptionItem);
    return this;
  }

   /**
   * Specifies the encryption types.
   * @return encryption
  **/
  @ApiModelProperty(value = "Specifies the encryption types.")
  public List<String> getEncryption() {
    return encryption;
  }

  public void setEncryption(List<String> encryption) {
    this.encryption = encryption;
  }

  public ProvidersKrb5IdParamsKeytabEntry kvno(Integer kvno) {
    this.kvno = kvno;
    return this;
  }

   /**
   * Specifies the version number of the SPN key.
   * minimum: 0
   * maximum: 4294967295
   * @return kvno
  **/
  @ApiModelProperty(value = "Specifies the version number of the SPN key.")
  public Integer getKvno() {
    return kvno;
  }

  public void setKvno(Integer kvno) {
    this.kvno = kvno;
  }

  public ProvidersKrb5IdParamsKeytabEntry spn(String spn) {
    this.spn = spn;
    return this;
  }

   /**
   * Specifies the Service Principal Name (SPN).
   * @return spn
  **/
  @ApiModelProperty(value = "Specifies the Service Principal Name (SPN).")
  public String getSpn() {
    return spn;
  }

  public void setSpn(String spn) {
    this.spn = spn;
  }

  public ProvidersKrb5IdParamsKeytabEntry timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Specifies the time the SPN key was created.
   * minimum: 0
   * maximum: 4294967295
   * @return timestamp
  **/
  @ApiModelProperty(value = "Specifies the time the SPN key was created.")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersKrb5IdParamsKeytabEntry providersKrb5IdParamsKeytabEntry = (ProvidersKrb5IdParamsKeytabEntry) o;
    return Objects.equals(this.encryption, providersKrb5IdParamsKeytabEntry.encryption) &&
        Objects.equals(this.kvno, providersKrb5IdParamsKeytabEntry.kvno) &&
        Objects.equals(this.spn, providersKrb5IdParamsKeytabEntry.spn) &&
        Objects.equals(this.timestamp, providersKrb5IdParamsKeytabEntry.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryption, kvno, spn, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersKrb5IdParamsKeytabEntry {\n");
    
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
    sb.append("    kvno: ").append(toIndentedString(kvno)).append("\n");
    sb.append("    spn: ").append(toIndentedString(spn)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
