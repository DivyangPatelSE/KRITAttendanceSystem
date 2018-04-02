package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.Course;

public interface CourseService {

	Course findCourseById(String courseId);
	List<Course> getAllCourses();
}
