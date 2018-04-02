package clg.krit.KritAttendanceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, String>{
}
