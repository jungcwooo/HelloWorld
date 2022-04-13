package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
//		Student s1 = new Student();

//		System.out.println("학생이름 점수 나이");
//		s1.studName = scn.next();
//		s1.score = Integer.parseInt(scn.nextLine());
//		s1.age = Integer.parseInt(scn.nextLine());
		
		Student[] students = {new Student(), new Student(), new Student()};
		
		for (int i = 0; i < students.length; i++) {
			students[i].studName = scn.next();
			students[i].score = Integer.parseInt(scn.next());
			students[i].age = Integer.parseInt(scn.next());
		}
		for (int i = 0; i < students.length; i++) {
				System.out.println(students[i].studName);
				System.out.println(students[i].age);
				System.out.println(students[i].score);
				}
//		
//
//			}
//		}
		System.out.println("끝");
	}
}
