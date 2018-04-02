package clg.krit.KritAttendanceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendanceSystem.model.Student;
import clg.krit.KritAttendanceSystem.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/students", method= RequestMethod.POST)
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	public Student findStudentById(String studentId){
		return studentService.findStudentById(studentId);
	}
}
