package com.shikha.test;

import java.util.Scanner;

import com.shikha.factory.StudentServiceFactory;
import com.shikha.model.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enrolling Students....");

		while (true) {
			System.out.println("1. Enrolling Students");
			System.out.println("2. Retrieve Students");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				enrollStudentsToTheSystem();
				break;
			case 2:
				retrieveStudents();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Please enter a valid choice and 0 to exit");
			}
		}
	}

	private static void enrollStudentsToTheSystem() {
		ArrayList<Student> enrolledStudentList = new ArrayList<Student>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.println("Enter student name.");
				String name = br.readLine();

				System.out.println("Enter student roll no.");
				int roll_no = Integer.parseInt(br.readLine());

				System.out.println("Enter student course");
				String course = br.readLine();

				enrolledStudentList.add(new Student(name, roll_no, course));

				System.out.println("Do you wish to enroll more students?");
				String choice = br.readLine();

				if (choice.equalsIgnoreCase("Yes")) {
					continue;
				} else {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		StudentServiceFactory.getStudentService().addStudents(enrolledStudentList);
	}
	
	private static void retrieveStudents() {
		ArrayList<Student> retrievedStudentList = new ArrayList<Student>();
		retrievedStudentList = StudentServiceFactory.getStudentService().getStudents();
		for(Student student : retrievedStudentList) {
			System.out.println(student.getName()+" "+student.getRollNo()+" "+student.getCourse());
		}
		
//		System.out.println("<html><body>");
//		System.out.println("<table>");
//		for(Student student : retrievedStudentList) {		
//			System.out.println("<tr><td>"+student.getName()+"</td><td>"+student.getRollNo()+"</td><td>"+student.getCourse()+"</td></tr>");		
//		}
//		System.out.println("</table>");
//		System.out.println("</html></body>");
	}
}
