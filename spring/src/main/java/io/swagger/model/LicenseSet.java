package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Feature;
import io.swagger.model.Property;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LicenseSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

public class LicenseSet   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("contractId")
  private String contractId = null;

  @JsonProperty("legalEntityId")
  private String legalEntityId = null;

  /**
   * License model that is applied to the component. Master Service Agreement, fixed license count, min/max license:
   */
  public enum ModelEnum {
    MSA("msa"),
    
    FIXED("fixed"),
    
    MINMAX("minMax");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModelEnum fromValue(String text) {
      for (ModelEnum b : ModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("model")
  private ModelEnum model = null;

  @JsonProperty("modelProperties")
  @Valid
  private List<Property> modelProperties = null;

  @JsonProperty("features")
  @Valid
  private List<Feature> features = null;

  public LicenseSet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Global Meet", required = true, value = "")
  @NotNull

@Size(max=256) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LicenseSet id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * System generated UUID
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "System generated UUID")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public LicenseSet contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Contract to which this sub component (license set) belongs. A single contract may contain multiple, independently licensable products.
   * @return contractId
  **/
  @ApiModelProperty(readOnly = true, value = "Contract to which this sub component (license set) belongs. A single contract may contain multiple, independently licensable products.")


  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public LicenseSet legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * In the case of a LicenseSet belonging to a Provider Contract, the provider may assign license sets to multpile legal entity.
   * @return legalEntityId
  **/
  @ApiModelProperty(readOnly = true, value = "In the case of a LicenseSet belonging to a Provider Contract, the provider may assign license sets to multpile legal entity.")


  public String getLegalEntityId() {
    return legalEntityId;
  }

  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }

  public LicenseSet model(ModelEnum model) {
    this.model = model;
    return this;
  }

   /**
   * License model that is applied to the component. Master Service Agreement, fixed license count, min/max license:
   * @return model
  **/
  @ApiModelProperty(required = true, value = "License model that is applied to the component. Master Service Agreement, fixed license count, min/max license:")
  @NotNull


  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }

  public LicenseSet modelProperties(List<Property> modelProperties) {
    this.modelProperties = modelProperties;
    return this;
  }

  public LicenseSet addModelPropertiesItem(Property modelPropertiesItem) {
    if (this.modelProperties == null) {
      this.modelProperties = new ArrayList<Property>();
    }
    this.modelProperties.add(modelPropertiesItem);
    return this;
  }

   /**
   * Array of properties that associated to alicense model (i.e.: min, max). Values are dependent on license model used
   * @return modelProperties
  **/
  @ApiModelProperty(value = "Array of properties that associated to alicense model (i.e.: min, max). Values are dependent on license model used")

  @Valid

  public List<Property> getModelProperties() {
    return modelProperties;
  }

  public void setModelProperties(List<Property> modelProperties) {
    this.modelProperties = modelProperties;
  }

  public LicenseSet features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public LicenseSet addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<Feature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Optional list of features that can be selected during license assignment. 
   * @return features
  **/
  @ApiModelProperty(value = "Optional list of features that can be selected during license assignment. ")

  @Valid

  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseSet licenseSet = (LicenseSet) o;
    return Objects.equals(this.name, licenseSet.name) &&
        Objects.equals(this.id, licenseSet.id) &&
        Objects.equals(this.contractId, licenseSet.contractId) &&
        Objects.equals(this.legalEntityId, licenseSet.legalEntityId) &&
        Objects.equals(this.model, licenseSet.model) &&
        Objects.equals(this.modelProperties, licenseSet.modelProperties) &&
        Objects.equals(this.features, licenseSet.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, contractId, legalEntityId, model, modelProperties, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseSet {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelProperties: ").append(toIndentedString(modelProperties)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

