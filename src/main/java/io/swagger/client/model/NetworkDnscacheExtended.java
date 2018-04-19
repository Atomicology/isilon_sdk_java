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
 * NetworkDnscacheExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NetworkDnscacheExtended {
  @SerializedName("cache_entry_limit")
  private Integer cacheEntryLimit = null;

  @SerializedName("cluster_timeout")
  private Integer clusterTimeout = null;

  @SerializedName("dns_timeout")
  private Integer dnsTimeout = null;

  @SerializedName("eager_refresh")
  private Integer eagerRefresh = null;

  @SerializedName("testping_delta")
  private Integer testpingDelta = null;

  @SerializedName("ttl_max_noerror")
  private Integer ttlMaxNoerror = null;

  @SerializedName("ttl_max_nxdomain")
  private Integer ttlMaxNxdomain = null;

  @SerializedName("ttl_max_other")
  private Integer ttlMaxOther = null;

  @SerializedName("ttl_max_servfail")
  private Integer ttlMaxServfail = null;

  @SerializedName("ttl_min_noerror")
  private Integer ttlMinNoerror = null;

  @SerializedName("ttl_min_nxdomain")
  private Integer ttlMinNxdomain = null;

  @SerializedName("ttl_min_other")
  private Integer ttlMinOther = null;

  @SerializedName("ttl_min_servfail")
  private Integer ttlMinServfail = null;

  public NetworkDnscacheExtended cacheEntryLimit(Integer cacheEntryLimit) {
    this.cacheEntryLimit = cacheEntryLimit;
    return this;
  }

   /**
   * DNS cache entry limit
   * minimum: 1024
   * maximum: 1048576
   * @return cacheEntryLimit
  **/
  @ApiModelProperty(value = "DNS cache entry limit")
  public Integer getCacheEntryLimit() {
    return cacheEntryLimit;
  }

  public void setCacheEntryLimit(Integer cacheEntryLimit) {
    this.cacheEntryLimit = cacheEntryLimit;
  }

  public NetworkDnscacheExtended clusterTimeout(Integer clusterTimeout) {
    this.clusterTimeout = clusterTimeout;
    return this;
  }

   /**
   * Timeout value for calls made to other nodes in the cluster
   * minimum: 1
   * maximum: 30
   * @return clusterTimeout
  **/
  @ApiModelProperty(value = "Timeout value for calls made to other nodes in the cluster")
  public Integer getClusterTimeout() {
    return clusterTimeout;
  }

  public void setClusterTimeout(Integer clusterTimeout) {
    this.clusterTimeout = clusterTimeout;
  }

  public NetworkDnscacheExtended dnsTimeout(Integer dnsTimeout) {
    this.dnsTimeout = dnsTimeout;
    return this;
  }

   /**
   * Timeout value for calls made to the dns resolvers
   * minimum: 1
   * maximum: 30
   * @return dnsTimeout
  **/
  @ApiModelProperty(value = "Timeout value for calls made to the dns resolvers")
  public Integer getDnsTimeout() {
    return dnsTimeout;
  }

  public void setDnsTimeout(Integer dnsTimeout) {
    this.dnsTimeout = dnsTimeout;
  }

  public NetworkDnscacheExtended eagerRefresh(Integer eagerRefresh) {
    this.eagerRefresh = eagerRefresh;
    return this;
  }

   /**
   * Lead time to refresh cache entries nearing expiration
   * minimum: 0
   * maximum: 60
   * @return eagerRefresh
  **/
  @ApiModelProperty(value = "Lead time to refresh cache entries nearing expiration")
  public Integer getEagerRefresh() {
    return eagerRefresh;
  }

  public void setEagerRefresh(Integer eagerRefresh) {
    this.eagerRefresh = eagerRefresh;
  }

  public NetworkDnscacheExtended testpingDelta(Integer testpingDelta) {
    this.testpingDelta = testpingDelta;
    return this;
  }

   /**
   * Deltas for checking cbind cluster health
   * minimum: 0
   * maximum: 60
   * @return testpingDelta
  **/
  @ApiModelProperty(value = "Deltas for checking cbind cluster health")
  public Integer getTestpingDelta() {
    return testpingDelta;
  }

  public void setTestpingDelta(Integer testpingDelta) {
    this.testpingDelta = testpingDelta;
  }

  public NetworkDnscacheExtended ttlMaxNoerror(Integer ttlMaxNoerror) {
    this.ttlMaxNoerror = ttlMaxNoerror;
    return this;
  }

   /**
   * Upper bound on ttl for cache hits
   * minimum: 0
   * maximum: 3600
   * @return ttlMaxNoerror
  **/
  @ApiModelProperty(value = "Upper bound on ttl for cache hits")
  public Integer getTtlMaxNoerror() {
    return ttlMaxNoerror;
  }

  public void setTtlMaxNoerror(Integer ttlMaxNoerror) {
    this.ttlMaxNoerror = ttlMaxNoerror;
  }

  public NetworkDnscacheExtended ttlMaxNxdomain(Integer ttlMaxNxdomain) {
    this.ttlMaxNxdomain = ttlMaxNxdomain;
    return this;
  }

   /**
   * Upper bound on ttl for nxdomain
   * minimum: 0
   * maximum: 3600
   * @return ttlMaxNxdomain
  **/
  @ApiModelProperty(value = "Upper bound on ttl for nxdomain")
  public Integer getTtlMaxNxdomain() {
    return ttlMaxNxdomain;
  }

  public void setTtlMaxNxdomain(Integer ttlMaxNxdomain) {
    this.ttlMaxNxdomain = ttlMaxNxdomain;
  }

  public NetworkDnscacheExtended ttlMaxOther(Integer ttlMaxOther) {
    this.ttlMaxOther = ttlMaxOther;
    return this;
  }

   /**
   * Upper bound on ttl for non-nxdomain failures
   * minimum: 0
   * maximum: 3600
   * @return ttlMaxOther
  **/
  @ApiModelProperty(value = "Upper bound on ttl for non-nxdomain failures")
  public Integer getTtlMaxOther() {
    return ttlMaxOther;
  }

  public void setTtlMaxOther(Integer ttlMaxOther) {
    this.ttlMaxOther = ttlMaxOther;
  }

  public NetworkDnscacheExtended ttlMaxServfail(Integer ttlMaxServfail) {
    this.ttlMaxServfail = ttlMaxServfail;
    return this;
  }

   /**
   * Upper bound on ttl for server failures
   * minimum: 0
   * maximum: 3600
   * @return ttlMaxServfail
  **/
  @ApiModelProperty(value = "Upper bound on ttl for server failures")
  public Integer getTtlMaxServfail() {
    return ttlMaxServfail;
  }

  public void setTtlMaxServfail(Integer ttlMaxServfail) {
    this.ttlMaxServfail = ttlMaxServfail;
  }

  public NetworkDnscacheExtended ttlMinNoerror(Integer ttlMinNoerror) {
    this.ttlMinNoerror = ttlMinNoerror;
    return this;
  }

   /**
   * Lower bound on ttl for cache hits
   * minimum: 0
   * maximum: 3600
   * @return ttlMinNoerror
  **/
  @ApiModelProperty(value = "Lower bound on ttl for cache hits")
  public Integer getTtlMinNoerror() {
    return ttlMinNoerror;
  }

  public void setTtlMinNoerror(Integer ttlMinNoerror) {
    this.ttlMinNoerror = ttlMinNoerror;
  }

  public NetworkDnscacheExtended ttlMinNxdomain(Integer ttlMinNxdomain) {
    this.ttlMinNxdomain = ttlMinNxdomain;
    return this;
  }

   /**
   * Lower bound on ttl for nxdomain
   * minimum: 0
   * maximum: 3600
   * @return ttlMinNxdomain
  **/
  @ApiModelProperty(value = "Lower bound on ttl for nxdomain")
  public Integer getTtlMinNxdomain() {
    return ttlMinNxdomain;
  }

  public void setTtlMinNxdomain(Integer ttlMinNxdomain) {
    this.ttlMinNxdomain = ttlMinNxdomain;
  }

  public NetworkDnscacheExtended ttlMinOther(Integer ttlMinOther) {
    this.ttlMinOther = ttlMinOther;
    return this;
  }

   /**
   * Lower bound on ttl for non-nxdomain failures
   * minimum: 0
   * maximum: 3600
   * @return ttlMinOther
  **/
  @ApiModelProperty(value = "Lower bound on ttl for non-nxdomain failures")
  public Integer getTtlMinOther() {
    return ttlMinOther;
  }

  public void setTtlMinOther(Integer ttlMinOther) {
    this.ttlMinOther = ttlMinOther;
  }

  public NetworkDnscacheExtended ttlMinServfail(Integer ttlMinServfail) {
    this.ttlMinServfail = ttlMinServfail;
    return this;
  }

   /**
   * Lower bound on ttl for server failures
   * minimum: 0
   * maximum: 3600
   * @return ttlMinServfail
  **/
  @ApiModelProperty(value = "Lower bound on ttl for server failures")
  public Integer getTtlMinServfail() {
    return ttlMinServfail;
  }

  public void setTtlMinServfail(Integer ttlMinServfail) {
    this.ttlMinServfail = ttlMinServfail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkDnscacheExtended networkDnscacheExtended = (NetworkDnscacheExtended) o;
    return Objects.equals(this.cacheEntryLimit, networkDnscacheExtended.cacheEntryLimit) &&
        Objects.equals(this.clusterTimeout, networkDnscacheExtended.clusterTimeout) &&
        Objects.equals(this.dnsTimeout, networkDnscacheExtended.dnsTimeout) &&
        Objects.equals(this.eagerRefresh, networkDnscacheExtended.eagerRefresh) &&
        Objects.equals(this.testpingDelta, networkDnscacheExtended.testpingDelta) &&
        Objects.equals(this.ttlMaxNoerror, networkDnscacheExtended.ttlMaxNoerror) &&
        Objects.equals(this.ttlMaxNxdomain, networkDnscacheExtended.ttlMaxNxdomain) &&
        Objects.equals(this.ttlMaxOther, networkDnscacheExtended.ttlMaxOther) &&
        Objects.equals(this.ttlMaxServfail, networkDnscacheExtended.ttlMaxServfail) &&
        Objects.equals(this.ttlMinNoerror, networkDnscacheExtended.ttlMinNoerror) &&
        Objects.equals(this.ttlMinNxdomain, networkDnscacheExtended.ttlMinNxdomain) &&
        Objects.equals(this.ttlMinOther, networkDnscacheExtended.ttlMinOther) &&
        Objects.equals(this.ttlMinServfail, networkDnscacheExtended.ttlMinServfail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheEntryLimit, clusterTimeout, dnsTimeout, eagerRefresh, testpingDelta, ttlMaxNoerror, ttlMaxNxdomain, ttlMaxOther, ttlMaxServfail, ttlMinNoerror, ttlMinNxdomain, ttlMinOther, ttlMinServfail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkDnscacheExtended {\n");
    
    sb.append("    cacheEntryLimit: ").append(toIndentedString(cacheEntryLimit)).append("\n");
    sb.append("    clusterTimeout: ").append(toIndentedString(clusterTimeout)).append("\n");
    sb.append("    dnsTimeout: ").append(toIndentedString(dnsTimeout)).append("\n");
    sb.append("    eagerRefresh: ").append(toIndentedString(eagerRefresh)).append("\n");
    sb.append("    testpingDelta: ").append(toIndentedString(testpingDelta)).append("\n");
    sb.append("    ttlMaxNoerror: ").append(toIndentedString(ttlMaxNoerror)).append("\n");
    sb.append("    ttlMaxNxdomain: ").append(toIndentedString(ttlMaxNxdomain)).append("\n");
    sb.append("    ttlMaxOther: ").append(toIndentedString(ttlMaxOther)).append("\n");
    sb.append("    ttlMaxServfail: ").append(toIndentedString(ttlMaxServfail)).append("\n");
    sb.append("    ttlMinNoerror: ").append(toIndentedString(ttlMinNoerror)).append("\n");
    sb.append("    ttlMinNxdomain: ").append(toIndentedString(ttlMinNxdomain)).append("\n");
    sb.append("    ttlMinOther: ").append(toIndentedString(ttlMinOther)).append("\n");
    sb.append("    ttlMinServfail: ").append(toIndentedString(ttlMinServfail)).append("\n");
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

