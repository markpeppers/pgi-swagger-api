package io.swagger.api;

import io.swagger.model.ClientRequest;
import io.swagger.model.License;
import io.swagger.model.LicenseRequest;
import io.swagger.model.LicenseSet;
import io.swagger.model.RestError;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:26:46.616Z")

@Controller
public class LicenseApiController implements LicenseApi {

    private static final Logger log = LoggerFactory.getLogger(LicenseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LicenseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<License> licenseLicenseIdGet(@ApiParam(value = "UUID of the license",required=true) @PathVariable("licenseId") UUID licenseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<License>(objectMapper.readValue("{  \"features\" : [ {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  }, {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  } ],  \"licenseSetId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"companyId\" : \"companyId\",  \"endDate\" : \"2000-01-23\",  \"canAdd\" : true,  \"licenseAssignments\" : [ {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  }, {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  } ],  \"licenseId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"startDate\" : \"2000-01-23\"}", License.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<License>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<License>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<License> licenseLicenseSetLicenseSetIdDelete(@ApiParam(value = "",required=true) @PathVariable("licenseSetId") UUID licenseSetId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<License>(objectMapper.readValue("{  \"features\" : [ {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  }, {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  } ],  \"licenseSetId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"companyId\" : \"companyId\",  \"endDate\" : \"2000-01-23\",  \"canAdd\" : true,  \"licenseAssignments\" : [ {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  }, {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  } ],  \"licenseId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"startDate\" : \"2000-01-23\"}", License.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<License>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<License>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LicenseSet> listLicense(@ApiParam(value = "Number of rows to return per page.") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "page number (1 based)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "sort attributes") @Valid @RequestParam(value = "sort", required = false) String sort,@ApiParam(value = "Sort direction; ascending or descending order. Default: ascending.", allowableValues = "asc, desc") @Valid @RequestParam(value = "dir", required = false) String dir,@ApiParam(value = "filter by companyId") @Valid @RequestParam(value = "companyid", required = false) UUID companyid,@ApiParam(value = "filter by license set id") @Valid @RequestParam(value = "licensesetid", required = false) UUID licensesetid,@ApiParam(value = "should results include only active license assignments (defaults to true)", defaultValue = "true") @Valid @RequestParam(value = "activeonly", required = false, defaultValue="true") Boolean activeonly,@ApiParam(value = "filter by contract id") @Valid @RequestParam(value = "contractid", required = false) UUID contractid,@ApiParam(value = "filter by client id") @Valid @RequestParam(value = "clientid", required = false) UUID clientid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LicenseSet>(objectMapper.readValue("{  \"id\" : \"2352-sdf24-235d9-0heyTh3re\",  \"name\" : \"Global Meet Web\",  \"contractId\" : \"598e-2kjla4-I3thlkj4\",  \"model\" : \"minMax\",  \"modelProperties\" : [ {    \"min\" : 30,    \"max\" : 50  } ],  \"features\" : [ {    \"featureName\" : \"participants\",    \"description\" : \"Max web participants\",    \"name\" : \"10 Users\"  } ],  \"default\" : false}", LicenseSet.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LicenseSet>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LicenseSet>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<License> modifyLicense(@ApiParam(value = "",required=true) @PathVariable("licenseSetId") UUID licenseSetId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ClientRequest client) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<License>(objectMapper.readValue("{  \"features\" : [ {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  }, {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  } ],  \"licenseSetId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"companyId\" : \"companyId\",  \"endDate\" : \"2000-01-23\",  \"canAdd\" : true,  \"licenseAssignments\" : [ {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  }, {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  } ],  \"licenseId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"startDate\" : \"2000-01-23\"}", License.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<License>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<License>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<License> newLicense(@ApiParam(value = "UUID of the licenseSet",required=true) @PathVariable("licenseSetId") UUID licenseSetId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody LicenseRequest licenceUpdate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<License>(objectMapper.readValue("{  \"features\" : [ {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  }, {    \"name\" : \"Included Minutes\",    \"description\" : \"description\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"option\" : \"1000 min\"  } ],  \"licenseSetId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"companyId\" : \"companyId\",  \"endDate\" : \"2000-01-23\",  \"canAdd\" : true,  \"licenseAssignments\" : [ {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  }, {    \"companyId\" : \"companyId\",    \"address\" : {      \"country\" : \"USA\",      \"address3\" : \"address3\",      \"stateOrProvince\" : \"GA\",      \"address2\" : \"address2\",      \"city\" : \"Alpharetta\",      \"address1\" : \"2300 Lakeview Parkway\",      \"postalCode\" : \"30009\",      \"timeZone\" : \"US Eastern\"    },    \"endDate\" : \"2000-01-23\",    \"name\" : \"Michael Knight\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"email\" : \"michael.knight@kitt.com\",    \"startDate\" : \"2000-01-23\"  } ],  \"licenseId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",  \"startDate\" : \"2000-01-23\"}", License.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<License>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<License>(HttpStatus.NOT_IMPLEMENTED);
    }

}
