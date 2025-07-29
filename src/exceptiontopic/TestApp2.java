package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int no1,no2,ans;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		no1= sc.nextInt();
		System.out.println("Enter No2 : ");
		no2= sc.nextInt();

		// Nested try...catch
		try 
		{
			try 
			{
				ans = no1 / no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				
				String name  = null;
				System.out.println(name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();// errorlog---rootcause---exception msg
			}
			
			try 
			{
				String value = "royal";
				System.out.println(value.charAt(5));

			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
