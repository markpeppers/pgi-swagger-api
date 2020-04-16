'use strict';


/**
 * Set this License set as the default
 * Sets the default flag to true for this LicenseSet, and modifies all other licenseSets in this contract as default = false 
 *
 * contractId String Id of the legal entity contract.
 * licenseSetId String Id of the License Set.
 * no response value expected for this operation
 **/
exports.contractContractIdLicensesetLicenseSetIdDefaultPOST = function(contractId,licenseSetId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get a contract by legal entity id
 * Get a contract by its UUID
 *
 * legalEntityId UUID UUID of contract to be fetched
 * returns Contract
 **/
exports.getContractByLegalEntity = function(legalEntityId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "default" : true,
  "contractType" : "legalEntity",
  "name" : "Hosted Voice with Global Meet",
  "entityId" : "entityId",
  "id" : "d290f1ee-6c54-4b01-90e6-d701748f0851"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a contract by provider id
 * Get a contract by its UUID
 *
 * providerId UUID UUID of contract to be fetched
 * returns Contract
 **/
exports.getContractByProvider = function(providerId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "default" : true,
  "contractType" : "legalEntity",
  "name" : "Hosted Voice with Global Meet",
  "entityId" : "entityId",
  "id" : "d290f1ee-6c54-4b01-90e6-d701748f0851"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get license by id
 *
 * licenseId UUID UUID of the license
 * returns License
 **/
exports.licenseLicenseIdGET = function(licenseId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "features" : [ {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  }, {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  } ],
  "licenseSetId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "companyId" : "companyId",
  "endDate" : "2000-01-23",
  "canAdd" : true,
  "licenseAssignments" : [ {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  }, {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  } ],
  "licenseId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "startDate" : "2000-01-23"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Remove all current client assignments from license
 * if the license model includes a minimum count, and removing the client does not violate the minimum, (or no minimum) then end the client relationship and marks the license as deleted.  If the license model does have a minimum, and deleting the client violates that, then just marks the client as deleted and leaves the license as active and resets options to defaults (We wouldn't actually expect a min/max license type to have options however...)  If the license model is an MSA, then delete the license.  (All deletes are soft-deletes, btw) 
 *
 * licenseSetId UUID 
 * returns License
 **/
exports.licenseLicenseSetLicenseSetIdDELETE = function(licenseSetId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "features" : [ {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  }, {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  } ],
  "licenseSetId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "companyId" : "companyId",
  "endDate" : "2000-01-23",
  "canAdd" : true,
  "licenseAssignments" : [ {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  }, {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  } ],
  "licenseId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "startDate" : "2000-01-23"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * legalEntityId String Returns all licenses associated with a legal entity
 * returns LicenseList
 **/
exports.licensesSearchLegalEntityLegalEntityIdGET = function(legalEntityId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "pagination" : {
    "last" : true,
    "size" : 5,
    "totalPages" : 6,
    "limit" : 1,
    "page" : 5,
    "dir" : "dir",
    "totalElements" : 0
  },
  "results" : [ {
    "features" : [ {
      "name" : "Included Minutes",
      "description" : "description",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "option" : "1000 min"
    }, {
      "name" : "Included Minutes",
      "description" : "description",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "option" : "1000 min"
    } ],
    "licenseSetId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "companyId" : "companyId",
    "endDate" : "2000-01-23",
    "canAdd" : true,
    "licenseAssignments" : [ {
      "companyId" : "companyId",
      "address" : {
        "country" : "USA",
        "address3" : "address3",
        "stateOrProvince" : "GA",
        "address2" : "address2",
        "city" : "Alpharetta",
        "address1" : "2300 Lakeview Parkway",
        "postalCode" : "30009",
        "timeZone" : "US Eastern"
      },
      "endDate" : "2000-01-23",
      "name" : "Michael Knight",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "email" : "michael.knight@kitt.com",
      "startDate" : "2000-01-23"
    }, {
      "companyId" : "companyId",
      "address" : {
        "country" : "USA",
        "address3" : "address3",
        "stateOrProvince" : "GA",
        "address2" : "address2",
        "city" : "Alpharetta",
        "address1" : "2300 Lakeview Parkway",
        "postalCode" : "30009",
        "timeZone" : "US Eastern"
      },
      "endDate" : "2000-01-23",
      "name" : "Michael Knight",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "email" : "michael.knight@kitt.com",
      "startDate" : "2000-01-23"
    } ],
    "licenseId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "startDate" : "2000-01-23"
  }, {
    "features" : [ {
      "name" : "Included Minutes",
      "description" : "description",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "option" : "1000 min"
    }, {
      "name" : "Included Minutes",
      "description" : "description",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "option" : "1000 min"
    } ],
    "licenseSetId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "companyId" : "companyId",
    "endDate" : "2000-01-23",
    "canAdd" : true,
    "licenseAssignments" : [ {
      "companyId" : "companyId",
      "address" : {
        "country" : "USA",
        "address3" : "address3",
        "stateOrProvince" : "GA",
        "address2" : "address2",
        "city" : "Alpharetta",
        "address1" : "2300 Lakeview Parkway",
        "postalCode" : "30009",
        "timeZone" : "US Eastern"
      },
      "endDate" : "2000-01-23",
      "name" : "Michael Knight",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "email" : "michael.knight@kitt.com",
      "startDate" : "2000-01-23"
    }, {
      "companyId" : "companyId",
      "address" : {
        "country" : "USA",
        "address3" : "address3",
        "stateOrProvince" : "GA",
        "address2" : "address2",
        "city" : "Alpharetta",
        "address1" : "2300 Lakeview Parkway",
        "postalCode" : "30009",
        "timeZone" : "US Eastern"
      },
      "endDate" : "2000-01-23",
      "name" : "Michael Knight",
      "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
      "email" : "michael.knight@kitt.com",
      "startDate" : "2000-01-23"
    } ],
    "licenseId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "startDate" : "2000-01-23"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * search licenses
 * Returns all licenses that are visible to the user. Can be filtered to show licenses assigned for a specific company (if user has access to multiple companies), by license set (GM5, Audio, etc), or by Result set includes pagination information 
 *
 * limit Integer Number of rows to return per page. (optional)
 * page Integer page number (1 based) (optional)
 * sort String sort attributes (optional)
 * dir String Sort direction; ascending or descending order. Default: ascending. (optional)
 * companyid UUID filter by companyId (optional)
 * licensesetid UUID filter by license set id (optional)
 * activeonly Boolean should results include only active license assignments (defaults to true) (optional)
 * contractid UUID filter by contract id (optional)
 * clientid UUID filter by client id (optional)
 * returns LicenseSet
 **/
exports.listLicense = function(limit,page,sort,dir,companyid,licensesetid,activeonly,contractid,clientid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "id" : "2352-sdf24-235d9-0heyTh3re",
  "name" : "Global Meet Web",
  "contractId" : "598e-2kjla4-I3thlkj4",
  "model" : "minMax",
  "modelProperties" : [ {
    "min" : 30,
    "max" : 50
  } ],
  "features" : [ {
    "featureName" : "participants",
    "description" : "Max web participants",
    "name" : "10 Users"
  } ],
  "default" : false
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * List all licenseSets for contract
 * List all license-able components for a particular contract
 *
 * contractId String 
 * returns List
 **/
exports.listLicenseSets = function(contractId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "id" : "2352-sdf24-235d9-0heyTh3re",
  "name" : "Global Meet Web",
  "contractId" : "598e-2kjla4-I3thlkj4",
  "model" : "minMax",
  "modelProperties" : [ {
    "min" : 30,
    "max" : 50
  } ],
  "features" : [ {
    "featureName" : "participants",
    "description" : "Max web participants",
    "name" : "10 Users"
  } ],
  "default" : false
}, {
  "id" : "2352-sdf24-235d9-0heyTh3re",
  "name" : "Global Meet Web",
  "contractId" : "598e-2kjla4-I3thlkj4",
  "model" : "minMax",
  "modelProperties" : [ {
    "min" : 30,
    "max" : 50
  } ],
  "features" : [ {
    "featureName" : "participants",
    "description" : "Max web participants",
    "name" : "10 Users"
  } ],
  "default" : false
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a specific licenseSet from this contract
 * Get a specific licenseSet
 *
 * contractId String Id of the legal entity contract.
 * licenseSetId String Id of the License Set.
 * returns LicenseSet
 **/
exports.listLicenseSetsByContract = function(contractId,licenseSetId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "id" : "2352-sdf24-235d9-0heyTh3re",
  "name" : "Global Meet Web",
  "contractId" : "598e-2kjla4-I3thlkj4",
  "model" : "minMax",
  "modelProperties" : [ {
    "min" : 30,
    "max" : 50
  } ],
  "features" : [ {
    "featureName" : "participants",
    "description" : "Max web participants",
    "name" : "10 Users"
  } ],
  "default" : false
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Change the client currently assigned to this license
 * This call will change the assigned client information for the source type listed in the request body. It will put an endDate on the previously assigned client based on the startDate of the request body. 
 *
 * licenseSetId UUID 
 * client ClientRequest 
 * returns License
 **/
exports.modifyLicense = function(licenseSetId,client) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "features" : [ {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  }, {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  } ],
  "licenseSetId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "companyId" : "companyId",
  "endDate" : "2000-01-23",
  "canAdd" : true,
  "licenseAssignments" : [ {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  }, {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  } ],
  "licenseId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "startDate" : "2000-01-23"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Create a new license in the given licenseSet with optional client information
 * Allows an admin to modify the client assignment of an existing license. If a clientId is passed, then the license is assigned to the existing client. If a Client object is passed, a new client will be created and assigned. 
 *
 * licenseSetId UUID UUID of the licenseSet
 * licenceUpdate LicenseRequest 
 * returns License
 **/
exports.newLicense = function(licenseSetId,licenceUpdate) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "features" : [ {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  }, {
    "name" : "Included Minutes",
    "description" : "description",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "option" : "1000 min"
  } ],
  "licenseSetId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "companyId" : "companyId",
  "endDate" : "2000-01-23",
  "canAdd" : true,
  "licenseAssignments" : [ {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  }, {
    "companyId" : "companyId",
    "address" : {
      "country" : "USA",
      "address3" : "address3",
      "stateOrProvince" : "GA",
      "address2" : "address2",
      "city" : "Alpharetta",
      "address1" : "2300 Lakeview Parkway",
      "postalCode" : "30009",
      "timeZone" : "US Eastern"
    },
    "endDate" : "2000-01-23",
    "name" : "Michael Knight",
    "id" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    "email" : "michael.knight@kitt.com",
    "startDate" : "2000-01-23"
  } ],
  "licenseId" : "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
  "startDate" : "2000-01-23"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

