package io.swagger.api;

import io.swagger.model.Contract;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-26T18:31:41.974Z")

@Controller
public class ContractApiController implements ContractApi {

    private static final Logger log = LoggerFactory.getLogger(ContractApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContractApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> contractContractIdLicensesetLicenseSetIdDefaultPost(@ApiParam(value = "Id of the legal entity contract.",required=true) @PathVariable("contractId") String contractId,@ApiParam(value = "Id of the License Set.",required=true) @PathVariable("licenseSetId") String licenseSetId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Contract> getContractByLegalEntity(@ApiParam(value = "UUID of contract to be fetched",required=true) @PathVariable("legalEntityId") UUID legalEntityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Contract>(objectMapper.readValue("{  \"default\" : true,  \"contractType\" : \"legalEntity\",  \"name\" : \"Hosted Voice with Global Meet\",  \"entityId\" : \"entityId\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}", Contract.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Contract>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Contract>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Contract> getContractByProvider(@ApiParam(value = "UUID of contract to be fetched",required=true) @PathVariable("providerId") UUID providerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Contract>(objectMapper.readValue("{  \"default\" : true,  \"contractType\" : \"legalEntity\",  \"name\" : \"Hosted Voice with Global Meet\",  \"entityId\" : \"entityId\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}", Contract.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Contract>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Contract>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<LicenseSet>> listLicenseSets(@ApiParam(value = "",required=true) @PathVariable("contractId") String contractId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<LicenseSet>>(objectMapper.readValue("[ {  \"id\" : \"2352-sdf24-235d9-0heyTh3re\",  \"name\" : \"Global Meet Web\",  \"contractId\" : \"598e-2kjla4-I3thlkj4\",  \"model\" : \"minMax\",  \"modelProperties\" : [ {    \"min\" : 30,    \"max\" : 50  } ],  \"features\" : [ {    \"featureName\" : \"participants\",    \"description\" : \"Max web participants\",    \"name\" : \"10 Users\"  } ],  \"default\" : false}, {  \"id\" : \"2352-sdf24-235d9-0heyTh3re\",  \"name\" : \"Global Meet Web\",  \"contractId\" : \"598e-2kjla4-I3thlkj4\",  \"model\" : \"minMax\",  \"modelProperties\" : [ {    \"min\" : 30,    \"max\" : 50  } ],  \"features\" : [ {    \"featureName\" : \"participants\",    \"description\" : \"Max web participants\",    \"name\" : \"10 Users\"  } ],  \"default\" : false} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<LicenseSet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<LicenseSet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LicenseSet> listLicenseSetsByContract(@ApiParam(value = "Id of the legal entity contract.",required=true) @PathVariable("contractId") String contractId,@ApiParam(value = "Id of the License Set.",required=true) @PathVariable("licenseSetId") String licenseSetId) {
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

}
