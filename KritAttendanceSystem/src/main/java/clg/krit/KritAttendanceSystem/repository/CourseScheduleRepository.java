package clg.krit.KritAttendanceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.CourseSchedule;

public interface CourseScheduleRepository  extends JpaRepository<CourseSchedule, Integer>{
}
