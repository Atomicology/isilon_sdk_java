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
import io.swagger.client.model.CertificateServer;
import io.swagger.client.model.CertificateServerCertificate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CertificateServerExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class CertificateServerExtended {
  @SerializedName("certificates")
  private List<CertificateServerCertificate> certificates = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public CertificateServerExtended certificates(List<CertificateServerCertificate> certificates) {
    this.certificates = certificates;
    return this;
  }

  public CertificateServerExtended addCertificatesItem(CertificateServerCertificate certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<CertificateServerCertificate>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @ApiModelProperty(value = "")
  public List<CertificateServerCertificate> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<CertificateServerCertificate> certificates) {
    this.certificates = certificates;
  }

  public CertificateServerExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
   * @return resume
  **/
  @ApiModelProperty(value = "Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public CertificateServerExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateServerExtended certificateServerExtended = (CertificateServerExtended) o;
    return Objects.equals(this.certificates, certificateServerExtended.certificates) &&
        Objects.equals(this.resume, certificateServerExtended.resume) &&
        Objects.equals(this.total, certificateServerExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateServerExtended {\n");
    
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

