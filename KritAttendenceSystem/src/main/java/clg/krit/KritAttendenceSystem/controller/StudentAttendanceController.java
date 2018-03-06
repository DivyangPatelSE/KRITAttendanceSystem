package clg.krit.KritAttendenceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendenceSystem.model.CourseSchedule;
import clg.krit.KritAttendenceSystem.model.StudentAttendance;
import clg.krit.KritAttendenceSystem.service.StudentAttendanceService;

@RestController
public class StudentAttendanceController {

	@Autowired
	StudentAttendanceService studentAttendanceService;

	@RequestMapping(value = "/studentAttendance", method = RequestMethod.POST)
	List<StudentAttendance> getAllAttendance() {
		return studentAttendanceService.getAllAttendance();
	}

	StudentAttendance findStudentAttendanceById(int studentAttendanceId) {
		return studentAttendanceService.findAttendanceById(studentAttendanceId);
	}

	@RequestMapping(value = "/studentAttendanceByProgramsCourse", method = RequestMethod.POST)
	List<StudentAttendance> findStudentAttendanceByCourseSchedule(@RequestBody CourseSchedule courseSchedule) {
		return studentAttendanceService.findStudentAttendanceByCourseSchedule(courseSchedule);
	}
}
