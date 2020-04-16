package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the base Contract (Agreement), which is assigned to an LegalEntity (top level of company heirarchy) 
 */
@ApiModel(description = "Represents the base Contract (Agreement), which is assigned to an LegalEntity (top level of company heirarchy) ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

public class Contract   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Denotes whether this contract is associated with an legal entity or with a provider
   */
  public enum ContractTypeEnum {
    LEGALENTITY("legalEntity"),
    
    PROVIDER("provider");

    private String value;

    ContractTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContractTypeEnum fromValue(String text) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("contractType")
  private ContractTypeEnum contractType = null;

  @JsonProperty("entityId")
  private String entityId = null;

  @JsonProperty("default")
  private Boolean _default = null;

  public Contract id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * System generated UUID. You are not able to create or update this value via the API. It is ignored in all PUT/POST/PATCH methods
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", readOnly = true, value = "System generated UUID. You are not able to create or update this value via the API. It is ignored in all PUT/POST/PATCH methods")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Contract name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Hosted Voice with Global Meet", required = true, value = "")
  @NotNull

@Size(max=256) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Contract contractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
    return this;
  }

   /**
   * Denotes whether this contract is associated with an legal entity or with a provider
   * @return contractType
  **/
  @ApiModelProperty(required = true, value = "Denotes whether this contract is associated with an legal entity or with a provider")
  @NotNull


  public ContractTypeEnum getContractType() {
    return contractType;
  }

  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }

  public Contract entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Id of this contract's associated top-level legal entity or provider, depending on its contractType.
   * @return entityId
  **/
  @ApiModelProperty(required = true, value = "Id of this contract's associated top-level legal entity or provider, depending on its contractType.")
  @NotNull


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public Contract _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Flag to determine if this is the default contract to be used for operations. If you update this flag to be true, then all other contracts belonging to the legal entity will be set to default=false 
   * @return _default
  **/
  @ApiModelProperty(required = true, value = "Flag to determine if this is the default contract to be used for operations. If you update this flag to be true, then all other contracts belonging to the legal entity will be set to default=false ")
  @NotNull


  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.id, contract.id) &&
        Objects.equals(this.name, contract.name) &&
        Objects.equals(this.contractType, contract.contractType) &&
        Objects.equals(this.entityId, contract.entityId) &&
        Objects.equals(this._default, contract._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contractType, entityId, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

