package oops.polymorphismtopic.compiletime;

// CompileTime Polymorphism - Method Overloadding
public class TestApp1 
{
	public void addFun(short  no1,short no2) 
	{
		float  ans = no1+no2;
		System.out.println("Twoargs(short) : Addition : " + ans);
	}
	
	public  void addFun(double no1,double no2) 
	{
		double ans = no1+no2;
		System.out.println("Twoargs(double) : Addition : " + ans);
	}

	public void addFun(int no1,int no2,int no3) 
	{
		int ans = no1+no2+no3;
		System.out.println("Threeargs : Addition : " + ans);

	}
	
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		int ans = no1+no2+no3+no4;
		System.out.println("Fourargs Addition : " + ans);
	}
	
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
		obj.addFun('A','B');	
	}
}
/*
	1. argument count
	2. argument type
	3. Type pramotion rule
	
	boolean----X
						
					byte
					 |
					short
					 |
	char----------->int 		
					 |
					long
					 |
				    float
					 |
				   double   

*/
