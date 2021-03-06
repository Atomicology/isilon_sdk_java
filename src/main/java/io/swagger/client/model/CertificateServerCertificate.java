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
import io.swagger.client.model.CertificateServerCertificateFingerprint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CertificateServerCertificate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CertificateServerCertificate {
  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dnsnames")
  private List<String> dnsnames = new ArrayList<String>();

  @SerializedName("expired")
  private Boolean expired = null;

  @SerializedName("fingerprints")
  private List<CertificateServerCertificateFingerprint> fingerprints = new ArrayList<CertificateServerCertificateFingerprint>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("not_after")
  private Integer notAfter = null;

  @SerializedName("not_before")
  private Integer notBefore = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("valid")
  private Boolean valid = null;

  public CertificateServerCertificate _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Boolean identifying if a certificate is the default certificate.The default certificate is used as the fallback when no other certificates match a TLS enabled service&#39;s particular criteria. There must always be a configured default certificate.
   * @return _default
  **/
  @ApiModelProperty(required = true, value = "Boolean identifying if a certificate is the default certificate.The default certificate is used as the fallback when no other certificates match a TLS enabled service's particular criteria. There must always be a configured default certificate.")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public CertificateServerCertificate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description field associated with a certificate provided for administrative convenience.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description field associated with a certificate provided for administrative convenience.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CertificateServerCertificate dnsnames(List<String> dnsnames) {
    this.dnsnames = dnsnames;
    return this;
  }

  public CertificateServerCertificate addDnsnamesItem(String dnsnamesItem) {
    this.dnsnames.add(dnsnamesItem);
    return this;
  }

   /**
   * A list of DNS names/patterns for which this certificate is valid. This list is extracted from the certificates CN (Common Name) and subjectAtlName extension fields.
   * @return dnsnames
  **/
  @ApiModelProperty(required = true, value = "A list of DNS names/patterns for which this certificate is valid. This list is extracted from the certificates CN (Common Name) and subjectAtlName extension fields.")
  public List<String> getDnsnames() {
    return dnsnames;
  }

  public void setDnsnames(List<String> dnsnames) {
    this.dnsnames = dnsnames;
  }

  public CertificateServerCertificate expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * True if the certificate has expired and is no longer valid.
   * @return expired
  **/
  @ApiModelProperty(required = true, value = "True if the certificate has expired and is no longer valid.")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public CertificateServerCertificate fingerprints(List<CertificateServerCertificateFingerprint> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }

  public CertificateServerCertificate addFingerprintsItem(CertificateServerCertificateFingerprint fingerprintsItem) {
    this.fingerprints.add(fingerprintsItem);
    return this;
  }

   /**
   * A list of zero or more certificate fingerprints which can be used for certificate identification.
   * @return fingerprints
  **/
  @ApiModelProperty(required = true, value = "A list of zero or more certificate fingerprints which can be used for certificate identification.")
  public List<CertificateServerCertificateFingerprint> getFingerprints() {
    return fingerprints;
  }

  public void setFingerprints(List<CertificateServerCertificateFingerprint> fingerprints) {
    this.fingerprints = fingerprints;
  }

  public CertificateServerCertificate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique server certificate identifier.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique server certificate identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CertificateServerCertificate issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Certificate issuer field extracted from the certificate.
   * @return issuer
  **/
  @ApiModelProperty(required = true, value = "Certificate issuer field extracted from the certificate.")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public CertificateServerCertificate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Subject common name extracted from the certificate.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Subject common name extracted from the certificate.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CertificateServerCertificate notAfter(Integer notAfter) {
    this.notAfter = notAfter;
    return this;
  }

   /**
   * Certificate notAfter field extracted from the certificate encoded as a UNIX epoch timestamp.  The certificate is not valid after this timestamp.
   * @return notAfter
  **/
  @ApiModelProperty(required = true, value = "Certificate notAfter field extracted from the certificate encoded as a UNIX epoch timestamp.  The certificate is not valid after this timestamp.")
  public Integer getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(Integer notAfter) {
    this.notAfter = notAfter;
  }

  public CertificateServerCertificate notBefore(Integer notBefore) {
    this.notBefore = notBefore;
    return this;
  }

   /**
   * Certificate notBefore field extracted from the certificate encoded as a UNIX epoch timestamp.  The certificate is not valid before this timestamp.
   * @return notBefore
  **/
  @ApiModelProperty(required = true, value = "Certificate notBefore field extracted from the certificate encoded as a UNIX epoch timestamp.  The certificate is not valid before this timestamp.")
  public Integer getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(Integer notBefore) {
    this.notBefore = notBefore;
  }

  public CertificateServerCertificate subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Certificate subject field extracted from the certificate.
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "Certificate subject field extracted from the certificate.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CertificateServerCertificate valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * True if the certificate is valid (ie: not_before &lt;&#x3D; now &lt;&#x3D; not_after).
   * @return valid
  **/
  @ApiModelProperty(required = true, value = "True if the certificate is valid (ie: not_before <= now <= not_after).")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateServerCertificate certificateServerCertificate = (CertificateServerCertificate) o;
    return Objects.equals(this._default, certificateServerCertificate._default) &&
        Objects.equals(this.description, certificateServerCertificate.description) &&
        Objects.equals(this.dnsnames, certificateServerCertificate.dnsnames) &&
        Objects.equals(this.expired, certificateServerCertificate.expired) &&
        Objects.equals(this.fingerprints, certificateServerCertificate.fingerprints) &&
        Objects.equals(this.id, certificateServerCertificate.id) &&
        Objects.equals(this.issuer, certificateServerCertificate.issuer) &&
        Objects.equals(this.name, certificateServerCertificate.name) &&
        Objects.equals(this.notAfter, certificateServerCertificate.notAfter) &&
        Objects.equals(this.notBefore, certificateServerCertificate.notBefore) &&
        Objects.equals(this.subject, certificateServerCertificate.subject) &&
        Objects.equals(this.valid, certificateServerCertificate.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, description, dnsnames, expired, fingerprints, id, issuer, name, notAfter, notBefore, subject, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateServerCertificate {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsnames: ").append(toIndentedString(dnsnames)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    fingerprints: ").append(toIndentedString(fingerprints)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

