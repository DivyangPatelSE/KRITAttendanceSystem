package clg.krit.KritAttendenceSystem.service;

import java.util.List;

import clg.krit.KritAttendenceSystem.model.Grade;
import clg.krit.KritAttendenceSystem.model.Student;

public interface GradeService {

	Grade findGradeById(int gradeId);

	List<Grade> getAllGrades();

	void insertGrade(Grade grade);

	void updateGrade(Grade grade);

	void deleteGrade(Grade grade);

	List<Grade> findGradeByStudent(Student student);
}
