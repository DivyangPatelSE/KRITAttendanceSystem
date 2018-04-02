package clg.krit.KritAttendanceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendanceSystem.model.CourseActivities;
import clg.krit.KritAttendanceSystem.model.ProgramsCourse;
import clg.krit.KritAttendanceSystem.service.CourseActivitiesService;

@RestController
public class CourseActivitiesController {

	@Autowired
	CourseActivitiesService courseActivitiesService;

	@RequestMapping(value = "/courseActivities", method = RequestMethod.POST)
	public List<CourseActivities> getCourseActivities() {
		return courseActivitiesService.getAllCourseActivities();
	}

	@RequestMapping(value = "/getCourseActivitiesByProgramCourse", method = RequestMethod.POST)
	public List<CourseActivities> findCourseActivitiesByProgramsCourse(@RequestBody ProgramsCourse programCourse) {
		return courseActivitiesService.findCourseActivitiesByProgramsCourse(programCourse);
	}
	
	@RequestMapping(value = "/insertCourseActivity", method = RequestMethod.POST)
	public void insertCourseActivity(@RequestBody CourseActivities courseActivity){
		courseActivitiesService.insertCourseActivities(courseActivity);
	}
	
	@RequestMapping(value = "/updateCourseActivity", method = RequestMethod.PUT)
	public void updateCourseActivities(@RequestBody CourseActivities courseActivity){
		courseActivitiesService.updateCourseActivities(courseActivity);
	}
	
	@RequestMapping(value = "/deleteCourseActivity", method = RequestMethod.DELETE)
	public void deleteCourseActivity(@RequestBody CourseActivities courseActivity){
		courseActivitiesService.deleteCourseActivities(courseActivity);
	}
}
