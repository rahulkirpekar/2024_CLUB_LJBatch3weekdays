package oops.statictopic.doubts;

public class Employee 
{
	int varI =23 ;
	int varO =78 ;

	Employee()
	{
		varI++;// line n1
	}
  	public int addSum()
  	{
  		varI++;
  		
  		int ans = varI + varO;//line n2
  		
  		return ans;
  	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();// count=1	
		
		e1.varI = 200;
		
		 int ans = e1.addSum();
		// ans -- ?
	}
}
