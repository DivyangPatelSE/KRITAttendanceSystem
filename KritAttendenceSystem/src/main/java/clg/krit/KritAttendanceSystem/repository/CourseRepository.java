package clg.krit.KritAttendanceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.Course;

public interface CourseRepository  extends JpaRepository<Course, String>{

}
