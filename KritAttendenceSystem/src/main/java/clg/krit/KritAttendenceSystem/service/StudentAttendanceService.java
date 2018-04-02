package clg.krit.KritAttendenceSystem.service;

import java.util.List;

import clg.krit.KritAttendenceSystem.model.CourseSchedule;
import clg.krit.KritAttendenceSystem.model.Student;
import clg.krit.KritAttendenceSystem.model.StudentAttendance;

public interface StudentAttendanceService {

	public List<StudentAttendance> getAllAttendance();

	public StudentAttendance findAttendanceById(int studentAttendanceId);

	public List<StudentAttendance> findStudentAttendanceByCourseSchedule(CourseSchedule courseSchedule);

	public void updateStudentAttendance(StudentAttendance studentAttendance);

	public void deleteStudentAttendance(StudentAttendance studentAttendance);

	public void addStudentAttendance(StudentAttendance studentAttendance);

	public List<StudentAttendance> findStudentAttandanceByStudent(Student student);
}
