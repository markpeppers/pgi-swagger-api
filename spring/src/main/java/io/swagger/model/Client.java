package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Client
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:26:46.616Z")

public class Client   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  public Client id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * System generated UUID
   * @return id
  **/
  @ApiModelProperty(value = "System generated UUID")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Client name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The client's name
   * @return name
  **/
  @ApiModelProperty(example = "Michael Knight", value = "The client's name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Client companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * This client's company
   * @return companyId
  **/
  @ApiModelProperty(value = "This client's company")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Client email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The client's email address
   * @return email
  **/
  @ApiModelProperty(example = "michael.knight@kitt.com", value = "The client's email address")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Client address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Client startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date that this client is assigned to the current license
   * @return startDate
  **/
  @ApiModelProperty(value = "Date that this client is assigned to the current license")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Client endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * If the client assignment to the license is 'deleted', then the end date is set. 
   * @return endDate
  **/
  @ApiModelProperty(readOnly = true, value = "If the client assignment to the license is 'deleted', then the end date is set. ")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this.name, client.name) &&
        Objects.equals(this.companyId, client.companyId) &&
        Objects.equals(this.email, client.email) &&
        Objects.equals(this.address, client.address) &&
        Objects.equals(this.startDate, client.startDate) &&
        Objects.equals(this.endDate, client.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, companyId, email, address, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

