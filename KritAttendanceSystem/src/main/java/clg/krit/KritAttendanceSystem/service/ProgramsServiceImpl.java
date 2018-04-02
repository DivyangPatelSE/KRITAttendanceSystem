package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.Programs;
import clg.krit.KritAttendanceSystem.repository.ProgramsRepository;

@Service("programsService")
public class ProgramsServiceImpl implements ProgramsService {

	@Autowired
	ProgramsRepository programsRepository;
	
	@Override
	public Programs getProgramsById(String program_Id) {
		return programsRepository.findOne(program_Id) ;
	}

	@Override 
	public List<Programs> getAllPrograms() {
 		return programsRepository.findAll();
	}

}
