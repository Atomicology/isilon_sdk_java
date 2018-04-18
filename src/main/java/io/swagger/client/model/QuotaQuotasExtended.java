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
import io.swagger.client.model.QuotaQuotaExtended;
import io.swagger.client.model.QuotaQuotas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QuotaQuotasExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class QuotaQuotasExtended {
  @SerializedName("quotas")
  private List<QuotaQuotaExtended> quotas = null;

  @SerializedName("resume")
  private String resume = null;

  public QuotaQuotasExtended quotas(List<QuotaQuotaExtended> quotas) {
    this.quotas = quotas;
    return this;
  }

  public QuotaQuotasExtended addQuotasItem(QuotaQuotaExtended quotasItem) {
    if (this.quotas == null) {
      this.quotas = new ArrayList<QuotaQuotaExtended>();
    }
    this.quotas.add(quotasItem);
    return this;
  }

   /**
   * Get quotas
   * @return quotas
  **/
  @ApiModelProperty(value = "")
  public List<QuotaQuotaExtended> getQuotas() {
    return quotas;
  }

  public void setQuotas(List<QuotaQuotaExtended> quotas) {
    this.quotas = quotas;
  }

  public QuotaQuotasExtended resume(String resume) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaQuotasExtended quotaQuotasExtended = (QuotaQuotasExtended) o;
    return Objects.equals(this.quotas, quotaQuotasExtended.quotas) &&
        Objects.equals(this.resume, quotaQuotasExtended.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotas, resume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaQuotasExtended {\n");
    
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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
