package co.edu.dimension;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int sum = 0;
		double avg = 0.0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료 ");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택 => ");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수를 입력해주세요.");
				studentNum = Integer.parseInt(scn.nextLine());
				System.out.println(studentNum + "명을 입력하셨습니다.");

			} else if (selectNo == 2) {
				if (studentNum != 0) {
					scores = new int[studentNum];
					for (int i = 0; i < studentNum; i++) {
						System.out.print(i + 1 + "번째 학생의 점수를 입력해주세요. => ");
						scores[i] = Integer.parseInt(scn.nextLine());
					}
				} else {
					System.out.println("학생수를 입력 안하셨습니다.");
					System.out.println("학생수를 입력해주세요.");
					studentNum = Integer.parseInt(scn.nextLine());
					System.out.println(studentNum + "명을 입력하셨습니다.");
				}
			} else if (selectNo == 3) {
				if (scores == null) {
					System.out.println("점수를 입력 안하셨습니다.");
					continue;
				} else if (studentNum != 0) {
					for (int i = 0; i < scores.length; i++) {
						System.out.print(i + 1 + "번째 학생의 점수 : ");
						System.out.println(scores[i]);
					}
				} else {
					System.out.println("학생수를 입력 안하셨습니다.");
					System.out.println("학생수를 입력해주세요.");
					studentNum = Integer.parseInt(scn.nextLine());
					System.out.println(studentNum + "명을 입력하셨습니다.");
				}
			} else if (selectNo == 4) {
				if (scores == null) {
					System.out.println("점수를 입력 안하셨습니다.");
					continue;
				} else if (studentNum != 0) {
					int max = 0;
					for (int i = 0; i < scores.length; i++) {
						if (scores[i] > max) {
							max = scores[i];
						}
						sum += scores[i];
						avg = (double) sum / studentNum;

					}
					System.out.println("이 반 점수의 최고점은 : " + max);
					System.out.println("이 반 점수의 총점은 : " + sum);
					System.out.println("이 반 점수의 평균은 : " + avg);
				} else {
					System.out.println("학생수를 입력 안하셨습니다.");
					System.out.println("학생수를 입력해주세요.");
					studentNum = Integer.parseInt(scn.nextLine());
					System.out.println(studentNum + "명을 입력하셨습니다.");
				}
			} else if (selectNo == 5) {
				System.out.println("종료합니다.");
				run = false;
			} else {
				System.out.println("잘못입력하셨습니다.");
				System.exit(0);
			}

		}
	}

}
