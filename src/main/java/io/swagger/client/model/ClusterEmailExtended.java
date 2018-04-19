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
 * Cluster email notification settings.
 */
@ApiModel(description = "Cluster email notification settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ClusterEmailExtended {
  /**
   * This setting determines how notifications will be batched together to be sent by email.  &#39;none&#39; means each notification will be sent separately.  &#39;severity&#39; means notifications of the same severity will be sent together.  &#39;category&#39; means notifications of the same category will be sent together.  &#39;all&#39; means all notifications will be batched together and sent in a single email.
   */
  @JsonAdapter(BatchModeEnum.Adapter.class)
  public enum BatchModeEnum {
    ALL("all"),
    
    SEVERITY("severity"),
    
    CATEGORY("category"),
    
    NONE("none");

    private String value;

    BatchModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BatchModeEnum fromValue(String text) {
      for (BatchModeEnum b : BatchModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BatchModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BatchModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BatchModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BatchModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("batch_mode")
  private BatchModeEnum batchMode = null;

  @SerializedName("mail_relay")
  private String mailRelay = null;

  @SerializedName("mail_sender")
  private String mailSender = null;

  @SerializedName("mail_subject")
  private String mailSubject = null;

  @SerializedName("smtp_auth_passwd")
  private String smtpAuthPasswd = null;

  /**
   * The type of secure communication protocol to use if SMTP is being used.  If &#39;none&#39;, plain text will be used, if &#39;starttls&#39;, the encrypted STARTTLS protocol will be used.
   */
  @JsonAdapter(SmtpAuthSecurityEnum.Adapter.class)
  public enum SmtpAuthSecurityEnum {
    NONE("none"),
    
    STARTTLS("starttls");

    private String value;

    SmtpAuthSecurityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SmtpAuthSecurityEnum fromValue(String text) {
      for (SmtpAuthSecurityEnum b : SmtpAuthSecurityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SmtpAuthSecurityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SmtpAuthSecurityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SmtpAuthSecurityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SmtpAuthSecurityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("smtp_auth_security")
  private SmtpAuthSecurityEnum smtpAuthSecurity = null;

  @SerializedName("smtp_auth_username")
  private String smtpAuthUsername = null;

  @SerializedName("smtp_port")
  private Integer smtpPort = null;

  @SerializedName("use_smtp_auth")
  private Boolean useSmtpAuth = null;

  @SerializedName("user_template")
  private String userTemplate = null;

  public ClusterEmailExtended batchMode(BatchModeEnum batchMode) {
    this.batchMode = batchMode;
    return this;
  }

   /**
   * This setting determines how notifications will be batched together to be sent by email.  &#39;none&#39; means each notification will be sent separately.  &#39;severity&#39; means notifications of the same severity will be sent together.  &#39;category&#39; means notifications of the same category will be sent together.  &#39;all&#39; means all notifications will be batched together and sent in a single email.
   * @return batchMode
  **/
  @ApiModelProperty(value = "This setting determines how notifications will be batched together to be sent by email.  'none' means each notification will be sent separately.  'severity' means notifications of the same severity will be sent together.  'category' means notifications of the same category will be sent together.  'all' means all notifications will be batched together and sent in a single email.")
  public BatchModeEnum getBatchMode() {
    return batchMode;
  }

  public void setBatchMode(BatchModeEnum batchMode) {
    this.batchMode = batchMode;
  }

  public ClusterEmailExtended mailRelay(String mailRelay) {
    this.mailRelay = mailRelay;
    return this;
  }

   /**
   * The address of the SMTP server to be used for relaying the notification messages.  An SMTP server is required in order to send notifications.  If this string is empty, no emails will be sent.
   * @return mailRelay
  **/
  @ApiModelProperty(value = "The address of the SMTP server to be used for relaying the notification messages.  An SMTP server is required in order to send notifications.  If this string is empty, no emails will be sent.")
  public String getMailRelay() {
    return mailRelay;
  }

  public void setMailRelay(String mailRelay) {
    this.mailRelay = mailRelay;
  }

  public ClusterEmailExtended mailSender(String mailSender) {
    this.mailSender = mailSender;
    return this;
  }

   /**
   * The full email address that will appear as the sender of notification messages.
   * @return mailSender
  **/
  @ApiModelProperty(value = "The full email address that will appear as the sender of notification messages.")
  public String getMailSender() {
    return mailSender;
  }

  public void setMailSender(String mailSender) {
    this.mailSender = mailSender;
  }

  public ClusterEmailExtended mailSubject(String mailSubject) {
    this.mailSubject = mailSubject;
    return this;
  }

   /**
   * The subject line for notification messages from this cluster.
   * @return mailSubject
  **/
  @ApiModelProperty(value = "The subject line for notification messages from this cluster.")
  public String getMailSubject() {
    return mailSubject;
  }

  public void setMailSubject(String mailSubject) {
    this.mailSubject = mailSubject;
  }

  public ClusterEmailExtended smtpAuthPasswd(String smtpAuthPasswd) {
    this.smtpAuthPasswd = smtpAuthPasswd;
    return this;
  }

   /**
   * Password to authenticate with if SMTP authentication is being used.
   * @return smtpAuthPasswd
  **/
  @ApiModelProperty(value = "Password to authenticate with if SMTP authentication is being used.")
  public String getSmtpAuthPasswd() {
    return smtpAuthPasswd;
  }

  public void setSmtpAuthPasswd(String smtpAuthPasswd) {
    this.smtpAuthPasswd = smtpAuthPasswd;
  }

  public ClusterEmailExtended smtpAuthSecurity(SmtpAuthSecurityEnum smtpAuthSecurity) {
    this.smtpAuthSecurity = smtpAuthSecurity;
    return this;
  }

   /**
   * The type of secure communication protocol to use if SMTP is being used.  If &#39;none&#39;, plain text will be used, if &#39;starttls&#39;, the encrypted STARTTLS protocol will be used.
   * @return smtpAuthSecurity
  **/
  @ApiModelProperty(value = "The type of secure communication protocol to use if SMTP is being used.  If 'none', plain text will be used, if 'starttls', the encrypted STARTTLS protocol will be used.")
  public SmtpAuthSecurityEnum getSmtpAuthSecurity() {
    return smtpAuthSecurity;
  }

  public void setSmtpAuthSecurity(SmtpAuthSecurityEnum smtpAuthSecurity) {
    this.smtpAuthSecurity = smtpAuthSecurity;
  }

  public ClusterEmailExtended smtpAuthUsername(String smtpAuthUsername) {
    this.smtpAuthUsername = smtpAuthUsername;
    return this;
  }

   /**
   * Username to authenticate with if SMTP authentication is being used.
   * @return smtpAuthUsername
  **/
  @ApiModelProperty(value = "Username to authenticate with if SMTP authentication is being used.")
  public String getSmtpAuthUsername() {
    return smtpAuthUsername;
  }

  public void setSmtpAuthUsername(String smtpAuthUsername) {
    this.smtpAuthUsername = smtpAuthUsername;
  }

  public ClusterEmailExtended smtpPort(Integer smtpPort) {
    this.smtpPort = smtpPort;
    return this;
  }

   /**
   * The port on the SMTP server to be used for relaying the notification messages.  
   * @return smtpPort
  **/
  @ApiModelProperty(value = "The port on the SMTP server to be used for relaying the notification messages.  ")
  public Integer getSmtpPort() {
    return smtpPort;
  }

  public void setSmtpPort(Integer smtpPort) {
    this.smtpPort = smtpPort;
  }

  public ClusterEmailExtended useSmtpAuth(Boolean useSmtpAuth) {
    this.useSmtpAuth = useSmtpAuth;
    return this;
  }

   /**
   * If true, this cluster will send SMTP authentication credentials to the SMTP relay server in order to send its notification emails.  If false, the cluster will attempt to send its notification emails without authentication.
   * @return useSmtpAuth
  **/
  @ApiModelProperty(value = "If true, this cluster will send SMTP authentication credentials to the SMTP relay server in order to send its notification emails.  If false, the cluster will attempt to send its notification emails without authentication.")
  public Boolean isUseSmtpAuth() {
    return useSmtpAuth;
  }

  public void setUseSmtpAuth(Boolean useSmtpAuth) {
    this.useSmtpAuth = useSmtpAuth;
  }

  public ClusterEmailExtended userTemplate(String userTemplate) {
    this.userTemplate = userTemplate;
    return this;
  }

   /**
   * Location of a custom template file that can be used to specify the layout of the notification emails.
   * @return userTemplate
  **/
  @ApiModelProperty(value = "Location of a custom template file that can be used to specify the layout of the notification emails.")
  public String getUserTemplate() {
    return userTemplate;
  }

  public void setUserTemplate(String userTemplate) {
    this.userTemplate = userTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterEmailExtended clusterEmailExtended = (ClusterEmailExtended) o;
    return Objects.equals(this.batchMode, clusterEmailExtended.batchMode) &&
        Objects.equals(this.mailRelay, clusterEmailExtended.mailRelay) &&
        Objects.equals(this.mailSender, clusterEmailExtended.mailSender) &&
        Objects.equals(this.mailSubject, clusterEmailExtended.mailSubject) &&
        Objects.equals(this.smtpAuthPasswd, clusterEmailExtended.smtpAuthPasswd) &&
        Objects.equals(this.smtpAuthSecurity, clusterEmailExtended.smtpAuthSecurity) &&
        Objects.equals(this.smtpAuthUsername, clusterEmailExtended.smtpAuthUsername) &&
        Objects.equals(this.smtpPort, clusterEmailExtended.smtpPort) &&
        Objects.equals(this.useSmtpAuth, clusterEmailExtended.useSmtpAuth) &&
        Objects.equals(this.userTemplate, clusterEmailExtended.userTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchMode, mailRelay, mailSender, mailSubject, smtpAuthPasswd, smtpAuthSecurity, smtpAuthUsername, smtpPort, useSmtpAuth, userTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterEmailExtended {\n");
    
    sb.append("    batchMode: ").append(toIndentedString(batchMode)).append("\n");
    sb.append("    mailRelay: ").append(toIndentedString(mailRelay)).append("\n");
    sb.append("    mailSender: ").append(toIndentedString(mailSender)).append("\n");
    sb.append("    mailSubject: ").append(toIndentedString(mailSubject)).append("\n");
    sb.append("    smtpAuthPasswd: ").append(toIndentedString(smtpAuthPasswd)).append("\n");
    sb.append("    smtpAuthSecurity: ").append(toIndentedString(smtpAuthSecurity)).append("\n");
    sb.append("    smtpAuthUsername: ").append(toIndentedString(smtpAuthUsername)).append("\n");
    sb.append("    smtpPort: ").append(toIndentedString(smtpPort)).append("\n");
    sb.append("    useSmtpAuth: ").append(toIndentedString(useSmtpAuth)).append("\n");
    sb.append("    userTemplate: ").append(toIndentedString(userTemplate)).append("\n");
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

