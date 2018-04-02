package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.Instructor;

public interface InstructorService {

	List<Instructor> getAllInstructor();
	Instructor findInstructorById(String instructorId);
}
