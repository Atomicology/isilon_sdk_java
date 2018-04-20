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
import io.swagger.client.model.RemotesupportConnectemcConnectemc;
import java.io.IOException;

/**
 * RemotesupportConnectemc
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class RemotesupportConnectemc {
  @SerializedName("connectemc")
  private RemotesupportConnectemcConnectemc connectemc = null;

  public RemotesupportConnectemc connectemc(RemotesupportConnectemcConnectemc connectemc) {
    this.connectemc = connectemc;
    return this;
  }

   /**
   * 
   * @return connectemc
  **/
  @ApiModelProperty(value = "")
  public RemotesupportConnectemcConnectemc getConnectemc() {
    return connectemc;
  }

  public void setConnectemc(RemotesupportConnectemcConnectemc connectemc) {
    this.connectemc = connectemc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemotesupportConnectemc remotesupportConnectemc = (RemotesupportConnectemc) o;
    return Objects.equals(this.connectemc, remotesupportConnectemc.connectemc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectemc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemotesupportConnectemc {\n");
    
    sb.append("    connectemc: ").append(toIndentedString(connectemc)).append("\n");
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

