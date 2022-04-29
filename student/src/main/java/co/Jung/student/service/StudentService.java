package co.Jung.student.service;

import java.util.List;

import co.Jung.student.dto.StudentVO;

public interface StudentService {
	List<StudentVO> selectListStudent();
	StudentVO selectStudent(StudentVO student);
	int insertStudent(StudentVO student);
	int updateStudent(StudentVO student);
	int deleteStudent(StudentVO student);
	
}
