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
import io.swagger.client.model.ProvidersFileFileItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProvidersFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ProvidersFile {
  @SerializedName("file")
  private List<ProvidersFileFileItem> file = null;

  public ProvidersFile file(List<ProvidersFileFileItem> file) {
    this.file = file;
    return this;
  }

  public ProvidersFile addFileItem(ProvidersFileFileItem fileItem) {
    if (this.file == null) {
      this.file = new ArrayList<ProvidersFileFileItem>();
    }
    this.file.add(fileItem);
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")
  public List<ProvidersFileFileItem> getFile() {
    return file;
  }

  public void setFile(List<ProvidersFileFileItem> file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersFile providersFile = (ProvidersFile) o;
    return Objects.equals(this.file, providersFile.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersFile {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

