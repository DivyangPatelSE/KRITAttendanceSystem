package clg.krit.KritAttendanceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendanceSystem.model.ProgramsCourse;
import clg.krit.KritAttendanceSystem.service.ProgramsCourseService;

@RestController
public class ProgramCourseController {

	@Autowired
	ProgramsCourseService programCourseService;
	
	@RequestMapping(value="/programCourses", method = RequestMethod.POST)
	public List<ProgramsCourse> getAllProgramCourse(){
		return programCourseService.getAllProgramsCourse();
	}
	
	public ProgramsCourse programCourse(String programCourseId){
		return programCourseService.findProgramsCourseById(programCourseId);
	}
}
