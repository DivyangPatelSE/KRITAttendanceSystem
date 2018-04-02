package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.CourseSchedule;

public interface CourseScheduleService {

	List<CourseSchedule> getAllCourseSchedules();
	CourseSchedule findCourseScheduleById(Integer courseScheduleId);
}
