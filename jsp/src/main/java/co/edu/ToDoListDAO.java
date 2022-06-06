package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToDoListDAO extends DAO {
	//타이틀 리스트
	public List<ToDoList> toDoList(){
		connect();
		String sql = "select list_number, title from todolist\r\n"
				+ "order by 1";
		List<ToDoList> list = new ArrayList<ToDoList>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				ToDoList todo = new ToDoList();
				todo.setListNo(rs.getInt("list_number"));
				todo.setTitle(rs.getString("title"));
				list.add(todo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			disconnect();
		}
		return list;
	}
	// 추가하기
	public void insertList(ToDoList todo) {
		connect();
		String sql = "insert into todolist values (list_seq.nextval,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, todo.getTitle());
			psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//삭제하기
	public void deleteList(ToDoList todo) {
		connect();
		String sql = "delete from todolist where list_number=?";

		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, todo.getTitle());
			psmt.setInt(1, todo.getListNo());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	//  바로 삭제
	public void deleteListNow(ToDoList todo) {
		connect();
		String sql = "delete from todolist where title=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, todo.getTitle());
//			psmt.setInt(1, todo.getListNo());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
