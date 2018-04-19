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
import io.swagger.client.model.SummaryClientClientItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SummaryClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SummaryClient {
  @SerializedName("client")
  private List<SummaryClientClientItem> client = null;

  public SummaryClient client(List<SummaryClientClientItem> client) {
    this.client = client;
    return this;
  }

  public SummaryClient addClientItem(SummaryClientClientItem clientItem) {
    if (this.client == null) {
      this.client = new ArrayList<SummaryClientClientItem>();
    }
    this.client.add(clientItem);
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")
  public List<SummaryClientClientItem> getClient() {
    return client;
  }

  public void setClient(List<SummaryClientClientItem> client) {
    this.client = client;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryClient summaryClient = (SummaryClient) o;
    return Objects.equals(this.client, summaryClient.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryClient {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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

