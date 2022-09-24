package org.practicaltest.model;
import java.util.Objects;

public class Student {
	public String studentEnrollNo;
	public String studentName;
	public int studentAge;
	

public Student(String studentEnrollNo,String studentName,int studentAge){
		this.studentEnrollNo=studentEnrollNo;
		this.studentName=studentName;
		this.studentAge=studentAge;

}


public String getStudentEnrollNo() {
	return studentEnrollNo;
}


public void setStudentEnrollNo(String studentEnrollNo) {
	this.studentEnrollNo = studentEnrollNo;
}


public String getStudentName() {
	return studentName;
}


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public int getStudentAge() {
	return studentAge;
}


public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}

public String toString() {
	return "Student [studentEnrollNo=" + studentEnrollNo + ", studentName=" + studentName + ", studentAge=" + studentAge
			+ "]";
}
public int hashCode() {
	return Objects.hash(studentAge, studentEnrollNo, studentName);
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return studentAge == other.studentAge && Objects.equals(studentEnrollNo, other.studentEnrollNo)
			&& Objects.equals(studentName, other.studentName);
}


}







