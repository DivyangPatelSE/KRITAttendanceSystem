package clg.krit.KritAttendanceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendanceSystem.model.Grade;
import clg.krit.KritAttendanceSystem.model.Student;
import clg.krit.KritAttendanceSystem.service.GradeService;

@RestController
public class GradeController {

	@Autowired
	GradeService gradeService;

	@RequestMapping(value = "/grades", method = RequestMethod.POST)
	public List<Grade> getAllGrades() {
		return gradeService.getAllGrades();
	}

	@RequestMapping(value = "/findGradeById", method = RequestMethod.POST)
	public Grade findGradeById(int gradeId) {
		return gradeService.findGradeById(gradeId);
	}

	@RequestMapping(value = "/insertGrade", method = RequestMethod.POST)
	public void insertGrade(@RequestBody Grade grade) {
		gradeService.insertGrade(grade);
	}

	@RequestMapping(value = "/updateGrade", method = RequestMethod.PUT)
	public void updateGrade(@RequestBody Grade grade) {
		gradeService.updateGrade(grade);
	}

	@RequestMapping(value = "/deleteGrade", method = RequestMethod.DELETE)
	public void deleteGrade(@RequestBody Grade grade) {
		gradeService.deleteGrade(grade);
	}

	@RequestMapping(value = "/findGradeByStudent", method = RequestMethod.POST)
	public List<Grade> findGradeByStudent(@RequestBody Student student) {
		return gradeService.findGradeByStudent(student);
	}
}
