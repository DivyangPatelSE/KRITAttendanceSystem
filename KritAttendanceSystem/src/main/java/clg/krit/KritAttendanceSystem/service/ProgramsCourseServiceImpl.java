package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.ProgramsCourse;
import clg.krit.KritAttendanceSystem.repository.ProgramsCourseRepository;

@Service("programsCourseService")
public class ProgramsCourseServiceImpl implements ProgramsCourseService{

	@Autowired
	ProgramsCourseRepository programsCourseRepository;
	
	@Override
	public List<ProgramsCourse> getAllProgramsCourse() {
		return programsCourseRepository.findAll();
	}

	@Override
	public ProgramsCourse findProgramsCourseById(String programsCourseId) {
		return programsCourseRepository.findOne(programsCourseId);
	}

}
