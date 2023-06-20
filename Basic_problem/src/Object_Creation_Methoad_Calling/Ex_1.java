package Object_Creation_Methoad_Calling;

public class Ex_1 {
	
	public void m1()
	{
		System.out.println("Hello");
	}
	
	public static void main (String [] args)
	{
		System.out.println("Main-Start");
		
		Ex_1 a=new Ex_1();
		a.m1();
		
		System.out.println("Main-End");
	}

}
