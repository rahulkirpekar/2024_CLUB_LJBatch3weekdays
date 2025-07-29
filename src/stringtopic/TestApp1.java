package stringtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// math---
		//    1.Textbook
		//    2. fairbook
		//    3 assignment
		
		String name1 = "royal";
		String name2 = "royal";
		
		String name3 = new String("royal");
		
		System.out.println(name1==name2); 
		System.out.println(name1==name3); 
		
		System.out.println("name1 : " + name1+"---"+name1.hashCode());
		System.out.println("name2 : " + name2+"---"+name2.hashCode());
		System.out.println("name3 : " + name3+"---"+name3.hashCode());
	}
}
