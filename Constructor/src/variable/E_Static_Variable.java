package variable;

public class E_Static_Variable {

	int rollno;
	String name;
	static String college="IIT";
	
	//const
	public E_Static_Variable(int r, String n) 
	{
		rollno=r;
		name=n;
	}
	
	//method to display the values
	public void m1()
	{
		System.out.println(rollno+"    "+name+"  "+college);
		
	}
	
	
}
