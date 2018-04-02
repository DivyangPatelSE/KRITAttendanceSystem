package clg.krit.KritAttendanceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.College;

public interface CollegeRepository extends JpaRepository<College, String> {
}
