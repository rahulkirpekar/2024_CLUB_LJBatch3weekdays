package oops.classobject;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s= new Student();
		
//		s.rno=1;
//		s.name="rahul";
//		s.std=12;
		
		s.setRno(1);
		s.setName("rahul");
		s.setStd(12);

		
		System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
	}
}
