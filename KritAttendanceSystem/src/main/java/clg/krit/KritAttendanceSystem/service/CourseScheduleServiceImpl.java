package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.CourseSchedule;
import clg.krit.KritAttendanceSystem.repository.CourseScheduleRepository;

@Service("courseScheduleService")
public class CourseScheduleServiceImpl implements CourseScheduleService{

	@Autowired
	CourseScheduleRepository courseScheduleRepository;
	
	@Override
	public List<CourseSchedule> getAllCourseSchedules() {
		return courseScheduleRepository.findAll();
	}

	@Override
	public CourseSchedule findCourseScheduleById(Integer courseScheduleId) {
		return courseScheduleRepository.findOne(courseScheduleId);
	}

}
