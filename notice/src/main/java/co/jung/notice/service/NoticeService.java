package co.jung.notice.service;

import java.util.List;

public interface NoticeService {
	List<NoticeVO> noticeSelectList();	//전체조회
	NoticeVO noticeSelect(NoticeVO vo);	//한건조회
	int noticeInsert(NoticeVO vo);		//추가
	int noticeUpdate(NoticeVO vo);		//변경
	int noticeDelete(NoticeVO vo);		//삭제
}
