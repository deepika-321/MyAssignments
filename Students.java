package week3.day1;

public class Students {

	public void getStudentinfo(String name, int id) 
	{
		System.out.println("Student name is " + name  + " and id is "+ id);
	}
public void getStudentinfo(int id) {
	System.out.println("Student id is "+ id);
	}
public void getStudentinfo(long phonenumber, String email) {
	System.out.println("Student phonenumber is "+ phonenumber + "and email is "+ email);
}
public static void main(String[] args) {
	
Students s1=new Students();
s1.getStudentinfo(131);
s1.getStudentinfo(987658789, "new@gmail.com");
s1.getStudentinfo("Deepika", 131);
}
}
