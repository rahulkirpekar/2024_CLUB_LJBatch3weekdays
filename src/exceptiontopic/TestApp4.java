package exceptiontopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		try 
		{
			String name=  null;
			System.out.println(name.length());
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception");
		}finally 
		{
			// Database/socket/file connection--close
			System.out.println("Finally Block");
		}
		System.out.println("General Statement");
	}
}
/*
Exception Handling:-
--------------------

	try
	{
		// raise ===> exception code
	}catch()
	{
		exception handled
	}finally
	{
		code
	}
-------------------------------------------------------
	try
	{
		// raise ===> exception code
	}catch()
	{
		exception handled
	}catch()
	{
		exception handled
	}finally
	{
		code
	}	
------------------------------------------------

	try
	{
		// raise ===> exception code
	}finally
	{
		code
	}
	
*/




