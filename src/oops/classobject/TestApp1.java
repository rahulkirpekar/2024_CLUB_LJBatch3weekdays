package oops.classobject;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		int no1,no2,ans;
//		ans = no1+no2;
//		System.out.println("Addition : " + ans);
		
		// s--reference variables
		// Student--Object
		
//		Student s =null;
//		s = new Student();

		
		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) 
		{
			//i---[0,1,2,3,4]--s[0],s[1],s[2],s[3],s[4]
			s[i] = new Student();
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();
//		
//		System.out.println("s1 : " + s1);
//		System.out.println("s2 : " + s2);
//		System.out.println("s3 : " + s3);
//		System.out.println("s4 : " + s4);
//		
//		s1.scanData();
//		s2.scanData();
//		s3.scanData();
//		s4.scanData();
//		
//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
//		s4.dispData();
		
	}

}
