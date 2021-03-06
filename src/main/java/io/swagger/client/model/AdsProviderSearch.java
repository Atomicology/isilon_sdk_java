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
import io.swagger.client.model.AdsProviderSearchObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AdsProviderSearch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AdsProviderSearch {
  @SerializedName("objects")
  private List<AdsProviderSearchObject> objects = null;

  @SerializedName("resume")
  private String resume = null;

  public AdsProviderSearch objects(List<AdsProviderSearchObject> objects) {
    this.objects = objects;
    return this;
  }

  public AdsProviderSearch addObjectsItem(AdsProviderSearchObject objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<AdsProviderSearchObject>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @ApiModelProperty(value = "")
  public List<AdsProviderSearchObject> getObjects() {
    return objects;
  }

  public void setObjects(List<AdsProviderSearchObject> objects) {
    this.objects = objects;
  }

  public AdsProviderSearch resume(String resume) {
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
    AdsProviderSearch adsProviderSearch = (AdsProviderSearch) o;
    return Objects.equals(this.objects, adsProviderSearch.objects) &&
        Objects.equals(this.resume, adsProviderSearch.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects, resume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsProviderSearch {\n");
    
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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

