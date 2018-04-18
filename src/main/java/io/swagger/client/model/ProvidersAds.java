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
import io.swagger.client.model.ProvidersAdsAdsItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProvidersAds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ProvidersAds {
  @SerializedName("ads")
  private List<ProvidersAdsAdsItem> ads = null;

  public ProvidersAds ads(List<ProvidersAdsAdsItem> ads) {
    this.ads = ads;
    return this;
  }

  public ProvidersAds addAdsItem(ProvidersAdsAdsItem adsItem) {
    if (this.ads == null) {
      this.ads = new ArrayList<ProvidersAdsAdsItem>();
    }
    this.ads.add(adsItem);
    return this;
  }

   /**
   * Get ads
   * @return ads
  **/
  @ApiModelProperty(value = "")
  public List<ProvidersAdsAdsItem> getAds() {
    return ads;
  }

  public void setAds(List<ProvidersAdsAdsItem> ads) {
    this.ads = ads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersAds providersAds = (ProvidersAds) o;
    return Objects.equals(this.ads, providersAds.ads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ads);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersAds {\n");
    
    sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
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

