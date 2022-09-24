package org.practicaltest.main;
import java.util.Scanner;

import org.practicaltest.model.Student;
import org.practicaltest.view.StudentView;

public class StudentMain {
static Scanner scanner=new Scanner(System.in);
	
	static void displaySubMenu() {
		System.out.println("1. Enter Student info");
		System.out.println("2. Display All Students");
		System.out.println("Enter your choice");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(StudentView.addStudent())
				System.out.println("Student Added Sucessfully");
			break;
		case 2:
			Student stu[]=StudentView.displayStudents();
			for(Student localStudent:stu) {
				if(localStudent!=null)
				System.out.println(localStudent);
				else
					break;
			}
			break;
			default: 
				System.out.println("Not a valid input");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			
			System.out.println("1. Add Student Data");
			System.out.println("2. Exit ");
		
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				displaySubMenu();
				break;
			case 2:
				System.exit(0);
				break;
				default:
					System.out.println("Not a valid input");
			}
		}while(true);
	}

}
