package clg.krit.KritAttendenceSystem.service;

import java.util.List;

import clg.krit.KritAttendenceSystem.model.CourseActivities;
import clg.krit.KritAttendenceSystem.model.ProgramsCourse;

public interface CourseActivitiesService {

	CourseActivities findCourseActivitiesById(int courseActivitiesId);

	List<CourseActivities> getAllCourseActivities();

	List<CourseActivities> findCourseActivitiesByProgramsCourse(ProgramsCourse programCourse);
}
