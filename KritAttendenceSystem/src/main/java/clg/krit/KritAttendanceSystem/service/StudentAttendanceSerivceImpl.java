package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clg.krit.KritAttendanceSystem.model.CourseSchedule;
import clg.krit.KritAttendanceSystem.model.Student;
import clg.krit.KritAttendanceSystem.model.StudentAttendance;
import clg.krit.KritAttendanceSystem.repository.StudentAttendanceRepository;

@Service
public class StudentAttendanceSerivceImpl implements StudentAttendanceService {

	@Autowired
	StudentAttendanceRepository studentAttendanceRepository;

	@Override
	public List<StudentAttendance> getAllAttendance() {
		return studentAttendanceRepository.findAll();
	}

	@Override
	public StudentAttendance findAttendanceById(int studentAttendanceId) {
		return studentAttendanceRepository.findOne(studentAttendanceId);
	}

	@Override
	public List<StudentAttendance> findStudentAttendanceByCourseSchedule(CourseSchedule courseSchedule) {
		return studentAttendanceRepository.findStudentAttendanceByCourseSchedule(courseSchedule);
	}

	@Override
	public void updateStudentAttendance(StudentAttendance studentAttendance) {
		studentAttendanceRepository.save(studentAttendance);
	}

	@Override
	public void deleteStudentAttendance(StudentAttendance studentAttendance) {
		studentAttendanceRepository.delete(studentAttendance);
	}

	@Override
	public void addStudentAttendance(StudentAttendance studentAttendance) {
		studentAttendanceRepository.save(studentAttendance);
	}

	@Override
	public List<StudentAttendance> findStudentAttandanceByStudent(Student student) {
		return studentAttendanceRepository.findStudentAttendanceByStudent(student);
	}

}
