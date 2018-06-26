package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Client;
import io.swagger.model.Feature;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * License
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:26:46.616Z")

public class License   {
  @JsonProperty("licenseId")
  private UUID licenseId = null;

  @JsonProperty("licenseSetId")
  private UUID licenseSetId = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("features")
  @Valid
  private List<Feature> features = null;

  @JsonProperty("canAdd")
  private Boolean canAdd = null;

  @JsonProperty("licenseAssignments")
  @Valid
  private List<Client> licenseAssignments = null;

  public License licenseId(UUID licenseId) {
    this.licenseId = licenseId;
    return this;
  }

   /**
   * System generated UUID for the billable license 
   * @return licenseId
  **/
  @ApiModelProperty(value = "System generated UUID for the billable license ")

  @Valid

  public UUID getLicenseId() {
    return licenseId;
  }

  public void setLicenseId(UUID licenseId) {
    this.licenseId = licenseId;
  }

  public License licenseSetId(UUID licenseSetId) {
    this.licenseSetId = licenseSetId;
    return this;
  }

   /**
   * License set id
   * @return licenseSetId
  **/
  @ApiModelProperty(required = true, value = "License set id")
  @NotNull

  @Valid

  public UUID getLicenseSetId() {
    return licenseSetId;
  }

  public void setLicenseSetId(UUID licenseSetId) {
    this.licenseSetId = licenseSetId;
  }

  public License companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public License startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date that this license assignment is in effect.
   * @return startDate
  **/
  @ApiModelProperty(value = "Date that this license assignment is in effect.")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public License endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date that this license assignment ends (delete)
   * @return endDate
  **/
  @ApiModelProperty(value = "Date that this license assignment ends (delete)")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public License features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public License addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<Feature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Optional array of license features, if applicable 
   * @return features
  **/
  @ApiModelProperty(value = "Optional array of license features, if applicable ")

  @Valid

  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public License canAdd(Boolean canAdd) {
    this.canAdd = canAdd;
    return this;
  }

   /**
   * There are additional licenses that can be assigned in this set. (Based on license model and current data.) This will need to allow for different licensing models (min/max, msa, fixed) and take into account both number of assigned licenses and number of unassigned licenses as part of the calculation. 
   * @return canAdd
  **/
  @ApiModelProperty(value = "There are additional licenses that can be assigned in this set. (Based on license model and current data.) This will need to allow for different licensing models (min/max, msa, fixed) and take into account both number of assigned licenses and number of unassigned licenses as part of the calculation. ")


  public Boolean isCanAdd() {
    return canAdd;
  }

  public void setCanAdd(Boolean canAdd) {
    this.canAdd = canAdd;
  }

  public License licenseAssignments(List<Client> licenseAssignments) {
    this.licenseAssignments = licenseAssignments;
    return this;
  }

  public License addLicenseAssignmentsItem(Client licenseAssignmentsItem) {
    if (this.licenseAssignments == null) {
      this.licenseAssignments = new ArrayList<Client>();
    }
    this.licenseAssignments.add(licenseAssignmentsItem);
    return this;
  }

   /**
   * License Assignments represent the recent history of all client Ids that have been assigned to this license. These records are primary used by Mediation Clients to map received CDR data to the appropriate billable license 
   * @return licenseAssignments
  **/
  @ApiModelProperty(value = "License Assignments represent the recent history of all client Ids that have been assigned to this license. These records are primary used by Mediation Clients to map received CDR data to the appropriate billable license ")

  @Valid

  public List<Client> getLicenseAssignments() {
    return licenseAssignments;
  }

  public void setLicenseAssignments(List<Client> licenseAssignments) {
    this.licenseAssignments = licenseAssignments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.licenseId, license.licenseId) &&
        Objects.equals(this.licenseSetId, license.licenseSetId) &&
        Objects.equals(this.companyId, license.companyId) &&
        Objects.equals(this.startDate, license.startDate) &&
        Objects.equals(this.endDate, license.endDate) &&
        Objects.equals(this.features, license.features) &&
        Objects.equals(this.canAdd, license.canAdd) &&
        Objects.equals(this.licenseAssignments, license.licenseAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseId, licenseSetId, companyId, startDate, endDate, features, canAdd, licenseAssignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License {\n");
    
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseSetId: ").append(toIndentedString(licenseSetId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    canAdd: ").append(toIndentedString(canAdd)).append("\n");
    sb.append("    licenseAssignments: ").append(toIndentedString(licenseAssignments)).append("\n");
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

