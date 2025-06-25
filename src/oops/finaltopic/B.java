package oops.finaltopic;

public class B 
{
	// 1. Dm's--final-Initialisation
	final int no ;// = 100;

	// 2
	B()
	{
		no = 200;
	}
	
	// 3
	B(int no)
	{
		this.no = no;
	}

	public static void main(String[] args) 
	{
		B obj = new B(3000);
		
		System.out.println("obj.no : " + obj.no);
		
//		obj.no = 2000;//C.E
//		System.out.println("Updated obj.no : " + obj.no);
	}
}
