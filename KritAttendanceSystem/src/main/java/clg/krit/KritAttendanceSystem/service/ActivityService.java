package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.Activity;

public interface ActivityService {

	Activity getActivityById(String activityId);
	List<Activity> getAllActivities();
	
	
}
