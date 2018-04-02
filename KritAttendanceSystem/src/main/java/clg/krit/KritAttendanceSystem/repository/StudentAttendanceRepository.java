package clg.krit.KritAttendanceSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clg.krit.KritAttendanceSystem.model.CourseSchedule;
import clg.krit.KritAttendanceSystem.model.Student;
import clg.krit.KritAttendanceSystem.model.StudentAttendance;

public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Integer> {

	public List<StudentAttendance> findStudentAttendanceByCourseSchedule(CourseSchedule courseSchedule);

	public List<StudentAttendance> findStudentAttendanceByStudent(Student student);
}
