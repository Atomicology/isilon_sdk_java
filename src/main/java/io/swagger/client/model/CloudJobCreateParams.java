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
import io.swagger.client.model.Empty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A cloud job for archiving or recalling files or restoring COI
 */
@ApiModel(description = "A cloud job for archiving or recalling files or restoring COI")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class CloudJobCreateParams {
  @SerializedName("accounts")
  private List<String> accounts = null;

  @SerializedName("directories")
  private List<String> directories = null;

  @SerializedName("expiration_date")
  private Integer expirationDate = null;

  @SerializedName("file_matching_pattern")
  private Empty fileMatchingPattern = null;

  @SerializedName("files")
  private List<String> files = null;

  @SerializedName("policy")
  private String policy = null;

  /**
   * The type of cloud action to be performed by this job.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ARCHIVE("archive"),
    
    RECALL("recall"),
    
    LOCAL_GARBAGE_COLLECTION("local-garbage-collection"),
    
    CLOUD_GARBAGE_COLLECTION("cloud-garbage-collection"),
    
    CACHE_WRITEBACK("cache-writeback"),
    
    CACHE_ON_ACCESS("cache-on-access"),
    
    CACHE_INVALIDATION("cache-invalidation"),
    
    RESTORE_COI("restore-coi");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public CloudJobCreateParams accounts(List<String> accounts) {
    this.accounts = accounts;
    return this;
  }

  public CloudJobCreateParams addAccountsItem(String accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<String>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * The names of accounts for COI restore
   * @return accounts
  **/
  @ApiModelProperty(value = "The names of accounts for COI restore")
  public List<String> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<String> accounts) {
    this.accounts = accounts;
  }

  public CloudJobCreateParams directories(List<String> directories) {
    this.directories = directories;
    return this;
  }

  public CloudJobCreateParams addDirectoriesItem(String directoriesItem) {
    if (this.directories == null) {
      this.directories = new ArrayList<String>();
    }
    this.directories.add(directoriesItem);
    return this;
  }

   /**
   * Directories addressed by this job
   * @return directories
  **/
  @ApiModelProperty(value = "Directories addressed by this job")
  public List<String> getDirectories() {
    return directories;
  }

  public void setDirectories(List<String> directories) {
    this.directories = directories;
  }

  public CloudJobCreateParams expirationDate(Integer expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The new expiration date in seconds
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The new expiration date in seconds")
  public Integer getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Integer expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CloudJobCreateParams fileMatchingPattern(Empty fileMatchingPattern) {
    this.fileMatchingPattern = fileMatchingPattern;
    return this;
  }

   /**
   * The file filtering logic to find files for this job. (Only applicable for &#39;recall&#39; jobs)
   * @return fileMatchingPattern
  **/
  @ApiModelProperty(value = "The file filtering logic to find files for this job. (Only applicable for 'recall' jobs)")
  public Empty getFileMatchingPattern() {
    return fileMatchingPattern;
  }

  public void setFileMatchingPattern(Empty fileMatchingPattern) {
    this.fileMatchingPattern = fileMatchingPattern;
  }

  public CloudJobCreateParams files(List<String> files) {
    this.files = files;
    return this;
  }

  public CloudJobCreateParams addFilesItem(String filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<String>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Filenames addressed by this job
   * @return files
  **/
  @ApiModelProperty(value = "Filenames addressed by this job")
  public List<String> getFiles() {
    return files;
  }

  public void setFiles(List<String> files) {
    this.files = files;
  }

  public CloudJobCreateParams policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * The name of an existing cloudpool policy to apply to this job. (Only applicable for &#39;archive&#39; jobs)
   * @return policy
  **/
  @ApiModelProperty(value = "The name of an existing cloudpool policy to apply to this job. (Only applicable for 'archive' jobs)")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public CloudJobCreateParams type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of cloud action to be performed by this job.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of cloud action to be performed by this job.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudJobCreateParams cloudJobCreateParams = (CloudJobCreateParams) o;
    return Objects.equals(this.accounts, cloudJobCreateParams.accounts) &&
        Objects.equals(this.directories, cloudJobCreateParams.directories) &&
        Objects.equals(this.expirationDate, cloudJobCreateParams.expirationDate) &&
        Objects.equals(this.fileMatchingPattern, cloudJobCreateParams.fileMatchingPattern) &&
        Objects.equals(this.files, cloudJobCreateParams.files) &&
        Objects.equals(this.policy, cloudJobCreateParams.policy) &&
        Objects.equals(this.type, cloudJobCreateParams.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, directories, expirationDate, fileMatchingPattern, files, policy, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudJobCreateParams {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    fileMatchingPattern: ").append(toIndentedString(fileMatchingPattern)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

