package variable;

public class G {

	static int i=10;
	int y=20;
	
	public  void m1()
	{
		
		System.out.println(i);
		System.out.println(y);
		m2();
	}
	
	public static void m2()
	{
		 G g=new G();
		System.out.println(i);
		System.out.println(g.y);
		//m1()
	}
//	public static void main(String[] args) {
//		G g = new G();
//		System.out.println(g.y);
//		System.out.println(i);
//	}
}
