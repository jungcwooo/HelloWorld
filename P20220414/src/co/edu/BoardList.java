package co.edu;

public class BoardList {
	private Board[] boards;

	public void init(int size) {
		boards = new Board[size];
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
	//작성자 조회
	public Board[] searchWrBoard(String bWr) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getWriter().equals(bWr)) {
				return boards;
			}
		}
		return null;
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
