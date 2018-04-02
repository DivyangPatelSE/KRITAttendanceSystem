package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.Activity;
import clg.krit.KritAttendanceSystem.repository.ActivityRepository;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityRepository activityRepository;

	@Override
	public Activity getActivityById(String activityId) {
		return activityRepository.findOne(activityId);
	}

	@Override
	public List<Activity> getAllActivities() {
		return activityRepository.findAll();
	}

}
