package co.edu.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("세개의 단어를 입력.");
//		while (scn.hasNext()) {
//			String str = scn.next();
//			System.out.println(str);
//			if(str.equals("exit")) {
//				break;
//			}
//		}
//		
			System.out.println("숫자 입력");
			while(true) {
				int readByte;
				try {
					readByte = System.in.read();
					System.out.println(readByte);
					if(readByte == -1)
						break;
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		System.out.println("end of program");
	}	
}
// 입력 스트림 System.in
// 출력 스트림 System.out