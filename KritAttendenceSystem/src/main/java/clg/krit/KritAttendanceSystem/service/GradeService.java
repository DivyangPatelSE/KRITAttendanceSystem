package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.Grade;
import clg.krit.KritAttendanceSystem.model.Student;

public interface GradeService {

	Grade findGradeById(int gradeId);

	List<Grade> getAllGrades();

	void insertGrade(Grade grade);

	void updateGrade(Grade grade);

	void deleteGrade(Grade grade);

	List<Grade> findGradeByStudent(Student student);
}
