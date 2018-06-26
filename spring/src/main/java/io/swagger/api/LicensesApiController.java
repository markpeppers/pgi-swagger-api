package io.swagger.api;

import io.swagger.model.LicenseList;
import io.swagger.model.RestError;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

@Controller
public class LicensesApiController implements LicensesApi {

    private static final Logger log = LoggerFactory.getLogger(LicensesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LicensesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<LicenseList> licensesSearchLegalEntityLegalEntityIdGet(@ApiParam(value = "Returns all licenses associated with a legal entity",required=true) @PathVariable("legalEntityId") String legalEntityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LicenseList>(objectMapper.readValue("{  \"pagination\" : {    \"last\" : true,    \"size\" : 5,    \"totalPages\" : 6,    \"limit\" : 1,    \"page\" : 5,    \"dir\" : \"dir\",    \"totalElements\" : 0  },  \"results\" : [ {    \"features\" : [ {      \"name\" : \"Included Minutes\",      \"description\" : \"description\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"option\" : \"1000 min\"    }, {      \"name\" : \"Included Minutes\",      \"description\" : \"description\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"option\" : \"1000 min\"    } ],    \"licenseSetId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"companyId\" : \"companyId\",    \"endDate\" : \"2000-01-23\",    \"canAdd\" : true,    \"licenseAssignments\" : [ {      \"companyId\" : \"companyId\",      \"address\" : {        \"country\" : \"USA\",        \"address3\" : \"address3\",        \"stateOrProvince\" : \"GA\",        \"address2\" : \"address2\",        \"city\" : \"Alpharetta\",        \"address1\" : \"2300 Lakeview Parkway\",        \"postalCode\" : \"30009\",        \"timeZone\" : \"US Eastern\"      },      \"endDate\" : \"2000-01-23\",      \"name\" : \"Michael Knight\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"email\" : \"michael.knight@kitt.com\",      \"startDate\" : \"2000-01-23\"    }, {      \"companyId\" : \"companyId\",      \"address\" : {        \"country\" : \"USA\",        \"address3\" : \"address3\",        \"stateOrProvince\" : \"GA\",        \"address2\" : \"address2\",        \"city\" : \"Alpharetta\",        \"address1\" : \"2300 Lakeview Parkway\",        \"postalCode\" : \"30009\",        \"timeZone\" : \"US Eastern\"      },      \"endDate\" : \"2000-01-23\",      \"name\" : \"Michael Knight\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"email\" : \"michael.knight@kitt.com\",      \"startDate\" : \"2000-01-23\"    } ],    \"licenseId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"startDate\" : \"2000-01-23\"  }, {    \"features\" : [ {      \"name\" : \"Included Minutes\",      \"description\" : \"description\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"option\" : \"1000 min\"    }, {      \"name\" : \"Included Minutes\",      \"description\" : \"description\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"option\" : \"1000 min\"    } ],    \"licenseSetId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"companyId\" : \"companyId\",    \"endDate\" : \"2000-01-23\",    \"canAdd\" : true,    \"licenseAssignments\" : [ {      \"companyId\" : \"companyId\",      \"address\" : {        \"country\" : \"USA\",        \"address3\" : \"address3\",        \"stateOrProvince\" : \"GA\",        \"address2\" : \"address2\",        \"city\" : \"Alpharetta\",        \"address1\" : \"2300 Lakeview Parkway\",        \"postalCode\" : \"30009\",        \"timeZone\" : \"US Eastern\"      },      \"endDate\" : \"2000-01-23\",      \"name\" : \"Michael Knight\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"email\" : \"michael.knight@kitt.com\",      \"startDate\" : \"2000-01-23\"    }, {      \"companyId\" : \"companyId\",      \"address\" : {        \"country\" : \"USA\",        \"address3\" : \"address3\",        \"stateOrProvince\" : \"GA\",        \"address2\" : \"address2\",        \"city\" : \"Alpharetta\",        \"address1\" : \"2300 Lakeview Parkway\",        \"postalCode\" : \"30009\",        \"timeZone\" : \"US Eastern\"      },      \"endDate\" : \"2000-01-23\",      \"name\" : \"Michael Knight\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",      \"email\" : \"michael.knight@kitt.com\",      \"startDate\" : \"2000-01-23\"    } ],    \"licenseId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"startDate\" : \"2000-01-23\"  } ]}", LicenseList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LicenseList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LicenseList>(HttpStatus.NOT_IMPLEMENTED);
    }

}
