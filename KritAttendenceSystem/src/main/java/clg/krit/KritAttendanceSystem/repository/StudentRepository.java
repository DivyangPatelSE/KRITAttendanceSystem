package clg.krit.KritAttendanceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
}
