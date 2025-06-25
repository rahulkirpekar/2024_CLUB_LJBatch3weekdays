package oops.inhtopic.mli;

public class ScienceStudent extends Student
{

	String subjectName;

	public ScienceStudent(int rno, String name, int marks,String subjectName) 
	{
		super(rno, name, marks);
		this.subjectName = subjectName;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + marks +" " + subjectName);
	}
	
	public static void main(String[] args) 
	{
		ScienceStudent s = new ScienceStudent(1, "Rahul", 100, "Math");
		
		s.dispData();
		
	}
}
