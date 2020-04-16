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
 * Pagination
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

public class Pagination   {
  @JsonProperty("last")
  private Boolean last = null;

  @JsonProperty("totalElements")
  private Integer totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("dir")
  private String dir = null;

  public Pagination last(Boolean last) {
    this.last = last;
    return this;
  }

   /**
   * is last page?
   * @return last
  **/
  @ApiModelProperty(value = "is last page?")


  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public Pagination totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * total rows that matched search criteria
   * @return totalElements
  **/
  @ApiModelProperty(value = "total rows that matched search criteria")


  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public Pagination totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * total number of pages in search results
   * @return totalPages
  **/
  @ApiModelProperty(value = "total number of pages in search results")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Pagination limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * number or rows per page in original search criteria
   * @return limit
  **/
  @ApiModelProperty(value = "number or rows per page in original search criteria")


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Pagination size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * number of items in the current page
   * @return size
  **/
  @ApiModelProperty(value = "number of items in the current page")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Pagination page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * current page number
   * @return page
  **/
  @ApiModelProperty(value = "current page number")


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Pagination dir(String dir) {
    this.dir = dir;
    return this;
  }

   /**
   * sort criteria in request
   * @return dir
  **/
  @ApiModelProperty(value = "sort criteria in request")


  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.last, pagination.last) &&
        Objects.equals(this.totalElements, pagination.totalElements) &&
        Objects.equals(this.totalPages, pagination.totalPages) &&
        Objects.equals(this.limit, pagination.limit) &&
        Objects.equals(this.size, pagination.size) &&
        Objects.equals(this.page, pagination.page) &&
        Objects.equals(this.dir, pagination.dir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last, totalElements, totalPages, limit, size, page, dir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
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

