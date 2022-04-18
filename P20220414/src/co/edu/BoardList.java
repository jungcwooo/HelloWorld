package co.edu;

public class BoardList {
	private Board[] boards, ddd;

	public void init(int size) {
		boards = new Board[size];
		ddd = new Board[size];
	}

	public int addBoard(Board board) {
//		boolean check = false;
		int errorCase = -1;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1;
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0;
				break;
			}
		}
		return errorCase;
	}

	// 수정 : 게시글 번호로 찾아서 내용과 제목을 바꾸기
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				return check = true;
			}
		}
		return check;
	}

	// 삭제
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				boards[i] = null;
				return check = true;
			}
		}
		return check;
	}

	// 작성자 조회
<<<<<<< HEAD
	public Board[] searchWrBoard(String bWr) {
		Board[] sBoards = new Board[5];
		for (int i = 0; i < boards.length; i++) { // 찾을 대상배열
			if (boards[i] != null && boards[i].getWriter().equals(bWr)) {
				for (int j = 0; j < sBoards.length; j++) { //이름 조회해서 반환하는 배열
					if (sBoards[j] == null) {
						sBoards[j] = boards[j];
						break;
					}
				}

=======
	public void searchWrBoard(String bWr) {

		if (bWr == null) {
			System.out.println("조회결과가 없습니다.");
		} else {

			for (int i = 0; i < boards.length; i++) {
				if (boards[i].getWriter().equals(bWr)) {
					if (!(boards[i] == null || boards[i].isEmpty())) {
						boards[i].getSearchInfo();
					}
				}else {
					continue;
				}
>>>>>>> branch 'master' of https://github.com/jungcwooo/HelloWorld.git
			}
		}
<<<<<<< HEAD
		return boards;
=======
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i].getWriter().equals(bWr)) {
//				
//				Arrays.deepToString(boards[i]);
//				
//			} else {
//				
//				
//			}
//			
//		}
>>>>>>> branch 'master' of https://github.com/jungcwooo/HelloWorld.git
	}

	// 한건 조회 : 게시글번호
	public Board searchBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				int currentCut = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCut + 1);
				return boards[i];
			}
		}
		return null;
	}

	// 게시글 목록 (조회)
	public Board[] boardList() {
		return boards;
	}
}
