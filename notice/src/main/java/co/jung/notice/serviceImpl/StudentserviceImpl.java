package co.jung.notice.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.jung.notice.dao.DataSource;
import co.jung.notice.service.StudentService;
import co.jung.notice.service.StudentVO;

public class StudentserviceImpl implements StudentService {
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn = dataSource.getConnection(); // connection연결
	private PreparedStatement psmt; // sql 명령실행
	private ResultSet rs; // select 결과 담음

	@Override 
	public List<StudentVO> selectListStudent() {
		List<StudentVO> students = new ArrayList<StudentVO>();
		// 전체 학생 리스트 가져오기
		StudentVO student;
		String sql = "SELECT * FROM STUDENT";

		try {
			psmt = conn.prepareStatement(sql); //sql에 담긴 명령을 보냄
			rs = psmt.executeQuery();	// 돌아온 결과를 rs에 담음

			while(rs.next()){	//next()는 일방통행 , rs를 읽다가 내용이 없으면 EOT (false리턴)
				student = new StudentVO();	//초기화
				student.setStudentid(rs.getString("studentid")); //rs.get변수타입("컬럼명");
				student.setName(rs.getString("name")); 
				student.setBirthday((rs.getDate("birthday")));
				student.setMajor(rs.getString("major")); 
				student.setAddress(rs.getString("address")); 
				student.setTel(rs.getString("tel")); 
				students.add(student);	//리스트에 추가
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public StudentVO selectStudent(StudentVO student) {
		//한명 조회
		
		StudentVO vo = new StudentVO();
		String sql = "SELECT * FROM STUDENT WHERE STUDENTID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getStudentid());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo.setStudentid(rs.getString("studentid")); //rs.get변수타입("컬럼명");
				vo.setName(rs.getString("name")); 
				vo.setBirthday((rs.getDate("birthday")));
				vo.setMajor(rs.getString("major")); 
				vo.setAddress(rs.getString("address")); 
				vo.setTel(rs.getString("tel")); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public int insertStudent(StudentVO student) {
		//한명 추가
		int n = 0;
		String sql = "insert into student values (?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql); 
			psmt.setString(1, student.getStudentid());
			psmt.setString(2, student.getName());
			psmt.setDate(3, student.getBirthday());
			psmt.setString(4, student.getMajor());
			psmt.setString(5, student.getAddress());
			psmt.setString(6, student.getTel());
			n = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}

	@Override
	public int updateStudent(StudentVO student) {
		//수정
		int n = 0;
		String sql = "UPDATE STUDENT SET MAJOR = ?, ADDRESS = ?, TEL = ? WHERE STUDENTID = ?";
		try {
			psmt = conn.prepareStatement(sql); 
			psmt.setString(1, student.getMajor());
			psmt.setString(2, student.getAddress());
			psmt.setString(3, student.getTel());
			psmt.setString(4, student.getStudentid());
			n = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}

	@Override
	public int deleteStudent(StudentVO student) {
		//삭제
		int n = 0;
		String sql = "DELETE FROM STUDENT WHERE STUDENTID = ?";
		try {
			psmt = conn.prepareStatement(sql); 
			psmt.setString(1, student.getStudentid());
			n = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}

}
