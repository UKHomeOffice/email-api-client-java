package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import java.util.Map;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Enough information to populate and send and email based on a template
 **/
@ApiModel(description = "Enough information to populate and send and email based on a template")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-20T12:03:14.150+01:00")
public class TemplatedEmail   {
  
  private String htmlTemplate = null;
  private String textTemplate = null;
  private Map<String, Object> variables = new HashMap<String, Object>();
  private List<String> recipients = new ArrayList<String>();
  private String sender = null;
  private String subject = null;

  
  /**
   * If a recipient uses HTML to view their they will see this template
   **/
  @ApiModelProperty(required = true, value = "If a recipient uses HTML to view their they will see this template")
  @JsonProperty("htmlTemplate")
  public String getHtmlTemplate() {
    return htmlTemplate;
  }
  public void setHtmlTemplate(String htmlTemplate) {
    this.htmlTemplate = htmlTemplate;
  }

  
  /**
   * If a recipient uses TXT to view their they will see this template
   **/
  @ApiModelProperty(required = true, value = "If a recipient uses TXT to view their they will see this template")
  @JsonProperty("textTemplate")
  public String getTextTemplate() {
    return textTemplate;
  }
  public void setTextTemplate(String textTemplate) {
    this.textTemplate = textTemplate;
  }

  
  /**
   * Variables to pass to both templates with string keys, and any JSON Number, String, Array, Object as the value
   **/
  @ApiModelProperty(required = true, value = "Variables to pass to both templates with string keys, and any JSON Number, String, Array, Object as the value")
  @JsonProperty("variables")
  public Map<String, Object> getVariables() {
    return variables;
  }
  public void setVariables(Map<String, Object> variables) {
    this.variables = variables;
  }

  
  /**
   * Array of recipients in an array of strings in format \"example@example.org\" or \"Annie Example <annie@example.com>\"
   **/
  @ApiModelProperty(required = true, value = "Array of recipients in an array of strings in format \"example@example.org\" or \"Annie Example <annie@example.com>\"")
  @JsonProperty("recipients")
  public List<String> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  
  /**
   * Sender of the email in format \"example@example.org\" or \"Annie Example <annie@example.com>\"
   **/
  @ApiModelProperty(required = true, value = "Sender of the email in format \"example@example.org\" or \"Annie Example <annie@example.com>\"")
  @JsonProperty("sender")
  public String getSender() {
    return sender;
  }
  public void setSender(String sender) {
    this.sender = sender;
  }

  
  /**
   * Subject of the email
   **/
  @ApiModelProperty(required = true, value = "Subject of the email")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatedEmail {\n");
    
    sb.append("    htmlTemplate: ").append(StringUtil.toIndentedString(htmlTemplate)).append("\n");
    sb.append("    textTemplate: ").append(StringUtil.toIndentedString(textTemplate)).append("\n");
    sb.append("    variables: ").append(StringUtil.toIndentedString(variables)).append("\n");
    sb.append("    recipients: ").append(StringUtil.toIndentedString(recipients)).append("\n");
    sb.append("    sender: ").append(StringUtil.toIndentedString(sender)).append("\n");
    sb.append("    subject: ").append(StringUtil.toIndentedString(subject)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
