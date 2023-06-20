package variable;

public class C_Private_Const_Call_Other_file {
	
	private C_Private_Const_Call_Other_file() 
	{
		
		System.out.println("Private Constructor");
		
	}
	
	public static void m1()
	{
		C_Private_Const_Call_Other_file c = new C_Private_Const_Call_Other_file();
	}

}
