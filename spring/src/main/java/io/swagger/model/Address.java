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
 * Physical Address
 */
@ApiModel(description = "Physical Address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

public class Address   {
  @JsonProperty("address1")
  private String address1 = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("address3")
  private String address3 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  public Address address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address line 1
   * @return address1
  **/
  @ApiModelProperty(example = "2300 Lakeview Parkway", required = true, value = "Address line 1")
  @NotNull


  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Address address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Address line 2
   * @return address2
  **/
  @ApiModelProperty(value = "Address line 2")


  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Address address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Address line 3
   * @return address3
  **/
  @ApiModelProperty(value = "Address line 3")


  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Alpharetta", required = true, value = "")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * Only relevant for states that have states or provinces
   * @return stateOrProvince
  **/
  @ApiModelProperty(example = "GA", value = "Only relevant for states that have states or provinces")


  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * ZIP or postal code
   * @return postalCode
  **/
  @ApiModelProperty(example = "30009", value = "ZIP or postal code")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "USA", required = true, value = "")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(example = "US Eastern", required = true, value = "")
  @NotNull


  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.address1, address.address1) &&
        Objects.equals(this.address2, address.address2) &&
        Objects.equals(this.address3, address.address3) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.timeZone, address.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, city, stateOrProvince, postalCode, country, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

