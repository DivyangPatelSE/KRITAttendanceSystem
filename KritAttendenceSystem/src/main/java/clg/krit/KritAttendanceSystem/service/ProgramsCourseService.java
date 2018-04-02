package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.ProgramsCourse;

public interface ProgramsCourseService {

	List<ProgramsCourse> getAllProgramsCourse(); 
	ProgramsCourse findProgramsCourseById(String programsCourseId);
	
}
