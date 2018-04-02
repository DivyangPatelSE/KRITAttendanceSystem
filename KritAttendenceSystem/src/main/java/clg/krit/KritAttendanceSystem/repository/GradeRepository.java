package clg.krit.KritAttendanceSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.Grade;
import clg.krit.KritAttendanceSystem.model.Student;

public interface GradeRepository extends JpaRepository<Grade, Integer>{

	List<Grade> findGradeByStudent(Student student);
	
}
