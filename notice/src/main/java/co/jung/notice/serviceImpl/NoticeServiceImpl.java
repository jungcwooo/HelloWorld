package co.jung.notice.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.jung.notice.dao.DataSource;
import co.jung.notice.service.NoticeService;
import co.jung.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private DataSource dao = DataSource.getInstance();
	private Connection conn = dao.getConnection();

	private PreparedStatement psmt;
	private ResultSet rs;

	@Override // 전체조회
	public List<NoticeVO> noticeSelectList() {
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		NoticeVO vo = new NoticeVO();

		String sql = "SELECT * FROM NOTICE"; // DB에 보낼 명령문을 String 타입으로 저장
		try {
			conn = dao.getConnection(); // 커넥션을 연결 (DB와의 연결을 위해)
			psmt = conn.prepareStatement(sql); // prepareStatement를 이용해서 sql문을 보냄
			rs = psmt.executeQuery(); // select는 resertset에 결과를 저장 (rs = ResultSet)
			while (rs.next()) { // rs에 저장되어있는 값을 하나씩 읽음
				vo = new NoticeVO(); // NoticeVO vo를 초기화
				vo.setId(rs.getInt("id")); // vo.setId
				vo.setWriter(rs.getString("WRITER"));
				vo.setTitle(rs.getString("TITLE"));
				vo.setWdate(rs.getDate("WDATE"));
				vo.setHit(rs.getInt("HIT"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			close();

		}
		return list;
	}

	@Override // 한건조회
	public NoticeVO noticeSelect(NoticeVO vo) {
		String sql = "SELECT * FROM NOTICE WHERE ID = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getId());
			rs = psmt.executeQuery();

			if (rs.next()) {
				vo = new NoticeVO();
				vo.setId(rs.getInt("ID"));
				vo.setWriter(rs.getString("WRITER"));
				vo.setTitle(rs.getString("TITLE"));
				vo.setSubject(rs.getString("SUBJECT"));
				vo.setWdate(rs.getDate("WDATE"));
				vo.setHit(rs.getInt("HIT"));

				hitUpdate(vo.getId());
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

		}
		return vo;
	}

	@Override // 추가
	public int noticeInsert(NoticeVO vo) {
		// 한명 추가
		int n = 0;
		String sql = "INSERT INTO NOTICE VALUES (b_id.nextval,?,?,?,sysdate,0)";
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, vo.getId());
			psmt.setString(1, vo.getWriter());
			psmt.setString(2, vo.getTitle());
			psmt.setString(3, vo.getSubject());
//			psmt.setDate(5, vo.sysdate);
//			psmt.setInt(6, vo.getHit());
			n = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

		}

		return n;
	}

	@Override // 변경
	public int noticeUpdate(NoticeVO vo) {
		// 수정
		int n = 0;
		String sql = "UPDATE NOTICE SET TITLE = ?, SUBJECT = ?  WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getSubject());
			psmt.setInt(3, vo.getId());

			n = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

		}

		return n;
	}

	@Override // 삭제
	public int noticeDelete(NoticeVO vo) {
		// 삭제
		int n = 0;
		String sql = "DELETE FROM NOTICE WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getId());
			n = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

		}

		return n;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void hitUpdate(int id) {
		String sql = "update notice set hit = hit + 1 where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
