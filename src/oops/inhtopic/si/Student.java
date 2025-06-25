package oops.inhtopic.si;

public class Student extends Person
{
	int rno,std,marks;
	public Student() 
	{
		rno=0;
		std=0;
		marks=0;
	}
	public Student(int rno, String name, int std, int marks) 
	{
		super(name);
		this.rno = rno;
//		this.name=name;
		this.std = std;
		this.marks = marks;
	}
	public void disp() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12, 100);
		s.disp();
	}
}
