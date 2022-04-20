package co.edu.board;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {

		BoardService bo = new BoardApp();

		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		Calendar time = Calendar.getInstance();
		Scanner scn = new Scanner(System.in);

		int menu = 0;
		int NO = 1;
		while (true) {
			System.out.println("1. 글등록 2. 글수정 3. 글삭제 4. 글조회(작성자) 5. 글상세조회(글번호) 6. 종료 9. 전체조회 ");
			try {
				menu = Integer.parseInt(scn.next());
			} catch (Exception e) {

			}

			if (menu == bo.ADD) { // 추가

				System.out.print("제목을 입력하세요 => ");
				String bName = scn.next();
				System.out.print("내용을 입력하세요 => ");
				String bIn = scn.next();
				System.out.print("작성자을 입력하세요 => ");
				String bUser = scn.next();
				String date = format.format(time.getTime());

				Board board = new Board(NO, bName, bIn, bUser, date);
				bo.add(board);
				NO++;

			} else if (menu == bo.INSERT) { // 수정
				System.out.print("수정할 게시물 번호를 입력하세요 => ");
				int iNo = scn.nextInt();
				bo.insert(iNo);

			} else if (menu == bo.DELELTE) { // 삭제
				System.out.print("삭제할 게시물 번호를 입력하세요 => ");
				int dNo = scn.nextInt();
				bo.delete(dNo);
			} else if (menu == bo.LIST) { // 전체조회
				bo.List();
			} else if (menu == bo.SEARCH) { // 조건조회
				System.out.print("조회할 작성자를 입력하세요 => ");
				String sUser = scn.next();
				bo.searchList(sUser);
			} else if (menu == bo.ONELIST) { // 한건조회
				System.out.print("조회할 게시물 번호를 입력하세요 => ");
				int oNo = scn.nextInt();
				bo.oneList(oNo);
			} else {

			}

		}
	}

}
