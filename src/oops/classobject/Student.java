package oops.classobject;

import java.util.Scanner;

// Pure Encapsulation ==> Data Security
public class Student 
{
	private int rno,std;
	private String name;

	// Constructor Overloadding
	// 1) Default Constructor
	public Student() 
	{
		System.out.println("======START : Default Constructor======");
		rno=1;
		name="rahul";
		std=12;
		System.out.println("======EXIT : Default Constructor======");
	}
	
	// 2) Para Constructor
	public Student(int rno,String name,int std) 
	{
		System.out.println("======START : PARA Constructor======");
		this.rno=rno;
		this.name=name;
		this.std=std;
		System.out.println("======EXIT : PARA Constructor======");
	}
	// 2) Para Constructor
		public Student(int rno,String name) 
		{
			System.out.println("======START : PARA Constructor======");
			this.rno=rno;
			this.name=name;
			System.out.println("======EXIT : PARA Constructor======");
		}
	// 3) Copy Constructor 	
	public Student(Student s) 
	{
		System.out.println("======START : Copy Constructor======");
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		System.out.println("======EXIT : Copy Constructor======");
	}
	// methods
	// getters(Accessors) and setters(Mutators)
	
	// setters
	
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setStd(int std) 
	{
		this.std = std;
	}
	
	// getters
	public int getRno()
	{
		return rno;
	}
	public String  getName()
	{
		return name;
	}
	public int getStd()
	{
		return std;
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name= sc.nextLine();
		System.out.println("Enter Std : ");
		std= sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
}
