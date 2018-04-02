'use strict';
/**
 * @ngdoc function
 * @name KRIT.controller:MainCtrl
 * @description #MainCtrl Controller of the KRIT
 */
angular.module('KRIT').controller('MainCtrl',
		function($scope, $state, $filter, sharedProperties, AppRestService) {
});
angular.module('KRIT').service('sharedProperties', function() {

	var isUpdate = null;
	var objectDataService = null;
	var allDataService = null;
	var userId = null;

	return {

		getObjectDataService : function() {
			return objectDataService;
		},
		setObjectDataService : function(objectData) {
			objectDataService = null;
			objectDataService = objectData;
		},
		getAllDataService : function() {
			return allDataService;
		},
		setAllDataService : function(allData) {
			allDataService = null;
			allDataService = allData;
		},

		getProcessDetails : function() {
			return isUpdate;
		},
		setProcessDetails : function(isUpdt) {
			isUpdate = null;
			isUpdate = isUpdt;
		},

		getUserId : function() {
			return userId;
		},

		setUserId : function(user) {
			userId = null;
			userId = user;
		}
	};
});