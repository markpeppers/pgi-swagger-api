/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Pagination (
  /* is last page? */
  last: Option[Boolean],
  /* total rows that matched search criteria */
  totalElements: Option[Int],
  /* total number of pages in search results */
  totalPages: Option[Int],
  /* number or rows per page in original search criteria */
  limit: Option[Int],
  /* number of items in the current page */
  size: Option[Int],
  /* current page number */
  page: Option[Int],
  /* sort criteria in request */
  dir: Option[String]
) extends ApiModel


