package variable;

public class F_Counter2 {
	
	static int count=0;//will get memory only once and retain its value  
	  
	F_Counter2()
	{  
	count++;//incrementing the value of static variable  
	System.out.println(count);  
	}  
	  
	public static void main(String args[])
	{  
	//creating objects  
	F_Counter2 c1=new F_Counter2();  
	F_Counter2 c2=new F_Counter2();  
	F_Counter2 c3=new F_Counter2();  
	}  

}
