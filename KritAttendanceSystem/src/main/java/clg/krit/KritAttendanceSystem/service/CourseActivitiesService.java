package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.CourseActivities;
import clg.krit.KritAttendanceSystem.model.ProgramsCourse;

public interface CourseActivitiesService {

	CourseActivities findCourseActivitiesById(int courseActivitiesId);

	List<CourseActivities> getAllCourseActivities();

	List<CourseActivities> findCourseActivitiesByProgramsCourse(ProgramsCourse programCourse);

	void updateCourseActivities(CourseActivities courseActivity);

	void deleteCourseActivities(CourseActivities courseActivity);

	void insertCourseActivities(CourseActivities courseActivity);
}
