package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.Grade;
import clg.krit.KritAttendanceSystem.model.Student;
import clg.krit.KritAttendanceSystem.repository.GradeRepository;

@Service("gradeService")
public class GradeServiceImpl implements GradeService {

	@Autowired
	GradeRepository gradeRepository;

	@Override
	public Grade findGradeById(int gradeId) {
		return gradeRepository.findOne(gradeId);
	}

	@Override
	public List<Grade> getAllGrades() {
		return gradeRepository.findAll();
	}

	@Override
	public void insertGrade(Grade grade) {
		gradeRepository.save(grade);
	}

	@Override
	public void updateGrade(Grade grade) {
		gradeRepository.save(grade);
	}

	@Override
	public void deleteGrade(Grade grade) {
		gradeRepository.delete(grade);
	}

	@Override
	public List<Grade> findGradeByStudent(Student student) {
		return gradeRepository.findGradeByStudent(student);
	}
}
