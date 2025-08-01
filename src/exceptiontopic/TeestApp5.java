package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TeestApp5 
{
	public static void isValidForVote(int age) //throws InvalidAgeException
	{
		if (age < 18) 
		{
			// User Defined Scenario---->[raise exception]---[User Defined Exception]
//			throw new IOException("\nInvalid Age,\n\tPlease enter valid Age.");
//			throw new ArithmeticException("\nInvalid Age,\n\tPlease enter valid Age.");
//			throw new InvalidAgeException("\nInvalid Age,\n\tPlease enter valid Age.");
			
			throw new InvalidAgeException("\nInvalid Age,\n\tPlease enter valid Age.");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception");
		}
		
		System.out.println("General Statement");
	}

}
