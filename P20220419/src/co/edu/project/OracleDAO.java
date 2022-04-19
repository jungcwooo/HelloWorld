package co.edu.project;

public class OracleDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("Oracle로 입력처리");
	}
	@Override
	public void update() {
		System.out.println("Oracle로 수정처리");
	}
	@Override
	public void delete() {
		System.out.println("Oracle로 삭제처리");
	}
	@Override
	public void list() {
		System.out.println("Oracle로 목록조회");
	}

}

