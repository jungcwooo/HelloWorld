package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;


public class BoardApp implements BoardService {
	Scanner scn = new Scanner(System.in);
	ArrayList<Board> list = new ArrayList<Board>();

	@Override
	// 추가
	public void add(Board board) {
		list.add(board);
	}

	@Override
	// 수정
	public void insert(int iNo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == iNo) {
				System.out.println("변경할 제목을 입력하세요");
				String iName = scn.next();
				list.get(i).setBoardName(iName);
				System.out.println("변경할 내용을 입력하세요");
				String iIString = scn.next();
				list.get(i).setBoardInString(iIString);

				System.out.println("변경이 완료되었습니다.");
				break;

			}

		}
	}

	@Override
	// 삭제
	public void delete(int dNo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == dNo) {
				list.remove(i);
			}

		}
	}

	@Override
	// 전체조회
	public void List() {
		System.out.println(" 게시번호   제목       작성자    작성일시");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	@Override
	// 조건조회(이름)
	public void searchList(String name) {
		int cnt = 0;
		System.out.println(" 게시번호   제목       작성자    작성일시");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUser().equals(name)) {
				System.out.println(list.get(i));
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("조회할 대상이 없습니다.");
		}
	}

	@Override
	// 한건조회(번호)
	public void oneList(int oNo) {
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getBoardNo() == oNo) {
				list.get(j).getInfo();
			}
		}
	}

}
