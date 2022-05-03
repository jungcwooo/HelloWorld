package co.jung.notice.service;

import java.util.List;

public interface StudentService {
	List<StudentVO> selectListStudent();
	StudentVO selectStudent(StudentVO student);
	int insertStudent(StudentVO student);
	int updateStudent(StudentVO student);
	int deleteStudent(StudentVO student);
	
}
