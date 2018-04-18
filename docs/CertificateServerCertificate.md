
# CertificateServerCertificate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_default** | **Boolean** | Boolean identifying if a certificate is the default certificate.The default certificate is used as the fallback when no other certificates match a TLS enabled service&#39;s particular criteria. There must always be a configured default certificate. | 
**description** | **String** | Description field associated with a certificate provided for administrative convenience. | 
**dnsnames** | **List&lt;String&gt;** | A list of DNS names/patterns for which this certificate is valid. This list is extracted from the certificates CN (Common Name) and subjectAtlName extension fields. | 
**expired** | **Boolean** | True if the certificate has expired and is no longer valid. | 
**fingerprints** | [**List&lt;CertificateServerCertificateFingerprint&gt;**](CertificateServerCertificateFingerprint.md) | A list of zero or more certificate fingerprints which can be used for certificate identification. | 
**id** | **String** | Unique server certificate identifier. | 
**issuer** | **String** | Certificate issuer field extracted from the certificate. | 
**name** | **String** | Subject common name extracted from the certificate. | 
**notAfter** | **Integer** | Certificate notAfter field extracted from the certificate encoded as a UNIX epoch timestamp.  The certificate is not valid after this timestamp. | 
**notBefore** | **Integer** | Certificate notBefore field extracted from the certificate encoded as a UNIX epoch timestamp.  The certificate is not valid before this timestamp. | 
**subject** | **String** | Certificate subject field extracted from the certificate. | 
**valid** | **Boolean** | True if the certificate is valid (ie: not_before &lt;&#x3D; now &lt;&#x3D; not_after). | 



