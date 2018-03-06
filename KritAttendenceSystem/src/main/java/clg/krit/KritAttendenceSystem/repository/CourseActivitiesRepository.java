package clg.krit.KritAttendenceSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendenceSystem.model.CourseActivities;
import clg.krit.KritAttendenceSystem.model.ProgramsCourse;

public interface CourseActivitiesRepository extends JpaRepository<CourseActivities, Integer> {

	List<CourseActivities> findCourseActivitiesByProgramsCourse(ProgramsCourse programCourse);
}
