package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error response details  * 1xx - Contract error message   * 120 - Contract not found * 2xx - LicenseSet error messages   * 210 - Max number of licenses reached for this licenseSet   * 220 - LicenseSet not found * 3xx - License and client assignment errors   * 310 - License is not active   * 325 - A client is already assigned to this license   * 35x - Option errors...     * 350 - Invalid option group (does not exist in parent)     * 351 - Invalid option value (does not exist as a value in parent licenseSet)     * 352 - No option specified for group, and default does not exist     * 353 - Multiple default options specified in OptionGroup.     * 354 - No default option specified in OptionGroup * 5xx - general errors   * 500 - Unexpected server error   * 501 - Missing required values, see extended information   * 520 - Provider, legal entity, corporate customer, company, or client not found 
 */
@ApiModel(description = "Error response details  * 1xx - Contract error message   * 120 - Contract not found * 2xx - LicenseSet error messages   * 210 - Max number of licenses reached for this licenseSet   * 220 - LicenseSet not found * 3xx - License and client assignment errors   * 310 - License is not active   * 325 - A client is already assigned to this license   * 35x - Option errors...     * 350 - Invalid option group (does not exist in parent)     * 351 - Invalid option value (does not exist as a value in parent licenseSet)     * 352 - No option specified for group, and default does not exist     * 353 - Multiple default options specified in OptionGroup.     * 354 - No default option specified in OptionGroup * 5xx - general errors   * 500 - Unexpected server error   * 501 - Missing required values, see extended information   * 520 - Provider, legal entity, corporate customer, company, or client not found ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

public class RestError   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("extended")
  private String extended = null;

  public RestError code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * System error code (not HTTP status)
   * @return code
  **/
  @ApiModelProperty(value = "System error code (not HTTP status)")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RestError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(value = "Error message")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RestError extended(String extended) {
    this.extended = extended;
    return this;
  }

   /**
   * extended error information (system related)
   * @return extended
  **/
  @ApiModelProperty(value = "extended error information (system related)")


  public String getExtended() {
    return extended;
  }

  public void setExtended(String extended) {
    this.extended = extended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestError restError = (RestError) o;
    return Objects.equals(this.code, restError.code) &&
        Objects.equals(this.message, restError.message) &&
        Objects.equals(this.extended, restError.extended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, extended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    extended: ").append(toIndentedString(extended)).append("\n");
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

