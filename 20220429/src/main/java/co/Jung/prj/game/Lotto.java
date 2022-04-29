package co.Jung.prj.game;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	Scanner scn = new Scanner(System.in);
	private int[] lottoNo = new int[6]; // 로또의 번호가 저장될 배열
	private int[] bingoNo = new int[6]; // 당첨번호가 들어있는 배열

	final int fullLottoPrice = 5000; // 로또 한장에 최대가격
	final int lottoPrice = 1000; // 로또 1게임의 가격
	final int maxLotto = 5; // 로또 한장에 들어갈수있는 최대 갯수

	int sum = 0;
	int cnt = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;

	public void score() {
		switch (cnt) {
		case 0:
		case 1:
		case 2:
			System.out.println("   " + cnt + "개 맞았어요. 꽝입니다.");
			
			break;

		case 3:
			System.out.println("   " + cnt + "개 맞았어요. 4등입니다.");
			System.out.println("   " + "지급액은 5000원입니다..");
			sum = sum + 5000;
			d++;
			break;

		case 4:
			System.out.println("   " + cnt + "개 맞았어요. 3등입니다.");
			System.out.println("   " + "지급액은 3,000,000원입니다..");
			sum = sum + 3000000;
			c++;
			break;

		case 5:
			System.out.println("   " + cnt + "개 맞았어요. 2등입니다.");
			System.out.println("   " + "지급액은 50,000,000원입니다..");
			sum = sum + 50000000;
			b++;
			break;

		case 6:
			System.out.println("   " + cnt + "개 맞았어요. 1등입니다.");
			System.out.println("   " + "지급액은 1,800,000,000원입니다..");
			sum = sum + 1800000000;
			a++;
			break;

		default:
			break;
		}

	}

	public void buylotto() {
		System.out.println("로또의 1게임 가격은 " + lottoPrice + "원입니다.");
		System.out.println("로또를 몇게임 구입하시겠습니까?");
		int game = Integer.parseInt(scn.next()); // 몇게임을 발매할지 입력
		int xPrice = lottoPrice * game; // 입력 받은 게임과 로또의 가격을 곱해서 가격이 얼만지

		if (xPrice >= lottoPrice) { // 받은 돈이 로도 1게임의 가격보다 크거나 같아야 동작하게

			System.out.println(xPrice + "원 입력하셨습니다.");
			System.out.println(xPrice / lottoPrice + "게임의 로또가 발매됩니다.");

			for (int i = 0; i < game; i++) { // 로또의 번호를 입력받은 게임횟수에 맞게 생성
				if (i % maxLotto == 0) { // 5게임마다 페이지 구분을 위해 경계선추가
					System.out.println("======= " + ((i / maxLotto) + 1) + " 페이지 =======");
				}

				int[] y = createlotto();

//				System.out.println(Arrays.toString(x));
				for (int j = 0; j < y.length; j++) {
					System.out.printf("[%2d]", y[j]);
				}
				
				for (int j = 0; j < y.length; j++) { // 당첨번호랑 개인번호랑 비교
					for (int j2 = 0; j2 < y.length; j2++) {
						if (y[j] == bingoNo[j2]) { // 당첨번호 0번째 인덱스랑 개인번호 전체인덱스랑비교해서 맞으면 카운트 ++
							cnt++;
						}
					}
				}
				score();
				

			}
		} else { // 0회가 들어오면 구매가 안되도록
			System.out.println("취소되었습니다.");
		}

	}

	public int[] createlotto() { // 배열을 반환하는 메서드로 로또 번호를 넣은 배열을반환
		cnt = 0;
		for (int i = 0; i < lottoNo.length; i++) {
			lottoNo[i] = (int) ((Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) {
				if (lottoNo[i] == lottoNo[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoNo); // 로또 배열을 정렬
		return lottoNo;
	}
	
	public int[] bingolotto() { // 배열을 반환하는 메서드로 로또 번호를 넣은 배열을반환
		cnt = 0;
		for (int i = 0; i < bingoNo.length; i++) {
			bingoNo[i] = (int) ((Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) {
				if (bingoNo[i] == bingoNo[j]) {
					i--;
				}
			}
		}
		Arrays.sort(bingoNo); // 로또 배열을 정렬
		return bingoNo;
	}

	

	public void run() {
		bingolotto();
		buylotto();
		System.out.println("당첨 번호는 : " + Arrays.toString(bingoNo));
		System.out.println("당첨 금액은 총 : " + sum + "원");
		System.out.println("당첨 등수는 : " +  "1등 : "+ a  + "번, 2등 : "+ b +  "번, 3등 : "+ c + "번, 4등 : "+ d +"번");
	}

}
