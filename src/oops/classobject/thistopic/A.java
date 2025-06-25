package oops.classobject.thistopic;
/*
 * 
---

# Rules for this() usage and constructor chaining in Java

 1️⃣ Purpose of this()

 this() is used to call another constructor of the same class.
 It helps avoid code duplication when initializing variables.

---

 2️⃣ Rules for this() in constructors

1️⃣ this() call must be the first statement inside the constructor.
👉 You cannot write any statement before this().

2️⃣ Only one this() call is allowed in a constructor.

3️⃣ If you don't use this(), Java will not automatically chain constructors. You need to call it explicitly.

---

 3️⃣ Order of Constructor Execution (Chaining Flow)

 Constructor chaining always starts from:

   The most deeply chained constructor (highest number of parameters) and follows back through the chain.

In your example:

java
new A(100,200,300)
↓
A(int no1, int no2, int no3)  
↓
A(int no1, int no2)  
↓
A(int no1)  
↓
A()  (Default Constructor)


---

 4️⃣ this (object reference)

 this keyword (without parentheses) refers to current object.
 You are printing this → it prints the object reference (memory address).

---

 5️⃣ When to use this()

✅ When multiple constructors share some initialization logic.

✅ When you want to simplify and centralize constructor code.

---

 6️⃣ Important: super() vs this()

 super() → Calls parent class constructor.
 this() → Calls another constructor of the same class.
 Both must be the first statement — but only one can be used.

---

 7️⃣ Default values before constructor execution

 Before any constructor starts:

   Instance variables get default values (0 for int, null for objects, etc.)
 Your parameterized constructors override these values step by step.

---

 8️⃣ Output understanding

Output shows the flow of constructor calls due to chaining.



 * 
 * 
 */
public class A 
{
	int no1,no2,no3;
	public A() 
	{
		System.out.println("=====Default Constructor===== : " + this);
		no1=10;
		no2=20;
		no3=30;
	}
	public A(int no1)
	{
		this();
		System.out.println("=====PARA-A(int no1) Constructor===== : " + this);
		this.no1=no1;
	}
	public A(int no1,int no2)
	{
		this(no1);
		System.out.println("=====PARA-A(int no1,int no2) Constructor===== : " + this);
		this.no2=no2;
	}
	public A(int no1,int no2,int no3)
	{
		this(no1, no2);
		System.out.println("=====PARA-A(int no1,int no2,int no3) Constructor===== : " + this);
		this.no3=no3;
	}

	public static void main(String[] args) 
	{
		System.out.println("====START : Main Function=====");
		
		A obj1 = new A(100,200,300); 
		
		System.out.println(obj1.no1+" " + obj1.no2+" " + obj1.no3);
		System.out.println("====EXIT : Main Function=====");
	}
}
