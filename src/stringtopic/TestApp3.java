package stringtopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// 1. equals---value
		String name1 = "royal";
		String name2 = "Royal";
		
//		if (name1.equals(name2))
			
//		if (name1.equalsIgnoreCase(name2)) 
		
		System.out.println(name1.compareTo(name2));
		
		if(name1.compareTo(name2) == 0)
		{
			System.out.println("Both strings are same");
		} else 
		{
			System.out.println("Both strings are not same");
		}
		
		System.out.println();
		
		// 2. equalsIgnorecase -- case ignore
		
		// 3. compareTo - value comparision --- int--[same ---0]
		
		// 4. contains
		
	}
}
