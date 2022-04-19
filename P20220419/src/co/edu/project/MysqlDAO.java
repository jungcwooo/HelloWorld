package co.edu.project;

public class MysqlDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("MySQL로 입력처리");
	}
	@Override
	public void update() {
		System.out.println("MySQL로 수정처리");
	}
	@Override
	public void delete() {
		System.out.println("MySQL로 삭제처리");
	}
	@Override
	public void list() {
		System.out.println("MySQL로 목록조회");
	}

}
