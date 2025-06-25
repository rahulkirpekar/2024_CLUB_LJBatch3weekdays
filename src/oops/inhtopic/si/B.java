package oops.inhtopic.si;

//Single Inheritace
public class B extends A
{
	int no2;
	
	public B() 
	{
		super(1000);
		System.out.println("B : Default Constructor");
		no2=20;
	}
	
	public B(int no1,int no2)
	{
		super(no1);
		System.out.println("B : PARA Constructor");
		this.no2=no2;
	}
	
	public void disp() 
	{
		System.out.println("No1 : " + no1+"\nNo2 : " + no2);
	}
}
