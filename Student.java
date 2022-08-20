package week3.day1;

public class Student extends Department {
	public void studentName() 
	{
		System.out.println("Student name is Deepika");
	}
	public void studentDept() 
	{
		System.out.println("Student Department is EC");
	}
	public void studentId() 
	{
		System.out.println("Student Id is 19");
	}

public static void main(String[] args) {
	Student s1=new Student();
	s1.collegeName();
	s1.collegeRank();
	s1.collegeCode();
	s1.deptName();
	s1.studentName();
	s1.studentId();
	s1.studentDept();
}
}
