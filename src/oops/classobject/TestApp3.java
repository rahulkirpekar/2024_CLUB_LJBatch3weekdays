package oops.classobject;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1= new Student();
		s1.dispData();
		
		System.out.println("----------------------------");
		
		Student s2= new Student(2,"Xyz",12);
		s2.dispData();
	
		System.out.println("----------------------------");
		
		Student s3= new Student(s2);
		s3.dispData();
		
		System.out.println("----------------------------");
		
	}
}
