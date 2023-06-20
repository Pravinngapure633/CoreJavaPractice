package Object_Creation_Methoad_Calling;

public class Ex_2 {
	
	public void m1() 
	{
		System.out.println("M1--");
	}
	
	public void m2() 
	{
		System.out.println("M2--");
	}
	
	public static void main(String[] args) 
	{
		Ex_2 a=new Ex_2();
		a.m1();
		a.m2();
	}
}
