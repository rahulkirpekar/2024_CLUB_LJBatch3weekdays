package oops.statictopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		 int x = 10;
		 
		 int y = ++x; // x = 11 , y  = 11
		 
		 int z = 0; // z =0

		 if ( y >=10 || y <= ++x )
		 {
		         z = x;
		 } else
		 {
		        z = x++;
		 }
		 System.out.println(z);  
	}
}
