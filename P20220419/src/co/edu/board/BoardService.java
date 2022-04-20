package co.edu.board;

public interface BoardService {
	
	int ADD = 1;
	int INSERT = 2;
	int DELELTE = 3;
	int LIST = 9;
	int SEARCH = 4;
	int ONELIST = 5;
	
	public void add(Board board);			// 추가
	public void insert(int iNo);		// 수정
	public void delete(int dNo);		// 삭제
	public void List();						// 전체조회
	public void searchList(String name);	// 선택조회(이름)
	public void oneList(int oNo);		// 한건조회(글번호)
	
}
