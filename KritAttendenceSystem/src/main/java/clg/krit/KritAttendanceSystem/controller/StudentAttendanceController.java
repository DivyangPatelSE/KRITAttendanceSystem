package clg.krit.KritAttendanceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendanceSystem.model.CourseSchedule;
import clg.krit.KritAttendanceSystem.model.Student;
import clg.krit.KritAttendanceSystem.model.StudentAttendance;
import clg.krit.KritAttendanceSystem.service.StudentAttendanceService;

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

	@RequestMapping(value = "/studentAttendanceByCourseSchedule", method = RequestMethod.POST)
	List<StudentAttendance> findStudentAttendanceByCourseSchedule(@RequestBody CourseSchedule courseSchedule) {
		return studentAttendanceService.findStudentAttendanceByCourseSchedule(courseSchedule);
	}

	@RequestMapping(value = "/studentAttendanceByStudent", method = RequestMethod.POST)
	List<StudentAttendance> findStudentAttendanceByStudentId(@RequestBody Student student){
		return studentAttendanceService.findStudentAttandanceByStudent(student);
	}
	
	@RequestMapping(value = "/addStudentAttendance", method = RequestMethod.POST)
	public void addStudentAttendance(@RequestBody StudentAttendance studentAttendance) {
		studentAttendanceService.addStudentAttendance(studentAttendance);
	}

	@RequestMapping(value = "/updateStudentAttendance", method = RequestMethod.PUT)
	public void updateStudentAttendance(@RequestBody StudentAttendance studentAttendance) {
		studentAttendanceService.updateStudentAttendance(studentAttendance);
	}

	@RequestMapping(value = "/deleteStudentAttendance", method = RequestMethod.DELETE)
	public void deleteStudentAttendance(@RequestBody StudentAttendance studentAttendance) {
		studentAttendanceService.deleteStudentAttendance(studentAttendance);
	}
}
