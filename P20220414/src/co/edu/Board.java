package co.edu;

public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int searchCnt = 0;
	
	
	public Board(int boardNo, String title, String content, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		
	}


	public int getBoardNo() {
		return boardNo;
	}


	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public int getSearchCnt() {
		return searchCnt;
	}


	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}
	
	public void getInfo() {
		System.out.printf("%6d %10s %-20s %-10s %3d\n",
		this.boardNo, this.title, this.content, this.writer, this.searchCnt );
	}
	
	public void getSearchInfo() {
		System.out.printf("%6d %10s %-20s %-10s %3d\n",
		this.boardNo, this.title, this.content, this.writer, this.searchCnt );
	}
	
	public void getDetaolInfo() {
		//게시글번호             작성자
		//제목                   조회수
		//내용
		String info ="======================================\n"+
					"게시글 번호 : %2d          작성자 : %-5s\n"+
					"제목 : %-10s         조회수 : %3d\n"+
					"내용 : %-30s\n"+
					"=======================================\n";
		System.out.printf(info,this.boardNo,this.writer,this.title,this.searchCnt,this.content );
		
	}
	
}
