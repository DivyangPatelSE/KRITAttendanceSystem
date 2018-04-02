package clg.krit.KritAttendanceSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.CourseActivities;
import clg.krit.KritAttendanceSystem.model.ProgramsCourse;

public interface CourseActivitiesRepository extends JpaRepository<CourseActivities, Integer> {

	List<CourseActivities> findCourseActivitiesByProgramsCourse(ProgramsCourse programCourse);
}
