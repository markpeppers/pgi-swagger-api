'use strict';

var utils = require('../utils/writer.js');
var LicenseMgmtExternal = require('../service/LicenseMgmtExternalService');

module.exports.contractContractIdLicensesetLicenseSetIdDefaultPOST = function contractContractIdLicensesetLicenseSetIdDefaultPOST (req, res, next) {
  var contractId = req.swagger.params['contractId'].value;
  var licenseSetId = req.swagger.params['licenseSetId'].value;
  LicenseMgmtExternal.contractContractIdLicensesetLicenseSetIdDefaultPOST(contractId,licenseSetId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getContractByLegalEntity = function getContractByLegalEntity (req, res, next) {
  var legalEntityId = req.swagger.params['legalEntityId'].value;
  LicenseMgmtExternal.getContractByLegalEntity(legalEntityId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getContractByProvider = function getContractByProvider (req, res, next) {
  var providerId = req.swagger.params['providerId'].value;
  LicenseMgmtExternal.getContractByProvider(providerId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.licenseLicenseIdGET = function licenseLicenseIdGET (req, res, next) {
  var licenseId = req.swagger.params['licenseId'].value;
  LicenseMgmtExternal.licenseLicenseIdGET(licenseId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.licenseLicenseSetLicenseSetIdDELETE = function licenseLicenseSetLicenseSetIdDELETE (req, res, next) {
  var licenseSetId = req.swagger.params['licenseSetId'].value;
  LicenseMgmtExternal.licenseLicenseSetLicenseSetIdDELETE(licenseSetId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.licensesSearchLegalEntityLegalEntityIdGET = function licensesSearchLegalEntityLegalEntityIdGET (req, res, next) {
  var legalEntityId = req.swagger.params['legalEntityId'].value;
  LicenseMgmtExternal.licensesSearchLegalEntityLegalEntityIdGET(legalEntityId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.listLicense = function listLicense (req, res, next) {
  var limit = req.swagger.params['limit'].value;
  var page = req.swagger.params['page'].value;
  var sort = req.swagger.params['sort'].value;
  var dir = req.swagger.params['dir'].value;
  var companyid = req.swagger.params['companyid'].value;
  var licensesetid = req.swagger.params['licensesetid'].value;
  var activeonly = req.swagger.params['activeonly'].value;
  var contractid = req.swagger.params['contractid'].value;
  var clientid = req.swagger.params['clientid'].value;
  LicenseMgmtExternal.listLicense(limit,page,sort,dir,companyid,licensesetid,activeonly,contractid,clientid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.listLicenseSets = function listLicenseSets (req, res, next) {
  var contractId = req.swagger.params['contractId'].value;
  LicenseMgmtExternal.listLicenseSets(contractId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.listLicenseSetsByContract = function listLicenseSetsByContract (req, res, next) {
  var contractId = req.swagger.params['contractId'].value;
  var licenseSetId = req.swagger.params['licenseSetId'].value;
  LicenseMgmtExternal.listLicenseSetsByContract(contractId,licenseSetId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modifyLicense = function modifyLicense (req, res, next) {
  var licenseSetId = req.swagger.params['licenseSetId'].value;
  var client = req.swagger.params['client'].value;
  LicenseMgmtExternal.modifyLicense(licenseSetId,client)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.newLicense = function newLicense (req, res, next) {
  var licenseSetId = req.swagger.params['licenseSetId'].value;
  var licenceUpdate = req.swagger.params['licenceUpdate'].value;
  LicenseMgmtExternal.newLicense(licenseSetId,licenceUpdate)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
