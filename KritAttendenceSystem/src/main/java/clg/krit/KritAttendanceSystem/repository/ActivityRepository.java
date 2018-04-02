package clg.krit.KritAttendanceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, String> {

}
