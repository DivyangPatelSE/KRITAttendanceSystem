package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.Programs;
public interface ProgramsService {

	Programs getProgramsById(String program_Id);
	List<Programs> getAllPrograms();
}
