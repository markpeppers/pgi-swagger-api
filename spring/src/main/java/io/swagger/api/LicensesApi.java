/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12-1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.LicenseList;
import io.swagger.model.RestError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:26:46.616Z")

@Api(value = "licenses", description = "the licenses API")
public interface LicensesApi {

    @ApiOperation(value = "", nickname = "licensesSearchLegalEntityLegalEntityIdGet", notes = "", response = LicenseList.class, tags={ "License Mgmt - external", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = LicenseList.class),
        @ApiResponse(code = 404, message = "not found", response = RestError.class) })
    @RequestMapping(value = "/licenses/search/legalEntity/{legalEntityId}",
        method = RequestMethod.GET)
    ResponseEntity<LicenseList> licensesSearchLegalEntityLegalEntityIdGet(@ApiParam(value = "Returns all licenses associated with a legal entity",required=true) @PathVariable("legalEntityId") String legalEntityId);

}
