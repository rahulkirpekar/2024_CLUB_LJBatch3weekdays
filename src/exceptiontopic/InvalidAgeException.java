package exceptiontopic;

// User Defined Exception



//	1. checked Exception---Exception
//public class InvalidAgeException extends Exception

//  2. Unchecked Exception--RuntimeException
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
