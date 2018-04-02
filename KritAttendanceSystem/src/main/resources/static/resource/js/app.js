'use strict';
/**
 * @ngdoc overview
 * @name KRIT
 * @description # KRIT
 * 
 * Main module of the application.
 */

/* 'ui.bootstrap', 'ngStorage', */
var app = angular.module('KRIT', [ 'oc.lazyLoad', 'ui.router', 'ui.bootstrap',
		'angular-loading-bar', 'ngMessages', 'ngMaterial', 'datatables',
		'datatables.bootstrap', 'ngStorage', 'datatables.buttons',
		'datatables.select', 'datatables.scroller', 'ngCookies',
		'ui.bootstrap.datetimepicker'

]);
app
		.config([
				'$stateProvider',
				'$urlRouterProvider',
				'$ocLazyLoadProvider',
				function($stateProvider, $urlRouterProvider,
						$ocLazyLoadProvider, $mdThemingProvider,
						$mdDateLocaleProvider) {

					$ocLazyLoadProvider.config({
						debug : false,
						events : true,
					});

					$urlRouterProvider.otherwise('/dashboard/home');
					/*
					 * $httpProvider.defaults.headers.common['X-Requested-With'] =
					 * 'XMLHttpRequest';
					 */
					$stateProvider
							.state(
									'dashboard',
									{
										url : '/dashboard',
										templateUrl : 'pages/views/dashboard/main.html',
										resolve : {
											loadMyDirectives : function(
													$ocLazyLoad) {
												return
														$ocLazyLoad
																.load({
																	name : 'KRIT',
																	files : [
																			'resource/js/directives/header/header.js',
																			'resource/js/directives/header/header-notification/header-notification.js',
																			'resource/js/directives/sidebar/sidebar.js',
																			'resource/js/directives/sidebar/sidebar-search/sidebar-search.js',
																			'resource/js/bp.js' ]
																}),
														$ocLazyLoad
																.load({
																	name : 'toggle-switch',
																	files : [
																			"resource/js/bower_components/angular-toggle-switch/angular-toggle-switch.min.js",
																			"resource/js/bower_components/angular-toggle-switch/angular-toggle-switch.css" ]
																}),
														$ocLazyLoad
																.load({
																	name : 'ngAnimate',
																	files : [ 'resource/js/bower_components/angular-animate/angular-animate.js' ]
																})
												$ocLazyLoad
														.load({
															name : 'ngCookies',
															files : [ 'resource/js/bower_components/angular-cookies/angular-cookies.js' ]
														})
												$ocLazyLoad
														.load({
															name : 'ngResource',
															files : [ 'resource/js/bower_components/angular-resource/angular-resource.js' ]
														})
												$ocLazyLoad
														.load({
															name : 'ngSanitize',
															files : [ 'resource/js/bower_components/angular-sanitize/angular-sanitize.js' ]
														})
												$ocLazyLoad
														.load({
															name : 'ngTouch',
															files : [ 'resource/js/bower_components/angular-touch/angular-touch.js' ]
														})
											}
										}
									})
							.state(
									'dashboard.home',
									{
										url : '/home',
										controller : 'MainCtrl',
										templateUrl : 'pages/views/dashboard/home.html',
										resolve : {
											loadMyFiles : function($ocLazyLoad) {
												return $ocLazyLoad
														.load({
															name : 'KRIT',
															files : [
																	'resource/js/controller/main.js',
																	'resource/js/directives/timeline/timeline.js',
																	'resource/js/directives/notifications/notifications.js',
																	'resource/js/directives/chat/chat.js',
																	'resource/js/directives/dashboard/stats/stats.js' ]
														})
											}
										}
									})
							.state('login', {
								templateUrl : 'pages/views/pages/login.html',
								url : '/login'
							})
							.state(
									'dashboard.courseScheduleDetails',
									{
										templateUrl : 'pages/view/course_schedule/courseSchedule.html',
										absolute : true,
										url : '/courseScheduleDetails'
									})
							.state(
									'dashboard.gradesDetails',
									{
										templateUrl : 'pages/view/grades/gradesDetails.html',
										absolute : true,
										url : '/gradesDetails'
									})
							.state(
									'dashboard.studentAttendanceDetails',
									{
										templateUrl : 'pages/view/student_attendance/studentAttendanceDetails.html',
										absolute : true,
										url : '/studentAttendanceDetails'
									})
							.state(
									'dashboard.courseActivity',
									{
										templateUrl : 'pages/view/course_activity/selectCourseActivity.html',
										absolute : true,
										url : '/courseActivity'
									})
							.state(
									'dashboard.addAttendance',
									{
										templateUrl : 'pages/view/grades/addGrade.html',
										absolute : true,
										url : '/addAttendance'
									})
							.state(
									'dashboard.addGrade',
									{
										templateUrl : 'pages/view/student_attendance/addAttendance.html',
										absolute : true,
										url : '/addGrade'
									})

				} ]);

app.run.$inject = [ '$rootScope', '$http', '$location', '$cookieStore' ];

app.run(function($rootScope, $http, $location, $cookieStore) {

	$rootScope.globals = $cookieStore.get('globals') || {};

	if ($rootScope.globals.currentUser) {
		$http.defaults.headers.common['Authorization'] = 'Basic'
				+ $rootScope.globals.currentUser.authdata
	}

	$rootScope.$on('$locationChangeStart', function(event, next, current) {
		var restrictedPage = $.inArray($location.path(), [ 'login' ]) === -1;
		var loggedIn = $rootScope.globals.currentUser;
		if (restrictedPage && !loggedIn) {
			$location.path('login');
		}
	});
});
