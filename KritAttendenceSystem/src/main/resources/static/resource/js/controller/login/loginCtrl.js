app
		.controller(
				'loginCtrl',
				function($scope, $state, $mdDialog, $mdMedia, $sessionStorage,
						$cookies, AuthenticationService, AppRestService) {

					$scope.labels = labels;
					$scope.errors = errors;
					$scope.error = false;
					$scope.onAlertClose = function(error) {
						$scope.error = false;
					};
					$scope.instructor = "Instructor";
					$scope.student = "Student";

					$scope.studentDetails = null;

					$scope.onSubmit = function() {
						(function initController() { // reset login status
							AuthenticationService.ClearCredentials();
						})();

						if ($scope.userName === null
								|| $scope.userName === undefined
								|| $scope.passWord === null
								|| $scope.passWord === undefined) {
							$scope.error = true;
							$scope.status = 407;
							$scope.errorMsg = "Enter Username and Password must not be empty";

						} else {
							if ($scope.role === null
									|| $scope.role === undefined) {
								$scope.error = true;
								$scope.errorMsg = "Please Select Role to Login";
							} else if ($scope.role === $scope.instructor) {
								AppRestService
										.getInstructorDetails(function(
												response, status) {
											if (status == 200) {
												$scope.success = true;
												$scope.SuccessMsg = "Data Added Successfully"
												// response.error;
												$scope.status = status;
												$scope.error = false;
												$scope.instructor = new Instructor();
												for (i in response) {
													$scope.instructor
															.set(response[i]);
													$scope.instructor
															.add($scope.instructor
																	.toJson());

												}

												var instructors = $scope.instructor
														.getInstructors();

												for (i in instructors) {
													if ($scope.userName === instructors[i].INSTRUCTOR_EMAIL
															&& $scope.passWord === instructors[i].PASSWORD) {

														sessionStorage
																.setItem(
																		'user',
																		instructors[i].INSTRUCTOR_FIRST_NAME
																				+ " "
																				+ instructors[i].INSTRUCTOR_LAST_NAME);
														sessionStorage
																.setItem(
																		'instructorId',
																		instructors[i].INSTRUCTOR_ID);

														sessionStorage
														.setItem(
																'role',
																$scope.role);
														
														$cookies
																.put(
																		'User',
																		instructors[i].INSTRUCTOR_ID);
														AuthenticationService
																.SetCredentials(
																		$scope.userName,
																		$scope.passWord);

														$state
																.go('dashboard.home');

													}
												}

											} else {
												$scope.error = true;
												$scope.errorMsg = data.message;
												$scope.status = status;
											}
										});
							} else if ($scope.role === $scope.student) {
								AppRestService
										.getStudentDetails(function(response,
												status) {

											if (status == 200) {
												// response.error;
												$scope.status = status;
												$scope.error = false;
												$scope.studentDetails = new Student();
												for (i in response) {
													$scope.studentDetails
															.set(response[i]);
													$scope.studentDetails
															.add($scope.studentDetails
																	.toJson());
												}

												// $scope.reset();
												var students = $scope.studentDetails
														.getStudents();
												for (i in students) {

													if ($scope.userName === students[i].STUDENT_EMAIL
															&& $scope.passWord === students[i].PASSWORD) {
														sessionStorage
																.setItem(
																		'user',
																		students[i].STUDENT_FIRST_NAME
																				+ " "
																				+ students[i].STUDENT_LAST_NAME);
														sessionStorage
																.setItem(
																		'programId',
																		students[i].PROGRAM.PROGRAMS_ID);
														sessionStorage
																.setItem(
																		'studentId',
																		students[i].STUDENT_ID);

														sessionStorage
														.setItem(
																'role',
																$scope.role);
														
														$cookies
																.put(
																		'User',
																		students[i].STUDENT_ID);
														AuthenticationService
																.SetCredentials(
																		$scope.userName,
																		$scope.passWord);

														$state
																.go('dashboard.home');

													} else {
														$scope.error = true;
														$scope.errorMsg = "Invalid Username/Password. Enter correct information to login";

													}

												}

											} else {
												$scope.error = true;
												$scope.status = 402;
												$scope.errorMsg = "Username or Password is incorrect";
											}
										});
							} else {
								$scope.error = true;
								$scope.status = 405;
								$scope.errorMsg = "Something went Wrong. Try Again";
							}
						}

					};

				});
