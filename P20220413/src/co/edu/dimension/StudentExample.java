package co.edu.dimension;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.studName = "정철우";
		s1.score = 80;
		s1.age = 29;
		
		Student s2 = new Student();
		s2.studName = "박철우";
		s2.score = 40;
		s2.age = 27;
		
		Student s3 = new Student();
		s3.studName = "김철우";
		s3.score = 70;
		s3.age = 20;
		
		Student[] students = {s1,s2,s3};
		
		int searchAge = 23;
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			if(students[i].age > searchAge) {
				System.out.println(students[i].studName);
				
			}
		}
		
//		Scanner scn = new Scanner(System.in);
//		String searchName = scn.nextLine();	
//		
//		for (int i = 0; i < students.length; i++) {
//			if(students[i].studName.equals(searchName)){
//				System.out.println(students[i].score);
//				System.out.println(students[i].age);
//
//			}
//		}
		System.out.println("끝");
	}
}
