/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Feature (
  /* System assigned name for this feature */
  id: Option[UUID],
  /* Human-readable name for this feature */
  name: String,
  /* Human-readable description for this feature */
  description: String,
  /* Human-readable option name */
  option: Option[String]
) extends ApiModel

