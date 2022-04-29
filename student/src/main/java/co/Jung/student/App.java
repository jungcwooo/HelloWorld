package co.Jung.student;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.Jung.student.dto.StudentVO;
import co.Jung.student.service.StudentService;
import co.Jung.student.serviceImpl.StudentserviceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
    	StudentService dao = new StudentserviceImpl();
    	
    	System.out.println("====================================전체조회=========================================");
    	List<StudentVO> list = new ArrayList<StudentVO>();
    	list = dao.selectListStudent();
    	
    	for (StudentVO vo : list) {
			vo.toString();
		}
    	System.out.println("====================================한명조회==========================================");
    	StudentVO student = new StudentVO();
    	student.setStudentid("pack@daum.net");
    	student = dao.selectStudent(student);
    	
    	student.toString();
//    	
//    	System.out.println("=====================================삭제=========================================");
//    	StudentVO student = new StudentVO();
//    	student.setStudentid("pack@daum.net");
//    	student = dao.selectStudent(student);
//    	
//    	System.out.println("=====================================한명추가=========================================");
//    	
//    	StudentVO vo = new StudentVO();
//    	vo.setStudentid("A@daum.net");
//    	vo.setName("아철우");
//    	vo.setBirthday(Date.valueOf("1995-02-12"));
//    	vo.setMajor("동물과");
//    	vo.setAddress(null);
//    	vo.setTel("010-6668-5511");
//    	
//    	int n = dao.insertStudent(vo);
//    	if(n != 00) {
//    		System.out.println("정상적으로 입력되었습니다.");
//    		
//    	}
    	
    }
}
