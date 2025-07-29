package oops.abstractopic.interfacetopic;

public class B implements A
{
	@Override
	public void test1() 
	{
		System.out.println();
	}
	@Override
	public void test2() {
		
	}
	public static void main(String[] args) 
	{
		A obj = new B();
		
		obj.test1();
		
		obj.testDefault();
		
		A.testStatic();
		
		obj.testDefault();
	}
}
