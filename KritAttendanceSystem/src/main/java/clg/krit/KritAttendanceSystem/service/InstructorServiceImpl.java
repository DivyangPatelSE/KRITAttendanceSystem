package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.Instructor;
import clg.krit.KritAttendanceSystem.repository.InstructorRepository;

@Service("instructorService")
public class InstructorServiceImpl implements InstructorService{

	@Autowired
	InstructorRepository instructorRepository;
	
	@Override
	public List<Instructor> getAllInstructor() {
		return instructorRepository.findAll();
	}

	@Override
	public Instructor findInstructorById(String instructorId) {
		return instructorRepository.findOne(instructorId);
	}

}
