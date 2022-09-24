package org.practicaltest.view;
import java.util.Scanner;

import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

public class StudentView {
	static Scanner scanner=new Scanner(System.in);
	public static boolean addStudent() {
		
		System.out.println("Enter a Student Enrollment Number");
		String studentEnrollNo=scanner.nextLine();
		System.out.println("Enter a Student Name");
		String employeeName=scanner.nextLine();
		System.out.println("Enter Student Age");
		int studentAge=scanner.nextInt();
		scanner.nextLine();
		
		Student studs=new Student(studentEnrollNo,employeeName,studentAge);
		StudentService.addStudent(studs);
		return true;
	}

		public static Student[] displayStudents() {
			return StudentService.displayStudents();
		}

}
