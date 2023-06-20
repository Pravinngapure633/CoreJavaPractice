package Object_Creation_Methoad_Calling;

public class Ex_3 {
	
	public void m1()
	{
		System.out.println("M1--");
		m2();
	}
	
	public void m2() 
	{
		System.out.println("M2--");
	}
	
	public static void main(String[] args) 
	{
		Ex_3 a=new Ex_3();
		a.m1(); 
		
	}
}
