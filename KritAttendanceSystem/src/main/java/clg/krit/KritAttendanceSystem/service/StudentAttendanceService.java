package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.CourseSchedule;
import clg.krit.KritAttendanceSystem.model.Student;
import clg.krit.KritAttendanceSystem.model.StudentAttendance;

public interface StudentAttendanceService {

	public List<StudentAttendance> getAllAttendance();

	public StudentAttendance findAttendanceById(int studentAttendanceId);

	public List<StudentAttendance> findStudentAttendanceByCourseSchedule(CourseSchedule courseSchedule);

	public void updateStudentAttendance(StudentAttendance studentAttendance);

	public void deleteStudentAttendance(StudentAttendance studentAttendance);

	public void addStudentAttendance(StudentAttendance studentAttendance);

	public List<StudentAttendance> findStudentAttandanceByStudent(Student student);
}
