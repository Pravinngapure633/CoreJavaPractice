package variable;

public class D_Copy_1 {
	
	int id;
	String name;
	
	public D_Copy_1(int i,String n) 
	{
		id=i;
		name=n;
	
	}
	
	public D_Copy_1() 
	{
		
	}

	void m1()
	{
		System.out.println(id+"   "+name);
	}
	
	public static void main(String[] args) {
		D_Copy_1 d1=new D_Copy_1(111, "XYZ");
		
		D_Copy_1 d2=new D_Copy_1();
		
		d2.id=d1.id;
		d2.name=d1.name;
		
		d1.m1();
		d2.m1();
	}
	
}
