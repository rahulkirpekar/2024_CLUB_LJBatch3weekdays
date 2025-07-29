package stringtopic;

public class TestApp5 
{
	 public static void main(String[] args) 
	 {
		 //  Mutable behaviour
//		 StringBuffer sb = new StringBuffer("Royal");
		 StringBuilder sb = new StringBuilder("Royal");
		 
		 System.out.println(sb+"---"+sb.hashCode());
		 sb.append(" techno");
		 System.out.println(sb+"---"+sb.hashCode());
		 
		 // Immutable behaviour
//		 String name1 = "This is Java";
//		 System.out.println("name1 : " + name1+"---"+name1.hashCode());
//		 name1.concat(" - James Gosling");// 
//		 System.out.println("name1 : " + name1+"---"+name1.hashCode());
		
	}
}
