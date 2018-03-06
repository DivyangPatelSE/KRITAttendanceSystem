package clg.krit.KritAttendenceSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendenceSystem.model.CourseSchedule;
import clg.krit.KritAttendenceSystem.model.StudentAttendance;

public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Integer>{
	
	List<StudentAttendance> findStudentAttendanceByCourseSchedule(CourseSchedule courseSchedule);
}
