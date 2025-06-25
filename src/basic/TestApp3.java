package basic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int a1[][] = new int[3][3];
		
		int [][]a2 = new int[3][3];
		
		int[][] a3 = new int[3][3];
		
		int [][] a4 = new int[3][3];
		
		int []a5[] = new int[3][3];

		int a6[][] = null ;
		a6 = new int[3][3];
		
		// Jagged Array
		int a7[][] = new int[3][];
		
		a7[0] = new int[3];
		a7[1] = new int[2];
		a7[2] = new int[4];
		
		System.out.println("a7.length : " + a7.length);// 3
		System.out.println("a7[0].length : " + a7[0].length);// 3
		System.out.println("a7[1].length : " + a7[1].length);// 2
		System.out.println("a7[2].length : " + a7[2].length);// 4
		
		
		for (int i = 0; i < a7.length; i++) 
		{
			for (int j = 0; j < a7[i].length; j++) {
				
			}
		}
		
	}
}
