package exceptiontopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
	
		// try with Multiple catch block
		int ans =0;
		try 
		{
			// raise code -- exception
			ans = no1 / no2;
			
			String name  = null;
			System.out.println(name.length());
		
			String value = "royal";
			System.out.println(value.charAt(5));
			
		}catch(ArithmeticException e) 
		{
			// handle exception
			System.out.println("Catch Block Handled exception");
		}catch (NullPointerException e) 
		{
			e.printStackTrace();
		}catch (StringIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Division : " + ans );
	}
}
