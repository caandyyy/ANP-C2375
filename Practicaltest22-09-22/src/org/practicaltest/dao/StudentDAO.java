package org.practicaltest.dao;
import java.util.TreeSet;


import org.practicaltest.model.Student;

public class StudentDAO {
private static final Student Student = null;
//	static Student studArray[]=new Student[10];
//	public static boolean addStudent(Student stud) {
//		boolean result=false;
//		
//		for(int i=0;i<studArray.length;i++)
//		{
//			if(studArray[i]==null) {
//				studArray[i]=stud;
//				result=true;
//				break;
//			}
//		}
//		
//		return result;
//	}
//	public static Student[] displayStudents() {
//		return studArray;
//	}
	TreeSet<Student>treeSet=new TreeSet<>();
		
	public String setStudent(Student stud) {
		treeSet.add(Student);
		System.out.println("treeSet");
		return "add details";
		
	}

	public static org.practicaltest.model.Student[] displayStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void addStudents(org.practicaltest.model.Student stud) {
		// TODO Auto-generated method stub
		
	}
	
	

}
