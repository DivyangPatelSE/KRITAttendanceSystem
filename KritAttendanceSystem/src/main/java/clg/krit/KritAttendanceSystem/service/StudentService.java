package clg.krit.KritAttendanceSystem.service;

import java.util.List;

import clg.krit.KritAttendanceSystem.model.Student;

public interface StudentService {

	List<Student> getAllStudent();
	Student findStudentById(String studentId);
}
