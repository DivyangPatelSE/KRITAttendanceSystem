package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.College;

public interface CollegeService{

	College findCollegeById(String college_Id);
	List<College> getAllColleges();
}
