package variable;

public class D_Copy_Constructor {
	
//	There are many ways to copy the values of one object into another in Java. They are:
//		By constructor
//		By assigning the values of one object into another
//		By clone() method of Object class
	
//		In this example, we are going to copy the values of one object into another using Java constructor.

		int id;
		String name;
		
		//constructor to initialize integer and string  
		public D_Copy_Constructor(int i,String n)
		{
			id=i;
			name=n;
		}
		
		//constructor to initialize another object  
		public D_Copy_Constructor(D_Copy_Constructor s)
		{
			id=s.id;
			name=s.name;
		}
		
		public void m1()
		{
			System.out.println(id+"  "+name);
		}
		
		public static void main(String[] args) {
			
			D_Copy_Constructor s1=new D_Copy_Constructor(111, "ABC");
			
			  
			D_Copy_Constructor s2=new D_Copy_Constructor(s1);
			
			  
			
			s1.m1();
			s2.m1();
		}
}
