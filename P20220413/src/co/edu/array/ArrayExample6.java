package co.edu.array;

import java.util.Scanner;

public class ArrayExample6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String[] names = new String[3];
		int[] scores = new int[names.length];

		for (int i = 0; i < scores.length; i++) {
			System.out.print(i + 1 + "번째 학생의 이름을 입력하세요 => ");
			names[i] = scn.nextLine();

			System.out.print(names[i] + "의 점수를 입력하세요 => ");
			scores[i] = scn.nextInt();
			scn.nextLine();
		}

//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(names[i]+"의 점수 : "+scores[i]);
//		}
		System.out.println("#########################");
		System.out.println("조회할 학생의 이름을 입력하세요.");
		String searchName = scn.nextLine();
		for (int i = 0; i < scores.length; i++) {
			if(names[i].equals(searchName)) {
				System.out.println(names[i]+"의 점수 : "+scores[i] + "점");
			}
			
		}
		System.out.println("#########################");
		System.out.println("종료");
	}

}
