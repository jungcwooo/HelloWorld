package co.jung.notice;

import java.util.List;

import co.jung.notice.service.NoticeService;
import co.jung.notice.service.NoticeVO;
import co.jung.notice.serviceImpl.NoticeServiceImpl;

public class App {
	public static void main(String[] args) {
		NoticeService notice = new NoticeServiceImpl();
		List<NoticeVO> list;
//		list = notice.noticeSelectList();
//		for (NoticeVO vo : list) {
//			vo.toString();
//		}
//		System.out.println("=================================================");
//		NoticeVO VO = new NoticeVO();
//		VO.setId(1);
//		VO = notice.noticeSelect(VO);
//		
//		for (NoticeVO noticeVO : list) {
//			noticeVO.toString();
//			System.out.println("===============  내  용  =====================");
//			System.out.println(VO.getSubject());
//		}
//		System.out.println("=================================================");
	Menu menu = new Menu();
	menu.Menu();
	
		
		

	}
}
