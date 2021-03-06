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
 * LicenseLicenseCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class LicenseLicenseCreateParams {
  @SerializedName("evaluation")
  private List<String> evaluation = null;

  @SerializedName("license_file_content")
  private String licenseFileContent = null;

  @SerializedName("license_file_path")
  private String licenseFilePath = null;

  public LicenseLicenseCreateParams evaluation(List<String> evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  public LicenseLicenseCreateParams addEvaluationItem(String evaluationItem) {
    if (this.evaluation == null) {
      this.evaluation = new ArrayList<String>();
    }
    this.evaluation.add(evaluationItem);
    return this;
  }

   /**
   * A list of evaluation licenses to enable on the cluster.
   * @return evaluation
  **/
  @ApiModelProperty(value = "A list of evaluation licenses to enable on the cluster.")
  public List<String> getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(List<String> evaluation) {
    this.evaluation = evaluation;
  }

  public LicenseLicenseCreateParams licenseFileContent(String licenseFileContent) {
    this.licenseFileContent = licenseFileContent;
    return this;
  }

   /**
   * License file string content. The license file is obtained from EMC&#39;s SLC web portal. Do not use with the license_file_path option.
   * @return licenseFileContent
  **/
  @ApiModelProperty(value = "License file string content. The license file is obtained from EMC's SLC web portal. Do not use with the license_file_path option.")
  public String getLicenseFileContent() {
    return licenseFileContent;
  }

  public void setLicenseFileContent(String licenseFileContent) {
    this.licenseFileContent = licenseFileContent;
  }

  public LicenseLicenseCreateParams licenseFilePath(String licenseFilePath) {
    this.licenseFilePath = licenseFilePath;
    return this;
  }

   /**
   * Path to new license file, must be under /ifs. The license file is obtained from EMC&#39;s SLC web portal. Do not include the path when only enabling evaluation licenses. Do not use with the license_file_content option.
   * @return licenseFilePath
  **/
  @ApiModelProperty(value = "Path to new license file, must be under /ifs. The license file is obtained from EMC's SLC web portal. Do not include the path when only enabling evaluation licenses. Do not use with the license_file_content option.")
  public String getLicenseFilePath() {
    return licenseFilePath;
  }

  public void setLicenseFilePath(String licenseFilePath) {
    this.licenseFilePath = licenseFilePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseLicenseCreateParams licenseLicenseCreateParams = (LicenseLicenseCreateParams) o;
    return Objects.equals(this.evaluation, licenseLicenseCreateParams.evaluation) &&
        Objects.equals(this.licenseFileContent, licenseLicenseCreateParams.licenseFileContent) &&
        Objects.equals(this.licenseFilePath, licenseLicenseCreateParams.licenseFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluation, licenseFileContent, licenseFilePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseLicenseCreateParams {\n");
    
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    licenseFileContent: ").append(toIndentedString(licenseFileContent)).append("\n");
    sb.append("    licenseFilePath: ").append(toIndentedString(licenseFilePath)).append("\n");
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

