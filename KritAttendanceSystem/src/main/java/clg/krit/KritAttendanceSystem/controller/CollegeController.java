package clg.krit.KritAttendanceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendanceSystem.model.College;
import clg.krit.KritAttendanceSystem.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	@RequestMapping(value="/colleges", method = RequestMethod.POST)
	public List<College> getColleges(){
		return collegeService.getAllColleges();
	}
	
	public College findCollegeById(String college_Id){
		return collegeService.findCollegeById(college_Id);
	}
}
