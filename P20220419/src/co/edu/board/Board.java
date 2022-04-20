package co.edu.board;

import java.time.LocalDate;

public class Board {
	
	int boardNo = 1;
	String boardName;
	String boardInString;
	String user;
	String date;
	
	
	
	public Board() {
		super();
	}

	public Board(int boardNo, String boardName, String boardInString, String user, String date) {
		super();
		this.date = date;
		this.boardNo = boardNo;
		this.boardName = boardName;
		this.boardInString = boardInString;
		this.user = user;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardInString() {
		return boardInString;
	}

	public void setBoardInString(String boardInString) {
		this.boardInString = boardInString;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String now) {
		this.date = date;
	}

	@Override
	public String toString() {
		return " |   " + boardNo + "   |   " + boardName + "   |   "
				+ user + "   |   " + date + "   |";
	}
	
	public void getInfo() {
		//게시글번호             작성자
		//제목                   조회수
		//내용
		String info ="======================================\n"+
					"게시글 번호 : %3d      작성일자 : %s\n"+
					"제목 : %-7s         작성자 : %6s \n"+
					"내용 : %-30s\n"+
					"=======================================\n";
		System.out.printf(info,this.boardNo,this.date,this.boardName,this.user,this.boardInString );
		
	}
	
	

	
}
