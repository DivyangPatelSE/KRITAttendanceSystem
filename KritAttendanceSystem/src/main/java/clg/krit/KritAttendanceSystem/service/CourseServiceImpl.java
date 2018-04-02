package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.Course;
import clg.krit.KritAttendanceSystem.repository.CourseRepository;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public Course findCourseById(String courseId) {
		return courseRepository.findOne(courseId);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

}
