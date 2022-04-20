package co.edu.board;

import java.util.Scanner;

public class MultiLineExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = "";

		while (true) {
			String temp = scn.nextLine();
			if (temp.equals("")) {
				break;
			}
			str += temp + "\n";
		}
	}
}
