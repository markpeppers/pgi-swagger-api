package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines a licence-able product&#39;s feature or add-on.
 */
@ApiModel(description = "Defines a licence-able product's feature or add-on.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

public class Feature   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("option")
  private String option = null;

  public Feature id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * System assigned name for this feature
   * @return id
  **/
  @ApiModelProperty(value = "System assigned name for this feature")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Feature name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human-readable name for this feature
   * @return name
  **/
  @ApiModelProperty(example = "Included Minutes", required = true, value = "Human-readable name for this feature")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Feature description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Human-readable description for this feature
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Human-readable description for this feature")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Feature option(String option) {
    this.option = option;
    return this;
  }

   /**
   * Human-readable option name
   * @return option
  **/
  @ApiModelProperty(example = "1000 min", value = "Human-readable option name")


  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.id, feature.id) &&
        Objects.equals(this.name, feature.name) &&
        Objects.equals(this.description, feature.description) &&
        Objects.equals(this.option, feature.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

