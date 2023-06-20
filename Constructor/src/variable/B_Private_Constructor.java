package variable;

public class B_Private_Constructor {
	
	 int i;

	  // constructor with no parameter
	  private B_Private_Constructor() {
	    i = 5;
	    System.out.println("Constructor is called");
	  }

	  public static void main(String[] args) {

	    // calling the constructor without any parameter
		  B_Private_Constructor obj = new B_Private_Constructor();
	    System.out.println("Value of i: " + obj.i);
	  }

}
