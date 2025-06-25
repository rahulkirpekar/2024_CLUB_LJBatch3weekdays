package basic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// 1'D Array Declaration
		int a1[] = new int[5]; 
//---------------------------------------		
		int []a2 = new int[5]; 
//---------------------------------------		
		int[] a3 = new int[5]; 
//---------------------------------------				
		int [] a4 = new int[5]; 
//---------------------------------------				
		int [] a5 = null;
		a5 = new int[5]; 
//---------------------------------------		
		
		// 1'D Array Declaration WIth Initialisation
		
		int a6[] = {10,20,30,40,50};

		// forEach / Advanced / Enhanced for loop
		for(int temp : a6) 
		{
			System.out.println(temp);
		}
		
		
//		for (int i = 0; i < a6.length; i++) 
//		{
//			System.out.println(a6[i]);
//		}
		
		
		
	}
}
