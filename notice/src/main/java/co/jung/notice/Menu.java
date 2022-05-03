package co.jung.notice;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import co.jung.notice.service.NoticeService;
import co.jung.notice.service.NoticeVO;
import co.jung.notice.service.StudentService;
import co.jung.notice.service.StudentVO;
import co.jung.notice.serviceImpl.NoticeServiceImpl;
import co.jung.notice.serviceImpl.StudentserviceImpl;


public class Menu {
	NoticeService service = new NoticeServiceImpl();
	StudentService service2 = new StudentserviceImpl();
	private Scanner scn = new Scanner(System.in);
	NoticeVO VO = new NoticeVO();
	StudentVO VO2 = new StudentVO();
	List<NoticeVO> list;

	public void Menu() {
		int menuNo = 0;

		System.out.println("메뉴를 입력하세요");
		System.out.println("1. 학생관리");
		System.out.println("2. 공지사항");
		System.out.println("3. 종료");

		menuNo = Integer.parseInt(scn.next());
		switch (menuNo) {
		case 1:
			StudentManager();
			break;
		case 2:
			Kongee();
		case 3:
			break;

		default:
			break;
		}

	}

	private void StudentManager() {

		System.out.println("학생관리 프로그램을 실행합니다.");
		System.out.println("1. 등록");
		System.out.println("2. 변경");
		System.out.println("3. 삭제");
		System.out.println("4. 조회");
		System.out.println("5. 전체조회");
		System.out.println("6. 종료");

		int menuNo = Integer.parseInt(scn.next());

		switch (menuNo) {
		case 1:
			System.out.println("ID를 입력해주세요");
			VO2.setStudentid(scn.next());
			System.out.println("이름을 입력해주세요");
			VO2.setName(scn.next());
			System.out.println("생일을 입력해주세요");
			VO2.setBirthday(Date.valueOf(scn.next()));
			System.out.println("학과를 입력해주세요");
			VO2.setMajor(scn.next());
			System.out.println("주소를 입력해주세요");
			VO2.setAddress(scn.next());
			System.out.println("전화번호를  입력해주세요");
			VO2.setTel(scn.next());
			
			service2.insertStudent(VO2);

			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			service2.selectListStudent();
			break;
		case 6:
			break;

		default:
			break;
		}
	}

	private void Kongee() { //공지 사항
		System.out.println("공지사항을 관리합니다.");
		System.out.println("1. 등록");
		System.out.println("2. 변경");
		System.out.println("3. 삭제");
		System.out.println("4. 한건조회");
		System.out.println("5. 전체조회");
		System.out.println("6. 종료");

		int menuNo = Integer.parseInt(scn.next());

		switch (menuNo) {
		case 1: // 추가
			System.out.println("작성자을 입력해주세요.");
			VO.setWriter(scn.next());
			System.out.println("제목을 입력해주세요.");
			VO.setTitle(scn.next());
			System.out.println("내용을 입력해주세요.");
			VO.setSubject(scn.next());

			service.noticeInsert(VO);
//			int n = service.noticeInsert(VO);
//			if (n != 00)
//				System.out.println("정상적으로 입력되었습니다.");
			break;

		case 2: // 수정

			System.out.println("수정할 공지사항 ID를 입력해주세요");
			VO.setId(Integer.parseInt(scn.next()));
			System.out.println("수정할 공지사항 제목을 입력해주세요.");
			VO.setTitle(scn.next());
			System.out.println("수정할 공지사항 내용을 입력해주세요.");
			VO.setSubject(scn.next());

			service.noticeUpdate(VO);
//			int n1 = service.noticeUpdate(VO);
//			if (n1 != 00)
//				System.out.println("정상적으로 입력되었습니다.");

			break;

		case 3: // 삭제
			System.out.println("삭제할 공지사항 ID를 입력해주세요");
			VO.setId(Integer.parseInt(scn.next()));

			service.noticeDelete(VO);
//			int n2 = service.noticeDelete(VO);
//			if (n2 != 00)
//				System.out.println("정상적으로 입력되었습니다.");

			break;

		case 4: // 한건조회
			System.out.println("조회하실 ID를 입력하세요");
			VO.setId(Integer.parseInt(scn.next()));
			VO = service.noticeSelect(VO);

			VO.toString();
			System.out.println("===============  내  용  =====================");
			System.out.println(VO.getSubject());
			break;
		case 5: // 전체조회
			List list = service.noticeSelectList();
			for (Object object : list) {
				object.toString();
			}
			break;

		case 6: // 종료
			System.out.println("종료");
			break;

		default:
			System.out.println("종료");
			break;
		}

	}

}
