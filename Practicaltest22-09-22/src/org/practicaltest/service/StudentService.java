package org.practicaltest.service;

import org.practicaltest.dao.StudentDAO;
import org.practicaltest.model.Student;

public class StudentService {

	public static boolean addStudent(Student stud) {
		boolean result=false;
		StudentDAO.addStudents(stud);
		return result;
	}
	public static Student[] displayStudents() {
		return StudentDAO.displayStudents();
	}
}