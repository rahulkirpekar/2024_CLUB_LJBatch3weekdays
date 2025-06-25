package oops.inhtopic.mli;

public class Student extends Person
{
	int rno,marks;

	public Student(int rno, String name, int marks) 
	{
		super(name);
		this.rno = rno;
		this.marks = marks;
	}
}
