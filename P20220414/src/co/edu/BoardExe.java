package co.edu;

import java.util.Arrays;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		// BoardList에 정의 해놓은 필드와메소드를 활용해서 기능.
		Scanner scn = new Scanner(System.in);
		BoardList boardList = new BoardList();
		Board bbb = new Board(0, null, null, null);
		boardList.init(5); // 배열의 크기 지정.
		
		int cnt = 1;

		while (true) {
			
			System.out.println("1. 추가 | 2. 수정 | 3. 목록 | 4. 삭제 | 5. 글번호 조회 | 6. 작성자조회 | 9. 종료");
			System.out.print("선택 => ");
			int menu = -1;
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("=======================");
				System.out.println("잘못된 입력이 있습니다.");
				System.out.println("숫자만 입력해주세요.");
				System.out.println("=======================");
			}

			if (menu == 1) {
//				System.out.print("게시물 번호를 입력하세요 => ");
//				int bNo = Integer.parseInt(scn.nextLine());
				System.out.print("제목을 입력하세요 =>");
				String bTitle = scn.nextLine();
				System.out.print("내용을 입력하세요 =>");
				String bContent = scn.nextLine();
				System.out.print("작성자를 입력하세요 =>");
				String bWriter = scn.nextLine();
				Board newBod = new Board(cnt, bTitle, bContent, bWriter);
				
				int chk = boardList.addBoard(newBod);
				

				if (chk == 0) {
					cnt++;
					System.out.println("완료되었습니다.");
				} else if (chk == -1) {
					System.out.println("저장 공간이 부족합니다.");
				} else if (chk == 1) {
					System.out.println("중복된 게시물 번호입니다.");
				}

			} else if (menu == 2) {
				System.out.print("수정하고 싶은 게시물의 번호를 입력하세요 => ");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.print("변경할 제목을 입력하세요 =>");
				String title = scn.nextLine();
				System.out.print("변경할 내용을 입력하세요 =>");
				String content = scn.nextLine();
				Board cBoard = new Board(bNo, title, content, null);
				boardList.modifyBoard(cBoard);

				if (boardList.modifyBoard(cBoard)) {
					System.out.println("완료되었습니다.");
				} else {
					System.out.println("실패하였습니다.");
				}

			} else if (menu == 3) {
				System.out.println("게시글번호   제목       내용            작성자    조회수");
				System.out.println("================================================================");
				Board[] boards = boardList.boardList();
				for (Board board : boards) {
					if (board != null) {
						board.getInfo();
					}
				}
			} else if (menu == 4) {
				String remove = "";
				System.out.println("삭제하고 싶은 게시물 번호를 입력하세요 => ");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.println("정말로 삭제하시겠습니까?(Y/N)");
				remove = scn.nextLine();
				if (remove.equalsIgnoreCase("y")) { // y,n을 구분하는 조건문
					boolean chk2 = boardList.removeBoard(bNo);
					if (chk2) {
						System.out.println("완료되었습니다.");
					} else {
						System.out.println("실패하였습니다.");
					}
				} else {
					System.out.println("실패하였습니다.");
				}

			} else if (menu == 5) {
				System.out.println("조회하고 싶은 게시물 번호를 입력하세요 => ");
				int bNo = Integer.parseInt(scn.nextLine());
				Board getBoard = boardList.searchBoard(bNo);
				if (getBoard == null) {
					System.out.println("조회결과가 없습니다.");
				} else {
					getBoard.getDetaolInfo();
				}
<<<<<<< HEAD
				// 작성자 조회
=======
				
>>>>>>> branch 'master' of https://github.com/jungcwooo/HelloWorld.git
			} else if (menu == 6) {
				System.out.println("조회하고 싶은 작성자명을 입력하세요 => ");
				String bWr = scn.nextLine();
<<<<<<< HEAD
				Board[] writerList = boardList.searchWrBoard(bWr);
				System.out.println("게시글번호   제목       내용            작성자    조회수");
				System.out.println("================================================================");
				
				for(Board board : writerList) {
					if(board != null) {
						board.getInfo();
					}
					
				}
=======
				System.out.println("게시글번호   제목       내용            작성자    조회수");
				System.out.println("================================================================");
				
				boardList.searchWrBoard(bWr);
//				if (getBoard == null) {
//					System.out.println("조회결과가 없습니다.");
//				} else {
//					
//					for (int i = 0; i < args.length; i++) {
//						
//						getBoard[i].removeAll(Arrays.asList("", null));
//						getBoard[i].getSearchInfo();
//					}
//					
//				}
>>>>>>> branch 'master' of https://github.com/jungcwooo/HelloWorld.git
			
				
						
					
		
				

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("정확한 메뉴를 선택하세요");
			}
		}

		System.out.println("끝");
	}
}
