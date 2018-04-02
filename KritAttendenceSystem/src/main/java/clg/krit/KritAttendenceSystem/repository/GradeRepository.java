package clg.krit.KritAttendenceSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendenceSystem.model.Grade;
import clg.krit.KritAttendenceSystem.model.Student;

public interface GradeRepository extends JpaRepository<Grade, Integer>{

	List<Grade> findGradeByStudent(Student student);
	
}
