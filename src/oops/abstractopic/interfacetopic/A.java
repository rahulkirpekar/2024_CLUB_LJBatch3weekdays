package oops.abstractopic.interfacetopic;

// Simple interface---100% Abstraction
//------------------------------------
// 100% abstraction---[Java-6]+---[]

// @FunctionalInterface

public abstract interface A 
{
//	1. Dm's ---[public static final]
	public static final int no = 100;//public static final
	
//	2. Member function
//		1. abstract method(One+ abstract method)			
		
	public abstract void test1();// public abstract
	public abstract void test2();// public abstract
	
//		2. Non-abstract method
//			==>static method
	public static void testStatic() 
	{
		System.out.println("A---static--method--testStatic");
	}
	
//			==>default method
	public default void testDefault() 
	{
		System.out.println("A---default--method--testDefault");
		testPrivate();
		testPrivate();
	}
//			==>private method
	private void testPrivate() 
	{
		System.out.println("A---Private--method--testPrivate");
	}
}